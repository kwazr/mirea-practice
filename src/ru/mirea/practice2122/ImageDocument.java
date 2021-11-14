package ru.mirea.practice2122;

public class ImageDocument implements IDocument {
    public void New() {
        System.out.println("Image: Создан файл");
    }
    public void Open() {
        System.out.println("Image: Открыт файл");
    }
    public void Save() {
        System.out.println("Image: Сохранен файл");
    }
    public void Exit() {
        System.out.println("Image: Закрыт файл");
    }
}