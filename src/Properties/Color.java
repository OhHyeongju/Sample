package Properties;

import Processing.Processing;

/**
 * Created by user on 2016-02-04.
 */
public class Color {

    public float R,G,B,A;

    public void setColor(int r, int g, int b, int a){
        this.R=(float)r;
        this.G=(float)g;
        this.B=(float)b;
        this.A=(float)a;
    }
    public void setColorProperties(){
        Processing.startProcessing.fill(R,G,B,A);
    }
}
