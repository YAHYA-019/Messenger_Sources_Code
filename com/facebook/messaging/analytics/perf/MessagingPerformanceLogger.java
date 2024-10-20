package com.facebook.messaging.analytics.perf;

import X.0FS;
import X.0FU;
import X.0JL;
import X.0Pz;
import X.0Q8;
import X.0S2;
import X.0SY;
import X.0T9;
import X.0Xd;
import X.0Xk;
import X.0fH;
import X.0lP;
import X.0uR;
import X.11T;
import X.1BP;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Er;
import X.1GU;
import X.1MT;
import X.1MU;
import X.1MX;
import X.1Od;
import X.1PG;
import X.1QZ;
import X.1Qc;
import X.1Qd;
import X.1Ru;
import X.1U4;
import X.1WY;
import X.2Rz;
import X.2SE;
import X.2Vl;
import X.2yD;
import X.4EB;
import X.4Z8;
import X.4Zc;
import X.4eA;
import X.4eB;
import X.C00i;
import X.C08804o3;
import X.C08814o4;
import X.C0dr;
import X.C0mk;
import X.C0ml;
import X.C0xq;
import X.C1iq;
import X.C2rx;
import X.C47t;
import X.C4Z6;
import X.C5oq;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.MessageQueue;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.classmarkers.ClassMarkerLoader;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.util.TriState;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.responsiveness.touch.loom.MessengerTouchResponsivenessLoomTracer;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.perf.startupstatemachine.StartupStateMachine;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.redex.dynamicanalysis.DynamicAnalysisTraceManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Joiner;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: MessagingPerformanceLogger.class */
public final class MessagingPerformanceLogger {
    public int A00;
    public long A01;
    public 2Vl A02;
    public Runnable A03;
    public Runnable A04;
    public boolean A07;
    public volatile boolean A0b;
    public volatile boolean A0c;
    public volatile boolean A0d;
    public volatile boolean A0e;
    public volatile boolean A0f;
    public volatile boolean A0g;
    public static final int[] A0j = {344075179, 5515119};
    public static final int[] A0h = {5505027, 5537534, 5505028, 5505026, 5505175};
    public static final int[] A0i = {5505027, 5537534};
    public final 1Br A0V = 1Bq.A00(16520);
    public final 1Br A09 = 1Bq.A00(16458);
    public final 1Br A0A = 1Bq.A00(67765);
    public final 1Br A0B = 1Bq.A00(16616);
    public final 1Br A0G = 1Bq.A00(100175);
    public final 1Br A0Q = 1Bq.A00(16765);
    public final 1Br A0T = 1Bq.A00(84488);
    public final 1Br A0M = 1Bq.A00(16385);
    public final 1Br A0H = 1Bu.A00(85043);
    public final 1Br A0Y = 1Bq.A00(16664);
    public final 1Br A0F = 1Bq.A00(131345);
    public final 1Br A0X = 1Bq.A00(85044);
    public final 1Br A0W = 1Bu.A00(66883);
    public final 1Br A0R = 1Bq.A00(65839);
    public final 1Br A0S = 1Bq.A00(16668);
    public final 1Br A0J = 1Bq.A00(68579);
    public final 1Br A0N = 1Bq.A00(16465);
    public final 1Br A0I = 1Bq.A00(66661);
    public final 1Br A0Z = 1Bq.A00(85046);
    public final 1Br A0L = 1Bq.A00(66282);
    public final 1Br A0E = 1Bq.A00(66265);
    public final 1Br A0D = 1Bq.A00(66266);
    public final 1Br A0K = 1Bq.A00(85045);
    public final 1BP A0P = FbInjector.A00;
    public final 1Br A0U = 1Bq.A00(66440);
    public final 1Br A0C = 1Bq.A00(66354);
    public final AtomicInteger A0O = new AtomicInteger();
    public final Runnable A0a = new 1MT(this);
    public final MessageQueue.IdleHandler A08 = new 1MU(this);
    public Set A06 = new HashSet();
    public Set A05 = new HashSet();

    public static final 1Qd A00(MessagingPerformanceLogger messagingPerformanceLogger) {
        return (1Qd) messagingPerformanceLogger.A0R.A00.get();
    }

    public static final C0dr A01(MessagingPerformanceLogger messagingPerformanceLogger) {
        return (C0dr) messagingPerformanceLogger.A0T.A00.get();
    }

    public static final C08804o3 A02(MessagingPerformanceLogger messagingPerformanceLogger) {
        return (C08804o3) messagingPerformanceLogger.A0X.A00.get();
    }

    public static final 4eA A03(MessagingPerformanceLogger messagingPerformanceLogger) {
        return (4eA) messagingPerformanceLogger.A0Z.A00.get();
    }

    public static final 1Ru A04(MessagingPerformanceLogger messagingPerformanceLogger) {
        return (1Ru) messagingPerformanceLogger.A0S.A00.get();
    }

    public static final 1U4 A05(MessagingPerformanceLogger messagingPerformanceLogger) {
        return (1U4) messagingPerformanceLogger.A0U.A00.get();
    }

    private final C1iq A06() {
        return (C1iq) this.A0Q.A00.get();
    }

    public static final StartupStateMachine A07(MessagingPerformanceLogger messagingPerformanceLogger) {
        return (StartupStateMachine) messagingPerformanceLogger.A0Y.A00.get();
    }

    public static final QuickPerformanceLogger A08(MessagingPerformanceLogger messagingPerformanceLogger) {
        return (QuickPerformanceLogger) messagingPerformanceLogger.A0V.A00.get();
    }

    public static String A09(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "not_preloaded";
            case 1:
                return "preloaded";
            case 2:
                return "prerendered";
            case 3:
                return "reused";
            default:
                return "reentered";
        }
    }

    private final void A0A(int i) {
        MarkerEditor withMarker = A08(this).withMarker(i);
        C00i c00i = this.A0M.A00;
        withMarker.annotate("cm_enabled", ((2yD) c00i.get()).AZk(36326408191825493L));
        withMarker.annotate("cm_has_joined_chats", ((2yD) c00i.get()).AZk(36326408191891030L));
        1WY r0 = (1WY) 1Bi.A03(66481);
        withMarker.annotate("cm_folder_enabled", r0.A06());
        withMarker.annotate("cm_sync_group_enabled", r0.A06());
        withMarker.annotate("cm_bumped_threads", r0.A03());
        C00i c00i2 = this.A0E.A00;
        withMarker.annotate("slimsys", ((1PG) c00i2.get()).A06());
        c00i2.get();
        withMarker.annotate("skip_slimsys_in_memory", true);
        withMarker.markerEditingCompleted();
    }

    public static final void A0B(MessagingPerformanceLogger messagingPerformanceLogger) {
        messagingPerformanceLogger.A0W.A00.get();
    }

    public static final void A0C(MessagingPerformanceLogger messagingPerformanceLogger) {
        if (messagingPerformanceLogger.A07) {
            return;
        }
        ((1GU) messagingPerformanceLogger.A09.A00.get()).Ciz(messagingPerformanceLogger.A0a);
    }

    public static final void A0D(MessagingPerformanceLogger messagingPerformanceLogger, int i) {
        MarkerEditor withMarker = A08(messagingPerformanceLogger).withMarker(i);
        0lP r0 = BackgroundStartupDetector.A0D;
        withMarker.annotate("bsdColdStartMode", BackgroundStartupDetector.A0F);
        withMarker.annotate("bsdIsBackground", r0.A04());
        withMarker.markerEditingCompleted();
    }

    public static final void A0E(MessagingPerformanceLogger messagingPerformanceLogger, int i) {
        MarkerEditor withMarker = A08(messagingPerformanceLogger).withMarker(i);
        C00i c00i = messagingPerformanceLogger.A0I.A00;
        withMarker.annotate("first_activity", String.valueOf(((1Er) c00i.get()).A04));
        Intent intent = ((1Er) c00i.get()).A03;
        ComponentName componentName = null;
        withMarker.annotate("first_intent_action", String.valueOf(intent != null ? intent.getAction() : null));
        if (intent != null) {
            componentName = intent.getComponent();
        }
        withMarker.annotate("first_intent_component", String.valueOf(componentName));
        withMarker.annotate("cold_start_mode", String.valueOf(((1Er) c00i.get()).A00));
        withMarker.annotate("startup_in_bg", String.valueOf(((1Er) c00i.get()).A05));
        withMarker.point("highpri_init_begin", ((1Er) c00i.get()).A01);
        withMarker.point("highpri_init_end", ((1Er) c00i.get()).A02);
        withMarker.markerEditingCompleted();
    }

    public static final void A0F(MessagingPerformanceLogger messagingPerformanceLogger, String str) {
        if (messagingPerformanceLogger.A0q()) {
            ClassMarkerLoader.loadIsNotColdStartRunMarker();
            messagingPerformanceLogger.A06().A03(0S2.A01);
            1Qd.A01(A00(messagingPerformanceLogger), 5505027, (short) 2);
        } else if (A0N(messagingPerformanceLogger)) {
            messagingPerformanceLogger.A06().A03(0S2.A0N);
            1Qd.A01(A00(messagingPerformanceLogger), 5505026, (short) 2);
            A05(messagingPerformanceLogger).A04("", A01(messagingPerformanceLogger).now(), (short) 4);
        } else if (messagingPerformanceLogger.A0r()) {
            messagingPerformanceLogger.A06().A03(0S2.A0C);
            1Qd.A01(A00(messagingPerformanceLogger), 5505028, (short) 2);
            A05(messagingPerformanceLogger).A03("", A01(messagingPerformanceLogger).now(), (short) 4);
        }
        StartupStateMachine A07 = A07(messagingPerformanceLogger);
        synchronized (A07) {
            try {
                A07.A00 = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        A08(messagingPerformanceLogger).markerAnnotate(5505027, "cancellation_reason", str);
        ((ScheduledExecutorService) messagingPerformanceLogger.A0N.A00.get()).schedule((Runnable) new 4Zc(messagingPerformanceLogger), 5, TimeUnit.SECONDS);
        A08(messagingPerformanceLogger).markerEnd(5537534, (short) 4);
        A08(messagingPerformanceLogger).markerEnd(5505175, (short) 4);
        StartupStateMachine A072 = A07(messagingPerformanceLogger);
        synchronized (A072) {
            A072.A02 = 2;
        }
        A08(messagingPerformanceLogger).markerEnd(5505028, (short) 4);
        A07 = A07(messagingPerformanceLogger);
        synchronized (A07) {
            A07.A03 = 2;
        }
        A08(messagingPerformanceLogger).markerEnd(5505026, (short) 4);
        1Ru A04 = A04(messagingPerformanceLogger);
        C00i c00i = A04.A05;
        ((UserFlowLogger) c00i.get()).flowMarkPoint(A04.A00, "application_backgrounded");
        ((UserFlowLogger) c00i.get()).flowEndCancel(A04.A00, CancelReason.USER_CANCELLED);
        messagingPerformanceLogger.A0g = false;
        messagingPerformanceLogger.A02 = null;
    }

    public static final void A0G(MessagingPerformanceLogger messagingPerformanceLogger, String str) {
        if (messagingPerformanceLogger.A0r() || messagingPerformanceLogger.A0q() || A0N(messagingPerformanceLogger)) {
            A0I(messagingPerformanceLogger, "destination", str, A0h);
            A0K(messagingPerformanceLogger, str, (short) 2);
            A0J(messagingPerformanceLogger, str, (short) 2);
            messagingPerformanceLogger.A0o(str, (short) 5);
        }
    }

    public static final void A0H(MessagingPerformanceLogger messagingPerformanceLogger, String str, String str2) {
        int hashCode = str.hashCode();
        0uR r0 = new 0uR();
        r0.A04(15);
        MessagingInteractionStateManager messagingInteractionStateManager = (MessagingInteractionStateManager) messagingPerformanceLogger.A0H.A00.get();
        long now = A01(messagingPerformanceLogger).now();
        MessagingInteractionStateManager.A00(messagingInteractionStateManager, 5505034, hashCode);
        messagingInteractionStateManager.A01.markerStartForLegacy(5505034, hashCode, now, TimeUnit.MILLISECONDS, r0);
        A08(messagingPerformanceLogger).markerAnnotate(5505034, hashCode, Property.SYMBOL_Z_ORDER_SOURCE, str2);
        if (messagingPerformanceLogger.A0q()) {
            A08(messagingPerformanceLogger).markerStart(5505175);
            A08(messagingPerformanceLogger).markerAnnotate(5505175, hashCode, Property.SYMBOL_Z_ORDER_SOURCE, str2);
        }
        messagingPerformanceLogger.A00 = hashCode;
        A0C(messagingPerformanceLogger);
    }

    public static final void A0I(MessagingPerformanceLogger messagingPerformanceLogger, String str, String str2, int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            int i3 = iArr[i2];
            if (A08(messagingPerformanceLogger).isMarkerOn(i3)) {
                A08(messagingPerformanceLogger).markerAnnotate(i3, str, str2);
            }
            i = i2 + 1;
        }
    }

    public static final void A0J(MessagingPerformanceLogger messagingPerformanceLogger, String str, short s) {
        if (messagingPerformanceLogger.A0g) {
            A08(messagingPerformanceLogger).markerAnnotate(5505028, "mainactivity_closed", true);
        }
        messagingPerformanceLogger.A0g = false;
        if (messagingPerformanceLogger.A0r()) {
            StartupStateMachine A07 = A07(messagingPerformanceLogger);
            synchronized (A07) {
                A07.A02 = 1;
            }
            QuickPerformanceLogger A08 = A08(messagingPerformanceLogger);
            Context context = FbInjector.A03;
            11T.A0A(context);
            boolean z = false;
            if (0Xd.A00(context)) {
                z = true;
            }
            A08.markerAnnotate(5505028, "non_blocking_splash_screen", z);
            messagingPerformanceLogger.A0A(5505028);
            A0D(messagingPerformanceLogger, 5505028);
            A08(messagingPerformanceLogger).markerEnd(5505028, s);
            A05(messagingPerformanceLogger).A03(str, A01(messagingPerformanceLogger).now(), s);
            messagingPerformanceLogger.A06().A04(0S2.A0C);
            ((C4Z6) messagingPerformanceLogger.A0F.A00.get()).A01(5505028);
            1Qd.A01(A00(messagingPerformanceLogger), 5505028, (short) 2);
            1Ru A04 = A04(messagingPerformanceLogger);
            ((UserFlowLogger) A04.A05.get()).flowMarkPoint(A04.A00, "luke_warm_start_complete");
            ((4Z8) messagingPerformanceLogger.A0J.A00.get()).A00();
            ((MessengerTouchResponsivenessLoomTracer) messagingPerformanceLogger.A0L.A00.get()).A00(str, "luke_warm_start");
        }
        messagingPerformanceLogger.A0b = false;
    }

    public static final void A0K(MessagingPerformanceLogger messagingPerformanceLogger, String str, short s) {
        if (A0N(messagingPerformanceLogger)) {
            A07(messagingPerformanceLogger).A01();
            messagingPerformanceLogger.A0A(5505026);
            A08(messagingPerformanceLogger).markerEnd(5505026, s);
            A05(messagingPerformanceLogger).A04(str, A01(messagingPerformanceLogger).now(), s);
            messagingPerformanceLogger.A06().A04(0S2.A0N);
            ((C4Z6) messagingPerformanceLogger.A0F.A00.get()).A01(5505026);
            1Qd.A01(A00(messagingPerformanceLogger), 5505026, (short) 2);
            1Ru A04 = A04(messagingPerformanceLogger);
            ((UserFlowLogger) A04.A05.get()).flowMarkPoint(A04.A00, "warm_start_complete");
            ((4Z8) messagingPerformanceLogger.A0J.A00.get()).A00();
            ((MessengerTouchResponsivenessLoomTracer) messagingPerformanceLogger.A0L.A00.get()).A00(str, "warm_start");
        }
    }

    public static final void A0L(MessagingPerformanceLogger messagingPerformanceLogger, short s) {
        int i;
        messagingPerformanceLogger.A0g = false;
        messagingPerformanceLogger.A0d = false;
        1Qd.A01(A00(messagingPerformanceLogger), 5505027, s);
        try {
            DalvikInternals.onColdStartEnd();
        } catch (NoClassDefFoundError unused) {
        }
        if (s == 5) {
            0T9.A02("msgr_cold_start_to_cached_content", 1213081525);
            i = -142548397;
        } else {
            0T9.A02("msgr_cold_start_incomplete", -757475792);
            i = -805089662;
        }
        0T9.A00(i);
    }

    private final void A0M(C2rx c2rx, int i) {
        QuickPerformanceLogger A08;
        Integer num;
        ClassMarkerLoader.loadIsMessengerStartToInboxFinishMarker();
        A08(this).markerAnnotate(i, "destination", "threadlist");
        2Vl r0 = this.A02;
        if (A08(this).isMarkerOn(i) && r0 != null) {
            QuickPerformanceLogger A082 = A08(this);
            2Rz r02 = r0.A00;
            CallerContext callerContext = 2Rz.A1U;
            2SE r03 = r02.A0G;
            if (r03 == null) {
                11T.A0L("inboxItemTypeLoggingHelper");
                throw 0Q8.createAndThrow();
            }
            A082.markerAnnotate(i, "thread_list_types", r03.A01(false));
        }
        if (C2rx.A03 == c2rx) {
            A08 = A08(this);
            num = 0S2.A01;
        } else {
            if (C2rx.A02 != c2rx) {
                return;
            }
            A08 = A08(this);
            num = 0S2.A0C;
        }
        A08.markerAnnotate(i, "navigation_surface", 4EB.A00(num));
    }

    public static final boolean A0N(MessagingPerformanceLogger messagingPerformanceLogger) {
        int i;
        StartupStateMachine A07 = A07(messagingPerformanceLogger);
        synchronized (A07) {
            i = A07.A03;
        }
        boolean z = false;
        if (i == 3) {
            z = true;
        }
        return z;
    }

    public final void A0O() {
        int[] iArr = A0h;
        int i = 0;
        do {
            A08(this).markerDrop(iArr[i]);
            A05(this).A02("", A01(this).now(), (short) 216);
            A05(this).A03("", A01(this).now(), (short) 216);
            A05(this).A04("", A01(this).now(), (short) 216);
            i++;
        } while (i < 5);
    }

    public final void A0P(int i, int i2) {
        C1iq A06 = A06();
        Integer num = 0S2.A01;
        if (A06.A02(num) != 0) {
            A08(this).markerAnnotate(i, i2, "time_since_cold_startup", String.valueOf(A06().A02(num)));
        }
        C1iq A062 = A06();
        Integer num2 = 0S2.A0C;
        if (A062.A02(num2) != 0) {
            A08(this).markerAnnotate(i, i2, "time_since_lukewarm_startup", String.valueOf(A06().A02(num2)));
        }
        C1iq A063 = A06();
        Integer num3 = 0S2.A0N;
        if (A063.A02(num3) != 0) {
            A08(this).markerAnnotate(i, i2, "time_since_warm_startup", String.valueOf(A06().A02(num3)));
        }
    }

    public final void A0Q(int i, int i2, String str) {
        if (A08(this).isMarkerOn(i, i2)) {
            return;
        }
        A08(this).markerStart(i, i2);
        A08(this).markerAnnotate(i, i2, "starting_location", str);
    }

    public final void A0R(int i, int i2, short s) {
        A08(this).markerPoint(i, i2, String.valueOf((int) s));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r306 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0S(com.facebook.messaging.model.threadkey.ThreadKey r302) {
        /*
            r301 = this;
            r0 = r301
            com.facebook.quicklog.QuickPerformanceLogger r0 = A08(r0)
            r303 = r0
            r0 = 5505186(0x5400a2, float:7.714409E-39)
            r304 = r0
            r0 = r303
            r1 = r304
            r0.markerStart(r1)
            r0 = r301
            com.facebook.quicklog.QuickPerformanceLogger r0 = A08(r0)
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L2e
            r0 = r302
            X.1yg r0 = r0.A06
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2e
            r0 = r303
            java.lang.String r0 = r0.toString()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L33
        L2e:
            java.lang.String r0 = "null"
            r306 = r0
        L33:
            r0 = r305
            r1 = r304
            java.lang.String r2 = "thread_type"
            r3 = r306
            r0.markerAnnotate(r1, r2, r3)
            r0 = r301
            A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.analytics.perf.MessagingPerformanceLogger.A0S(com.facebook.messaging.model.threadkey.ThreadKey):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ac, code lost:
    
        if (X.C6oq.A00(r0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03c9, code lost:
    
        if (r304 == null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0T(com.facebook.messaging.model.threadkey.ThreadKey r302, X.C2rx r303, com.google.common.collect.ImmutableList r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.analytics.perf.MessagingPerformanceLogger.A0T(com.facebook.messaging.model.threadkey.ThreadKey, X.2rx, com.google.common.collect.ImmutableList, java.lang.String):void");
    }

    public final void A0U(ThreadKey threadKey, String str) {
        if (threadKey != null) {
            A03(this).A04(threadKey.A0u().hashCode(), str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (r312 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0V(com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.String r303, java.lang.String r304, java.lang.String r305) {
        /*
            r301 = this;
            r0 = 2
            r306 = r0
            r0 = r305
            r1 = r306
            X.11T.A0F(r0, r1)
            r0 = r301
            X.4o3 r0 = A02(r0)
            r307 = r0
            r0 = r303
            if (r0 == 0) goto L9d
            r0 = r303
            int r0 = r0.hashCode()
            r308 = r0
            r0 = r307
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.C08804o3.A00(r0)
            r309 = r0
            r0 = 5505025(0x540001, float:7.714183E-39)
            r310 = r0
            r0 = r309
            r1 = r310
            r2 = r308
            java.lang.String r3 = "send_type"
            r4 = r304
            r0.markerAnnotate(r1, r2, r3, r4)
            r0 = r307
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.C08804o3.A00(r0)
            r309 = r0
            r0 = 1479(0x5c7, float:2.073E-42)
            r306 = r0
            r0 = r306
            java.lang.String r0 = X.4YT.A00(r0)
            r311 = r0
            r0 = r309
            r1 = r310
            r2 = r308
            r3 = r311
            r4 = r305
            r0.markerAnnotate(r1, r2, r3, r4)
            r0 = r302
            if (r0 == 0) goto L72
            r0 = r302
            X.1yg r0 = r0.A06
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L72
            r0 = r311
            java.lang.String r0 = r0.toString()
            r312 = r0
            r0 = r312
            if (r0 != 0) goto L77
        L72:
            java.lang.String r0 = "UNKNOWN"
            r312 = r0
        L77:
            r0 = r307
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.C08804o3.A00(r0)
            r309 = r0
            java.lang.String r0 = "thread_type"
            r311 = r0
            r0 = r309
            r1 = r310
            r2 = r308
            r3 = r311
            r4 = r312
            r0.markerAnnotate(r1, r2, r3, r4)
            r0 = 147508(0x24034, float:2.06703E-40)
            r306 = r0
            r0 = r306
            java.lang.Object r0 = X.1Bn.A0A(r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.analytics.perf.MessagingPerformanceLogger.A0V(com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v28 X.2lP, still in use, count: 2, list:
          (r310v28 X.2lP) from 0x0467: PHI (r310v26 X.2lP) = (r310v7 X.2lP), (r310v28 X.2lP) binds: [B:80:0x0704, B:41:0x0464] A[DONT_GENERATE, DONT_INLINE]
          (r310v28 X.2lP) from 0x0464: IF  (r310v28 X.2lP) != (null X.2lP)  -> B:42:0x0467 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0704  */
    /* JADX WARN: Type inference failed for: r0v386, types: [java.lang.Object, X.6or] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, X.6o2] */
    /* JADX WARN: Type inference failed for: r348v3, types: [java.lang.Object, X.6o2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0W(com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, int r306) {
        /*
            Method dump skipped, instructions count: 1892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.analytics.perf.MessagingPerformanceLogger.A0W(com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public final void A0X(ThreadKey threadKey, String str, String str2, String str3, int i, int i2, long j, long j2, long j3, boolean z) {
        11T.A0F(str3, 2);
        C08804o3 A02 = A02(this);
        C08804o3.A02(A02, threadKey, str, str2, str3, 5505076, i, i2, j, j2, j3, z);
        A02.A08.add(str);
        if (j > 0) {
            A02.A05.put(str, Long.valueOf(j));
            C08804o3.A02(A02, threadKey, str, str2, str3, 231283540, i, i2, j, j2, j3, z);
        }
        C08804o3 A022 = A02(this);
        C00i c00i = this.A0E.A00;
        boolean A05 = ((1PG) c00i.get()).A05();
        QuickPerformanceLogger A00 = C08804o3.A00(A022);
        int hashCode = str.hashCode();
        A00.markerAnnotate(5505076, hashCode, "is_dolphin", A05);
        if (A022.A05.get(str) != null) {
            C08804o3.A00(A022).markerAnnotate(231283540, hashCode, "is_dolphin", A05);
        }
        A0B(this);
        A0B(this);
        ((1PG) c00i.get()).A05();
        A0C(this);
    }

    public final void A0Y(ThreadKey threadKey, String str, String str2, String str3, int i, long j, long j2, boolean z) {
        11T.A0F(str, 0);
        11T.A0F(str3, 2);
        A0X(threadKey, str, str2, str3, i, 1, j, j2, 0L, z);
    }

    public final void A0Z(ThreadKey threadKey, boolean z) {
        4eA A03 = A03(this);
        if (threadKey != null) {
            A03.A04(threadKey.A0u().hashCode(), "setup_thread_view_fragment_end");
            4eA.A01(A03).markerAnnotate(5505032, threadKey.A0u().hashCode(), "user_visibility_hint", z);
            C47t A00 = 4eB.A00(4eA.A00(A03), threadKey.A0u().hashCode());
            if (A00 != null) {
                A00.Bcr("setup_thread_view_fragment_end");
                A00.Bci("user_visibility_hint", z);
            }
        }
    }

    public final void A0a(C2rx c2rx) {
        QuickPerformanceLogger A08;
        Integer num;
        11T.A0F(c2rx, 0);
        if (A0r()) {
            A0M(c2rx, 5505028);
            A0J(this, "threadlist", (short) 2);
        } else if (A0N(this)) {
            A0M(c2rx, 5505026);
            A0K(this, "threadlist", (short) 2);
        } else if (A0q()) {
            A0M(c2rx, 5505027);
            A0M(c2rx, 5537534);
            if (C2rx.A03 == c2rx) {
                A08 = A08(this);
                num = 0S2.A01;
            } else {
                if (C2rx.A02 == c2rx) {
                    A08 = A08(this);
                    num = 0S2.A0C;
                }
                A0o("threadlist", (short) 5);
            }
            A08.markerAnnotate(5505175, "navigation_surface", 4EB.A00(num));
            A0o("threadlist", (short) 5);
        }
        A08(this).markerEnd(5505186, (short) 2);
        1Ru A04 = A04(this);
        StartupStateMachine A07 = A07(this);
        if (A04.A02) {
            int ordinal = c2rx.ordinal();
            ((UserFlowLogger) A04.A05.get()).flowAnnotateWithCrucialData(A04.A00, "threadlist_draw_complete", 0Pz.A0W(A07.toString(), ordinal != 1 ? ordinal != 2 ? "" : ";bubbles" : ";chatheads"));
            A04.A02 = false;
        }
        this.A02 = null;
    }

    public final void A0b(String str) {
        C08804o3 A02 = A02(this);
        C08804o3.A00(A02).markerPoint(5505076, str.hashCode(), "create_message_list_end");
        A0B(this);
    }

    public final void A0c(String str) {
        C08804o3 A02 = A02(this);
        for (String str2 : A02.A08) {
            QuickPerformanceLogger A00 = C08804o3.A00(A02);
            int hashCode = str2.hashCode();
            A00.markerPoint(5505076, hashCode, str);
            if (A02.A05.get(str2) != null) {
                C08804o3.A00(A02).markerPoint(231283540, hashCode, str);
            }
        }
        A0B(this);
    }

    public final void A0d(String str) {
        11T.A0F(str, 0);
        if (!this.A0f) {
            ((1MX) this.A0K.A00.get()).A00(str, TimeUnit.MILLISECONDS, A01(this).now());
            return;
        }
        int[] iArr = A0h;
        int i = 0;
        do {
            int i2 = iArr[i];
            if (A08(this).isMarkerOn(i2)) {
                A08(this).markerPoint(i2, str);
            }
            i++;
        } while (i < 5);
    }

    public final void A0e(String str) {
        if (this.A0c || this.A0d) {
            int[] iArr = A0i;
            int i = 0;
            do {
                A08(this).markerPoint(iArr[i], str);
                i++;
            } while (i < 2);
        }
    }

    public final void A0f(String str) {
        C08804o3 A02 = A02(this);
        int hashCode = str.hashCode();
        C08804o3.A03(A02, str);
        1Qd.A01((1Qd) 1Br.A0B(A02.A01), 5505076, (short) 2);
        C08804o3.A00(A02).markerEnd(5505076, hashCode, (short) 3);
        Map map = A02.A05;
        if (map.get(str) != null) {
            C08804o3.A00(A02).markerEnd(231283540, hashCode, (short) 3);
        }
        A02.A08.remove(str);
        map.remove(str);
        1Br.A0C(A02.A03);
        C08814o4.A00.remove(Integer.valueOf(hashCode));
        A0B(this);
    }

    public final void A0g(String str) {
        11T.A0F(str, 0);
        C08804o3 A02 = A02(this);
        MessagingInteractionStateManager messagingInteractionStateManager = (MessagingInteractionStateManager) A02.A04.A00.get();
        int hashCode = str.hashCode();
        MessagingInteractionStateManager.A00(messagingInteractionStateManager, 5505025, hashCode);
        messagingInteractionStateManager.A01.markerStart(5505025, hashCode);
        A02.A06.put(str, 0JL.A00(0Pz.A0W("send_message: ", str)));
        A0C(this);
    }

    public final void A0h(String str) {
        11T.A0F(str, 0);
        A0F(this, "thread view fragment hidden");
        MessagingInteractionStateManager messagingInteractionStateManager = (MessagingInteractionStateManager) this.A0H.A00.get();
        int hashCode = str.hashCode();
        messagingInteractionStateManager.A01(5505034, hashCode, (short) 4);
        4eA A03 = A03(this);
        4eB A00 = 4eA.A00(A03);
        C47t A002 = 4eB.A00(A00, hashCode);
        if (A002 != null) {
            A002.BYG();
        }
        4eB.A03(A00, hashCode);
        4eA.A01(A03).markerEnd(5505032, hashCode, (short) 4);
        A03.A03.A00.get();
        Map map = C5oq.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        map.remove(valueOf);
        C5oq.A00.remove(valueOf);
        C5oq.A02.remove(valueOf);
        ((MessagingInteractionStateManager) A02(this).A04.A00.get()).A01(5505025, 0, (short) 4);
        A0B(this);
    }

    public final void A0i(String str) {
        C08804o3.A00(A02(this)).markerPoint(5505060, -599342816, str);
    }

    public final void A0j(String str, String str2) {
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        if (this.A0f) {
            A0I(this, str, str2, A0i);
            return;
        }
        1MX r0 = (1MX) this.A0K.A00.get();
        synchronized (r0) {
            if (!r0.A00) {
                r0.A01.put(str, str2);
            }
        }
    }

    public final void A0k(String str, String str2) {
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        C08804o3.A00(A02(this)).markerTag(5505025, str.hashCode(), str2);
    }

    public final void A0l(String str, String str2) {
        A02(this).A04(str, str2);
        A0B(this);
    }

    public final void A0m(String str, String str2) {
        C08804o3 A02 = A02(this);
        if (str != null) {
            QuickPerformanceLogger A00 = C08804o3.A00(A02);
            int hashCode = str.hashCode();
            A00.markerPoint(5513931, hashCode, str2);
            if (A02.A07.get(str) != null) {
                C08804o3.A00(A02).markerPoint(231288954, hashCode, str2);
            }
        }
    }

    public final void A0n(String str, TimeUnit timeUnit, long j) {
        11T.A0F(str, 0);
        11T.A0F(timeUnit, 2);
        if (!this.A0f) {
            ((1MX) this.A0K.A00.get()).A00(str, timeUnit, j);
            return;
        }
        int[] iArr = A0i;
        int i = 0;
        do {
            A08(this).markerPoint(iArr[i], str, j, timeUnit);
            i++;
        } while (i < 2);
    }

    /* JADX WARN: Type inference failed for: r0v198, types: [X.0ml, java.lang.Object] */
    public final void A0o(String str, short s) {
        Object obj;
        if (A0q()) {
            C00i c00i = this.A0B.A00;
            if (((1Od) c00i.get()).A0A() == TriState.YES || ((1Od) c00i.get()).A0E()) {
                ClassMarkerLoader.loadIsNotColdStartRunMarker();
                obj = DynamicAnalysisTraceManager.class;
                synchronized (obj) {
                }
            } else {
                ClassMarkerLoader.loadColdStartTTIRunMarker();
                obj = DynamicAnalysisTraceManager.class;
                synchronized (obj) {
                    0fH.A0j("DYNA|TraceManager", "Nothing to end. The app is not instrumented!");
                }
            }
            A07(this).A00();
            A08(this).dropAllInstancesOfMarker(5505190);
            QuickPerformanceLogger A08 = A08(this);
            Joiner joiner = new Joiner(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            A08.markerAnnotate(5505027, "activity", new Joiner.AnonymousClass1(joiner, "null").join(this.A06.iterator()));
            QuickPerformanceLogger A082 = A08(this);
            Joiner joiner2 = new Joiner(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            A082.markerAnnotate(5505027, "action", new Joiner.AnonymousClass1(joiner2, "null").join(this.A05.iterator()));
            A0A(5505027);
            0FU r0 = (0FU) 0FS.A00.A00.getAndSet(null);
            if (r0 != null) {
                0SY r02 = r0.A00;
                QuickPerformanceLogger A083 = A08(this);
                C0xq c0xq = r02.A00;
                if (c0xq != null) {
                    Lock lock = c0xq.A01;
                    lock.lock();
                    try {
                        AtomicReference atomicReference = c0xq.A00;
                        ?? obj2 = new Object();
                        obj2.A01 = null;
                        obj2.A00 = null;
                        C0ml c0ml = (C0ml) atomicReference.getAndSet(obj2);
                        c0ml.getClass();
                        lock.unlock();
                        ConcurrentLinkedQueue concurrentLinkedQueue = c0ml.A01;
                        if (concurrentLinkedQueue != null) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                C0xq.A00(A083, (C0mk) it.next());
                            }
                        }
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                }
            }
            long now = A01(this).now();
            A0E(this, 5505027);
            A0D(this, 5505027);
            1Qc r03 = (1Qc) 1Bi.A03(65837);
            ReentrantLock reentrantLock = r03.A04;
            reentrantLock.lock();
            try {
                List<1QZ> list = r03.A03;
                ArrayList arrayList = new ArrayList();
                for (1QZ r04 : list) {
                    if (11T.A0O(r04.A06, "GraphQL")) {
                        String str2 = r04.A05;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                }
                reentrantLock.unlock();
                A08(this).markerAnnotate(5505027, "graphql_query_count", arrayList.size());
                A08(this).markerAnnotate(5505027, "graphql_query_names", (String[]) arrayList.toArray(new String[0]));
                A08(this).markerAnnotate(5505027, "threads_number_on_end", 0Xk.A00());
                QuickPerformanceLogger A084 = A08(this);
                C00i c00i2 = this.A0E.A00;
                A084.markerAnnotate(5505027, "is_dolphin", ((1PG) c00i2.get()).A05());
                A08(this).markerAnnotate(5505175, "is_dolphin", ((1PG) c00i2.get()).A05());
                QuickPerformanceLogger A085 = A08(this);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                A085.markerEnd(5505027, s, now, timeUnit);
                A05(this).A02(str, now, s);
                A08(this).markerAnnotate(5537534, "cold_start_marker_end_duration", A01(this).now() - now);
                A08(this).markerEnd(5537534, s, now, timeUnit);
                A08(this).markerEnd(5505175, s);
                A06().A04(0S2.A01);
                A0L(this, s);
                ((C4Z6) this.A0F.A00.get()).A01(5505027);
                1Ru A04 = A04(this);
                ((UserFlowLogger) A04.A05.get()).flowMarkPoint(A04.A00, "cold_start_complete");
                ((4Z8) this.A0J.A00.get()).A00();
                ((MessengerTouchResponsivenessLoomTracer) this.A0L.A00.get()).A00(str, "cold_start");
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final void A0p(String str, short s) {
        11T.A0F(str, 0);
        C08804o3.A00(A02(this)).markerPoint(5505025, str.hashCode(), String.valueOf((int) s));
    }

    public final boolean A0q() {
        int i;
        StartupStateMachine A07 = A07(this);
        synchronized (A07) {
            i = A07.A00;
        }
        boolean z = false;
        if (i == 3) {
            z = true;
        }
        return z;
    }

    public final boolean A0r() {
        int i;
        StartupStateMachine A07 = A07(this);
        synchronized (A07) {
            i = A07.A02;
        }
        boolean z = false;
        if (i == 3) {
            z = true;
        }
        return z;
    }
}
