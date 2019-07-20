package com.example.muhtadi.a445.shapes;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Mubeen on 2/9/2017.
 */
public interface Shape {
    public void draw(GL10 gl);
    public void loadGLTexture(GL10 gl);
}
