package X;

import android.content.res.Resources;

/* renamed from: X.70z, reason: invalid class name */
/* loaded from: 70z.class */
public final class C70z implements C2pe {
    public final int A00;

    @Override // X.C2pe
    public int Chq(Resources resources) {
        11T.A0F(resources, 0);
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        boolean z = false;
        if ((obj instanceof C70z) && i == ((C70z) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return 0Pz.A0O("PixelResource(px=", ')', this.A00);
    }
}
