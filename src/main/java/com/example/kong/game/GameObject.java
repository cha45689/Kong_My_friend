package com.example.kong.game;

/**
 * Created by Kong on 11/13/2017.
 */
import android.graphics.Rect;

public abstract class GameObject {
    // แกน x
    protected int x;
    // แกน y
    protected int y;
    // ดิฟ y
    protected int dy;
    // ดิฟ x
    protected int dx;
    // กว่้าง
    protected int width;
    // สูง
    protected int height;

    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getHeight()
    {
        return height;
    }
    public int getWidth()
    {
        return width;
    }
    public Rect getRectangle()
    {
        return new Rect(x, y, x+width, y+height);
    }

}