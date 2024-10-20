package com.facebook.mcrypto.mcc;

import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AccountContext.class */
public class AccountContext {
    public final NativeHolder mNativeHolder;

    static {
        C0il.A0B("mcryptojni");
    }

    public AccountContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public native String getFacebookUserID();
}
