package com.marianyelis.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KhxDvvlDzBXzQS4fqNBR1R4An7piv85CeAYiMvGZ")
                .clientKey("ib3EjO1SkeSeWHgJwvjX2wZBcoOVQPmbwJpuCj3Y")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
