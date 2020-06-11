package com.example.twitterRest.Controller;

import com.example.twitterRest.Repository.TweetRepository;
import com.example.twitterRest.model.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
public class TweetController {
    @Autowired
    private TweetRepository tweetRepository;

    @GetMapping("/ping")
    public String ping(){
        return "Up";
    }

    @GetMapping("/getAllRecord")
    public List<Tweet> getAllRecords()
    {
        return tweetRepository.findAll();
    }


    @RequestMapping(value="/getRecord/{id}")
    public Tweet getRecord(@PathVariable("id") Long id){
        return tweetRepository.findById(id).get();
    }

//
//    @RequestMapping(value="/postRecord",method= RequestMethod.POST)
//    public Tweet SaveTweet(@RequestBody Tweet tweet)
//    {
//        return tweetRepository.save(tweet);
//    }


}
