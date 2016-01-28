package cn.com.company.baseproject.web.controller.stardard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.company.baseproject.repository.dao.DemoMapper;
import cn.com.company.baseproject.repository.util.Page;

/**
 * Demo controller
 * 
 * @author Ron
 * @date 2015年8月1日
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

	private static final Logger	logger	= LoggerFactory.getLogger(DemoController.class);

	@Autowired
	DemoMapper					demoMapper;

	/**
	 * test
	 * 
	 * @return
	 */
	@RequestMapping("/test")
	@ResponseBody
	String test() {
		logger.debug("test start ...");

		Page page = new Page();
		demoMapper.selectDemosForPage(page, "test");

		logger.debug("test end ...");
		return "success";
	}

}
