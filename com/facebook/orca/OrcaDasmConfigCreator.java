package com.facebook.orca;

import X.3D6;
import X.C0il;
import com.facebook.msys.mcs.DasmConfigCreator;
import com.facebook.simplejni.NativeHolder;
import com.mcftypeholder.McfTypeHolder;

/* loaded from: OrcaDasmConfigCreator.class */
public class OrcaDasmConfigCreator extends DasmConfigCreator {
    public static OrcaDasmConfigCreator sInstance;

    static {
        C0il.A0B("OrcaDasmConfigCreator-jni");
    }

    private native NativeHolder createDasmConfigNativeHolder();

    /* JADX WARN: Type inference failed for: r301v2, types: [com.facebook.msys.mcs.DasmConfigCreator, com.facebook.orca.OrcaDasmConfigCreator] */
    public static OrcaDasmConfigCreator getInstance() {
        OrcaDasmConfigCreator orcaDasmConfigCreator = sInstance;
        OrcaDasmConfigCreator orcaDasmConfigCreator2 = orcaDasmConfigCreator;
        if (orcaDasmConfigCreator == null) {
            ?? dasmConfigCreator = new DasmConfigCreator();
            sInstance = dasmConfigCreator;
            orcaDasmConfigCreator2 = dasmConfigCreator;
        }
        return orcaDasmConfigCreator2;
    }

    @Override // com.facebook.msys.mcs.DasmConfigCreator
    public 3D6 createDasmConfig() {
        McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
        return new McfTypeHolder(30166406, createDasmConfigNativeHolder());
    }

    @Override // com.facebook.msys.mcs.DasmConfigCreator
    public native NativeHolder initNativeHolder();
}
