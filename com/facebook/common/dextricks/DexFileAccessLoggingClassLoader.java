package com.facebook.common.dextricks;

import dalvik.system.DexFile;

/* loaded from: DexFileAccessLoggingClassLoader.class */
public interface DexFileAccessLoggingClassLoader {
    void subscribeToDexFileAccesses(DexFile[] dexFileArr, DexFileAccessListener dexFileAccessListener);
}
