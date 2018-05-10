package entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="chapter")
public class Chapter {

    @EmbeddedId
    private ChapterId id;

	@Column(name="TITLE")
	private String title;

	public Chapter() {
	}

    public ChapterId getId() {
        return id;
    }

    public void setId(ChapterId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}














