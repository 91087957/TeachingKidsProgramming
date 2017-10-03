package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuizGrader;

public class HiLowQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuiz
{
  @Override
  public void question1()
  {
    int y = Tortoise.getY();
    if (y == 115)
    {
      Tortoise.turn(63);
    }
  }
  @Override
  public void question2()
  {
    int y = Tortoise.getY();
    int x = Tortoise.getX();
    
    {
      if (x > y)
    }
    //  If the X position of tortoise is less than Y position of tortoise
    Tortoise.turn(-54);
    Tortoise.turn(22);
  }
  @Override
  public void question3()
  {
    MessageBox.showMessage("elcomeway omehay!");
  }
  @Override
  public void question4()
  {
    //  If the Y position of tortoise is greater than 50
    Tortoise.turn(-177);
  }
  public static void main(String[] args)
  {
    new HiLowQuizGrader().grade(new HiLowQuiz());
  }
}
