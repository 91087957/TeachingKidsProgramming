package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibsVarariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edverb = askEdverb();
    String BodyPart = askBodyPart();
  }
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Try again !");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are NOT adverbs.");
      askAdverb();
    }
    return adverb;
  }//end of method
  private static String askEdverb()
  {
    String edverb = MessageBox.askForTextInput("Enter an edverb: ");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("Try again !");
      askEdverb();
    }
    else if (edverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are not edverbs. ");
      askEdverb();
    }
    return edverb;
  }
  private static String askBodyPart()
  {
    String askBodyPart = MessageBox.askForTextInput("Enter a body part: ");
    if(bodypart.isEmp)
  }
}// end of class
