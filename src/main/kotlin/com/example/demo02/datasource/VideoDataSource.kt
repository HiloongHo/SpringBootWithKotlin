package com.example.demo02.datasource

import com.example.demo02.model.Video

interface VideoDataSource {
    fun retrieveVideos(): Collection<Video>
    fun retrieveVideo(id: Int): Video
}