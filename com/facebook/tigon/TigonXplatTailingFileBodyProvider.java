package com.facebook.tigon;

import X.4SQ;
import X.AnonymousClass001;
import X.C0il;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;

/* loaded from: TigonXplatTailingFileBodyProvider.class */
public final class TigonXplatTailingFileBodyProvider extends TigonBodyProvider {
    public static final 4SQ Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4SQ, java.lang.Object] */
    static {
        C0il.A0B("tigonfilebodyproviderjni");
    }

    public static final native HybridData initHybrid(String str, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, int i, int i2, int i3, int i4, boolean z);

    @Override // com.facebook.tigon.TigonBodyProvider
    public void beginStream(TigonBodyStream tigonBodyStream) {
        throw AnonymousClass001.A0N("should not be used");
    }

    public final native void close();

    public final native void flush();
}
