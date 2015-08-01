package cn.com.company.baseproject.common.exception;

/**
 * 业务异常
 * 
 * @author Ron
 * @date 2015年8月1日
 */
public class BusinessException extends BaseException {

	private static final long	serialVersionUID	= 1185194371898930783L;

	public BusinessException(String errCode, Throwable e) {
		super(errCode, e);
	}

	public BusinessException(String errCode, String msg, Throwable e) {
		super(errCode, msg, e);
	}
}
