public class Prism extends Rectangle implements Volume{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume(){
	return getArea() * height;
    }

    public String toString(){
	return "Prism "+getName()+" with volume of "+getVolume()+", with base area of "+getArea()+", with width="+getWidth()+", length="+getLength()+", and height="+getHeight();
    }
}
