package sist.com.obj.app3;

public class Board {
	private String id;
	private String writer;
	private String title;
	private String contents;
	private int hit;
	private String regdate;
	public Board() {
		super();
	}
	public Board(String id, String writer, String title) {
		super();
		this.id = id;
		this.writer = writer;
		this.title = title;
	}
	public Board(String id, String writer, String title, String contents, int hit, String regdate) {
		super();
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.hit = hit;
		this.regdate = regdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Board [id=" + id + ", writer=" + writer + ", title=" + title + ", contents=" + contents + ", hit=" + hit
				+ ", regdate=" + regdate + "]";
	}
}
