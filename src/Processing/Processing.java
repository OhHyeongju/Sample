package Processing;

import ShapeObj.Circle;
import ShapeObj.Rect;
import ShapeObj.Shape;
import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016-02-04.
 */
public class Processing extends PApplet{

    private int flag = 0;
    List<Shape> shapes = new ArrayList<>();
    public final static Processing startProcessing = new Processing();

    Circle circle;
    Rect rect;

    public static void main(String args[]){
        startProcessing.runSketch();
    }

    public void settings(){size(800,600);}

    public void setup(){smooth();}

    public void draw(){
        background(255);
        for(Shape each: shapes)
            each.draw();
    }

    public void addCircle(){
        circle = new Circle();
        circle.setPos(mouseX, mouseY, 100, 100);
        circle.setColor(100,20,200,255);
        circle.setStroke(20,200,100,2);

        shapes.add(circle);
    }

    public void addRect(){
        rect = new Rect();
        rect.setPos(mouseX,mouseY,100,100);
        rect.setColor(100,20,200,255);
        rect.setStroke(20,200,100,2);

        shapes.add(rect);
    }

    public void mousePressed(){
        if(flag == 0){
            addCircle();
            flag = 1;
        }else{
            addRect();
            flag=0;
        }
    }
}
