package com.facebook.msys.mci;

import X.1SL;
import X.C04I;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: EventLogSubscriber.class */
public abstract class EventLogSubscriber {
    public final NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public EventLogSubscriber(int i, String[] strArr) {
        this.mNativeHolder = initTransportSubscriberNative(C04I.A00().toString(), 1, Arrays.asList(strArr));
    }

    public static native void addSubscriberNative(EventLogSubscriber eventLogSubscriber);

    private native String getIdNative();

    private native int getSchemaIdNative();

    private native ArrayList getTransportKeysNative();

    private native NativeHolder initTransportSubscriberNative(String str, int i, List list);

    private void onLogTalEvent(PrivacyContext privacyContext, String str, long j, int i, boolean z, int i2, Object[] objArr) {
        onLogTalEvent(new EventLoggingData(privacyContext, str, j, i, z, objArr));
    }

    public static native void removeSubscriberNative(EventLogSubscriber eventLogSubscriber);

    public abstract void onLogTalEvent(EventLoggingData eventLoggingData);

    public boolean shouldLogEvent(long j) {
        return true;
    }

    public boolean shouldLogMCITraceEvent(long j) {
        return true;
    }
}
