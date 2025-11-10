class Book{
private String name;
private String author;
private double price;
private int num_pages;

public Book(String name, String author, double price, int num_pages){
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}
public void setName(String name){
this.name=name;
}
public void setAuthor(String author){
this.author=author;
}
public void setPrice(double price){
this.price=price;
}
public void setNumpages(int num_pages){
this.num_pages=num_pages;
}
public String getName(){
return name;
}
public String getAuthor(){
return author;
}
public double getPrice(){
return price;
}
public int getNumpages(){
return num_pages;
}

public String toString(){
return "Book Name:"+name+"\nAuthor:"+author+"\nPrice:"+price+"\nNumber of pages="+num_pages;
}
}