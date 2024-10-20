package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: Cursor.class */
public class Cursor implements Closeable {
    public final HybridData mHybridData;

    static {
        C0il.A0B("omnistorecollections");
    }

    public Cursor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public native void close();

    public native ByteBuffer getBlob();

    public native String getPrimaryKey();

    public native String getSortKey();

    public native boolean step();
}
