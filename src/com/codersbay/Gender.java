package com.codersbay;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private String Gender;

    Gender(String gender) {
        this.Gender = gender;
    }

    @Override
    public String toString() {
        return this.Gender;
    }
}
