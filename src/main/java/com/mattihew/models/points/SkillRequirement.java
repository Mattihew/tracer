package com.mattihew.models.points;

import java.util.Collections;
import java.util.List;

public class SkillRequirement extends Requirement
{
    private final List<SubSkillRequirement> subSkillRequirements;

    public SkillRequirement(final int index, final int code, final String text)
    {
        this(index, code, text, Collections.emptyList());
    }

    public SkillRequirement(final int index, final int code, final String text, final List<SubSkillRequirement> subSkillRequirements)
    {
        super(index, code, text);
        this.subSkillRequirements = subSkillRequirements;
    }

    @Override
    public String getCode()
    {
        return "S" + this.getCodeNumber(); //NON-NLS
    }

    public List<SubSkillRequirement> getSubSkillRequirements()
    {
        return subSkillRequirements;
    }
}
