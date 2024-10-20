package com.facebook.common.dextricks;

import android.util.Pair;
import dalvik.system.DexFile;

/* loaded from: MultiDexClassLoaderJava$LoadApi.class */
public class MultiDexClassLoaderJava$LoadApi {
    public final /* synthetic */ MultiDexClassLoaderJava this$0;

    public MultiDexClassLoaderJava$LoadApi(MultiDexClassLoaderJava multiDexClassLoaderJava) {
        this.this$0 = multiDexClassLoaderJava;
    }

    public Class loadInnerNewApiClass(String str, Pair[] pairArr, int i) {
        int i2;
        Class cls = null;
        int i3 = 1;
        try {
            MultiDexClassLoaderJava multiDexClassLoaderJava = this.this$0;
            ClassLoader classLoader = multiDexClassLoaderJava.mPutativeLoader;
            Pair pair = pairArr[0];
            if (pair == null) {
                MultiDexClassLoaderJava.access$000(multiDexClassLoaderJava);
            } else if (!((Boolean) pair.second).booleanValue() || MultiDexClassLoaderJava.mayBeRedexRenamedOrStoreCanary(str)) {
                DexFile dexFile = (DexFile) pair.first;
                cls = DexFileLoadNew.loadClassBinaryName(dexFile, str, classLoader);
                this.this$0.observeDexFileLoad(dexFile, cls);
            }
            int min = Math.min(i, pairArr.length);
            int i4 = 1;
            while (true) {
                i2 = i4;
                if (cls != null || i2 >= min) {
                    break;
                }
                try {
                    Pair pair2 = pairArr[i2];
                    if (!((Boolean) pair2.second).booleanValue() || MultiDexClassLoaderJava.mayBeRedexRenamedOrStoreCanary(str)) {
                        DexFile dexFile2 = (DexFile) pair2.first;
                        cls = DexFileLoadNew.loadClassBinaryName(dexFile2, str, classLoader);
                        if (cls != null && i2 > 1) {
                            MultiDexClassLoaderJava.access$100(this.this$0, dexFile2, i2);
                        }
                        this.this$0.observeDexFileLoad(dexFile2, cls);
                    }
                    i4 = i2 + 1;
                } catch (Throwable th) {
                    th = th;
                    i3 = i2;
                    MultiDexClassLoaderJava multiDexClassLoaderJava2 = this.this$0;
                    int i5 = MultiDexClassLoader.BASE_DEX_RETRY_WAIT_MS;
                    multiDexClassLoaderJava2.mClassLoadingStats.incrementDexFileQueries(i3);
                    throw th;
                }
            }
            this.this$0.mClassLoadingStats.incrementDexFileQueries(i2);
            return cls;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
