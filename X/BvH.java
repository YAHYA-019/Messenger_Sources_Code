package X;

import java.util.List;

/* loaded from: BvH.class */
public final class BvH {
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public BvH(String str, List list, List list2, List list3, List list4) {
        this.A02 = list;
        this.A01 = list2;
        this.A04 = list3;
        this.A03 = list4;
        this.A00 = str;
    }
}
