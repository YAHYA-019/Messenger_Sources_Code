package X;

/* loaded from: Kkd.class */
public final class Kkd {
    public int A00;
    public int A01;
    public int A02;
    public Object[] A03;

    public Kkd() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.A00 = numberOfLeadingZeros - 1;
        this.A01 = (int) (0.75f * numberOfLeadingZeros);
        this.A03 = new Object[numberOfLeadingZeros];
    }
}
