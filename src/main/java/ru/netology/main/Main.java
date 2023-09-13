package ru.netology.main;

import ru.netology.api.FormDate;
import ru.netology.api.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.birthday.day = 10;
        post.birthday.month = 8;
        post.birthday.year = 1981;
        post.passport = "1961 № 090334";
        post.phone = "+7 (921)-158-96-85";
        post.subscription = true;
    }
}

