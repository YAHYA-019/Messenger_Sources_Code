package X;

import java.util.Collections;
import java.util.List;

/* loaded from: L0w.class */
public final class L0w {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;

    public L0w(String str, String str2, String str3, List list, List list2, List list3, List list4, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A07 = Collections.unmodifiableList(list);
        this.A05 = Collections.unmodifiableList(list2);
        this.A06 = Collections.unmodifiableList(list3);
        this.A08 = Collections.unmodifiableList(list4);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A09 = z;
        this.A0A = z2;
    }

    public static List A00(List list) {
        return ((L0w) ((KqM) list.get(0)).A03.get(0)).A07;
    }
}
