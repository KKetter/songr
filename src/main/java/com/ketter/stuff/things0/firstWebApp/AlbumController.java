package com.ketter.stuff.things0.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/getAllAlbums")
    public String getAllAlbums(Model a) {
        Iterable<Album> listOfAlbums = albumRepository.findAll();
        a.addAttribute("listOfAlbums", listOfAlbums);
        //why is the given value? why not return "potato";
        return "albums";

    }

    @GetMapping("/albums/new")
    public String getAddAlbumForm() {
        return "AlbumForm";
    }

    @PostMapping("/createAlbum")
    public RedirectView addAlbum(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount, @RequestParam double length, @RequestParam String imageUrl) {
        Album a = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(a);
        return new RedirectView("/getAllAlbums");
    }
}

