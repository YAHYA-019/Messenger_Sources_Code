package com.facebook.messaging.library;

import X.1BO;
import X.C0il;
import com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadataSerializer;

/* loaded from: PandoBlobCache.class */
public class PandoBlobCache {
    static {
        C0il.A0B("pandoblobcachejni");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.messaging.library.PandoBlobCache] */
    public static final PandoBlobCache _UL__ULSEP_com_facebook_messaging_library_PandoBlobCache_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new Object();
    }

    public static native void initialize(long j);

    public void initializeWithCapacity(long j) {
        ThreadMetadataSerializer.init();
        if (j > 0) {
            initialize(j);
        }
    }
}
