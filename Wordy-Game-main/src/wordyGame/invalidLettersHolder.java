package wordyGame;

/**
* wordyGame/invalidLettersHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Wordy.idl
* Sunday, June 18, 2023 11:16:05 PM SGT
*/

public final class invalidLettersHolder implements org.omg.CORBA.portable.Streamable
{
  public wordyGame.invalidLetters value = null;

  public invalidLettersHolder ()
  {
  }

  public invalidLettersHolder (wordyGame.invalidLetters initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = wordyGame.invalidLettersHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    wordyGame.invalidLettersHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return wordyGame.invalidLettersHelper.type ();
  }

}
