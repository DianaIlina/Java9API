package ru.netology.PostManager;

import ru.netology.Domain.FormDate;
import ru.netology.Domain.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Иванов";
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.passport = "4444 № 444444";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1999;
        post.phone = "+7 (999) 999 99 99";
        post.subscription = true;
    }
}
