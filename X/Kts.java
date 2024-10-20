package X;

import java.util.List;

/* loaded from: Kts.class */
public final class Kts {
    public long A00 = 0;
    public KgN A01;
    public List A02;
    public final float A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Type inference failed for: r0v12, types: [X.KgN, java.lang.Object] */
    public Kts(float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3) {
        this.A05 = j;
        this.A0A = j2;
        this.A06 = j3;
        this.A0B = z;
        this.A03 = f;
        this.A08 = j4;
        this.A07 = j5;
        this.A0C = z2;
        this.A04 = i;
        this.A09 = j6;
        ?? obj = new Object();
        ((KgN) obj).A01 = z3;
        ((KgN) obj).A00 = z3;
        this.A01 = obj;
    }

    public final void A00() {
        KgN kgN = this.A01;
        kgN.A00 = true;
        kgN.A01 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0.A01 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01() {
        /*
            r301 = this;
            r0 = r301
            X.KgN r0 = r0.A01
            r302 = r0
            r0 = r302
            boolean r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L19
            r0 = r302
            boolean r0 = r0.A01
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1b
        L19:
            r0 = 1
            r303 = r0
        L1b:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kts.A01():boolean");
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PointerInputChange(id=");
        A0k.append((Object) 0Pz.A0Q("PointerId(value=", ')', this.A05));
        A0k.append(", uptimeMillis=");
        A0k.append(this.A0A);
        A0k.append(", position=");
        A0k.append((Object) LE0.A07(this.A06));
        A0k.append(", pressed=");
        A0k.append(this.A0B);
        A0k.append(", pressure=");
        A0k.append(this.A03);
        A0k.append(", previousUptimeMillis=");
        A0k.append(this.A08);
        A0k.append(", previousPosition=");
        A0k.append((Object) LE0.A07(this.A07));
        A0k.append(", previousPressed=");
        A0k.append(this.A0C);
        A0k.append(", isConsumed=");
        A0k.append(A01());
        A0k.append(", type=");
        int i = this.A04;
        A0k.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch");
        A0k.append(", historical=");
        List list = this.A02;
        if (list == null) {
            list = C0ty.A00;
        }
        A0k.append(list);
        A0k.append(",scrollDelta=");
        A0k.append((Object) LE0.A07(this.A09));
        return AnonymousClass001.A0g(A0k, ')');
    }
}
