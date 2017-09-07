package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Yerissa");
    Tortoise.show();
    Tortoise.setSpeed(5);
    int sides = 80;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.setPenWidth(i);
      int length = i;
      Tortoise.move(50);
      Tortoise.turn(90); // i is a loop variable
    }
    //
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}
