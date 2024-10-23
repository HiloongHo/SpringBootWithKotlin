package com.example.demo02.service

import com.example.demo02.datasource.VideoDataSource
import com.example.demo02.model.Video
import org.springframework.stereotype.Service

@Service
class VideoService(private val dataSource: VideoDataSource) {
    fun getVideos(): Collection<Video>
    {
        return dataSource.retrieveVideos()
    }

    fun getVideo(id: Int): Video {
        return dataSource.retrieveVideo(id)
    }
}