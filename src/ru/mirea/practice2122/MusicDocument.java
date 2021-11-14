package ru.mirea.practice2122;

public class MusicDocument implements IDocument {
    public void New() {
        System.out.println("Music: Создан файл");
    }
    public void Open() {
        System.out.println("Music: Открыт файл");
    }
    public void Save() {
        System.out.println("Music: Сохранен файл");
    }
    public void Exit() {
        System.out.println("Music: Закрыт файл");
    }
}