package com.facebook.common.dextricks;

import dalvik.system.DexFile;

/* loaded from: DexFileAccessListener.class */
public interface DexFileAccessListener {
    void onClassLoadedFromDexFile(Class cls, DexFile dexFile);
}
