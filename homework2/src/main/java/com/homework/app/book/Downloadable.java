package main.java.ksenia.app.book;

import main.java.ksenia.app.book.exeptions.DownloadException;


public interface Downloadable {

    public  void download() throws DownloadException;

}

