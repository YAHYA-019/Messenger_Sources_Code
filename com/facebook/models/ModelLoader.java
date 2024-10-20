package com.facebook.models;

import X.1FV;
import X.4YU;
import X.5K2;
import X.AnonymousClass001;
import X.C0il;
import X.Iab;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.models.interfaces.ManifestLoaderBase;
import com.facebook.models.interfaces.ModelLoaderBase;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.Set;

/* loaded from: ModelLoader.class */
public class ModelLoader extends ModelLoaderBase {
    public static final Class TAG = ModelLoader.class;

    static {
        C0il.A0B("models-core");
    }

    public static native HybridData initHybridWithCppManifestLoader(XAnalyticsHolder xAnalyticsHolder, TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, ManifestLoaderBase manifestLoaderBase, VoltronModuleLoaderProxy voltronModuleLoaderProxy, String str);

    public static native HybridData initHybridWithGraphAPIManifestLoader(XAnalyticsHolder xAnalyticsHolder, TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, VoltronModuleLoaderProxy voltronModuleLoaderProxy, String str, String str2, String str3);

    public static native HybridData initHybridWithJavaManifestLoader(XAnalyticsHolder xAnalyticsHolder, TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, ManifestLoaderProxy manifestLoaderProxy, VoltronModuleLoaderProxy voltronModuleLoaderProxy, String str);

    private native void load(String str, long j, Set set, ModelLoaderCallbacks modelLoaderCallbacks);

    private native void loadPersonalized(String str, long j, ModelLoaderCallbacks modelLoaderCallbacks);

    private native boolean removePersonalizedNative(String str, long j);

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    @Override // com.facebook.models.interfaces.ModelLoaderBase
    public ListenableFuture load(String str) {
        HashSet A0v = AnonymousClass001.A0v();
        ?? A0j = 4YU.A0j();
        load(str, -1, A0v, new 5K2(this, (SettableFuture) A0j));
        return A0j;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // com.facebook.models.interfaces.ModelLoaderBase
    public ListenableFuture load(String str, long j) {
        if (j < 0) {
            1FV A0j = 4YU.A0j();
            A0j.setException(AnonymousClass001.A0G("Invalid version"));
            return A0j;
        }
        HashSet hashSet = new HashSet();
        ?? obj = new Object();
        load(str, j, hashSet, new 5K2(this, (SettableFuture) obj));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    @Override // com.facebook.models.interfaces.ModelLoaderBase
    public ListenableFuture loadPersonalized(String str, Long l) {
        ?? A0j = 4YU.A0j();
        loadPersonalized(str, l.longValue(), new Iab(this, A0j));
        return A0j;
    }

    @Override // com.facebook.models.interfaces.ModelLoaderBase
    public boolean removePersonalized(String str, Long l) {
        return removePersonalizedNative(str, l.longValue());
    }
}
