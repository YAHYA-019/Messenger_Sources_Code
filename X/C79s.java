package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.79s, reason: invalid class name */
/* loaded from: 79s.class */
public final class C79s {
    public C79q A00;
    public CharSequence A01;
    public Set A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public C79s() {
        this.A02 = new HashSet();
        this.A04 = true;
    }

    public C79s(C77v c77v) {
        this.A02 = new HashSet();
        this.A03 = c77v.A03;
        this.A01 = c77v.A01;
        this.A04 = c77v.A04;
        this.A05 = c77v.A05;
        this.A00 = c77v.A00;
        this.A02 = new HashSet(c77v.A02);
    }

    public void A00(CharSequence charSequence) {
        this.A01 = charSequence;
        C1pq.A08("initialText", charSequence);
        if (this.A02.contains("initialText")) {
            return;
        }
        HashSet hashSet = new HashSet(this.A02);
        this.A02 = hashSet;
        hashSet.add("initialText");
    }
}
