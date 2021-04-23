package com.mycompany.testinglang;
public class Driver4 {
    public static void main(String[] args){
        Author a1 = new Author();
        
        a1.setName("Toriyama");
        Book b1 = new Book("Otaku for Life",a1,1500);
        
        
        System.out.println(b1.getAuthor().getName());
        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        
        System.out.println(b1.toString());
        
        
        
        
        
    }
}
