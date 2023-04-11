package C21318233;


public class Rain {
    Heathens h;
    float x, y;

    //Rain constructor
    public Rain(Heathens h, float x, float y)
    {
        this.h = h;
        this.x = x;
        this.y = y;
    }

    //Determines the speed of the raindrop based on the amplitude
    public void fall(float amplitude) {
        y += Heathens.map(amplitude, 0, 1.0f, 6, 12.0f);
    }

    //Shows the raindrop
    public void show(boolean color) {
        if (color)
        {
            h.stroke(0,0,255);
        }
        else 
        {
          h.stroke(255);  
        }
        h.line(x, y, x, y + h.random(10,20));
    }

    //Once the raindrop hits the bottom, it resets to the top at a random y value
    public void bottom() {
        if (y > h.height) 
        {
            y = h.random(-200, 0);
        }
    }
}