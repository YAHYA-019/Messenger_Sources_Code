package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: Delta.class */
public class Delta {
    public final HybridData mHybridData;

    static {
        C0il.A0B("omnistore");
    }

    public Delta(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static native Delta makeDelta(CollectionName collectionName, int i, String str, String str2, byte[] bArr);

    public native ByteBuffer getBlob();

    public native CollectionName getCollectionName();

    public native String getPrimaryKey();

    public native String getSortKey();

    public native int getStatus();

    public native int getType();
}
