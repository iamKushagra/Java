public class Rectangle
{
	int lenght, width;
	void insert(int l, int w)
	{
		lenght=l;
		width=w;
	}void calculateArea()
	{
		System.out.println(lenght*width);

	}
}
class TestRectangle1
{
	public static void main(String[] args) {
	Rectangle r1= new Rectangle();
	Rectangle r2= new Rectangle();
    r1.insert(11,5);
    r2.insert(3,15);
    r1.calculateArea();
    r2.calculateArea();
	}
}