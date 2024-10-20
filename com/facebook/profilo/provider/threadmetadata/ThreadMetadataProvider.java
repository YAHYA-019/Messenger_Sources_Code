package com.facebook.profilo.provider.threadmetadata;

import X.0Gw;
import X.C0T5;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.core.Buffer;

/* loaded from: ThreadMetadataProvider.class */
public final class ThreadMetadataProvider extends C0T5 {
    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }

    public static native void nativeLogThreadMetadata(Buffer buffer);

    @Override // X.C0T5
    public void logOnTraceEnd(TraceContext traceContext, 0Gw r303) {
        nativeLogThreadMetadata(traceContext.A09);
    }
}
