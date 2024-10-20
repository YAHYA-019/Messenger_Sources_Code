package com.facebook.msys.mci;

import X.0T9;
import X.0fH;
import X.1XV;
import X.C1jS;
import X.C1jd;
import com.facebook.simplejni.NativeHolder;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: NetworkSession.class */
public class NetworkSession {
    public static final NetworkSession $redex_init_class = null;
    public final HashMap mCallbackMap = new HashMap();
    public final DataTaskListener mDataTaskListener;
    public boolean mDisposed;
    public final C1jd mDisposer;
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    static {
        1XV.A00();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.1jd] */
    public NetworkSession(String str, NotificationCenter notificationCenter, final C1jS c1jS) {
        0T9.A02("NetworkSession.new", -616813026);
        try {
            this.mNotificationCenter = notificationCenter;
            this.mDataTaskListener = c1jS.A06;
            this.mDisposer = new Object() { // from class: X.1jd
            };
            this.mNativeHolder = initNativeHolder(str, notificationCenter);
            int networkSessionTimeoutIntervalMs = getNetworkSessionTimeoutIntervalMs();
            if (networkSessionTimeoutIntervalMs > 0) {
                c1jS.A00 = networkSessionTimeoutIntervalMs;
            }
            0T9.A00(-484994929);
        } catch (Throwable th) {
            0T9.A00(1263853440);
            throw th;
        }
    }

    private void dispatchProgressUpdateToObserver(String str, long j, long j2, long j3) {
        if (this.mCallbackMap.containsKey(str)) {
            this.mCallbackMap.get(str);
        }
    }

    private native NativeHolder initNativeHolder(String str, NotificationCenter notificationCenter);

    private native void markDataTaskAsCompleted(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, Throwable th);

    private native void markDataTaskStreamingCompleted(String str, String str2, UrlResponse urlResponse, Throwable th);

    private native void nativeDispose();

    private void onCancelDataTask(String str) {
        0fH.A0g(str, "NetworkSession", "DataTask with taskIdentifier %s cancelled by Msys");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onCancelDataTask(str, this);
        }
    }

    private native void onDataTaskNewStreamingData(String str, String str2, UrlResponse urlResponse, byte[] bArr);

    private void onNewDataTask(DataTask dataTask) {
        0fH.A0j("NetworkSession", "New data task received from Msys");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onNewTask(dataTask, this);
        }
    }

    private void onUpdateStreamingDataTask(byte[] bArr, String str) {
        0fH.A0j("NetworkSession", "Msys just sent us a streaming DataTask update!");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onUpdateStreamingDataTask(bArr, str, this);
        }
    }

    private native void registerDownloadTaskProgressObserver(String str);

    private native void registerUploadTaskProgressObserver(String str);

    private native void setNetworkStateConnectedNative(NotificationCenter notificationCenter);

    private native void setNetworkStateDisconnectedNative(NotificationCenter notificationCenter);

    public native synchronized void canHandleStreamingUploadUpdate(String str);

    public void dispose() {
        synchronized (this) {
            if (!this.mDisposed) {
                nativeDispose();
                this.mDisposed = true;
            }
        }
    }

    public native int getNetworkSessionTimeoutIntervalMs();

    public native DataTask[] getPendingDataTasks();

    public void markDataTaskAsCompletedCallback(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, IOException iOException) {
        synchronized (this) {
            markDataTaskAsCompleted(str, str2, i, urlResponse, bArr, str3, iOException);
            if (this.mCallbackMap.containsKey(str2)) {
                this.mCallbackMap.remove(str2);
            }
        }
    }

    public void markDataTaskStreamingCompletedCallback(String str, String str2, UrlResponse urlResponse, Throwable th) {
        markDataTaskStreamingCompleted(str, str2, urlResponse, th);
    }

    public void onDataTaskNewStreamingDataCallback(String str, String str2, UrlResponse urlResponse, byte[] bArr) {
        onDataTaskNewStreamingData(str, str2, urlResponse, bArr);
    }

    public void setNetworkStateConnected() {
        setNetworkStateConnectedNative(this.mNotificationCenter);
    }

    public void setNetworkStateDisconnected() {
        setNetworkStateDisconnectedNative(this.mNotificationCenter);
    }

    public native void updateDataTaskDownloadProgress(String str, long j, long j2, long j3);

    public native void updateDataTaskUploadProgress(String str, long j, long j2, long j3);
}
