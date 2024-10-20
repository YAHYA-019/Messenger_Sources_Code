package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: OmnistoreCollections.class */
public class OmnistoreCollections {
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("omnistorecollections");
    }

    private native Collection doSubscribeCollection(Omnistore omnistore, CollectionName collectionName, String str, String str2, String str3, byte[] bArr, long j, boolean z, int i);

    public static native HybridData initHybrid();

    public native OmnistoreCollectionFrontendHolder getFrontend();
}
