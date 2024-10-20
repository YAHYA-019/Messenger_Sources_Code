package X;

import android.util.Pair;

/* loaded from: H10.class */
public final class H10 extends GR2 {
    public final int A00;

    public H10(int i) {
        this.A00 = i;
    }

    public Pair A00() {
        return this.A00 != 0 ? ((GR2) this).A00 : Pair.create(1BK.A0d(), C52j.A09);
    }

    public Pair A01() {
        switch (this.A00) {
            case 0:
            case 2:
                return GOn.A0G(AnonymousClass001.A0K(), C52j.A09);
            default:
                return ((GR2) this).A01;
        }
    }

    public boolean A08() {
        return this.A00 == 0;
    }

    public boolean A09() {
        return 1 - this.A00 == 0;
    }
}
