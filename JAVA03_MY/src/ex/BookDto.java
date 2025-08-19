package ex;

public class BookDto {
//	속성
	private Long bookcode;
	private String bookName;
	private String publisher;
	private String isbn;
	
//	디폴트 생성자
	
	public BookDto() {}
	
//	모든인자 생성자

	public BookDto(Long bookcode, String bookName, String publisher, String isbn) {
		super();
		this.bookcode = bookcode;
		this.bookName = bookName;
		this.publisher = publisher;
		this.isbn = isbn;
	}

	
//	Getter and Setter
	
	public Long getBookcode() {
		return bookcode;
	}
	
	public void setBookcode(Long bookcode) {
		this.bookcode = bookcode;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
//	toString
	
	@Override
	public String toString() {
		return "BookDto [bookcode=" + bookcode + ", bookName=" + bookName + ", publisher=" + publisher + ", isbn="
				+ isbn + "]";
	}
	
	
}
