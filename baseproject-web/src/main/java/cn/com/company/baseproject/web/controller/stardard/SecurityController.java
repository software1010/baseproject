package cn.com.company.baseproject.web.controller.stardard;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.company.baseproject.common.Constants;
import cn.com.company.baseproject.common.image.VerifyCode;

/**
 * 安全
 * 
 * @author Ron
 * @date 2016年2月28日
 */
@Controller
public class SecurityController {

	/**
	 * 登陆
	 * 
	 * @return
	 */
	@RequestMapping("/login")
	String login() {
		return "login";
	}

	/**
	 * 动态验证码
	 */
	@RequestMapping(value = "/verifyCode", method = RequestMethod.GET)
	void verifyCode(HttpServletRequest request, HttpServletResponse response) {
		// 设置响应的类型格式为图片格式
		response.setContentType("image/jpeg");
		// 禁止图像缓存。
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);

		HttpSession session = request.getSession();

		VerifyCode vCode = new VerifyCode(100, 33, 4, 160);
		session.setAttribute(Constants.VERIFY_CODE, vCode.getCode());
		try {
			vCode.write(response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
