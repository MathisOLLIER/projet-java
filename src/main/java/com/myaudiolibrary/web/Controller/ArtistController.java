package com.myaudiolibrary.web.Controller;

import com.myaudiolibrary.web.Repository.ArtistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.myaudiolibrary.web.Model.Artist;

import java.util.Optional;

@RestController
@RequestMapping(value="/artists")
public class ArtistController {

    @Autowired
    private ArtistsRepository artistsRepository;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Artist getArtistById(
            @PathVariable(value = "id") Integer id){
        Optional<Artist> artist = artistsRepository.findById(id);
        return artist.get();
    }
}
