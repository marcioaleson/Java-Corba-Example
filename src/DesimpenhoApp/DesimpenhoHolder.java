package DesimpenhoApp;

/**
* DesimpenhoApp/DesimpenhoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Desimpenho.idl
* Segunda-feira, 17 de Fevereiro de 2014 05h04min19s GMT-03:00
*/

public final class DesimpenhoHolder implements org.omg.CORBA.portable.Streamable
{
  public DesimpenhoApp.Desimpenho value = null;

  public DesimpenhoHolder ()
  {
  }

  public DesimpenhoHolder (DesimpenhoApp.Desimpenho initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DesimpenhoApp.DesimpenhoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DesimpenhoApp.DesimpenhoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DesimpenhoApp.DesimpenhoHelper.type ();
  }

}