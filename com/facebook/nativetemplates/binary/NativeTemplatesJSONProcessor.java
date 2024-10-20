package com.facebook.nativetemplates.binary;

/* loaded from: NativeTemplatesJSONProcessor.class */
public final class NativeTemplatesJSONProcessor {
    public static final NativeTemplatesJSONProcessor INSTANCE = new Object();
    public static volatile boolean isSoLibraryLoaded;

    public static final native long nativeGetBinaryForJSON(String str, Object obj, long j);
}
