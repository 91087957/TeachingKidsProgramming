package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class RecursiveSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.getBackgroundWindow().setBackground(PenColors.Greens.DarkGreen);
    Tortoise.setPenColor(PenColors.Yellows.Gold);
    //
    Tortoise.setSpeed(10);
    //  Update the length to 100.0 --#1.1
    double length = 100.0;
    //  MakeASquare with the current length(recipe below) --#11.4
    //
    makeASquare(length);
  }
  private static void makeASquare(double length)
  {
    //  If the current length is greater than 10 --#10.2
    if (length > 10)
    {
      moveToTheSquareStart(length);
      for (int i = 0; i < 4; i++)
      {
        Tortoise.move(length);
        makeASquare(length / 1.7);
        //      If the current process count is less than 3 (HINT: use 'i') --#9
        if (i < 3)
        {
          Tortoise.turn(90);
        }
      }
    }
    //
    //  MoveBackToCenter with the current length (recipe below)--#5.3
    moveBackToCenter(length);
    //
    length = length * 2;
  }
  private static void moveBackToCenter(double length)
  {
    //  Create the moveBackToCenter recipe --#5.1
    Tortoise.setPenUp();
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
    //
    //
    //  End of moveBackToCenter recipe--#5.2
  }
  private static void moveToTheSquareStart(double length)
  {
    Tortoise.setPenUp();
    Tortoise.move(length / 2);
    Tortoise.turn(-90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
  }
}
