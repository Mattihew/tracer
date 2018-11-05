package com.mattihew.models.points;

public class Requirement implements Comparable<Requirement>
{
    private final int index;
    private final String text;
    private final int code;

    public Requirement(final int index, final int code, final String text)
    {
        this.index = index;
        this.code = code;
        this.text = text;
    }

    public int getIndex()
    {
        return index;
    }

    public String getText()
    {
        return text;
    }

    int getCodeNumber()
    {
        return code;
    }

    public String getCode()
    {
        return "P" + code; //NON-NLS
    }

    @Override
    public String toString()
    {
        return this.getCode() + ": " + this.text;
    }

    @Override
    public int compareTo(final Requirement other)
    {
        return Integer.compare(this.index, other.index);
    }
}
