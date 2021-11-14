package ru.mirea.practice2122;

public class CreateImageDocument implements IDocumentCreate {
    private ImageDocument image;
    public IDocument CreateNew() {
        image = new ImageDocument();
        return image;
    }
    public IDocument CreateOpen() {
        return image;
    }
}