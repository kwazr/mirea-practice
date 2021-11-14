package ru.mirea.practice2122;

import java.util.Scanner;

public class Base {
    private IDocument Document;
    private IDocumentCreate DocumentCreate;
    public void New(){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите тип файла: Text, Image, Music");
        String nameDocument = in.nextLine();
        if (nameDocument.equals("Text")){
            DocumentCreate = new CreateTextDocument();
            Document = DocumentCreate.CreateNew();
            Document.New();
        }
        if (nameDocument.equals("Image")){
            DocumentCreate = new CreateImageDocument();
            Document = DocumentCreate.CreateNew();
            Document.New();
        }
        if (nameDocument.equals("Music")){
            DocumentCreate = new CreateMusicDocument();
            Document = DocumentCreate.CreateNew();
            Document.New();
        }
    }
    public void Open(){
        Document.Open();
    }
    public void Save(){
        Document.Save();
    }
    public void Exit(){
        Document.Exit();
    }
}
