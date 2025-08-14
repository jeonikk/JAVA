package Ch01;
class Book {
	String bookName;
	String authorName;
	int year;
	
	public Book(String bookName,String authorName,int year) {
		this.bookName =bookName;
		this.authorName =authorName;
		this.year =year;
	}
	void show() {
		System.out.printf("제목 : %s\n저자 : %s\n출판년도 : %d",this.bookName,this.authorName,this.year);
	}
}
public class C09연습 {

	public static void main(String[] args) {
        Book myBook = new Book("해리 포터", "J.K. 롤링", 1997);
        myBook.show();

	}

}
