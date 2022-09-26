package com.jjorim.spring.book.dto;

public class BookVO {

	// 테이블 컬럼에 해당하는 변수 생성
		private String book_id;
	    private String title;
	    private String author;
	    private Integer price;
	    private String cdate;
	    private String udate;
	    
	    
	 // 각 변수에 대한 getter, setter 메서드 생성
		public String getBook_id() {
			return book_id;
		}
		public void setBook_id(String book_id) {
			this.book_id = book_id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public String getCdate() {
			return cdate;
		}
		public void setCdate(String cdate) {
			this.cdate = cdate;
		}
		public String getUdate() {
			return udate;
		}
		public void setUdate(String udate) {
			this.udate = udate;
		}
	
}
