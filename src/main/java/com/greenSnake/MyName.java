package com.greenSnake;

import com.google.gson.Gson;

public class MyName {
    public static void main(String[] args) {
        User user = new User("alex", "solovey");
        System.out.println(new Gson().toJson(user));

    }
}