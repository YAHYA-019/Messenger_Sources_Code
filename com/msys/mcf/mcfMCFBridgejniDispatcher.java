package com.msys.mcf;

import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: mcfMCFBridgejniDispatcher.class */
public class mcfMCFBridgejniDispatcher {
    static {
        C0il.A0B("mcfMCFBridgejni");
    }

    public static native NativeHolder MCFURLCreateWithFileSystemPathNative(String str, boolean z);

    public static native NativeHolder MCFURLCreateWithStringNative(String str);
}
