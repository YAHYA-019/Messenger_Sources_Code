package X;

import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.2w2, reason: invalid class name */
/* loaded from: 2w2.class */
public final class C2w2 {
    public C3Og A00;
    public C3Og A01;
    public C3Og A02;
    public final C00i A06 = new 1BQ(16634);
    public final C00i A09 = new 1BQ(84630);
    public final C00i A07 = new 1BQ(16385);
    public final C00i A0G = new 1BQ(66097);
    public final Set A0E = 1Bi.A06(206);
    public final C00i A0A = new 1BV(16459);
    public final C00i A0F = new 1BQ(66337);
    public final C00i A05 = new 1BQ(66335);
    public final C2w3 A03 = new Handler() { // from class: X.2w3
        {
            Looper.getMainLooper();
        }
    };
    public final C2w3 A04 = new Handler() { // from class: X.2w3
        {
            Looper.getMainLooper();
        }
    };
    public final C00i A08 = new 1BQ(66333);
    public final Runnable A0B = new Runnable() { // from class: X.2w4
        public static final String __redex_internal_original_name = "AutomatedLoggingStateLogger$1";

        @Override // java.lang.Runnable
        public void run() {
            C2w2.this.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        }
    };
    public final Runnable A0C = new Runnable() { // from class: X.2w5
        public static final String __redex_internal_original_name = "AutomatedLoggingStateLogger$2";

        @Override // java.lang.Runnable
        public void run() {
            C2w2.this.A01 = null;
        }
    };
    public final Runnable A0D = new Runnable() { // from class: X.2w6
        public static final String __redex_internal_original_name = "AutomatedLoggingStateLogger$3";

        @Override // java.lang.Runnable
        public void run() {
            C2w2 c2w2 = C2w2.this;
            C3Og c3Og = c2w2.A02;
            if (c3Og == null || c2w2.A00 != null) {
                return;
            }
            c3Og.A04(C2w2.A00());
            C2w2.A05(c2w2, c2w2.A02);
            c2w2.A02 = null;
        }
    };

    public static String A00() {
        UUID A00 = C04I.A00();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(A00.getMostSignificantBits());
        wrap.putLong(A00.getLeastSignificantBits());
        return 0Pz.A0W("MMtrcs", 1PN.A03.A03(wrap.array()).replaceAll(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, ""));
    }

    private void A01() {
        C3Og c3Og;
        String A00;
        C3Og c3Og2;
        C3Og c3Og3;
        if (this.A02 != null) {
            C3Og c3Og4 = this.A00;
            if (c3Og4 == null || c3Og4.A02() == null || (c3Og2 = this.A02) == null || c3Og2.A02() == null || !this.A00.A02().equals(this.A02.A02()) || (c3Og3 = this.A00) == null || c3Og3.A03("event_trace_id") == null) {
                c3Og = this.A02;
                A00 = A00();
            } else {
                c3Og = this.A02;
                A00 = this.A00.A03("event_trace_id");
            }
            c3Og.A04(A00);
            A05(this, this.A02);
        }
    }

    private void A02() {
        boolean z;
        1Zk r0 = (1Zk) this.A05.get();
        C1Zf c1Zf = (C1Zf) this.A0F.get();
        if (c1Zf.A03) {
            z = c1Zf.A02;
        } else {
            z = 2yD.A04(c1Zf.A0A, 36319665089231087L);
            c1Zf.A02 = z;
            c1Zf.A03 = true;
        }
        if (z) {
            r0.A01(r0.A00(0S2.A00));
        }
    }

    public static void A03(C2w2 c2w2) {
        C3Og c3Og = c2w2.A00;
        if (c3Og != null) {
            A05(c2w2, c3Og);
            ((1vU) c2w2.A0A.get()).A01(new C3g5(c2w2, c2w2.A00));
            c2w2.A02();
        }
        c2w2.A01();
    }

    public static void A04(C2w2 c2w2) {
        if (((C1iu) c2w2.A08.get()).A01) {
            c2w2.A04.removeCallbacks(c2w2.A0C);
        }
    }

    public static void A05(C2w2 c2w2, C3Og c3Og) {
        A06(c3Og, (04J) c2w2.A06.get(), ((2A1) c2w2.A09.get()).A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d6, code lost:
    
        if (r0.booleanValue() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A06(X.C3Og r301, X.04J r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2w2.A06(X.3Og, X.04J, boolean):void");
    }

    public static boolean A07(C2w2 c2w2) {
        C3Og c3Og = c2w2.A00;
        if (c3Og != null && !A09(c3Og.A00("tracking"))) {
            return true;
        }
        C3Og c3Og2 = c2w2.A00;
        c2w2.A0B(c3Og2 == null ? "miss_tap_event" : A09(c3Og2.A00("tracking")) ? "mm_event_invalid" : "mm_event_set_but_incomplete");
        return false;
    }

    public static boolean A08(C2w2 c2w2) {
        C3Og c3Og = c2w2.A01;
        if (c3Og != null && !A09(c3Og.A00("tracking"))) {
            return true;
        }
        c2w2.A01 = null;
        return false;
    }

    public static boolean A09(24X r301) {
        if (r301 != null) {
            return r301.A0F() == 2wD.A09 ? r301.A0W() : r301.A05() == 0;
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v8 ??, still in use, count: 2, list:
          (r306v8 ??) from 0x01d9: PHI (r306v6 ??) = (r306v5 ??), (r306v8 ??) binds: [B:119:0x01c7, B:123:0x01d6] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ?? I:X.3Qm) from 0x01d6: SPUT (r306v8 ?? I:X.3Qm) A[Catch: all -> 0x02a9] X.3Qm.A01 X.3Qm
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public void A0A() {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2w2.A0A():void");
    }

    public void A0B(String str) {
        if (this.A00 != null) {
            this.A00.A04(A00());
        }
        C3Og c3Og = this.A00;
        if (c3Og != null) {
            A05(this, c3Og);
            ((1vU) this.A0A.get()).A01(new C3g5(this, this.A00));
            A02();
        }
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT)) {
            A01();
            this.A02 = null;
        }
        this.A00 = null;
    }

    public void A0C(String str) {
        C3Og c3Og;
        synchronized (this) {
            if (str != null) {
                C3Og c3Og2 = this.A02;
                if (c3Og2 == null || !c3Og2.A05()) {
                    C3Og c3Og3 = this.A00;
                    if (c3Og3 != null && c3Og3.A05()) {
                        c3Og = this.A00;
                    }
                } else {
                    c3Og = this.A02;
                }
                if (c3Og != null) {
                    c3Og.A00.put("ads_navigation_url", new C33c("ads_navigation_url", str));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r0.booleanValue() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0D() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.3Og r0 = r0.A00     // Catch: java.lang.Throwable -> L2f
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L25
            java.lang.String r0 = "is_open_application"
            r303 = r0
            r0 = r302
            r1 = r303
            java.lang.Boolean r0 = r0.A01(r1)     // Catch: java.lang.Throwable -> L2f
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L25
            r0 = r303
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L2a
        L25:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L2a:
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            return r0
        L2f:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2w2.A0D():boolean");
    }
}
