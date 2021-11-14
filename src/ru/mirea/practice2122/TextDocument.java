package ru.mirea.practice2122;

public class TextDocument implements IDocument {
    public void New() {
        System.out.println("Text: Создан файл");
    }
    public void Open() {
        System.out.println("Text: Открыт файл");
    }
    public void Save() {
        System.out.println("Text: Сохранен файл");
    }
    public void Exit() {
        System.out.println("Text: Закрыт файл");
    }
}
