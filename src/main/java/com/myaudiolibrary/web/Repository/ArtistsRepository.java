package com.myaudiolibrary.web.Repository;

import com.myaudiolibrary.web.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtistsRepository extends JpaRepository<Artist, Integer> {
    Artist findByName(String name);

    List<Artist> findByNameAndId(String name, Integer id);
}
