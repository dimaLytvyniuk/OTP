package com.lab111.labwork4.implemention.Image;

public class ImageQtGui implements ImageImpl {
    @Override
    public void drawImage(int x, int y, int height, int width, String path) {
        System.out.println("Qt Draw Image: " + x +", " + y + ", " + height + ", " + width + ", " + path);
    }
}
