package com.coba;

public enum Gender {
    MALE(1, "M"),
    FEMALE(1, "F"),
    UNDEFINED(3, "U")
            {
                @Override
                public String comment() {
                    String s = "to be decided later : " + getRepr() + ", " + getDescr();
                    return s;
                }
            };

    private final String descr;
    private final int repr;

    Gender(int repr, String descr)
    {
        this.descr = descr;
        this.repr = repr;
    }

    public String getDescr() {
        return descr;
    }

    public int getRepr() {
        return repr;
    }

    public String comment() {
        return (repr + " : " + descr);
    }
}
