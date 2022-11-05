package com.project.designpatternv1.service;

import java.util.Optional;

public class checkOptional {

    // A good design should read like to story not like a puzzle
    // DO NOT return null instead return empty collection or object - Benefit just iterate we dont need
    // to do NULL check
    // Code convey the intension very clearly

    // 1. Single value in the past return null instead return Optional
            // a. potential run time exception turns to run time erro
    // If method returns may or may not return single value then use Optional
    //
    // DONT use OPtional<T> as parameter as method. INstead use method overloading
    public void setName() {

    }

    public void setName(String name) {

    }
    public static void main(String[] args) {
        var result = getName();
    }

    public static Optional<String> getName() {
            if(Math.random() > 0.5) {
                return Optional.of("Joe");
            }
        return Optional.empty();
    }
}
