package com.facebook.common.dextricks;

import X.0Pz;
import X.0fH;
import X.AnonymousClass001;
import android.content.Context;
import com.mapbox.mapboxsdk.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: RuntimeImageHelper.class */
public class RuntimeImageHelper {
    public static final String TAG = "RuntimeImageHelper";
    public File apk;
    public Context ctx;

    public RuntimeImageHelper(Context context, File file) {
        this.ctx = context;
        this.apk = file;
    }

    private String getImageName() {
        String name = this.apk.getName();
        if (name.endsWith(".apk")) {
            name = name.substring(0, name.length() - 4);
        }
        return 0Pz.A0W(name, ".art");
    }

    private List getPresumedImagePaths() {
        LinkedList linkedList = new LinkedList();
        try {
            String canonicalPath = this.ctx.getCacheDir().getCanonicalPath();
            String[] strArr = {"arm", BuildConfig.CPU_FILTERS, "x86", "x86_64"};
            for (int i = 0; i < 4; i++) {
                linkedList.add(0Pz.A0z(canonicalPath, "/oat_primary/", strArr[i], "/", getImageName()));
            }
        } catch (IOException e) {
            0fH.A0v(TAG, "Error getting app file dir path", e);
        }
        return linkedList;
    }

    public boolean tryRemovingImage() {
        try {
            Iterator it = getPresumedImagePaths().iterator();
            while (it.hasNext()) {
                File A0E = AnonymousClass001.A0E(AnonymousClass001.A0i(it));
                if (A0E.exists()) {
                    A0E.delete();
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            0fH.A0z(TAG, "Error deleting runtime image for split %s.", e, new Object[]{this.apk});
            return false;
        }
    }
}
