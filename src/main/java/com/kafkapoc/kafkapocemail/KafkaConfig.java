package com.kafkapoc.kafkapocemail;

import com.google.gson.Gson;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.List;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic createNewTopic(){
        return TopicBuilder
                .name("user-login")
                .build();
    }

    @Bean
    public NewTopic createCreateUserNewTopic(){
        return TopicBuilder
                .name("user-registration")
                .build();
    }


    @Bean
    public NewTopic createCreateBlogTopic(){
        return TopicBuilder
                .name("blog-details")
                .build();
    }

    @Bean
    public NewTopic createBlogViewTopic(){
        return TopicBuilder
                .name("blog-view-details")
                .build();
    }


    @Bean
    public NewTopic createLikeBlogTopic(){
        return TopicBuilder
                .name("blog-like-details")
                .build();
    }


    @Bean
    public NewTopic createActivityBlogTopic(){
        return TopicBuilder
                .name("blog-activity-details")
                .build();
    }

    @Bean
    public NewTopic createHitsTopic(){
        return TopicBuilder
                .name("email_1")
                .build();
    }



    @Bean
    public NewTopic createEmailTopic1(){
        return TopicBuilder
                .name("email_topic_1")
                .build();
    }

    @Bean
    public NewTopic createEmailTopic2(){
        return TopicBuilder
                .name("email_topic_2")
                .build();
    }

    @Bean
    public NewTopic createEmailTopic3(){
        return TopicBuilder
                .name("email_topic_3")
                .build();
    }

    @Bean
    public List<NewTopic> createEmailTopicList(){
        return List.of(TopicBuilder
                .name("email_topic_new_1")
                .build(),TopicBuilder
                .name("email_topic_new_2")
                .build(),TopicBuilder
                .name("email_topic_new_3")
                .build());
    }

    @Bean
    public Gson getGson(){
        return new Gson();
    }


}
