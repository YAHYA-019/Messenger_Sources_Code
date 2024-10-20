package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.69q, reason: invalid class name */
/* loaded from: 69q.class */
public final class C69q {
    public static 1iL A06;
    public static 1iL A07;
    public static 1iL A08;
    public static 1iL A09;
    public static HashSet A0A;
    public C07004ik A00;
    public C06974ih A01;
    public String A02;
    public boolean A03 = ((Boolean) A08.get()).booleanValue();
    public final boolean A05 = ((Boolean) A09.get()).booleanValue();
    public final boolean A04 = ((Boolean) A07.get()).booleanValue();

    static {
        1iL r0 = 1iO.A00;
        A07 = r0;
        A08 = r0;
        A09 = r0;
        A06 = 1iO.A02;
    }

    public C69q() {
        if (A0A == null) {
            String[] split = ((String) A06.get()).split(" ");
            HashSet hashSet = new HashSet(split.length);
            Collections.addAll(hashSet, split);
            A0A = hashSet;
        }
    }

    public C07004ik A00() {
        C07004ik c07004ik = this.A00;
        if (c07004ik == null) {
            c07004ik = 5BI.A00(C06974ih.A0Q);
            this.A00 = c07004ik;
        }
        this.A01 = null;
        return c07004ik;
    }

    public C06974ih A01() {
        C06974ih c06974ih = this.A01;
        if (c06974ih == null) {
            C07004ik c07004ik = this.A00;
            c06974ih = c07004ik != null ? new C06974ih(c07004ik) : C06974ih.A0Q;
            this.A01 = c06974ih;
        }
        return c06974ih;
    }

    public boolean A02() {
        String str;
        HashSet hashSet;
        return this.A03 || ((str = this.A02) == null && this.A05) || ((hashSet = A0A) != null && hashSet.contains(str));
    }
}
