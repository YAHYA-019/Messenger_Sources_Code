package com.facebook.jni;

import X.0BR;
import X.0BS;
import X.0BW;
import X.0Pz;
import X.AnonymousClass001;
import X.C01s;
import X.C01t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;

/* loaded from: NativeSoftErrorReporterProxy.class */
public final class NativeSoftErrorReporterProxy {
    public static ExecutorService sErrorReportingExecutorService;
    public static C01t sErrorReportingGkReader;
    public static WeakReference sFbErrorReporterWeakReference;
    public static final LinkedList sSoftErrorCache = new LinkedList();

    public static void flushSoftErrorCacheAsync() {
        synchronized (NativeSoftErrorReporterProxy.class) {
            WeakReference weakReference = sFbErrorReporterWeakReference;
            if (weakReference != null) {
                C01s c01s = (C01s) weakReference.get();
                if (c01s != null && sErrorReportingGkReader != null) {
                    LinkedList linkedList = sSoftErrorCache;
                    if (!linkedList.isEmpty()) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        synchronized (linkedList) {
                            A0s.addAll(linkedList);
                            linkedList.clear();
                        }
                        sErrorReportingExecutorService.execute(new 0BW(c01s, A0s));
                    }
                }
            }
        }
    }

    public static native void generateNativeSoftError();

    public static void softReport(int i, String str, String str2, int i2) {
        softReport(i, str, str2, null, i2);
    }

    public static void softReport(int i, String str, String str2, Throwable th, int i2) {
        String A0j = 0Pz.A0j("[Native] ", i != 1 ? i != 2 ? "<level:unknown> " : "<level:mustfix> " : "<level:warning> ", str);
        synchronized (NativeSoftErrorReporterProxy.class) {
            LinkedList linkedList = sSoftErrorCache;
            synchronized (linkedList) {
                0BS A01 = 0BR.A01(A0j, str2);
                A01.A04 = th;
                A01.A00 = i2;
                linkedList.addLast(new 0BR(A01));
                while (linkedList.size() >= 50) {
                    linkedList.removeFirst();
                }
            }
        }
        flushSoftErrorCacheAsync();
    }
}
