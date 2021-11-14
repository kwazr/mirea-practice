package ru.mirea.practice2122;

public class CreateMusicDocument implements IDocumentCreate {
    private MusicDocument music;
    public IDocument CreateNew() {
        music =  new MusicDocument();
        return music;
    }
    public IDocument CreateOpen() {
        return music;
    }
}
