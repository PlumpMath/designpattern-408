package com.github.xbest.structural.decorator;

import java.io.*;

/**
 * Created by link on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            int c;
            inputStream = new LowerCaseInputStream(new BufferedInputStream(
                    Client.class.getResourceAsStream("/resources/decorator.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
