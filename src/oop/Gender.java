package oop;

public enum Gender {
    // value of enum class
    MALE("Nam"), FEMALE("Nữ");

    // properties of enum class
    private final String text;

    // constructor
    Gender(String text) { this.text = text;}
    // Properties getter
    public String getText() { return text; }
}
