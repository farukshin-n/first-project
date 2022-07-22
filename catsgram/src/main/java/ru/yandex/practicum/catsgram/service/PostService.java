package ru.yandex.practicum.catsgram.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.catsgram.exception.UserNotFoundException;
import ru.yandex.practicum.catsgram.model.Post;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();
    private UserService userService;

    public PostService(UserService us) {
        this.userService = us;
    }

    public List<Post> findAll() {
        return posts;
    }

    public Post create(Post post) {
        if (userService.findUserByEmail(post.getAuthor()) != null) {
            posts.add(post);
        } else {
            throw new UserNotFoundException("Пользователь " + post.getAuthor() + " не найден");
        }
        return post;
    }
}
