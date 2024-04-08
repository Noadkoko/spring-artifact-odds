package fr.khry.springartifactodds.stat;

import java.util.Objects;

public abstract class Stat {
    protected String label = "";
    protected String unit = "";
    protected float[] mainStatRolls;
    protected float[] subStatRolls;
    protected int subStatWeight = 0;
    protected float value = 0f;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stat stat = (Stat) o;
        return Objects.equals(label, stat.label);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(label);
    }

    @Override
    public String toString() {
        return label + "+" + value + unit;
    }

    protected String statToString() {
        return value + unit;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float[] getMainStatRolls() {
        return mainStatRolls;
    }

    public void setMainStatRolls(float[] mainStatRolls) {
        this.mainStatRolls = mainStatRolls;
    }

    public float[] getSubStatRolls() {
        return subStatRolls;
    }

    public void setSubStatRolls(float[] subStatRolls) {
        this.subStatRolls = subStatRolls;
    }

    public int getSubStatWeight() {
        return subStatWeight;
    }

    public void setSubStatWeight(int subStatWeight) {
        this.subStatWeight = subStatWeight;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
