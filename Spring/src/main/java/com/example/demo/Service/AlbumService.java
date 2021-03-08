package com.example.demo.Service;

import com.example.demo.Entity.Album;

//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
import java.net.URLDecoder;
import java.util.List;

public interface AlbumService {

        public List<Album> getAlbums();
        public Album getAlbum(String ISRC, String title);

//        public Album findById(String ISRC, String title);

        public void createAlbum(String ISRC,String title, String description, int year, String artist);

//        public void deleteAlbum(String ISRC);
//        public void modifyAlbum(String ISRC, String title, String description, int year,String artist);




}