package com.company;

public class Digits
{
  public Digits(int num)
  {
    digitList = new ArrayList<Integer>();
    String x = String.valueOf(num);
    for(int i = 0; i < x. length(); i ++)
    {
      digitList.add(Integer.parseInt(x.charAt(i));
    }
  }
  
  public boolean isStrictlyIncreasing()
  {
    for(int i = 1; i < digitList.size(); i++)
    {
      if(digitList.get(i-1)>= digitList.get(i))
      {
        return false;
      }
    }
    return true;
  }
}
