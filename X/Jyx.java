package X;

/* loaded from: Jyx.class */
public final class Jyx extends 3AV {
    public 24X A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ 3sX A01() {
        return ((3AV) this).A02;
    }

    public C42h A06() {
        if (this.A01) {
            this.A00 = null;
            return null;
        }
        ((3sX) this).A00++;
        this.A01 = true;
        return this.A00.AAi();
    }

    public 24X A07() {
        if (this.A01) {
            return this.A00;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Jyw, X.3AV] */
    public Jyw A08() {
        24X r0 = this.A00;
        ?? r02 = new 3AV(this, 1);
        r02.A00 = r0.A0L();
        return r02;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Jyy, X.3AV] */
    public Jyy A09() {
        24X r0 = this.A00;
        ?? r02 = new 3AV(this, 2);
        r02.A00 = r0.A0N();
        r02.A01 = true;
        return r02;
    }
}
