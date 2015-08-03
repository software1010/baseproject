package cn.com.company.baseproject.repository.interceptor.dialect;

import cn.com.company.baseproject.repository.util.Page;



/**
 * 数据分页方言接口
 * 
 * @author dave.ww
 * @version $Id: Dialect.java, v 0.1 2015年7月17日 上午11:34:24 dave.ww Exp $
 */
public interface Dialect {

	/**
	 * 由生成指定数据库方言的分页sql语句
	 * @param page
	 * @param sqlBuffer
	 * @return
	 */
	public String getPageSql(Page page, StringBuffer sqlBuffer);

}
