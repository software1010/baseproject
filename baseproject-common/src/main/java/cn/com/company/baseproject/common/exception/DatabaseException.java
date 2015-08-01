package cn.com.company.baseproject.common.exception;

/**
 * 数据库操作异常
 * 
 * @author Ron
 * @date 2015年8月1日
 */
public class DatabaseException extends BaseException {

	private static final long	serialVersionUID	= 1185194371898930783L;

	public DatabaseException(String errCode, Throwable e) {
		super(errCode, e);
	}

	public DatabaseException(String errCode, String msg, Throwable e) {
		super(errCode, msg, e);
	}
}
