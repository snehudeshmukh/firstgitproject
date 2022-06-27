package autowiring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Library {
private String deptName;
@Autowired
@Qualifier("book2")
 private Book book;
public String getDeptName() {
	return deptName;
}

public Library() {
	super();
	// TODO Auto-generated constructor stub
}


//@Autowired
public Library(Book book) {
	super();
	this.book = book;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public Book getBook() {
	return book;
}
//@Autowired
//@Qualifier("book1")
public void setBook(Book book) {
	this.book = book;
}
@Override
public String toString() {
	return "Library [deptName=" + deptName + ", book=" + book + "]";
}

}
