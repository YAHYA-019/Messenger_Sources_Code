package X;

import java.util.List;

/* loaded from: Fz6.class */
public final class Fz6 implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final List A03;

    public Fz6(String str, List list, int i, int i2) {
        this.A00 = i;
        this.A03 = list;
        this.A01 = i2;
        this.A02 = str == null ? "" : str;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((Fz6) obj).A01 - this.A01;
    }
}
