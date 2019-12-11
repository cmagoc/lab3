public class Tile1{

    public static void main(String [] args){
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.filledSquare(0.5,0.5,0.5);
	StdDraw.setPenColor(StdDraw.GRAY);
	double[] x = {0,0.5,0.5,1};
	double[] y = {0.5,0,1,0.5};
	StdDraw.filledPolygon(x,y);
	
	//	StdDraw.setPenColor(StdDraw.WHITE);
	//StdDraw.filledPolygon({0,.25,.25},{.75,.75,1});
	//StdDraw.filledPolygon({0,.25,.25},{.25,.25,0});
	//StdDraw.filledPolygon({.75,.75,1},{0,.25,.25});
	//StdDraw.filledPolygon({.75,.75,1},{1,.75,.75});
    }
}
