package X;

import java.util.List;

/* renamed from: X.3pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pm.class */
public final class C01063pm {
    public final int A00;
    public final 1LI A01;
    public final C01063pm A02;
    public final List A03;

    public C01063pm(1LI r302, C01063pm c01063pm, List list, int i) {
        this.A02 = c01063pm;
        this.A01 = r302;
        this.A03 = list;
        this.A00 = i;
    }

    public final C01063pm A00(int i) {
        if (this.A00 == i) {
            return this;
        }
        return new C01063pm(this.A01, this.A02, this.A03, i);
    }
}
