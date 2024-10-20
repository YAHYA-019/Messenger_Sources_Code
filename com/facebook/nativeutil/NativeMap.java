package com.facebook.nativeutil;

import X.1BL;
import X.AbstractC01993ti;
import X.AnonymousClass001;
import X.C0gh;
import X.JQw;
import com.facebook.jni.HybridData;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* loaded from: NativeMap.class */
public class NativeMap extends AbstractMap {
    public static final NativeMap $redex_init_class = null;
    public final HybridData mHybridData = initHybridData();

    static {
        C0gh.A02("nativeutil-jni");
    }

    public NativeMap() {
    }

    public NativeMap(Map map) {
        putAll(map);
    }

    public static native HybridData initHybridData();

    private native void putBoolean(String str, boolean z);

    private native void putDouble(String str, double d);

    private native void putInt(String str, long j);

    private native void putNativeList(String str, NativeList nativeList);

    private native void putNativeMap(String str, NativeMap nativeMap);

    private native void putNull(String str);

    private native void putString(String str, String str2);

    public native Map consumeMap();

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        throw AnonymousClass001.A0q(JQw.A00(91));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        put((String) obj, obj2);
        return obj2;
    }

    public Object put(String str, Object obj) {
        Object A00 = AbstractC01993ti.A00(obj);
        if (A00 == null) {
            putNull(str);
            return obj;
        }
        if (A00 instanceof Boolean) {
            putBoolean(str, ((Boolean) A00).booleanValue());
            return obj;
        }
        if ((A00 instanceof Integer) || (A00 instanceof Long) || (A00 instanceof Short)) {
            putInt(str, ((Number) A00).longValue());
            return obj;
        }
        if (A00 instanceof Number) {
            putDouble(str, ((Number) A00).doubleValue());
            return obj;
        }
        if (A00 instanceof String) {
            putString(str, (String) A00);
            return obj;
        }
        if (A00 instanceof NativeMap) {
            putNativeMap(str, (NativeMap) A00);
            return obj;
        }
        if (!(A00 instanceof NativeList)) {
            throw 1BL.A0e(A00, "Could not convert ", AnonymousClass001.A0k());
        }
        putNativeList(str, (NativeList) A00);
        return obj;
    }
}
