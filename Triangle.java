public class Triangle {

private Point v1, v2, v3;

public Triangle(Point a, Point b, Point c){
  v1 = a;
  v2 = b;
  v3 = c;

}

public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){

  v1 = new Point(x1,y1);
  v2 = new Point(x2, y2);
  v3 = new Point(x3, y3);


}

public double getPerimeter() {
//return the perimeter without any rounding

  return (v2.distanceTo(v1) + v1.distanceTo(v3) + v3.distanceTo(v2));



}

public double getArea(){
//returns the area using heron's formula without any rounding
  double s = getPerimeter() / 2;
  double side1 = v2.distanceTo(v1);
  double side2 = v2.distanceTo(v3);
  double side3 = v3.distanceTo(v2);

  return Math.sqrt( s * (s - side1) * (s - side2) * (s - side3) );


}



}
