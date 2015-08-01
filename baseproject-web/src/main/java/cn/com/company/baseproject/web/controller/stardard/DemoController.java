package cn.com.company.baseproject.web.controller.stardard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Demo controller
 * 
 * @author Ron
 * @date 2015年8月1日
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

	/**
	 * test
	 * 
	 * @return
	 */
	@RequestMapping("/test")
	@ResponseBody
	String test() {
		return "success";
	}

}
