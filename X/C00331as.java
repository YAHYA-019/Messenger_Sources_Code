package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1as, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1as.class */
public final class C00331as {
    public final C02q A00;
    public final ThreadLocal A01 = new ThreadLocal();
    public final C15h A02;
    public final AwakeTimeSinceBootClock A03;
    public final C0dp A04;
    public final 1Jx A05;
    public final Random A06;
    public final C15h A07;
    public final C15h A08;

    public C00331as(AwakeTimeSinceBootClock awakeTimeSinceBootClock, C0dp c0dp, C02q c02q, 1Jx r305, Random random, C15h c15h, C15h c15h2, C15h c15h3) {
        this.A00 = c02q;
        this.A07 = c15h;
        this.A05 = r305;
        this.A04 = c0dp;
        this.A08 = c15h3;
        this.A03 = awakeTimeSinceBootClock;
        this.A06 = random;
        this.A02 = c15h2;
    }

    public static 1Qb A00(0El r301, C00331as c00331as, String str, long j) {
        1Qb A01 = A01(c00331as, TimeUnit.NANOSECONDS, 27787270, j, r301.A0G);
        A01.A8P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A01.A04("real_marker_id", r301.A00);
        A01.A8O("nanoseconds_value", j);
        A01.A05("event_was_sampled", r301.A0N);
        A01.A8O("thread_contention", r301.A0K.get());
        A01.A05("main_thread", r301.A0L);
        ArrayList arrayList = r301.A0P;
        A01.A05("listener_was_used", !arrayList.isEmpty());
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList2 = r301.A0O;
            if (i2 >= arrayList2.size()) {
                A04(r301, A01, "quick_listeners_triggered", r301.A0D);
                A04(r301, A01, "restart_passed", r301.A0E);
                A04(r301, A01, "sample_rate_calculated", r301.A0F);
                A04(r301, A01, "quick_event_ready", r301.A0C);
                A04(r301, A01, "metadata_collected", r301.A09);
                A04(r301, A01, "listeners_triggered", r301.A05);
                A04(r301, A01, "event_found", r301.A03);
                A04(r301, A01, "annotation_added", r301.A01);
                A04(r301, A01, "point_added", r301.A0A);
                A04(r301, A01, "loss_track", r301.A0J);
                A04(r301, A01, "lock_acquired", r301.A06);
                A04(r301, A01, "lock_released", r301.A07);
                A04(r301, A01, "trace_map_updated", r301.A0I);
                A04(r301, A01, "event_was_not_found", r301.A04);
                A04(r301, A01, "quick_event_not_ready", r301.A0B);
                return A01;
            }
            A01.A8O(0Pz.A0W("listener_", (String) arrayList2.get(i2)), ((Number) arrayList.get(i2)).longValue());
            i = i2 + 1;
        }
    }

    public static 1Qb A01(C00331as c00331as, TimeUnit timeUnit, int i, long j, long j2) {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = c00331as.A03;
        1Qb r0 = new 1Qb(awakeTimeSinceBootClock);
        r0.A06 = timeUnit.toNanos(j);
        r0.A0N = (short) 2;
        r0.A0B = c00331as.A04.now();
        r0.A09 = awakeTimeSinceBootClock.nowNanos();
        r0.A0A = j2;
        r0.A05 = c00331as.A06.nextInt();
        r0.A03 = i;
        r0.A0R = false;
        r0.A0Q = false;
        r0.A0H = (1hG) c00331as.A07.get();
        return r0;
    }

    public static 1Qb A02(C00331as c00331as, TimeUnit timeUnit, int i, long j, boolean z) {
        long B8e = z ? C03g.A00 : c00331as.A05.B8e(i);
        int i2 = (int) B8e;
        boolean z2 = false;
        if (i2 == -1) {
            z2 = true;
        }
        if (z2 || c00331as.A05.Cam(i2) == ((-1) >>> 1)) {
            return null;
        }
        return A01(c00331as, timeUnit, i, j, B8e);
    }

    public static void A03(0El r301, C00331as c00331as, 1Qb r303) {
        C15h c15h = c00331as.A08;
        ArrayList arrayList = r301.A0R;
        int i = 0;
        boolean z = false;
        if (arrayList.size() > 0) {
            z = true;
        }
        r303.A05("metadata_was_used", z);
        while (true) {
            ArrayList arrayList2 = r301.A0Q;
            if (i >= arrayList2.size()) {
                return;
            }
            r303.A8O(0Pz.A0W("metadata_", ((C00371aw) c15h.get()).A00(AnonymousClass001.A03(arrayList2.get(i))).B5Q()), AnonymousClass001.A05(arrayList.get(i)));
            i++;
        }
    }

    public static void A04(0El r301, 1Qb r302, String str, long j) {
        if (j > 0) {
            r302.A02((AnonymousClass045) null, (AnonymousClass042) null, str, TimeUnit.NANOSECONDS, 7, j - r301.A0H);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.booleanValue() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(X.C00331as r301) {
        /*
            r0 = r301
            java.lang.ThreadLocal r0 = r0.A01
            r301 = r0
            r0 = r301
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1c
            r0 = r302
            boolean r0 = r0.booleanValue()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L28
        L1c:
            r0 = 1
            r304 = r0
            r0 = r304
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.set(r1)
        L28:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00331as.A05(X.1as):boolean");
    }

    public void A06(TimeUnit timeUnit, int[] iArr, int[] iArr2, String[] strArr, int i, long j) {
        Runnable A02 = A02(this, timeUnit, i, j, false);
        if (A02 == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            boolean z = true;
            if (i3 >= strArr.length) {
                this.A00.execute(A02);
                return;
            }
            int i4 = iArr2[i3];
            if (i4 == 2) {
                A02.A04(strArr[i3], iArr[i3]);
            } else {
                if (i4 != 8) {
                    throw AnonymousClass001.A0q(0Pz.A0d("Annotation type ", " is not supported yet. Add support on your own.", i4));
                }
                String str = strArr[i3];
                if (iArr[i3] == 0) {
                    z = false;
                }
                A02.A05(str, z);
            }
            i2 = i3 + 1;
        }
    }

    public void A07(TimeUnit timeUnit, int[] iArr, String[] strArr) {
        Runnable A02 = A02(this, timeUnit, 27801349, 0L, false);
        if (A02 == null) {
            return;
        }
        for (int i = 0; i < 8; i += 2) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            int i2 = iArr[i / 2];
            if (i2 == 1) {
                A02.A8P(str, str2);
            } else {
                if (i2 != 2) {
                    throw AnonymousClass001.A0q(0Pz.A0d("Annotation type ", " is not supported yet. Add support on your own.", i2));
                }
                A02.A04(str, Integer.parseInt(str2));
            }
        }
        this.A00.execute(A02);
    }
}
