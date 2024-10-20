package com.facebook.downloadservice;

import X.C0il;
import com.facebook.jni.HybridData;
import java.util.concurrent.Executor;

/* loaded from: DownloadServiceJNI.class */
public class DownloadServiceJNI implements DownloadService {
    public final HybridData mHybridData;

    static {
        C0il.A0B("downloadservice-jni");
    }

    public DownloadServiceJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native DownloadServiceToken downloadFileIntegerBuffer(byte[] bArr, int i, DownloadServiceCallback downloadServiceCallback, Executor executor);

    public native DownloadServiceToken downloadFile(String str, DownloadServiceCallback downloadServiceCallback, Executor executor);
}
