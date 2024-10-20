package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.C3Vf;
import X.Inf;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: NetworkClientImpl.class */
public class NetworkClientImpl extends NetworkClient {
    public final C3Vf mWorker;

    public NetworkClientImpl(C3Vf c3Vf) {
        this.mWorker = c3Vf;
        this.mHybridData = initHybrid();
    }

    private native HybridData initHybrid();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, org.apache.http.client.ResponseHandler] */
    @Override // com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient
    public void sendRequest(NativeDataPromise nativeDataPromise, String str, String str2, String str3, String[] strArr, String[] strArr2, boolean z) {
        C3Vf c3Vf;
        try {
            c3Vf = this.mWorker;
            c3Vf.A00(Inf.A00(nativeDataPromise, this, 0), str, str2, str3, new Object(), strArr, strArr2, z);
        } catch (Exception unused) {
            nativeDataPromise.setException(c3Vf.toString());
        }
    }
}
