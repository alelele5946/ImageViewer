/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.ui;


import imageviewer.model.Image;

/**
 *
 * @author Entrar
 */
public interface ImageDisplay {
    Image current();
    void show(Image image);
    
}
