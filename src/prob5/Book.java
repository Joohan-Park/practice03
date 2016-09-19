package prob5;

public class Book {
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	
	//생성자
	public Book(int bookNO,String title,String author){
		this.bookNo = bookNO;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	//getter setter
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
	//메소드
	public void rent(){
		this.stateCode=0;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
	
	public void print(){
		System.out.println("책제목:"+this.title+", 작가:"+this.author+", 대여유무:"+(stateCode==0?"대여중":"재고있음"));
	}
	
	
}
