package com.facebook.cameracore.mediapipeline.services.persistence.config;

import X.C0il;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;

/* loaded from: LocalLocationPersistenceServiceDelegateHybrid.class */
public class LocalLocationPersistenceServiceDelegateHybrid extends PersistenceServiceDelegateHybrid {
    static {
        C0il.A0B("arpersistenceserviceconfig");
    }

    public LocalLocationPersistenceServiceDelegateHybrid(String str, ARDFileCache aRDFileCache, ARDFileCache aRDFileCache2, AndroidAsyncExecutorFactory androidAsyncExecutorFactory) {
        this.mHybridData = initHybrid(str, aRDFileCache, aRDFileCache2, androidAsyncExecutorFactory);
    }

    private native HybridData initHybrid(String str, ARDFileCache aRDFileCache, ARDFileCache aRDFileCache2, AndroidAsyncExecutorFactory androidAsyncExecutorFactory);
}
