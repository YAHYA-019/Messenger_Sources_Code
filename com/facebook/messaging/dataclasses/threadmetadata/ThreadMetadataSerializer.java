package com.facebook.messaging.dataclasses.threadmetadata;

import X.C00j;
import X.C0il;

/* loaded from: ThreadMetadataSerializer.class */
public class ThreadMetadataSerializer {
    static {
        C00j.A05("ThreadMetadataSerializer.loadLibrary", -943557503);
        C0il.A0B("pandoblobserializerjni");
        C0il.A0B("pando-jni");
        C00j.A01(-1181566678);
    }

    public static native ThreadMetadataImpl fromJSONString(String str);

    public static ThreadMetadata fromString(String str) {
        ThreadMetadataImpl fromJSONString;
        int i;
        C00j.A05("ThreadMetadataSerializer.fromString", -2094093226);
        if (str == null) {
            fromJSONString = null;
            i = 435925200;
        } else {
            try {
                fromJSONString = fromJSONString(str);
                i = -911614009;
            } catch (Throwable th) {
                C00j.A01(320813458);
                throw th;
            }
        }
        C00j.A01(i);
        return fromJSONString;
    }

    public static native void init();

    public static native String toJSONString(ThreadMetadataImpl threadMetadataImpl);

    public static String toString(ThreadMetadata threadMetadata) {
        String jSONString;
        int i;
        C00j.A05("ThreadMetadataSerializer.toString", 1908040832);
        if (threadMetadata == null) {
            jSONString = null;
            i = 655447919;
        } else {
            try {
                jSONString = toJSONString((ThreadMetadataImpl) threadMetadata);
                i = -1194892495;
            } catch (Throwable th) {
                C00j.A01(-2013540444);
                throw th;
            }
        }
        C00j.A01(i);
        return jSONString;
    }
}
