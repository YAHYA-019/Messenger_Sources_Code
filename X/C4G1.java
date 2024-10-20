package X;

import android.os.Handler;
import java.util.concurrent.CancellationException;

/* renamed from: X.4G1, reason: invalid class name */
/* loaded from: 4G1.class */
public final class C4G1 extends C4G2 implements 2Zt {
    public final Handler A00;
    public final C4G1 A01;
    public final String A02;
    public final boolean A03;

    public C4G1(Handler handler, String str, boolean z) {
        this.A00 = handler;
        this.A02 = str;
        this.A03 = z;
        this.A01 = z ? this : new C4G1(handler, str, true);
    }

    private final void A00(0DE r302, Runnable runnable) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("The task was rejected, the handler underlying the dispatcher '");
        A0k.append(this);
        C5x7.A00(new CancellationException(AnonymousClass001.A0d("' was closed", A0k)), r302);
        2aN.A01.dispatch(r302, runnable);
    }

    public C2a8 BQJ(final Runnable runnable, 0DE r303, long j) {
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new C2a8() { // from class: X.4Xp
                @Override // X.C2a8
                public final void dispose() {
                    C4G1 c4g1 = this;
                    c4g1.A00.removeCallbacks(runnable);
                }
            };
        }
        A00(r303, runnable);
        return C2a7.A00;
    }

    public void Cjn(final C2s8 c2s8, long j) {
        Runnable runnable = new Runnable() { // from class: X.4X9
            public static final String __redex_internal_original_name = "HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1";

            @Override // java.lang.Runnable
            public final void run() {
                C2s8.this.CiQ(04S.A00, this);
            }
        };
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            c2s8.BQE(new C4O2(runnable, this, 2));
        } else {
            A00(c2s8.getContext(), runnable);
        }
    }

    public void dispatch(0DE r302, Runnable runnable) {
        if (this.A00.post(runnable)) {
            return;
        }
        A00(r302, runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r0.A03 != r301.A03) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.C4G1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L34
            r0 = r302
            X.4G1 r0 = (X.C4G1) r0
            r302 = r0
            r0 = r302
            android.os.Handler r0 = r0.A00
            r304 = r0
            r0 = r301
            android.os.Handler r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L34
            r0 = r302
            boolean r0 = r0.A03
            r306 = r0
            r0 = r301
            boolean r0 = r0.A03
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L39
        L34:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L39:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G1.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return System.identityHashCode(this.A00) ^ AnonymousClass002.A00(this.A03 ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (X.11T.A0O(android.os.Looper.myLooper(), r301.A00.getLooper()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isDispatchNeeded(X.0DE r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            android.os.Looper r0 = android.os.Looper.myLooper()
            r304 = r0
            r0 = r301
            android.os.Handler r0 = r0.A00
            android.os.Looper r0 = r0.getLooper()
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L2a
        L28:
            r0 = 1
            r303 = r0
        L2a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G1.isDispatchNeeded(X.0DE):boolean");
    }

    public String toString() {
        String str;
        2Zs r302;
        2Zs r0 = 2aN.A01;
        C4G3 c4g3 = 4ZJ.A00;
        if (this == c4g3) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                r302 = c4g3.A01();
            } catch (UnsupportedOperationException unused) {
                r302 = null;
            }
            if (this == r302) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str == null) {
            str = this.A02;
            if (str == null) {
                str = this.A00.toString();
            }
            if (this.A03) {
                str = 0Pz.A0W(str, ".immediate");
            }
        }
        return str;
    }
}
