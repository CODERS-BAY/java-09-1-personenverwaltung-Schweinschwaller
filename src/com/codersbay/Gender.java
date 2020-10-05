package com.codersbay;

public enum Gender {
    Male("Male"),
    Female("Female"),
    Other("Other");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.gender;
    }
}
