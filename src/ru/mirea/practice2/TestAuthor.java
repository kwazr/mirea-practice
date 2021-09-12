package ru.mirea.practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", 'M', "ahTeck@somewhere.com");
        Author a2 = new Author("Sue Grant", 'F', "suGrant@somewhere.com");
        Author a3 = new Author("Jade Osten", 'U', "ja.Ost@somewhere.com");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
