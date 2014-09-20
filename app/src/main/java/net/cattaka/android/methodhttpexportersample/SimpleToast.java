package net.cattaka.android.methodhttpexportersample;

import android.content.Context;
import android.widget.Toast;

import net.cattaka.util.methodhttpexporter.annotation.ExportMethodHttp;
import net.cattaka.util.methodhttpexporter.annotation.ExportMethodHttpAttr;

/**
 * Created by cattaka on 14/09/19.
 */
@ExportMethodHttp
public class SimpleToast {
    private Context mContext;

    public SimpleToast(Context mContext) {
        this.mContext = mContext;
    }

    @ExportMethodHttpAttr
    public String doToast(String text) {
        Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();
        return "Succeed";
    }
    @ExportMethodHttpAttr
    public String doNumberToast(Integer number) {
        Toast.makeText(mContext, "Number:"+number, Toast.LENGTH_SHORT).show();
        return "Succeed";
    }
}
