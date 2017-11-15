package com.lab111.labwork4.implemention.Image;

public class ImageWpfGui  implements ImageImpl {
    @Override
    public void drawImage(int x, int y, int height, int width, String path) {
        System.out.println("Wpf Draw Image: " + x +", " + y + ", " + height + ", " + width + ", " + path);
    }
}
