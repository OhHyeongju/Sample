package ShapeObj;

import Properties.Color;
import Properties.Stroke;


public class Shape {

    Color color;
    Stroke stroke;

    public Shape(){
        color = new Color();
        stroke = new Stroke();
    }

    public void setColor(int r, int g, int b, int a){color.setColor(r,g,b,a);}
    public void setStroke(int r, int g, int b, int weight)
    {stroke.setStroke(r,g,b,weight);}

    public void setPos(int x, int y, int z, int a){}

    public void draw(){
        color.setColorProperties();
        stroke.setStrokeProperties();
    }
}
