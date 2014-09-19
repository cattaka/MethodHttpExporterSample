package net.cattaka.android.methodhttpexportersample;

import android.content.Context;
import android.widget.Toast;

import net.cattaka.util.methodhttpexporter.annotation.ExportMethodHttp;

/**
 * Created by cattaka on 14/09/19.
 */
@ExportMethodHttp
public class SimpleToast {
    private Context mContext;

    public SimpleToast(Context mContext) {
        this.mContext = mContext;
    }

    public String doToast(String text) {
        Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();
        return "Succeed";
    }
}
