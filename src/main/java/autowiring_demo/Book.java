package autowiring_demo;

public class Book {
String authorName;
String bookName;
public String getAuthorName() {
	return authorName;
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}

public Book(String authorName, String bookName) {
	super();
	this.authorName = authorName;
	this.bookName = bookName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
@Override
public String toString() {
	return "Book [authorName=" + authorName + ", bookName=" + bookName + "]";
}

}
