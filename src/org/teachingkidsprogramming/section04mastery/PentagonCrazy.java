package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //
    createColorPalette();
    //
    //    drawPentagon (recipe below) --#10.1
    //
    //    ------------- Recipe for drawPentagon --#10.2
    for (int i = 0; i < 200; i++)
    {
      //
      adjustPen();
      //        The current length of a side is the same as the number of the side you are about to draw ( 1st side = 1 pixel, 2nd side = 2 pixels, etc) --#4.2
      //        Move the tortoise the length of a side --#4.1
      int length = i;
      Tortoise.move(length);
      Tortoise.turn(360 / 5);
      //        Turn the tortoise 1 more degree --#5
      Tortoise.turn(1);
    }
    //    ------------- End of drawPentagon recipe --#10.3
  }
  private static void adjustPen()
  {
    //        Change the pen color of the line the tortoise draws to the next color on the color wheel --#6
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //        Increase the tortoises pen width by 1 --#15                                              
    //        If the tortoise's pen width is greater than 4, then --#17
    //            Reset the pen width to 1 --#16
    //
  }
  private static void createColorPalette()
  {
    //    Add steel blue to the color wheel --#7
    ColorWheel.addColor(Blues.SteelBlue);
    //    Add dark orchid to the color wheel --#11
    //    Add dark slate blue to the color wheel --#12
    //    Add teal to the color wheel --#13
    //    Add indigo to the color wheel --#14
  }
}
