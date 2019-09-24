package swelightsouls.demo.Model;

import java.util.Random;

public class Dice
{
    protected int total_Faces;
    protected int[] values;

    public int throw_Dice(Dice die)
    {
        return die.get_Element(new Random().nextInt(die.getTotal_Faces()));
    }

    public int getTotal_Faces()
    {
        return total_Faces;
    }

    public int get_Element(int i)
    {
        return values[i];
    }
}
