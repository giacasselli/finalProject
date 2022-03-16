package finalproject;
class Circle
        {
    int r;
    int x;
    int y;
    String colour;
    int border;
    String borderColour;
    
    Circle(int r, int x, int y, String colour, int border, String borderColour)
    {
        this.r=r;
        this.x=x;
        this.y=y;
        this.colour=colour;
        this.border=border;
        this.borderColour=borderColour;
    }
    
}
class Rectangle
{
    int x;
    int y;
    int border; 
    String colour;
    String borderColour;
    int length;
    int width;
    
    Rectangle(int x, int y, int border, String colour, String borderColour, int length, int width)
    {
        this.x=x;
        this.y=y;
        this.border=border;
        this.colour=colour;
        this.borderColour=borderColour;
        this.length=length;
        this.width=width;
    }
}
class Line
{
    int startX;
    int startY;
    int endX;
    int endY;
    String colour;
    int border;
    
    Line(int startX, int startY, int endX, int endY, String colour, int border)
    {
        this.startX=startX;
        this.startY=startY;
        this.endX=endX;
        this.endY=endY;
        this.colour=colour;
        this.border=border;
    }
}
class AnimationPlayer
{
    AnimationPlayer()
    {
        
    }
    void loadAnimationFromFile(String FileName)
    {
        
    }
    void run()
    {
        
    }
}
public class animationPlayer {
    public static void main(String[] args) {

    }  
}
