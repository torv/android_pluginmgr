package com.torv.adam.pluginmgr;

import android.app.Application;

import androidx.pluginmgr.PluginManager;

/**
 * @author Lody
 * @version 1.0
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PluginManager.init(this);
    }
}
