package Fangen;

import java.io.PrintStream;

public abstract class Fangen implements Drawble {

    protected PrintStream stream;
    protected int size;
    private boolean direction;
    private CharSet chars;


    public Fangen(int size, CharSet chars){
        this.size = Math.abs(size * 2);
        direction = size > 0;
        this.chars = chars;
    }

    @Override
    public void draw()
    {
        for (int i = 0; i < this.size; ++i)
        {
            for (int j = 0; j < this.size; ++j)
            {
                // Prawo
                if (direction)
                {
                    if (i < size / 2)
                    {
                        // Lewy gorny
                        if (j < size / 2)
                        {
                            if (j < i + 1)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy gorny
                        else
                        {
                            if (j < size - i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    }
                    else
                    {
                        // Lewy dolny
                        if (j < size / 2)
                        {
                            if (j >= size - i - 1)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy dolny
                        else
                        {
                            if (j >= i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    }
                }
                // Lewo
                else
                {
                    if (i < size / 2)
                    {
                        // Lewy gorny
                        if (j < size / 2)
                        {
                            if (j >= i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy gorny
                        else
                        {
                            if (j >= size - i - 1)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    }
                    else
                    {
                        // Lewy dolny
                        if (j < size / 2)
                        {
                            if (j < size - i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy dolny
                        else
                        {
                            if (j <= i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    }
                }

            }
            stream.println();
        }
        stream.println();
    }



}
