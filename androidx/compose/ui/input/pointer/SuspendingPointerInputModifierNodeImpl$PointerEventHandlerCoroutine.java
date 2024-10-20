package androidx.compose.ui.input.pointer;

import X.0DE;
import X.0DL;
import X.0DR;
import X.7zV;
import X.C2904Jcq;
import X.C2s7;
import X.C2s8;
import X.KMa;
import X.KvQ;
import X.L5l;
import X.LtK;
import X.MNe;
import X.MNh;

/* loaded from: SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.class */
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine implements 0DR, MNh, MNe {
    public C2s8 A01;
    public final 0DR A02;
    public final /* synthetic */ C2904Jcq A04;
    public final /* synthetic */ C2904Jcq A05;
    public KMa A00 = KMa.A03;
    public final 0DE A03 = 0DL.A00;

    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(C2904Jcq c2904Jcq, 0DR r303) {
        this.A04 = c2904Jcq;
        this.A02 = r303;
        this.A05 = c2904Jcq;
    }

    @Override // X.MNe
    public Object AB9(KMa kMa, 0DR r303) {
        C2s7 A0d = 7zV.A0d(r303);
        this.A00 = kMa;
        this.A01 = A0d;
        return A0d.A0C();
    }

    @Override // X.MNh
    public float AhL() {
        return this.A05.AhL();
    }

    @Override // X.MI2
    public float Amu() {
        return this.A05.Amu();
    }

    @Override // X.MNh
    public int Cik(float f) {
        return L5l.A01(this.A05, f);
    }

    @Override // X.MI2
    public float D4L(long j) {
        return KvQ.A00(this.A05, j);
    }

    @Override // X.MNh
    public float D4M(float f) {
        return f / this.A05.AhL();
    }

    @Override // X.MNh
    public float D4S(long j) {
        return L5l.A00(this.A05, j);
    }

    @Override // X.MNh
    public float D4T(float f) {
        return f * this.A05.AhL();
    }

    @Override // X.MNh
    public long D4W(long j) {
        return L5l.A02(this.A05, j);
    }

    @Override // X.MNh
    public long D4X(float f) {
        return this.A05.D4X(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    @Override // X.MNe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object DAk(X.0DR r302, kotlin.jvm.functions.Function2 r303, long r304) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.DAk(X.0DR, kotlin.jvm.functions.Function2, long):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(2:9|(2:14|15)(2:11|12))(8:16|17|18|19|20|(2:22|23)|24|25)))|27|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r311 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    @Override // X.MNe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object DAl(X.0DR r302, kotlin.jvm.functions.Function2 r303, long r304) {
        /*
            r301 = this;
            r0 = 4
            r306 = r0
            r0 = r306
            r1 = r302
            boolean r0 = X.AId.A03(r0, r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L64
            r0 = r302
            r308 = r0
            r0 = r302
            X.AId r0 = (X.AId) r0
            r308 = r0
            r0 = r308
            int r0 = r0.A00
            r309 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r310 = r0
            r0 = r309
            r1 = r310
            r0 = r0 & r1
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L64
            r0 = r309
            r1 = r310
            int r0 = r0 - r1
            r309 = r0
            r0 = r308
            r1 = r309
            r0.A00 = r1
        L3f:
            r0 = r308
            java.lang.Object r0 = r0.A01
            r311 = r0
            X.0Ds r0 = X.0Ds.A02
            r312 = r0
            r0 = r308
            int r0 = r0.A00
            r310 = r0
            r0 = 1
            r307 = r0
            r0 = r310
            if (r0 == 0) goto L81
            r0 = r310
            r1 = r307
            if (r0 != r1) goto L7d
            goto L75
        L64:
            X.AId r0 = new X.AId
            r308 = r0
            r0 = r308
            r1 = r301
            r2 = r302
            r3 = r306
            r0.<init>(r1, r2, r3)
            goto L3f
        L75:
            r0 = r311
            X.0Dt.A00(r0)     // Catch: X.Lym -> La1
            r0 = r311
            return r0
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        L81:
            r0 = r311
            X.0Dt.A00(r0)
            r0 = r308
            r1 = r307
            r0.A00 = r1     // Catch: X.Lym -> La1
            r0 = r301
            r1 = r308
            r2 = r303
            r3 = r304
            java.lang.Object r0 = r0.DAk(r1, r2, r3)     // Catch: X.Lym -> La1
            r311 = r0
            r0 = r311
            r1 = r312
            if (r0 != r1) goto La8
            r0 = r312
            return r0
        La1:
            r0 = 0
            r306 = r0
            r0 = 0
            r311 = r0
        La8:
            r0 = r311
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.DAl(X.0DR, kotlin.jvm.functions.Function2, long):java.lang.Object");
    }

    public 0DE getContext() {
        return this.A03;
    }

    public void resumeWith(Object obj) {
        LtK ltK = this.A04.A06;
        synchronized (ltK) {
            ltK.A0E(this);
        }
        this.A02.resumeWith(obj);
    }
}
