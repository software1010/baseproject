package cn.com.company.baseproject.common.image;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * 验证码生成器
 * 
 * @author Ron
 * @date 2014年8月21日
 */
public class VerifyCode {
	// 图片的宽度。
	private int width = 160;
	// 图片的高度。
	private int height = 40;
	// 验证码字符个数
	private int codeCount = 4;
	// 验证码干扰线数
	private int lineCount = 150;
	// 验证码
	private String code = null;
	// 验证码图片Buffer
	private BufferedImage buffImg = null;

	private char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3',
			'4', '5', '6', '7', '8', '9' };

	public VerifyCode() {
		this.createCode();
	}

	/**
	 * 
	 * @param width
	 *            图片宽
	 * @param height
	 *            图片高
	 */
	public VerifyCode(int width, int height) {
		this.width = width;
		this.height = height;
		this.createCode();
	}

	/**
	 * 
	 * @param width
	 *            图片宽
	 * @param height
	 *            图片高
	 * @param codeCount
	 *            字符个数
	 * @param lineCount
	 *            干扰线条数
	 */
	public VerifyCode(int width, int height, int codeCount, int lineCount) {
		this.width = width;
		this.height = height;
		this.codeCount = codeCount;
		this.lineCount = lineCount;
		this.createCode();
	}

	public void createCode() {
		int x = 0, fontHeight = 0, codeY = 0;
		int red = 0, green = 0, blue = 0;

		x = width / (codeCount + 2);// 每个字符的宽度
		fontHeight = height - 2;// 字体的高度
		codeY = height - 4;

		// 图像buffer
		buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = buffImg.createGraphics();
		// 生成随机数
		Random random = new Random();
		// 将图像填充为白色
		g.setColor(new Color(220, 238, 252));
		g.fillRect(0, 0, width, height);
		// 创建字体
		// ImgFontByte imgFont=new ImgFontByte();
		// Font font =imgFont.getFont(fontHeight);
		Font font = new Font(null, Font.BOLD, fontHeight);
		g.setFont(font);

		for (int i = 0; i < lineCount; i++) {
			// int xs = random.nextInt(width);
			// int ys = random.nextInt(height);
			// int xe = xs + random.nextInt(width / 8);
			// int ye = ys + random.nextInt(height / 8);
			// red = random.nextInt(255);
			// green = random.nextInt(255);
			// blue = random.nextInt(255);
			// g.setColor(new Color(red, green, blue));
			// g.drawLine(xs, ys, xe, ye);
			g.setColor(getRandColor(120, 160, random));
			int xs = random.nextInt(width);
			int ys = random.nextInt(height);
			int xl = random.nextInt(10);
			int yl = random.nextInt(10);
			g.drawLine(xs, ys, xs + xl, ys + yl);
		}

		// randomCode记录随机产生的验证码
		StringBuffer randomCode = new StringBuffer();
		// 随机产生codeCount个字符的验证码。
		for (int i = 0; i < codeCount; i++) {
			String strRand = String.valueOf(codeSequence[random.nextInt(codeSequence.length)]);
			// 产生随机的颜色值，让输出的每个字符的颜色值都将不同。
			red = random.nextInt(255);
			green = random.nextInt(255);
			blue = random.nextInt(255);
			// g.setColor(new Color(red, green, blue));
			g.setColor(new Color(100 + random.nextInt(100), 30 + random.nextInt(60), 30 + random.nextInt(60))); // 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
			g.drawString(strRand, (i + 1) * x, codeY);
			// 将产生的四个随机数组合在一起。
			randomCode.append(strRand);
		}
		// 将四位数字的验证码保存到Session中。
		code = randomCode.toString();
	}

	public void write(String path) throws IOException {
		OutputStream sos = new FileOutputStream(path);
		this.write(sos);
	}

	public void write(OutputStream sos) throws IOException {
		ImageIO.write(buffImg, "png", sos);
		sos.close();
	}

	public BufferedImage getBuffImg() {
		return buffImg;
	}

	public String getCode() {
		return code;
	}

	/**
	 * 获取给定范围内随机颜色
	 * 
	 * @param fc
	 * @param bc
	 * @return
	 */
	private Color getRandColor(int fc, int bc, Random random) {
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
}