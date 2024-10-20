package com.msys;

import X.C0il;
import com.facebook.msys.mci.AuthData;
import com.facebook.simplejni.NativeHolder;

/* loaded from: msysInfraMnsMCFBridgejniDispatcher.class */
public class msysInfraMnsMCFBridgejniDispatcher {
    static {
        C0il.A0B("msysInfraMnsMCFBridgejni");
    }

    public static native NativeHolder MCIAccountIdentifierCreateWithAuthDataNative(AuthData authData);
}
