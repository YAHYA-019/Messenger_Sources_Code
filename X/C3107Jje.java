package X;

import java.util.List;

/* renamed from: X.Jje, reason: case insensitive filesystem */
/* loaded from: Jje.class */
public final class C3107Jje extends AbstractC3112Jjj {
    public final Ksl A00;

    public C3107Jje(List list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Ksl ksl = (Ksl) ((LCv) list.get(i2)).A0E;
            if (ksl != null) {
                i = Math.max(i, ksl.A01.length);
            }
        }
        this.A00 = new Ksl(new float[i], new int[i]);
    }
}
