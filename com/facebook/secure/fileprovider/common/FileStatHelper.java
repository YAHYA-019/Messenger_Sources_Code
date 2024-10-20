package com.facebook.secure.fileprovider.common;

import X.C0il;
import android.os.ParcelFileDescriptor;

/* loaded from: FileStatHelper.class */
public class FileStatHelper {
    static {
        C0il.A0B("filestathelper");
    }

    public FileStatHelper() {
    }

    public FileStatHelper(int i) {
    }

    public static int A00(ParcelFileDescriptor parcelFileDescriptor) {
        return parcelFileDescriptor.getFd();
    }

    public static native StatInfo statOpenFile(int i);
}
