package com.mattihew.models.points;

public class SubSkillRequirement extends SkillRequirement
{
    private final int minorCode;

    public SubSkillRequirement(final int index, final int majorCode, final String text, final int minorCode)
    {
        super(index, majorCode, text);
        this.minorCode = minorCode;
    }

    @Override
    public String getCode()
    {
        return super.getCode() + '.' + minorCode;
    }
}
