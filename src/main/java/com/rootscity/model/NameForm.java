package com.rootscity.model;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class NameForm {
    public String prefix;
    public String given;
    public String surname;
    public String suffix;

@Override
public String toString() {
    return String.join(" ", prefix, given, surname, suffix);
}
}
