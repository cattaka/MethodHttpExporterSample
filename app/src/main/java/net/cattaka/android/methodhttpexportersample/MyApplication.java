package net.cattaka.android.methodhttpexportersample;

import android.app.Application;

import java.io.IOException;

/**
 * Created by cattaka on 14/09/19.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        {   // Create Development tool and run
            SimpleToast simpleToast = new SimpleToast(this);
            SimpleToastHttpServer server = new SimpleToastHttpServer(simpleToast);
            try {
                server.run(8090);   // port number of HttpServer
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
