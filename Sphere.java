public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public double getVolume(){
	return Math.pow(getRadius(),3) * Math.PI * (4/3);
    }

    public String toString(){
	return "FIXME!";
    }
}
