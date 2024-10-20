package X;

/* loaded from: Kpx.class */
public final class Kpx {
    public final int A00;
    public final MKq A01;
    public final LBT A02;
    public final L4J A03;

    public Kpx(MKq mKq, LBT lbt, L4J l4j, int i) {
        this.A02 = lbt;
        this.A00 = i;
        this.A03 = l4j;
        this.A01 = mKq;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ScrollCaptureCandidate(node=");
        A0k.append(this.A02);
        A0k.append(", depth=");
        A0k.append(this.A00);
        A0k.append(", viewportBoundsInWindow=");
        A0k.append(this.A03);
        A0k.append(", coordinates=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
