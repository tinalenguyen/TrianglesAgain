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

  return (v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1));



}

public double getArea(){
//returns the area using heron's formula without any rounding
  double s = getPerimeter() / 2.0;
  double side1 = v1.distanceTo(v2);
  double side2 = v2.distanceTo(v3);
  double side3 = v3.distanceTo(v1);

  return Math.sqrt( s * (s - side1) * (s - side2) * (s - side3) );


}

public String classify() {
//return the triangle as equilateral/isosceles/scalene
double side1 = Math.round(v2.distanceTo(v1) * 1000.0) / 1000.0;
double side2 = Math.round(v2.distanceTo(v3) * 1000.0) / 1000.0;
double side3 = Math.round(v1.distanceTo(v3) * 1000.0) / 1000.0;
String result = "";
  if (side1 == side2 && side2 == side3 && side1 == side3){
    result = "equilateral";
  }

  else if (side1 == side2 || side2 == side3 || side1 == side3){
    result = "isosceles";
  }

  else  {
    result = "scalene";
  }

  return result;
}

public String toString(){
//format should be "v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"
return "v1(" + v1.getX() + ", " + v1.getY() +
       ") v2(" + v2.getX() + ", " + v2.getY() +
       ") v3(" + v3.getX() + ", " + v3.getY() + ")";

}

public void setVertex(int index, Point newP){
//replace specified point with new Point

if (index == 0) {
  v1 = newP;
}

if (index == 1){
  v2 = newP;
}

if (index == 2){
  v3 = newP;
}

  }

}
