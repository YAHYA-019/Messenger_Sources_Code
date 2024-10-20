package com.facebook.nativeutil;

import X.1BL;
import X.AbstractC01993ti;
import X.AnonymousClass001;
import X.C0gh;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.List;

/* loaded from: NativeList.class */
public class NativeList {
    public static final NativeList $redex_init_class = null;
    public final HybridData mHybridData;

    static {
        C0gh.A02("nativeutil-jni");
    }

    public NativeList(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public NativeList(List list) {
        this.mHybridData = initHybridData();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object A00 = AbstractC01993ti.A00(it.next());
                if (A00 == null) {
                    addNull();
                } else if (A00 instanceof Boolean) {
                    addBoolean(AnonymousClass001.A1V(A00));
                } else if ((A00 instanceof Integer) || (A00 instanceof Long) || (A00 instanceof Short)) {
                    addInt(((Number) A00).longValue());
                } else if (A00 instanceof Number) {
                    addDouble(((Number) A00).doubleValue());
                } else if (A00 instanceof String) {
                    addString((String) A00);
                } else if (A00 instanceof NativeMap) {
                    addNativeMap((NativeMap) A00);
                } else {
                    if (!(A00 instanceof NativeList)) {
                        throw 1BL.A0e(A00, "Could not convert ", AnonymousClass001.A0k());
                    }
                    addNativeList((NativeList) A00);
                }
            }
        }
    }

    private native void addBoolean(boolean z);

    private native void addDouble(double d);

    private native void addInt(long j);

    private native void addNativeList(NativeList nativeList);

    private native void addNativeMap(NativeMap nativeMap);

    private native void addNull();

    private native void addString(String str);

    public static native HybridData initHybridData();

    public native List consumeList();
}
