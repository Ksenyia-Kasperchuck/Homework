package com.homework.app;

import com.homework.app.book.*;
import com.homework.app.book.exeptions.DownloadException;
import com.homework.app.book.menu.Menu;
import com.homework.app.book.utils.ReadingFromFile;
import com.homework.app.book.utils.WrittingToFile;

import java.io.*;


public class Executor {
    public static void main(String[] args) throws IOException, DownloadException {
        Menu menu=new Menu();
        menu.show();

    }
}

