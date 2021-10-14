package com.ledgy98.spring.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ledgy98.spring.lesson06.bo.BookingBO;
import com.ledgy98.spring.lesson06.model.Booking;

@RequestMapping("/lesson06/test03")
@Controller
public class BookingController {
	
	@Autowired
	private BookingBO bookingBO;
	
	@GetMapping("/main")
	public String main() {
			return "lesson06/test03/main";
	}
	
	@GetMapping("/booking_list")
	public String bookingList(Model model) {
			
		model.addAttribute("bookingList", bookingBO.getBookingList());
		
		return "lesson06/test03/bookingList";
	}
	
	@GetMapping("/booking_delete")
	@ResponseBody
	public Map<String, String> delete(
				@RequestParam("id") int id){
			
		Map<String, String> result = new HashMap<>();
		if(bookingBO.deleteBooking(id) == 1) {
			result.put("result", "success");
		}else {
			result.put("result", "fail");
		}
		
		return result;
	}
	
	@GetMapping("/add_booking_view")
	public String addBooking() {
		return "lesson06/test03/insertBooking";
	}
	
	@GetMapping("/add_booking")
	@ResponseBody
	public Map<String, String> insertBooking(
			@RequestParam("name") String name
			, @RequestParam("date") String date
			, @RequestParam("day") int day
			, @RequestParam("headcount") int headcount
			, @RequestParam("phoneNumber") String phoneNumber){
		
		int count = bookingBO.addBooking(name, date, day, headcount, phoneNumber);
		
		Map<String, String> result = new HashMap<>();
		
			if(count == 1) {
				result.put("result", "success");
			} else {
				result.put("result", "fail");
			}
		
			return result;
	}
	
	@GetMapping("/get_booking")
	@ResponseBody
	public Map<String, Object> getBooking(
			@RequestParam("name") String name
			, @RequestParam("phoneNumber") String phoneNumber) {
		
		Map<String, Object> result = new HashMap<>();
		
		Booking booking = bookingBO.getBooking(name, phoneNumber);
		if(booking != null) {
			result.put("result", "success");
			result.put("booking", booking);
		} else {
			result.put("result", "fail");
		}
		
		return result;
	}
	

}
