package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: IndexQuery.class */
public class IndexQuery {
    public final HybridData mHybridData;

    static {
        C0il.A0B("omnistoreindexquery");
    }

    public IndexQuery(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static native IndexQuery and(List list);

    public static native IndexQuery or(List list);

    public static native IndexQuery predicate(String str, int i, String str2);

    public native String[] getQueryParams(boolean z);

    public native String getQueryString(boolean z);

    public native Cursor queryWithIndex(Collection collection, int i);

    public native Cursor queryWithIndexSorted(Collection collection, String str, int i, int i2, int i3);
}
