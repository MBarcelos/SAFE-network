package org.academiadecodigo.hackathon.womanizer.dao;

import org.academiadecodigo.hackathon.womanizer.model.Video;

import java.util.List;

public interface VideoDao {

    List<Video> findAll();
    Video findById(Integer id);
    Video saveOrUpdate(Video video);
    void delete(Integer id);
}
