package com.thebluealliance.androidclient.di;


import com.thebluealliance.androidclient.di.components.FragmentComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules= {
                MockSubscriberModule.class,
                MockBinderModule.class,
                MockDatafeedModule.class,
                MockDatabaseWriterModule.class,
                MockClickListenerModule.class},
        dependencies = {MockApplicationComponent.class})
public interface MockFragmentComponent extends FragmentComponent {
}
