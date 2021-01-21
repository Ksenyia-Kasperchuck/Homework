package book;

import book.exeptions.DownloadException;


public interface Downloadable {

    public  void download() throws DownloadException;

}

