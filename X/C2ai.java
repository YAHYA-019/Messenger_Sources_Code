package X;

/* renamed from: X.2ai, reason: invalid class name */
/* loaded from: 2ai.class */
public abstract class C2ai extends 2Zs {
    public long A00;
    public C07a A01;
    public boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r311 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        r311.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fe, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b4, code lost:
    
        if (((int) ((1073741823 & r0) >> 0)) == ((int) ((r0 & 1152921503533105152L) >> 30))) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0227, code lost:
    
        if (r0 == X.C44g.A00) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A02() {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ai.A02():long");
    }

    public final void A03(C2ap c2ap) {
        C07a c07a = this.A01;
        if (c07a == null) {
            c07a = new C07a();
            this.A01 = c07a;
        }
        c07a.addLast(c2ap);
    }

    public final void A04(boolean z) {
        long j = this.A00 - (z ? 4294967296L : 1L);
        this.A00 = j;
        if (j > 0 || !this.A02) {
            return;
        }
        A06();
    }

    public final boolean A05() {
        C07a c07a = this.A01;
        boolean z = false;
        if (c07a != null) {
            C2ap c2ap = (C2ap) (c07a.isEmpty() ? null : c07a.removeFirst());
            if (c2ap != null) {
                c2ap.run();
                z = true;
            }
        }
        return z;
    }

    public abstract void A06();

    public final 2Zs limitedParallelism(int i) {
        C2ac.A00(i);
        return this;
    }
}
