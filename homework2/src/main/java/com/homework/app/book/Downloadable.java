package main.java.com.homework.app.book;

import main.java.com.homework.app.book.exeptions.DownloadException;


public interface Downloadable {

    public  void download() throws DownloadException;

}

