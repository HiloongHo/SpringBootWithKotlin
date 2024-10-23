package com.example.demo02.controller

import com.example.demo02.model.Video
import com.example.demo02.service.VideoService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/nathan/allVideos")
class VideoController(private val service: VideoService) {
    @RequestMapping
    fun getVideos(): Collection<Video>
    {
        return service.getVideos()
    }

    @RequestMapping("/{id}")
    fun getVideo(@PathVariable id: Int): Video
    {
        return service.getVideo(id)
    }

}