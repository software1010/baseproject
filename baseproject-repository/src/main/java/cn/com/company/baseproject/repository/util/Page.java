package cn.com.company.baseproject.repository.util;

/**
 * 分页
 * 
 * @author Ron
 * @date 2015年8月2日
 */
public class Page {
	/**
	 * 页码
	 */
	private int	page	= 1;
	/**
	 * 每页显示行数
	 */
	private int	size	= 10;
	/**
	 * 总行数
	 */
	private int	totalRow;
	/**
	 * 总页数
	 */
	private int	totalPage;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public long getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
		int totalPage = totalRow % size == 0 ? totalRow / size : totalRow / size + 1;
		this.setTotalPage(totalPage);
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * 获取查询指针
	 * 
	 * @return
	 */
	public int getOffset() {
		return (page - 1) * size;
	}
}
