package com.fbpay.ptt.impl.javacpp;

import X.C0il;
import X.C3o5;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: ServerCertsVerifierImpl.class */
public class ServerCertsVerifierImpl {
    public HybridData mHybridData;

    static {
        C0il.A0B("fbpayptt-android");
    }

    public ServerCertsVerifierImpl() {
        this.mHybridData = initHybrid();
    }

    public ServerCertsVerifierImpl(int i) {
    }

    public static native HybridData initHybrid();

    private native String verifyCerts(String[] strArr);

    public String verifyCerts(List list) {
        return verifyCerts(C3o5.A0n(list));
    }
}
