package com.mcftypeholder;

import X.1BL;
import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: McfTypeHolder.class */
public abstract class McfTypeHolder {
    public static final McfTypeHolder $redex_init_class = null;
    public final NativeHolder mNativeHolder;
    public final int mTypeTag;

    static {
        C0il.A0B("mcftypeholder");
    }

    public McfTypeHolder(int i, NativeHolder nativeHolder) {
        this.mTypeTag = i;
        this.mNativeHolder = nativeHolder;
    }

    private native boolean equalsNative(long j, NativeHolder nativeHolder, long j2);

    private native long hashCodeNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof McfTypeHolder)) {
            return false;
        }
        long j = this.mNativeHolder.mNativePointer;
        NativeHolder nativeHolder = ((McfTypeHolder) obj).mNativeHolder;
        return equalsNative(j, nativeHolder, nativeHolder.mNativePointer);
    }

    public int hashCode() {
        return 1BL.A01(hashCodeNative(this.mNativeHolder.mNativePointer));
    }
}
