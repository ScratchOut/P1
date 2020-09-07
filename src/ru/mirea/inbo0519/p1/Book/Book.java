package ru.mirea.inbo0519.p1.Book;

public class Book {
    private String name;
    private int pages;
    private String author;
    private String plot;

    public Book(String n, int p, String a, String pl){
        name = n;
        pages = p;
        author = a;
        plot = pl;
    }

    public Book(String n, int p, String a){
        name = n;
        pages = p;
        author = a;
        plot = "None";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPlot(String plot){
        this.plot = plot;
    }
    public String getName(){
        return name;
    }
    public int getPages(){
        return pages;
    }
    public String getAuthor(){
        return author;
    }
    public String getPlot(){
        return plot;
    }
    public String toString(){
        return this.name+", pages "+this.pages+", "+this.author+", "+this.plot;
    }

}
