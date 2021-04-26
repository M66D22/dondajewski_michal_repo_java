import java.time.LocalDate;

class ToDo{
	private String title = "";
	private String content = "";
	private String author = "Anonymous";
	private LocalDate add_date = LocalDate.now();
	
	//Constructor author unknown
	public ToDo(String title, String content){
		this.title = title;
		this.content = content;
	}
	//Constructor
	public ToDo(String title, String content, String author){
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public String getTitle(){
		return title;
	}
	public String getContent(){
		return content;
	}
	public String getAuthor(){
		return author;
	}
	public LocalDate getDate(){
		return add_date;
	}
	
	@Override
	public String toString(){
		return "Title: "+title
			+"\n"+"Content: "+content
			+"\n"+"Author: "+author
			+"\n"+"Date: "+add_date;
	}
}