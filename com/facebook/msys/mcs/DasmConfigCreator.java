package com.facebook.msys.mcs;

import X.3D6;
import com.facebook.simplejni.NativeHolder;

/* loaded from: DasmConfigCreator.class */
public abstract class DasmConfigCreator {
    public final NativeHolder mNativeHolder = initNativeHolder();

    public abstract 3D6 createDasmConfig();

    public abstract NativeHolder initNativeHolder();
}
