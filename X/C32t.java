package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import com.facebook.flexiblesampling.SamplingResult;
import java.util.HashMap;

/* renamed from: X.32t, reason: invalid class name */
/* loaded from: 32t.class */
public final class C32t extends Handler {
    public long A00;
    public final int A01;
    public final int A02;
    public final 3IX A03;
    public final int A04;
    public final 3G3 A05;
    public final C07a A06;

    public C32t(Looper looper, 3IX r303, 3G3 r304) {
        super(looper);
        this.A03 = r303;
        this.A05 = r304;
        this.A04 = 1;
        this.A02 = 2;
        this.A01 = 3;
        this.A06 = new C07a();
        sendEmptyMessageDelayed(1, 500L);
    }

    private final void A00() {
        while (true) {
            C07a c07a = this.A06;
            if (c07a.isEmpty()) {
                return;
            }
            C1ke c1ke = (C1ke) c07a.removeFirst();
            07S r0 = c1ke.A03;
            HashMap A00 = 3G4.A00(r0);
            long j = c1ke.A01;
            SamplingResult samplingResult = c1ke.A04;
            boolean z = samplingResult.A05;
            long j2 = this.A00;
            String str = c1ke.A05;
            if (z) {
                long j3 = c1ke.A02;
                long j4 = this.A03.A00.A01(c1ke.A00).A01;
                Object obj = A00.get("extra");
                11T.A0I(obj, "null cannot be cast to non-null type kotlin.String");
                FFSingletonJNILogger.log(j2, str, j, false, 1L, false, j3, j4, (String) obj, c1ke.A06);
            } else {
                long j5 = c1ke.A02;
                long j6 = this.A03.A00.A01(c1ke.A00).A01;
                Object obj2 = A00.get("extra");
                11T.A0I(obj2, "null cannot be cast to non-null type kotlin.String");
                FFSingletonJNILogger.logWithCollectionControlDecision(j2, str, j, false, j5, j6, (String) obj2, new FFSingletonJNILogger.CollectionControlDecision(samplingResult.A00, samplingResult.A04, j, false, FFSingletonJNILogger.CollectionControlDecisionStatus.SUCCESS.mVal), c1ke.A06);
            }
            r0.A02();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        11T.A0F(message, 0);
        int i = message.what;
        if (i == this.A01) {
            Object obj = message.obj;
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.analytics2.fabric.handler.EventDataWithLatency");
            this.A06.add(obj);
            return;
        }
        int i2 = this.A04;
        if (i == i2) {
            A00();
            sendEmptyMessageDelayed(i2, 500L);
        } else if (i == this.A02) {
            A00();
            Object obj2 = message.obj;
            11T.A0I(obj2, DKB.A00(5));
            this.A00 = AnonymousClass001.A05(obj2);
        }
    }
}
