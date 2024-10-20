package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Array;

/* loaded from: MemoryReductionHack.class */
public final class MemoryReductionHack {
    public static final String TAG = "MemoryReductionHack";

    public static void freeApkZip(Context context) {
    }

    public static Object getDexElementsArray(Object obj) {
        return AnonymousClass001.A0r(obj.getClass(), "dexElements").get(obj);
    }

    public static Object getDexPathList(BaseDexClassLoader baseDexClassLoader) {
        return AnonymousClass001.A0r(BaseDexClassLoader.class, "pathList").get(baseDexClassLoader);
    }

    public static Object getField(Object obj, Class cls, String str) {
        return AnonymousClass001.A0r(cls, str).get(obj);
    }

    public static File getFileOrZip(Object obj, int i) {
        if (i <= 22) {
            try {
                return (File) AnonymousClass001.A0r(obj.getClass(), "file").get(obj);
            } catch (NoSuchFieldException unused) {
            }
        }
        return (File) AnonymousClass001.A0r(obj.getClass(), ServerW3CShippingAddressConstants.POSTAL_CODE).get(obj);
    }

    public static void removeZipFromPathClassLoader(String str, PathClassLoader pathClassLoader) {
        Object dexElementsArray = getDexElementsArray(getDexPathList(pathClassLoader));
        int length = Array.getLength(dexElementsArray);
        int i = Build.VERSION.SDK_INT;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = Array.get(dexElementsArray, i2);
            File fileOrZip = getFileOrZip(obj, i);
            if (fileOrZip != null && str.equals(fileOrZip.getPath())) {
                AnonymousClass001.A0r(obj.getClass(), "initialized").set(obj, AnonymousClass001.A0K());
                Log.d(TAG, 0Pz.A0W("Marked as initialized entry corresponding to path ", str));
                return;
            }
        }
        Log.w(TAG, 0Pz.A0W("Could not find zipFile entry corresponding to path ", str));
    }

    public static void setField(Object obj, Class cls, String str, Object obj2) {
        AnonymousClass001.A0r(cls, str).set(obj, obj2);
    }
}
