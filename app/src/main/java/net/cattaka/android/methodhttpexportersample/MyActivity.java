package net.cattaka.android.methodhttpexportersample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import net.cattaka.util.methodhttpexporter.annotation.ExportMethodHttp;
import net.cattaka.util.methodhttpexporter.annotation.ExportMethodHttpAttr;

import java.io.IOException;

@ExportMethodHttp
public class MyActivity extends Activity {
    MyActivityHttpServer myActivityHttpServer = new MyActivityHttpServer(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    protected void onStart() {
        super.onStart();
        {   // Run Development tool
            try {
                myActivityHttpServer.run(8091);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        {   // Terminate Development tool
            try {
                myActivityHttpServer.terminate();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @ExportMethodHttpAttr
    String clickItem1Radio() {
        findViewById(R.id.item1Radio).performClick();
        return "Item 1 clicked";
    }
    @ExportMethodHttpAttr
    String clickItem2Radio() {
        findViewById(R.id.item2Radio).performClick();
        return "Item 2 clicked";
    }
    @ExportMethodHttpAttr
    String clickItem3Radio() {
        findViewById(R.id.item3Radio).performClick();
        return "Item 3 clicked";
    }
    @ExportMethodHttpAttr
    String clickItemRadio(int i) {
        switch (i) {
            case 1:
                return clickItem1Radio();
            case 2:
                return clickItem2Radio();
            case 3:
                return clickItem3Radio();
            default:
                return "Out of index";
        }
    }



}
