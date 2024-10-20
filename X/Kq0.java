package X;

/* loaded from: Kq0.class */
public final class Kq0 {
    public final double A00;
    public final double A01;
    public final double A02;
    public final String A03;

    public Kq0(String str, double d, double d2, double d3) {
        this.A01 = d;
        this.A00 = d2;
        this.A02 = d3;
        this.A03 = str;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{");
        A0k.append(this.A01);
        A0k.append(", csvqm=");
        A0k.append(5MI.A00(1L, this.A00));
        A0k.append(", uumos=");
        A0k.append(5MI.A00(1L, this.A02));
        A0k.append(" (");
        A0k.append(this.A03);
        return AnonymousClass001.A0d(")}", A0k);
    }
}
