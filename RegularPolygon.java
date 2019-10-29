
public class RegularPolygon {
private int n=3;
private double side=1;
private double x=0;
private double y=0;
RegularPolygon(){}
RegularPolygon(int newN,int newS){
	n=newN;
	side=newS;
	x=0;
	y=0;
}
RegularPolygon(int newN,int newS,double newX,double newY){
	n=newN;
	side=newS;
	x=newX;
	y=newY;
}
public void setN(int newN){
	n=newN;
}
public void setSide(double newX){
	x=newX;
}
public void setY(double newY){
	y=newY;
}
public double getSide(){
	return side;
}
public double getX(){
	return x;
}
public double getY(){
	return y;
}
public double getPerimeter(){
	return n*side;
}public double getArea(){
	return (n*side*side)/(4*Math.tan(getPerimeter()/n));
}


	public static void main(String[]args){
		RegularPolygon r1=new RegularPolygon();
		System.out.println(r1);
		System.out.println("����һ���ܳ���"+r1.getPerimeter()+" ���:"+r1.getArea());
		RegularPolygon r2=new
		RegularPolygon(6,4);
		System.out.println("��������ܳ���"+r2.getPerimeter()+" ���:"+r2.getArea());
		RegularPolygon r3=new
		RegularPolygon(10,4,5.6,7.8);
		System.out.println("���������ܳ���"+r3.getPerimeter()+" ���:"+r3.getArea());
		
	}
}