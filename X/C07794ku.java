package X;

import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ku.class */
public final class C07794ku implements 1Vf {
    public final 1Br A05 = 1Bq.A00(85048);
    public final 1Br A06 = 1Bq.A00(16385);
    public final 1Br A01 = 1Bq.A00(66807);
    public final 1Br A00 = 1Bq.A00(16616);
    public final 1Br A0B = 1Bq.A00(67183);
    public final 1Br A02 = 1Bq.A00(68470);
    public final 1Br A03 = 1Bq.A00(66481);
    public final HashMap A0A = new HashMap();
    public final 1Br A08 = 1Bq.A00(16782);
    public final 1Br A07 = 1Bq.A00(66437);
    public final 1Br A04 = 1Bq.A00(16687);
    public final 1Br A09 = 1Bu.A00(115013);
    public final 1uZ A0C = (1uZ) 1Bi.A03(66270);

    private final C6ic A00(ThreadKey threadKey) {
        C6ic c6ic = null;
        if (threadKey.A0z()) {
            c6ic = C6ic.A04;
        } else if (threadKey.A1L()) {
            if (this.A0C.A07(threadKey)) {
                return C6ic.A0E;
            }
        } else if (threadKey.A1A()) {
            if (60K.A00()) {
                return C6ic.A0D;
            }
        } else if (threadKey.A0y()) {
            return C6ic.A02;
        }
        return c6ic;
    }

    public static final C6ic A01(ThreadViewParams threadViewParams) {
        ThreadKey threadKey = threadViewParams.A05;
        11T.A09(threadKey);
        boolean z = false;
        if (threadViewParams.A0B != null) {
            z = true;
        }
        boolean A12 = threadKey.A12();
        boolean A1A = threadKey.A1A();
        boolean A0y = threadKey.A0y();
        C6ic c6ic = null;
        if (z) {
            c6ic = C6ic.A0B;
        } else {
            if (A12) {
                return C6ic.A04;
            }
            if (A1A) {
                if (60K.A00()) {
                    return C6ic.A0D;
                }
            } else if (A0y) {
                return C6ic.A02;
            }
        }
        return c6ic;
    }

    public static final ThreadPRETltvLogger A02(int i) {
        AbstractC07814kx abstractC07814kx;
        6iZ r0 = new 6iZ();
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance == null) {
            throw AnonymousClass001.A0N("QPL has not been initialized.");
        }
        C6ib c6ib = C6ib.A00;
        C07844l0 c07844l0 = C07804kv.A01;
        synchronized (c07844l0) {
            ConcurrentHashMap concurrentHashMap = c07844l0.A00;
            Integer valueOf = Integer.valueOf(i);
            Object obj = concurrentHashMap.get(valueOf);
            if (obj == null) {
                obj = (AbstractC07814kx) c07844l0.A01.invoke(qPLInstance, valueOf, r0, c6ib);
                concurrentHashMap.put(valueOf, obj);
            }
            abstractC07814kx = (AbstractC07814kx) obj;
        }
        return (ThreadPRETltvLogger) abstractC07814kx;
    }

    public static final ThreadPRETltvLogger A03(int i) {
        return (ThreadPRETltvLogger) ((AbstractC07814kx) C07804kv.A01.A00.get(Integer.valueOf(i)));
    }

    private final 4lM A04() {
        return (4lM) this.A0B.A00.get();
    }

    private final void A05(PRELoggingEvent pRELoggingEvent) {
        int i = pRELoggingEvent.A02;
        ThreadPRETltvLogger A03 = A03(i);
        if (A03 != null) {
            A03.logEvent(pRELoggingEvent);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(' ');
        sb.append(pRELoggingEvent.getClass().getSimpleName());
        sb.append(", timestamp = ");
        sb.append(pRELoggingEvent.A00);
        0fH.A0j("MessengerTltvEventHandler", sb.toString());
    }

    private final void A06(ThreadPRETltvLogger threadPRETltvLogger, Boolean bool, String str, String str2, String str3, String str4, int i) {
        ((MessagingPerformanceLogger) this.A05.A00.get()).A0P(threadPRETltvLogger.getQplIdentifier(), i);
        threadPRETltvLogger.addMarkerAnnotate("navigation_source", str);
        threadPRETltvLogger.addMarkerAnnotate("thread_type", str2);
        threadPRETltvLogger.addMarkerAnnotate("flow_type", str3);
        if (str4 != null) {
            threadPRETltvLogger.addMarkerAnnotate("ch_class_preloading_state", str4);
        }
        if (11T.A0O(bool, true)) {
            threadPRETltvLogger.addMarkerAnnotate("THREAD_VIEW_IMPL", "STAX");
        }
    }

    public static final void A07(short s) {
        Collection values = C07804kv.A01.A00.values();
        11T.A0A(values);
        Iterator it = 0QD.A0V(values).iterator();
        while (it.hasNext()) {
            ((AbstractC07814kx) it.next()).loggingEndedWithAction(s, -1);
        }
    }

    private final boolean A08(ThreadPRETltvLogger threadPRETltvLogger) {
        if (threadPRETltvLogger.threadLoggerType == C6ic.A0D && 1WY.A01((1WY) this.A03.A00.get()).AZk(36322327969088915L)) {
            return true;
        }
        return threadPRETltvLogger.threadLoggerType == C6ic.A0B && 1Wi.A00((1Wi) this.A02.A00.get()).AZk(36320279273684210L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        if (r0.A00 != X.0S2.A0C) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A09(com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0.getIsMessageListContentFresh()
            r303 = r0
            r0 = r301
            java.util.HashMap r0 = r0.A0A
            r304 = r0
            java.lang.String r0 = "selective_sync_remediation"
            r305 = r0
            r0 = r304
            r1 = r305
            java.lang.Object r0 = r0.get(r1)
            X.6ik r0 = (X.C6ik) r0
            r306 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.A08(r1)
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L74
            r0 = r306
            if (r0 == 0) goto L74
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1WY r0 = (X.1WY) r0
            r305 = r0
            r0 = r305
            X.1CO r0 = X.1WY.A01(r0)
            r309 = r0
            r0 = 36322327969154452(0x810af700044594, double:3.033724693743946E-306)
            r310 = r0
            r0 = r309
            r1 = r310
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L74
            r0 = r303
            if (r0 == 0) goto L72
            r0 = r306
            java.lang.Integer r0 = r0.A00
            r304 = r0
            java.lang.Integer r0 = X.0S2.A0C
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L74
        L72:
            r0 = 0
            r303 = r0
        L74:
            r0 = r302
            java.lang.String r1 = "cutover_message_copy"
            X.6ik r0 = r0.getPerfComponent(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L96
            r0 = r303
            if (r0 == 0) goto Lbb
            r0 = r301
            r1 = r305
            boolean r0 = r0.A0A(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lbb
        L93:
            r0 = r308
            r303 = r0
        L96:
            r0 = r302
            X.6ic r0 = r0.threadLoggerType
            r304 = r0
            X.6ic r0 = X.C6ic.A04
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto Lb9
            r0 = r302
            boolean r0 = r0.getIsMessageListContentFresh()
            r312 = r0
            java.lang.String r0 = "is_act_content_fresh"
            r305 = r0
            r0 = r302
            r1 = r305
            r2 = r312
            r0.addMarkerAnnotate(r1, r2)
        Lb9:
            r0 = r303
            return r0
        Lbb:
            r0 = 0
            r308 = r0
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07794ku.A09(com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger):boolean");
    }

    private final boolean A0A(C6ik c6ik) {
        if (c6ik.A00 == 0S2.A0C) {
            return true;
        }
        java.util.Map map = (java.util.Map) A04().A0B.get();
        int i = A04().A08.get();
        if (map == null || i == 0) {
            return false;
        }
        return (i == 2 && map.containsKey("ThreadHeaderMessage") && map.containsKey("AdminMessage")) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0a5b, code lost:
    
        if (r0.A00 != X.0S2.A0C) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0b3f, code lost:
    
        if (r313 == null) goto L194;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0025. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x1063  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1874  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x1d25  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:637:0x1ff3  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x2014  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x20b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x1cc3  */
    /* JADX WARN: Type inference failed for: r314v29 */
    /* JADX WARN: Type inference failed for: r314v34 */
    /* JADX WARN: Type inference failed for: r314v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BQC(X.1Q5 r302, X.1Vp r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 8533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07794ku.BQC(X.1Q5, X.1Vp, java.lang.String):void");
    }
}
