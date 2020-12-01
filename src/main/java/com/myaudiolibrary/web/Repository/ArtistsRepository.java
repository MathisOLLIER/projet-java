package com.myaudiolibrary.web.Repository;

import com.myaudiolibrary.web.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistsRepository extends JpaRepository<Artist, Integer> {

}
