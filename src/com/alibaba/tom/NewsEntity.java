package com.alibaba.tom;

public class NewsEntity {
	public Integer Id;
	public String Title;
	public String Content;
	/** 
	* @return id 
	*/
	public Integer getId() {
		return Id;
	}
	/** 
	* @param id 要设置的 id 
	*/
	public void setId(Integer id) {
		Id = id;
	}
	/** 
	* @return title 
	*/
	public String getTitle() {
		return Title;
	}
	/** 
	* @param title 要设置的 title 
	*/
	public void setTitle(String title) {
		Title = title;
	}
	/** 
	* @return content 
	*/
	public String getContent() {
		return Content;
	}
	/** 
	* @param content 要设置的 content 
	*/
	public void setContent(String content) {
		Content = content;
	}
}
