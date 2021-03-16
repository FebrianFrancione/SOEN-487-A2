package com.example.demo.Service;

import com.example.demo.Entity.Album;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.util.List;

public interface AlbumService {

    List<Album> getAlbums();
    Album findByISRCAndTitle(String ISRC, String title);
    Album createNewAlbum(String ISRC, String title, String description, int year, String artist_first_name, String artist_last_name) throws FileNotFoundException;
    boolean deleteAlbum(String ISRC);
    boolean modifyAlbum(String ISRC, String title, String description, int year, String artist_first_name, String artist_last_name) throws FileNotFoundException;

    Album upload(String ISRC, String title, String cover_image_name, String image_mime, byte[] cover_image) throws FileNotFoundException;
    Album upload2(String ISRC, String title, String description, int year, String artist_first_name, String artist_last_name, String cover_image_name, String image_mime, byte[] cover_image) throws FileNotFoundException;
    //    Album getAlbum(String ISRC);
////    Album getAlbumHtml(String ISRC);


//    //cover images CRUD
    Album getCoverImage(String ISRC, String title);
    Album deleteCoverImage(String ISRC, String title)throws FileNotFoundException;
    void updateCoverImage();
}
