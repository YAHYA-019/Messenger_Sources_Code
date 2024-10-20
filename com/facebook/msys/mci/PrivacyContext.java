package com.facebook.msys.mci;

import X.1SL;
import com.facebook.simplejni.NativeHolder;
import java.util.Set;

/* loaded from: PrivacyContext.class */
public class PrivacyContext {
    public static final PrivacyContext $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public PrivacyContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native PrivacyContext newPrivacyContext(Set set);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PrivacyContext)) {
            return false;
        }
        return getKeys().equals(((PrivacyContext) obj).getKeys());
    }

    public native Set getKeys();

    public int hashCode() {
        return getKeys().hashCode();
    }
}
