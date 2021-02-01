package com.homework.app.book;

import com.homework.app.book.exeptions.DownloadException;


public interface Downloadable {

    public  void download() throws DownloadException;

}

