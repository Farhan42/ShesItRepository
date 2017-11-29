package com.example.com.shesit;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by DELL on 11/28/2017.
 */
@Component(modules = {AndroidInjectionModule.class})
public interface AppComponent extends AndroidInjector<MyApplication> {

}
