package Function;

public class Main {


	// ALL AREA FORMULAS //
	public static double area(double w, double l){
		return l*w;
	}

	public static double area(double l){
		return l*l;
	}

	public static double areaTriangle(double h, double b){
		return (b*h)/2;
	}

	public static double areaTriangle(double a){
		return (Math.pow(3, .5)/4)*(Math.pow(a, 2));
	}

	public static double parallelogramArea(double b, double h){
		return b*h;
	}

	public static double trapezoidArea(double b1, double b2, double h){
		return (h/2) * (b1 + b2);
	}

	public static double circleArea(double r){
		return Math.PI*Math.pow(r, 2);
	}

	public static double ellipseArea(double r1, double r2){
		return Math.PI*(r1*r2);
	}

	// PERIMETER //

	public static double cdCircle(double d){
		return Math.PI*d;
	}

	public static double crCircle(double r){
		return Math.PI*Math.pow(r, 2);
	}

	public static double pSquare(double s){
		return 4 * s;
	}

	public static double pRectangle(double l, double w){
		return 2 * l + 2 * w;
	}

	public static double pTriangle(double a, double b, double c){
		return a + b + c;
	}

	// ALL VOLUME FORMULAS //

	public static double cube(double s){
		return Math.pow(s, 3);
	}

	public static double recPrism(double b, double h, double w){
		return b * h * w;
	}

	//irrPrism too
	public static double cylinder(double r, double h){
		return Math.PI * Math.pow(r, 2) * h;
	}

	//Pyramid too
	public static double cone(double r, double h){
		return (cylinder(r, h))/(1/3);
	}

	public static double sphere(double r){
		return Math.pow(r, 3) * Math.PI * (4/3);
	}

	public static double ellipsoid(double r1, double r2, double r3){
		return r1 * r2 * r3 * Math.PI * (4/3);
	}

	// ALL SURFACE AREA FORMULAS //

	public static double saCube(double s){
		return (Math.pow(s, 2)) * 6;
	}

	public static double saRectangularPrism(double w, double h, double l){
		return 2*w*h + 2*h*l + 2*l*w;
	}

	public static double saSphere(double r){
		return Math.pow(r, 2) * Math.PI * 4;
	}

	public static double saCylinder(double r, double h){
		return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
	}

	// MISC FORMULAS //

	public static String quadratic(double a, double b, double c){
		return "It can be " + ((-1* b) - Math.sqrt((Math.pow(b, 2) - (4 * a * c))))/2 + " or " + ((-1* b) + Math.sqrt((Math.pow(b, 2) - (4 * a * c))))/2;
	}
}
