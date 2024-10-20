package com.facebook.cameracore.ardelivery.xplat.scripting;

import X.C0il;
import X.EV4;
import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;
import com.facebook.jni.HybridData;

/* loaded from: XplatScriptingMetadataCompletionCallback.class */
public final class XplatScriptingMetadataCompletionCallback {
    public static final EV4 Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EV4, java.lang.Object] */
    static {
        C0il.A0B("ard-scripting-downloader");
    }

    public XplatScriptingMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final native void onFailure(String str);

    public final native void onSuccess(ScriptingPackageMetadata scriptingPackageMetadata);
}
