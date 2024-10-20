package com.facebook.messaging.analytics.perf.efficiency;

import X.0FR;
import X.0fH;
import X.11T;
import X.1BP;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1CO;
import X.1Od;
import X.3oS;
import X.7Tr;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C00i;
import X.C0dr;
import X.C1fx;
import X.C1m1;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: MessagingStateChangePerformanceLogger.class */
public final class MessagingStateChangePerformanceLogger {
    public static final C1fx A0a = new Object();
    public static final int[] A0b = {5512674, 5520009, 5509469, 5515336};
    public UsageStatsManager A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final PowerManager A07;
    public final 1Br A08;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final long A0N;
    public final long A0O;
    public final Context A0P;
    public final 1BP A0Q;
    public volatile ScheduledFuture A0V;
    public volatile ScheduledFuture A0W;
    public volatile ScheduledFuture A0X;
    public volatile boolean A0Y;
    public volatile boolean A0Z;
    public volatile String A0U = "Cold Start";
    public volatile String A0T = "Unknown";
    public final 1Br A0S = 1Bq.A00(68406);
    public final 1Br A09 = 1Bq.A00(16458);
    public final 1Br A0I = 1Bq.A00(16465);
    public final 1Br A0D = 1Bq.A00(66265);
    public final 1Br A0C = 1Bu.A00(66804);
    public final 1Br A0A = 1Bq.A00(16616);
    public final 1Br A0E = 1Bq.A00(16687);
    public final 1Br A0R = 1Bq.A00(16385);
    public final 1Br A0B = 1Bq.A00(16782);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x013c, code lost:
    
        if (A00(r301).AZk(36315030819774850L) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x016a, code lost:
    
        if (A00(r301).AZk(36315030819971459L) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00de, code lost:
    
        if (A00(r301).AZk(36315030819578240L) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x010e, code lost:
    
        if (A00(r301).AZk(36315030819709313L) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessagingStateChangePerformanceLogger() {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger.<init>():void");
    }

    public static final 1CO A00(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger) {
        return (1CO) messagingStateChangePerformanceLogger.A0R.A00.get();
    }

    public static final LightweightQuickPerformanceLogger A01(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger) {
        return (LightweightQuickPerformanceLogger) messagingStateChangePerformanceLogger.A0S.A00.get();
    }

    public static final ScheduledFuture A02(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger, int i, long j, short s) {
        ScheduledFuture<?> schedule = ((ScheduledExecutorService) messagingStateChangePerformanceLogger.A0I.A00.get()).schedule((Runnable) new 3oS(messagingStateChangePerformanceLogger, i, s), j, TimeUnit.SECONDS);
        11T.A0A(schedule);
        return schedule;
    }

    public static final void A03(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger, int i) {
        0fH.A0d(Integer.valueOf(i), Boolean.valueOf(C1fx.A00()), "MessagingStateChangePerformanceLogger", "Starting QPL markerId=%d isInTestEnvironment()=%b");
        A01(messagingStateChangePerformanceLogger).markerAnnotate(i, "start_mqtt_state", messagingStateChangePerformanceLogger.A0B());
        A01(messagingStateChangePerformanceLogger).markerAnnotate(i, "firstComponentName", 0FR.A05);
        A01(messagingStateChangePerformanceLogger).markerAnnotate(i, "firstComponentType", 0FR.A06);
        A01(messagingStateChangePerformanceLogger).markerAnnotate(i, "first_component_action", 0FR.A07);
        A01(messagingStateChangePerformanceLogger).markerAnnotate(i, "start_network_state", ((FbNetworkManager) messagingStateChangePerformanceLogger.A0E.A00.get()).A0M() ? "Connected" : "Disconnected");
        A01(messagingStateChangePerformanceLogger).markerAnnotate(i, "start_chatd_state", messagingStateChangePerformanceLogger.A0T);
        if (C1fx.A00()) {
            A01(messagingStateChangePerformanceLogger).markerAnnotate(i, AnonymousClass000.A00(218), Process.myPid());
            if (messagingStateChangePerformanceLogger.A01 != null) {
                A01(messagingStateChangePerformanceLogger).markerAnnotate(i, "debug_message", messagingStateChangePerformanceLogger.A01);
            }
        }
    }

    public static final void A04(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger, String str) {
        if (messagingStateChangePerformanceLogger.A0J) {
            int[] iArr = A0b;
            int i = 0;
            do {
                int i2 = iArr[i];
                if (A01(messagingStateChangePerformanceLogger).isMarkerOn(i2, true)) {
                    A01(messagingStateChangePerformanceLogger).markerPoint(i2, str);
                }
                i++;
            } while (i < 4);
        }
    }

    public static final void A05(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger, String str) {
        if (((1Od) messagingStateChangePerformanceLogger.A0A.A00.get()).A0E()) {
            A01(messagingStateChangePerformanceLogger).markerStart(5512674);
            A01(messagingStateChangePerformanceLogger).markerAnnotate(5512674, TraceFieldType.SessionType, str);
            LightweightQuickPerformanceLogger A01 = A01(messagingStateChangePerformanceLogger);
            long j = messagingStateChangePerformanceLogger.A0N;
            A01.markerAnnotate(5512674, "event_duration", j);
            A03(messagingStateChangePerformanceLogger, 5512674);
            messagingStateChangePerformanceLogger.A0V = A02(messagingStateChangePerformanceLogger, 5512674, j, (short) 2);
        }
    }

    public static final void A06(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger, String str) {
        if (C1fx.A00()) {
            7Tr r0 = 7Tr.A01;
            synchronized (r0) {
                r0.A00 = AnonymousClass001.A0u();
            }
        }
        A01(messagingStateChangePerformanceLogger).markerStart(5509469);
        A01(messagingStateChangePerformanceLogger).markerAnnotate(5509469, TraceFieldType.SessionType, str);
        LightweightQuickPerformanceLogger A01 = A01(messagingStateChangePerformanceLogger);
        long j = messagingStateChangePerformanceLogger.A0O;
        A01.markerAnnotate(5509469, "event_duration", j);
        A03(messagingStateChangePerformanceLogger, 5509469);
        A01(messagingStateChangePerformanceLogger).markerAnnotate(5509469, "push_during_background", messagingStateChangePerformanceLogger.A02);
        messagingStateChangePerformanceLogger.A0W = A02(messagingStateChangePerformanceLogger, 5509469, j, (short) 2);
    }

    public static final void A07(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger, String str, int i) {
        if (messagingStateChangePerformanceLogger.A0J) {
            int[] iArr = A0b;
            int i2 = 0;
            do {
                int i3 = iArr[i2];
                if (A01(messagingStateChangePerformanceLogger).isMarkerOn(i3, true)) {
                    A01(messagingStateChangePerformanceLogger).markerAnnotate(i3, str, i);
                }
                i2++;
            } while (i2 < 4);
        }
    }

    public static final void A08(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger, String str, long j) {
        if (messagingStateChangePerformanceLogger.A0J) {
            int[] iArr = A0b;
            int i = 0;
            do {
                int i2 = iArr[i];
                if (A01(messagingStateChangePerformanceLogger).isMarkerOn(i2, true)) {
                    A01(messagingStateChangePerformanceLogger).markerAnnotate(i2, str, j);
                }
                i++;
            } while (i < 4);
        }
    }

    public static final void A09(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger, String str, String str2) {
        if (messagingStateChangePerformanceLogger.A0J) {
            int[] iArr = A0b;
            int i = 0;
            do {
                int i2 = iArr[i];
                if (A01(messagingStateChangePerformanceLogger).isMarkerOn(i2, true)) {
                    A01(messagingStateChangePerformanceLogger).markerAnnotate(i2, str, str2);
                }
                i++;
            } while (i < 4);
        }
    }

    public static final void A0A(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger, short s) {
        ScheduledFuture scheduledFuture = messagingStateChangePerformanceLogger.A0X;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        messagingStateChangePerformanceLogger.A0X = null;
        A01(messagingStateChangePerformanceLogger).markerAnnotate(5515336, "end_mqtt_state", messagingStateChangePerformanceLogger.A0B());
        A01(messagingStateChangePerformanceLogger).markerAnnotate(5515336, "end_network_state", ((FbNetworkManager) messagingStateChangePerformanceLogger.A0E.A00.get()).A0M() ? "Connected" : "Disconnected");
        A01(messagingStateChangePerformanceLogger).markerAnnotate(5515336, "end_chatd_state", messagingStateChangePerformanceLogger.A0T);
        A01(messagingStateChangePerformanceLogger).markerAnnotate(5515336, "call_state", messagingStateChangePerformanceLogger.A0Z ? "rtc_call_start" : "rtc_call_end");
        A01(messagingStateChangePerformanceLogger).markerEnd(5515336, s, ((C0dr) messagingStateChangePerformanceLogger.A0G.A00.get()).now(), TimeUnit.MILLISECONDS);
    }

    public final String A0B() {
        C00i c00i = this.A0B.A00;
        return ((C1m1) c00i.get()).A03() ? "Connected" : ((C1m1) c00i.get()).A04() ? "Connecting" : "Disconnected";
    }

    public final void A0C(String str) {
        if (this.A0J) {
            A04(this, str);
        }
    }

    public final void A0D(String str, TimeUnit timeUnit, long j) {
        if (this.A0J && this.A0K) {
            int[] iArr = A0b;
            int i = 0;
            do {
                int i2 = iArr[i];
                if (A01(this).isMarkerOn(i2, true)) {
                    A01(this).markerPoint(i2, str, j, timeUnit);
                }
                i++;
            } while (i < 4);
        }
    }

    public final void A0E(String str, TimeUnit timeUnit, long j) {
        11T.A0F(str, 0);
        if (this.A0J && this.A0L) {
            A01(this).markerPoint(5509469, str, j, timeUnit);
        }
    }
}
