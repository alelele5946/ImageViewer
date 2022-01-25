package imageviewer.controller;

import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;

import java.io.File;

public class Main {
    public static void main(String[] args){
        File file = new File("C:\\Users\\Alejandro\\Pictures\\");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainframe = new MainFrame();
        mainframe.getImageDisplay().show(image);
    }
}
