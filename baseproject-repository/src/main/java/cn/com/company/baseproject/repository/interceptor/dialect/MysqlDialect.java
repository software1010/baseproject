package cn.com.company.baseproject.repository.interceptor.dialect;

import cn.com.company.baseproject.repository.util.Page;

/**
 * mysql 方言
 * 
 * @author Ron
 * @date 2015年8月2日
 */
public class MysqlDialect implements Dialect {

	@Override
	public String getPageSql(Page page, StringBuffer sqlBuffer) {
		// 计算第一条记录的位置，Mysql中记录的位置是从0开始的。
		int offset = page.getOffset();
		sqlBuffer.append(" limit ").append(offset).append(",").append(page.getSize());
		return sqlBuffer.toString();
	}

}
