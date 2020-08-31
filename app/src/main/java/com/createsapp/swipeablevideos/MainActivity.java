package com.createsapp.swipeablevideos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videosViewPager = findViewById(R.id.videoViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemCelebration = new VideoItem();
        videoItemCelebration.videoURL = "https://www.infinityandroid.com/videos/video1.mp4";
        videoItemCelebration.videoTitle = "Celebration";
        videoItemCelebration.videoDescription = "Celebrate who you in your deepest heart. Love your self and the world will love you";
        videoItems.add(videoItemCelebration);

        VideoItem videoItemParty = new VideoItem();
        videoItemParty.videoURL = "https://www.infinityandroid.com/videos/video2.mp4";
        videoItemParty.videoTitle = "Party";
        videoItemParty.videoDescription = "You gotta have life your way.";
        videoItems.add(videoItemParty);

        VideoItem videoItemExercise = new VideoItem();
        videoItemExercise.videoURL = "https://www.infinityandroid.com/videos/video3.mp4";
        videoItemExercise.videoTitle = "Exercise";
        videoItemExercise.videoDescription = "Whenever I feel the need to exercise, I lie down until it goes away.";
        videoItems.add(videoItemExercise);

        VideoItem videoItemNature = new VideoItem();
        videoItemNature.videoURL = "https://www.infinityandroid.com/videos/video4.mp4";
        videoItemNature.videoTitle = "Nature";
        videoItemNature.videoDescription = "In every walk in with nature one receivers far more then he seeks.";
        videoItems.add(videoItemNature);

        VideoItem videoItemTravel = new VideoItem();
        videoItemTravel.videoURL = "https://www.infinityandroid.com/videos/video5.mp4";
        videoItemTravel.videoTitle = "Travel";
        videoItemTravel.videoDescription = "It is better to travel well than to arrive";
        videoItems.add(videoItemTravel);

        VideoItem videoItemChill = new VideoItem();
        videoItemChill.videoURL = "https://www.infinityandroid.com/videos/video6.mp4";
        videoItemChill.videoTitle = "Chill";
        videoItemChill.videoDescription = "Life is so much easier when you just chill out.";
        videoItems.add(videoItemChill);

        VideoItem videoItemLove = new VideoItem();
        videoItemLove.videoURL = "https://www.infinityandroid.com/videos/video7.mp4";
        videoItemLove.videoTitle = "Love";
        videoItemLove.videoDescription = "The best thing to hold onto in life is each other.";
        videoItems.add(videoItemLove);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));
    }
}