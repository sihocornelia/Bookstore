package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="book")
public class Book {

	@Id
	@Column(name="ISBN")
	private String isbn;

	@Column(name="BOOK_NAME")
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PUBLISHER_CODE")
	private Publisher publisher;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="BOOK_ISBN")
	private List<Chapter> chapters;

	public Book() {
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
}












































