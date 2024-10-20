package com.facebook.pando;

import X.C0il;
import X.R2b;

/* loaded from: TreeUtils.class */
public final class TreeUtils {
    public static final R2b Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.R2b, java.lang.Object] */
    static {
        C0il.A0B("pando-jni");
    }

    public static final native String appendWeakRecordIndex(String str, int i);

    public static final native String appendWeakRecordPath(String str, String str2);

    public static final native String canonicalNameFromTemplate(String str, TreeJNI treeJNI);

    public static final native String makeStrongConcatenatedKey(String str, String str2);
}
