package com.mattihew.models;

import com.mattihew.models.points.Requirement;

import java.util.List;

public class Unit implements Comparable<Unit>
{
    private final int number;
    private final List<Requirement> requirements;

    public Unit(final int number, final List<Requirement> requirements)
    {
        this.number = number;
        this.requirements = requirements;
    }

    @Override
    public String toString()
    {
        return String.format("EAMD4-%03d", this.number); //NON-NLS
    }

    @Override
    public int compareTo(final Unit other)
    {
        return Integer.compare(this.number, other.number);
    }
}
