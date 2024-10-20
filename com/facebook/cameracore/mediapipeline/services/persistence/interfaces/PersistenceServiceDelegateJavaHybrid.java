package com.facebook.cameracore.mediapipeline.services.persistence.interfaces;

import X.N6V;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: PersistenceServiceDelegateJavaHybrid.class */
public class PersistenceServiceDelegateJavaHybrid extends PersistenceServiceDelegateHybrid {
    public final N6V mDelegate;

    public PersistenceServiceDelegateJavaHybrid(N6V n6v) {
        this.mDelegate = n6v;
        this.mHybridData = initHybrid();
    }

    private native HybridData initHybrid();

    public void get(String str, NativeDataPromise nativeDataPromise) {
        this.mDelegate.A00(str, nativeDataPromise);
    }

    public void getV2(String str, String str2, String str3, int i, int i2, NativeDataPromise nativeDataPromise) {
    }

    public void remove(String str, NativeDataPromise nativeDataPromise) {
        this.mDelegate.A01(str, nativeDataPromise);
    }

    public void removeV2(String str, String str2, String str3, int i, int i2) {
    }

    public void set(String str, String str2, NativeDataPromise nativeDataPromise) {
        this.mDelegate.A02(str, str2, nativeDataPromise);
    }

    public void setV2(String str, String str2, String str3, String str4, int i, int i2) {
    }
}
