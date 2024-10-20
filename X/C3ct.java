package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3ct, reason: invalid class name */
/* loaded from: 3ct.class */
public final class C3ct implements 1Vf {
    public final 1Br A01;
    public final 1Br A02 = 1BK.A0C();
    public final 1Br A03 = 1Bq.A00(66502);
    public final 1Br A00 = 1Bq.A00(16464);
    public final AtomicReference A04 = new AtomicReference(1Hb.A02);
    public final AtomicReference A05 = new AtomicReference();
    public final C22K A06 = new C22K();
    public final C22K A07 = new C22K();

    public C3ct(Context context, FbUserSession fbUserSession) {
        this.A01 = 1Lm.A00(context, fbUserSession, 33183);
    }

    public static final void A00(C22K c22k, C3ct c3ct, 1Hb r303) {
        Object obj;
        if (c22k.A01(1Br.A07(c3ct.A02).Auy(36604107889514984L) * 60000)) {
            String A02 = 11T.A02(C04I.A00());
            22I r0 = (22I) 1Br.A0B(c3ct.A01);
            int ordinal = r303.ordinal();
            if (ordinal == 0) {
                obj = "PRELOAD_BUMP_TO_INBOX_COMMUNITY_CHANNELS";
            } else {
                if (ordinal != 12) {
                    throw AnonymousClass001.A0N("We should not have reached this state");
                }
                obj = "PRELOAD_JOINED_COMMUNITY_CHANNELS";
            }
            List A03 = 11T.A03(obj);
            03W r02 = 03W.A00;
            11T.A0I(r02, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            5QE A04 = r0.A04(A02, A03, r02, Long.MIN_VALUE);
            A04.A00(new RsT(c22k));
            A04.A01.addResultCallback(new RsU(c22k));
        }
    }

    private final void A01(1Hb r302, boolean z) {
        C22K c22k;
        int i;
        C00j.A05("SelectiveSyncPreloadHandler.runPreloadRequest", -2141855779);
        try {
            int ordinal = r302.ordinal();
            if (ordinal == 0) {
                c22k = this.A06;
            } else {
                if (ordinal != 12) {
                    i = -221925081;
                    C00j.A01(i);
                }
                c22k = this.A07;
            }
            if (z) {
                AtomicReference atomicReference = this.A05;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Br.A0B(this.A00);
                long j = ((2bE) 1Br.A0B(this.A03)).A03;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                85O r0 = new 85O(40, r302, c22k, this);
                11T.A0F(scheduledExecutorService, 0);
                ScheduledFuture schedule = scheduledExecutorService.schedule(new C3ix(r0, 0), j, timeUnit);
                11T.A0A(schedule);
                atomicReference.set(schedule);
            } else {
                A00(c22k, this, r302);
            }
            i = -338898308;
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(-1961635180);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BQC(X.1Q5 r302, X.1Vp r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3ct.BQC(X.1Q5, X.1Vp, java.lang.String):void");
    }
}
