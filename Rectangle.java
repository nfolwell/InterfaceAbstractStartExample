public class Rectangle extends Shape
{
  private int length;
  private int width;
  
  public Rectangle(int length, int width)
  {
    super(4);
    this.length = length;
    this.width = width;
  }
  
  public int getLength()
  {
    return length;
  }
  
  public int getWidth()
  {
    return width;
  }

  // implementing abstract method
  public void printInfo()
  {
    System.out.println("I am a rectangle with length " + length + " and width " + width);
  }
}