package cn.com.company.baseproject.common.exception;

/**
 * 通讯异常
 * 
 * @author Ron
 * @date 2015年8月1日
 */
public class ConnectionException extends BaseException {

	private static final long	serialVersionUID	= 1185194371898930783L;

	public ConnectionException(String errCode, Throwable e) {
		super(errCode, e);
	}

	public ConnectionException(String errCode, String msg, Throwable e) {
		super(errCode, msg, e);
	}
}
