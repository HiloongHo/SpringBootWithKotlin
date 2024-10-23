package com.example.demo02.datasource.mock

import com.example.demo02.datasource.VideoDataSource
import com.example.demo02.model.Video
import org.springframework.stereotype.Repository

@Repository
class MockVideoDataSource :VideoDataSource {
    val videos = listOf(
            Video(1, "Video 1", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", "Description 1", "https://i.ytimg.com/vi/dQw4w9WgXcQ/maxresdefault.jpg"),
            Video(2, "Video 2", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", "Description 2", "https://i.ytimg.com/vi/dQw4w9WgXcQ/maxresdefault.jpg"),
            Video(3, "Video 3", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", "Description 3", "https://i.ytimg.com/vi/dQw4w9WgXcQ/maxresdefault.jpg"),
            Video(4, "Video 4", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", "Description 4", "https://i.ytimg.com/vi/dQw4w9WgXcQ/maxresdefault.jpg"),
            Video(5, "Video 5", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", "Description 5", "https://i.ytimg.com/vi/dQw4w9WgXcQ/maxresdefault.jpg"),
            Video(6, "Video 6", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", "Description 6", "https://i.ytimg.com/vi/dQw4w9WgXcQ/maxresdefault.jpg"))

    override fun retrieveVideos(): Collection<Video> {
        return videos
    }

    override fun retrieveVideo(id: Int): Video {
        return videos.firstOrNull { it.id == id } ?: throw NoSuchElementException("Could not find video with id $id")
    }


}