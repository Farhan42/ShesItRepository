package com.example.com.shesit;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by DELL on 11/28/2017.
 */
@Module
public abstract class AppModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
    
   // @Provides
    //static NetworkApi provideNetworkApi(){
     //   return new NetworkApi();
    //}

}
