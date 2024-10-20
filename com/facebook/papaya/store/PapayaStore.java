package com.facebook.papaya.store;

import X.0Pz;
import X.1BK;
import X.1Kd;
import X.2FP;
import X.2FT;
import X.AbM;
import X.AnonymousClass001;
import X.C00i;
import X.C0il;
import X.GOn;
import X.InL;
import X.LXZ;
import X.Ley;
import X.MCQ;
import X.QpJ;
import X.QqL;
import com.facebook.jni.HybridData;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: PapayaStore.class */
public final class PapayaStore {
    public static final AtomicInteger sSequenceId;
    public final MCQ mEventListener;
    public final HybridData mHybridData;

    static {
        C0il.A0B("papaya-store");
        sSequenceId = GOn.A1K(1);
    }

    public PapayaStore(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.mEventListener = null;
    }

    public PapayaStore(String str, String str2, ScheduledExecutorService scheduledExecutorService, Map map, String str3, Long l, MCQ mcq) {
        this.mHybridData = initHybrid(str, str2, scheduledExecutorService, map, str3, l);
        this.mEventListener = mcq;
        if (mcq != null) {
            File file = new File(str, 0Pz.A0W(str2, ".db"));
            QpJ qpJ = QpJ.A03;
            ImmutableMap of = ImmutableMap.of((Object) "size_kb", (Object) String.valueOf(file.length() / 1024), (Object) "db_name", (Object) str2);
            LXZ lxz = (LXZ) mcq;
            EventBuilder markEventBuilder = 1BK.A0U(lxz.A01).markEventBuilder(LXZ.A00(qpJ), "INIT");
            Iterator A14 = AbM.A14(of);
            while (A14.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A14);
                markEventBuilder.annotate(AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
            }
            markEventBuilder.annotate("experiment_name", 1BK.A0N(lxz.A00).BCy(36875983614247494L));
            markEventBuilder.report();
        }
    }

    public static native HybridData initHybrid(String str, String str2, ScheduledExecutorService scheduledExecutorService, Map map, String str3, Long l);

    private native void nativeCleanup(Callback callback);

    private native void nativeErase(Query query, Callback callback);

    private native void nativeEraseAll(Callback callback);

    private native void nativeNormalize(Callback callback);

    private native void nativeRead(Query query, Callback callback);

    private native void nativeRegisterProperty(long j, int i, long j2, String str, Callback callback);

    private native void nativeRegisterRecord(long j, Set set, long j2, String str, Callback callback);

    private native void nativeWrite(long j, Map map, String str, long j2, Callback callback);

    private void notifyListener(QpJ qpJ, Map map, ListenableFuture listenableFuture) {
        if (this.mEventListener != null) {
            int incrementAndGet = sSequenceId.incrementAndGet();
            C00i c00i = this.mEventListener.A01;
            QuickPerformanceLogger A0U = 1BK.A0U(c00i);
            int A00 = LXZ.A00(qpJ);
            A0U.markerStart(A00, incrementAndGet, false);
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                1BK.A0U(c00i).markerAnnotate(A00, incrementAndGet, AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
            }
            1Kd.A0E(new InL(incrementAndGet, 2, qpJ, this), listenableFuture);
        }
    }

    public ListenableFuture registerProperty(long j, QqL qqL, long j2, String str) {
        Callback callback = new Callback();
        nativeRegisterProperty(j, qqL.value, j2, "", callback);
        2FT A01 = 2FP.A01(new Ley(callback, 6), callback.mFuture);
        notifyListener(QpJ.A05, RegularImmutableMap.A03, A01);
        return A01;
    }

    public ListenableFuture registerRecord(long j, ImmutableSet immutableSet, long j2, String str) {
        Callback callback = new Callback();
        nativeRegisterRecord(j, immutableSet, j2, "", callback);
        2FT A01 = 2FP.A01(new Ley(callback, 6), callback.mFuture);
        notifyListener(QpJ.A06, ImmutableMap.of((Object) "record_id", (Object) String.valueOf(j)), A01);
        return A01;
    }

    public ListenableFuture write(long j, ImmutableMap immutableMap, String str, long j2) {
        String str2 = str;
        Callback callback = new Callback();
        if (str == null) {
            str2 = "";
        }
        nativeWrite(j, immutableMap, str2, 0L, callback);
        2FT A01 = 2FP.A01(new Ley(callback, 6), callback.mFuture);
        notifyListener(QpJ.A07, ImmutableMap.of((Object) "record_id", (Object) String.valueOf(j)), A01);
        return A01;
    }
}
