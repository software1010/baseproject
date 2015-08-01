package cn.com.company.baseproject.common.exception;

/**
 * 异常基类
 * 
 * @author Ron
 * @date 2015年8月1日
 */
public abstract class BaseException extends RuntimeException {

	private static final long	serialVersionUID	= 2350290896375353216L;
	/**
	 * 错误码
	 */
	private String	errCode;

	public BaseException(String errCode, Throwable e) {
		super(errCode, e);
		this.errCode = errCode;
	}
	
	public BaseException(String errCode, String msg, Throwable e) {
		super(errCode + msg, e);
		this.errCode = errCode;
	}

	public String getErrCode() {
		return errCode;
	}

}
