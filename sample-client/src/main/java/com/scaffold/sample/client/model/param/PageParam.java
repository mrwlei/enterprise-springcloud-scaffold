/**
 * 
 */
package com.scaffold.sample.client.model.param;

import lombok.Data;

/**
 * 页码
 * @author leiwa
 */
@Data
public class PageParam {

	/**
	 *用户ID
	 */
	private int userId;
	/**
	 * 页码
	 */
	private int pageNo;
	/**
	 * 每页大小
	 */
	private int pageSize;
}
