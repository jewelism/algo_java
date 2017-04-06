package exam2;

import java.util.Arrays;
import java.util.Comparator;

class RectangleComparator implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle r1, Rectangle r2) {
		// TODO Auto-generated method stub
		if(r1 == r2) return 0;
		if(r1 ==null) return -1;
		if(r2 ==null) return 1;
		if(r1.getArea()>r2.getArea()) return -1;
		if(r2.getArea()>r1.getArea()) return 1;
		if(r1.getArea()==r2.getArea()) return 0;
		return 0;
	}
	
}

class Rectangle {
    private int width, height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getArea() {
        return width * height;
    }
}

public class Example3 {
    
    public static void main(String[] args) {
        Rectangle a[] = new Rectangle[] {
                new Rectangle(5, 7), new Rectangle(3, 2), new Rectangle(7, 2), 
                new Rectangle(4, 5), new Rectangle(8, 2), new Rectangle(6, 3) 
        };
        
        Comparator<Rectangle> rectangleComparator = new RectangleComparator();
        Arrays.sort(a, rectangleComparator);
        System.out.println(Arrays.toString(a));       
    }

}

