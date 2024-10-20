package X;

import android.content.res.Resources;

/* renamed from: X.709, reason: invalid class name */
/* loaded from: 709.class */
public final class AnonymousClass709 implements C2pe {
    public final int A00;

    @Override // X.C2pe
    public int Chq(Resources resources) {
        11T.A0F(resources, 0);
        return resources.getDimensionPixelSize(this.A00);
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        boolean z = false;
        if ((obj instanceof AnonymousClass709) && i == ((AnonymousClass709) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return 0Pz.A0O("ResIdResource(resId=", ')', this.A00);
    }
}
