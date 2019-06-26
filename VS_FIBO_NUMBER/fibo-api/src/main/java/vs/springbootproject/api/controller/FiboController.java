package vs.springbootproject.api.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vs.springbootproject.api.model.Fibonumbers;
import vs.springbootproject.api.service.FiboService;

@RestController
public class FiboController {
	Fibonumbers fibonumbers;
	@Autowired
	private FiboService fiboService;
	public static final Logger logger = Logger.getLogger(Class.class.getName());

	@RequestMapping("/fibnumber/{number}")
	public ArrayList<Integer> findNumber(@PathVariable int number, HttpServletResponse response) throws IOException {

		if (number < 0) {

			response.sendError(400, "Please enter a number that is greater than zero");

		}

		return fiboService.findNumber(number);
	}

}
