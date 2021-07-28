package com.keyword;
class Bank
{
    String Name;
    String Branch;
    public Bank()
    {
        Name="ICICI BANK";
        Branch="Chennai";
        System.out.println(Name+" has branch in "+Branch);

    }
}
class AxisBank extends Bank
{
    String Name;
    String Branch;
    public AxisBank()
    {
        super();
        Name="AXIS BANK";
        Branch="Chromepet";
        System.out.println(Name+" has a branch in "+Branch);

    }
}

public class SuperUsingConstructor
{
    public static void main(String[] args)
    {
        AxisBank obj = new AxisBank();

    }
}
