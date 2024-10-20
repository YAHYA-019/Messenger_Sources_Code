package com.facebook.common.dextricks;

import dalvik.system.DexFile;

/* loaded from: DexFileLoadNew.class */
public final class DexFileLoadNew {
    public static void init() {
    }

    public static Class loadClassBinaryName(DexFile dexFile, String str, ClassLoader classLoader) {
        return dexFile.loadClassBinaryName(str, classLoader, null);
    }
}
