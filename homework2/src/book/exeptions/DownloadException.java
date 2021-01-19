package book.exeptions;

public class DownloadException extends Exception{
    public DownloadException(){
        super("Sorry,you don't have access");
    }

}

