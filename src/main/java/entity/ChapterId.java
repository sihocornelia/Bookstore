package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

//The Embeddable must be `Serializable` and we need to provide an implementation for `equals` and `hashCode`.
@Embeddable
public class ChapterId implements Serializable {

    @Column(name="BOOK_ISBN")
    private String bookIsbn;

    @Column(name="CHAPTER_NUM")
    private Integer chapterNumber;

    public ChapterId() {
    }

    public ChapterId(String bookIsbn, Integer chapterNumber) {
        this.bookIsbn = bookIsbn;
        this.chapterNumber = chapterNumber;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChapterId chapterId = (ChapterId) o;
        return Objects.equals(getBookIsbn(), chapterId.getBookIsbn()) &&
                Objects.equals(getChapterNumber(), chapterId.getChapterNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookIsbn(), getChapterNumber());
    }
}
