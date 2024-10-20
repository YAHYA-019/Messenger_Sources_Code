package com.facebook.common.fury.reliability.sapienz;

import X.0WL;
import X.0cQ;
import X.0fH;
import X.0wD;
import X.1Mq;
import X.C0jw;
import X.C3NZ;
import X.L5y;
import X.LVL;
import android.content.Context;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.fury.context.EventQueueReqContextLifecycle$TimeProvider;
import com.facebook.fury.context.ReqContext;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: SapienzStacktraceFlowCollector.class */
public final class SapienzStacktraceFlowCollector implements 1Mq {
    public static C3NZ A05;
    public static final int A06;
    public static final Map A07;
    public static final boolean A08;
    public static final boolean A09;
    public static final int A0A;
    public final Context A02;
    public final 0wD A03;
    public final String A04;
    public ExecutorService A00 = Executors.newSingleThreadExecutor();
    public ExecutorService A01 = Executors.newSingleThreadExecutor();
    public final AtomicBoolean isStackTraceReportCreationStarted = new AtomicBoolean(false);

    static {
        boolean equals = 0WL.A02("fb.fury_experimental").equals("true");
        A08 = equals;
        A09 = 0WL.A02("fb.fury_rft").equals("true");
        int i = 4000;
        int i2 = 60;
        if (equals) {
            if (!0WL.A02("fb.fury_max_req_context_size").equals("")) {
                try {
                    i = Integer.parseInt(0WL.A02("fb.fury_max_req_context_size"));
                } catch (NumberFormatException e) {
                    0fH.A0p("com.facebook.common.fury.reliability.sapienz.SapienzStacktraceFlowCollector", "fb.fury_max_req_context_size prop is not an int, setting default value!", e);
                }
            }
            if (!0WL.A02("fb.fury_stacktraces_timeout").equals("")) {
                i2 = Integer.parseInt(0WL.A02("fb.fury_stacktraces_timeout"));
            }
        }
        A0A = i;
        A06 = i2;
        A07 = new ConcurrentHashMap();
    }

    public SapienzStacktraceFlowCollector(Context context) {
        this.A02 = context;
        A05 = new C3NZ(context);
        this.A03 = new 0wD(new EventQueueReqContextLifecycle$TimeProvider() { // from class: X.4Vi
            @Override // com.facebook.fury.context.EventQueueReqContextLifecycle$TimeProvider
            public long currentTime() {
                return System.currentTimeMillis();
            }
        }, C0jw.FINE);
        this.A04 = 0WL.A02(ErrorReportingConstants.REPORT_FURY_TRACES_FILE_PROP);
        0cQ.A03(new LVL(this), 100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Type inference failed for: r306v0 */
    /* JADX WARN: Type inference failed for: r306v1 */
    /* JADX WARN: Type inference failed for: r306v3, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00() {
        /*
            r301 = this;
            r0 = r301
            X.0wD r0 = r0.A03
            r302 = r0
            int r0 = com.facebook.common.fury.reliability.sapienz.SapienzStacktraceFlowCollector.A0A
            r303 = r0
            r0 = r303
            if (r0 < 0) goto L3e
            r0 = r302
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A00
            r304 = r0
            r0 = r304
            int r0 = r0.size()
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 >= r1) goto L3e
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r306 = r0
        L23:
            r0 = r304
            int r0 = r0.size()
            r305 = r0
            r0 = r305
            r1 = r303
            if (r0 <= r1) goto L43
            r0 = r304
            java.lang.Object r0 = r0.poll()
            r302 = r0
            r0 = r306
            r1 = r302
            boolean r0 = r0.add(r1)
            goto L23
        L3e:
            java.util.List r0 = java.util.Collections.emptyList()
            r306 = r0
        L43:
            r0 = r306
            java.util.Iterator r0 = r0.iterator()
            r307 = r0
        L4c:
            r0 = r307
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L8b
            r0 = r307
            java.lang.Object r0 = r0.next()
            X.0jk r0 = (X.C0jk) r0
            r304 = r0
            r0 = r304
            int r0 = r0.A01
            r308 = r0
            r0 = 4
            r305 = r0
            r0 = r308
            r1 = r305
            if (r0 != r1) goto L4c
            java.util.Map r0 = com.facebook.common.fury.reliability.sapienz.SapienzStacktraceFlowCollector.A07
            r306 = r0
            r0 = r304
            com.facebook.fury.context.ReqContext r0 = r0.A04
            r302 = r0
            r0 = r306
            r1 = r302
            java.lang.Object r0 = r0.remove(r1)
            goto L4c
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.fury.reliability.sapienz.SapienzStacktraceFlowCollector.A00():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.lang.Runnable, X.LjD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01(boolean r302) {
        /*
            r301 = this;
            r0 = r301
            X.0wD r0 = r0.A03
            r303 = r0
            r0 = 500(0x1f4, float:7.0E-43)
            r304 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = X.0wD.A03
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            r0 = r303
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A00
            r303 = r0
            r0 = r303
            int r0 = r0.size()
            r307 = r0
            r0 = r307
            r1 = r304
            if (r0 < r1) goto L98
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r308 = r0
        L35:
            r0 = r303
            java.lang.Object r0 = r0.poll()
            r309 = r0
            r0 = r308
            r1 = r309
            boolean r0 = r0.add(r1)
            r0 = r304
            r1 = -1
            int r0 = r0 + r1
            r304 = r0
            r0 = r304
            if (r0 > 0) goto L35
            r0 = r305
            r1 = 0
            r0.set(r1)
        L51:
            r0 = r308
            boolean r0 = r0.isEmpty()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L97
            r0 = r301
            android.content.Context r0 = r0.A02
            r306 = r0
            java.util.Map r0 = com.facebook.common.fury.reliability.sapienz.SapienzStacktraceFlowCollector.A07
            r309 = r0
            X.LjD r0 = new X.LjD
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r303
            r1 = r308
            r0.A01 = r1
            r0 = r303
            r1 = r306
            r0.A00 = r1
            r0 = r303
            r1 = r309
            r0.A02 = r1
            r0 = r303
            r1 = r302
            r0.A03 = r1
            r0 = r301
            java.util.concurrent.ExecutorService r0 = r0.A00
            r309 = r0
            r0 = r309
            r1 = r303
            r0.execute(r1)
        L97:
            return
        L98:
            r0 = r305
            r1 = 0
            r0.set(r1)
        L9e:
            java.util.List r0 = java.util.Collections.emptyList()
            r308 = r0
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.fury.reliability.sapienz.SapienzStacktraceFlowCollector.A01(boolean):void");
    }

    public C0jw BGo() {
        return C0jw.FINE;
    }

    public boolean BRm() {
        return false;
    }

    public void onActivate(ReqContext reqContext) {
        ArrayList A00 = L5y.A00(Thread.currentThread().getStackTrace());
        A07.put(reqContext, A00.toArray(new StackTraceElement[A00.size()]));
        if (A08) {
            A01(A09);
        } else {
            A00();
        }
        this.A03.onActivate(reqContext);
    }

    public void onDeactivate(ReqContext reqContext) {
        if (A08) {
            A01(A09);
        } else {
            A00();
        }
        this.A03.onDeactivate(reqContext);
    }

    public void onReqContextFailure(ReqContext reqContext, Throwable th) {
        this.A03.onReqContextFailure(reqContext, th);
    }
}
