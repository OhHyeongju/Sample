package Properties;

import Processing.Processing;

/**
 * Created by user on 2016-02-04.
 */
public class Stroke {

    public float R,G,B,W;

    public void setStroke(int r, int g, int b, int weight){
        this.R=(float)r;
        this.G=(float)g;
        this.B=(float)b;
        this.W=(float)weight;
    }

    public void setStrokeProperties(){
        Processing.startProcessing.strokeWeight(W);
        Processing.startProcessing.fill(R,G,B);
    }
}
