package cn.com.company.baseproject.common.protocol;

/**
 * 返回报文定义
 * 
 * @author Ron
 * @date 2015年8月1日
 */
public class Message {
	/**
	 * 返回码
	 */
	private String	resultCode;
	/**
	 * 返回消息
	 */
	private String	resultMsg;
	/**
	 * 返回数据
	 */
	private Object	data;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
