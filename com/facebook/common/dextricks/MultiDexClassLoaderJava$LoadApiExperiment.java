package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.util.Pair;
import dalvik.system.DexFile;

/* loaded from: MultiDexClassLoaderJava$LoadApiExperiment.class */
public class MultiDexClassLoaderJava$LoadApiExperiment extends MultiDexClassLoaderJava$LoadApi {
    public final /* synthetic */ MultiDexClassLoaderJava this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiDexClassLoaderJava$LoadApiExperiment(MultiDexClassLoaderJava multiDexClassLoaderJava) {
        super(multiDexClassLoaderJava);
        this.this$0 = multiDexClassLoaderJava;
    }

    @Override // com.facebook.common.dextricks.MultiDexClassLoaderJava$LoadApi
    public Class loadInnerNewApiClass(String str, Pair[] pairArr, int i) {
        int i2 = 0;
        if (pairArr[0] == null) {
            i2 = 1;
        }
        Class cls = null;
        try {
            int min = Math.min(i, pairArr.length);
            while (cls == null && i2 < min) {
                Pair pair = pairArr[i2];
                if (!AnonymousClass001.A1V(pair.second) || MultiDexClassLoaderJava.mayBeRedexRenamedOrStoreCanary(str)) {
                    DexFile dexFile = (DexFile) pair.first;
                    cls = DexFileLoadNew.loadClassBinaryName(dexFile, str, this.this$0.mPutativeLoader);
                    this.this$0.observeDexFileLoad(dexFile, cls);
                }
                i2++;
            }
            MultiDexClassLoaderJava multiDexClassLoaderJava = this.this$0;
            int i3 = MultiDexClassLoader.BASE_DEX_RETRY_WAIT_MS;
            multiDexClassLoaderJava.mClassLoadingStats.incrementDexFileQueries(i2);
            return cls;
        } catch (Throwable th) {
            MultiDexClassLoaderJava multiDexClassLoaderJava2 = this.this$0;
            int i4 = MultiDexClassLoader.BASE_DEX_RETRY_WAIT_MS;
            multiDexClassLoaderJava2.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }
}
