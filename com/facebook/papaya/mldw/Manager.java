package com.facebook.papaya.mldw;

import X.0fH;
import X.C0il;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Manager.class */
public class Manager {
    public static final Map sHosts;

    static {
        C0il.A0B("papaya-mldw");
        sHosts = new HashMap();
    }

    public static Host getHost(int i) {
        Host host;
        synchronized (Manager.class) {
            host = (Host) sHosts.get(Integer.valueOf(i));
        }
        return host;
    }

    public static native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static native SettableFuture nativeCleanup(int i);

    public static native Host nativeRegisterHost(int i, ScheduledExecutorService scheduledExecutorService, String str, ITransport iTransport, ImmutableList immutableList);

    public static native void nativeRemoveLogSink(String str);

    public static native void nativeUnregisterHost(int i);

    public static Host registerHost(int i, ScheduledExecutorService scheduledExecutorService, String str, ITransport iTransport, ImmutableList immutableList) {
        Host host;
        synchronized (Manager.class) {
            Map map = sHosts;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                0fH.A0g(valueOf, "Manager", "Host %s is already registered.");
            } else {
                map.put(valueOf, nativeRegisterHost(i, scheduledExecutorService, str, iTransport, null));
            }
            host = (Host) map.get(valueOf);
            host.getClass();
        }
        return host;
    }

    public static void unregisterHost(int i) {
        synchronized (Manager.class) {
            Map map = sHosts;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                map.remove(valueOf);
                nativeUnregisterHost(i);
            }
        }
    }
}
