package X;

/* loaded from: Kpf.class */
public final class Kpf {
    public final C00m A00;
    public final C00m A01;
    public final boolean A02;

    public Kpf(C00m c00m, C00m c00m2, boolean z) {
        this.A01 = c00m;
        this.A00 = c00m2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ScrollAxisRange(value=");
        A0k.append(JQy.A02(this.A01));
        A0k.append(", maxValue=");
        A0k.append(JQy.A02(this.A00));
        A0k.append(", reverseScrolling=");
        return DKH.A0q(A0k, this.A02);
    }
}
