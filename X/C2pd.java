package X;

import android.content.res.Resources;

/* renamed from: X.2pd, reason: invalid class name */
/* loaded from: 2pd.class */
public final class C2pd implements C2pe {
    public final int A00;

    @Override // X.C2pe
    public int Chq(Resources resources) {
        11T.A0F(resources, 0);
        return AnonymousClass272.A00(this.A00 * resources.getDisplayMetrics().density);
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        boolean z = false;
        if ((obj instanceof C2pd) && i == ((C2pd) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return 0Pz.A0O("DipResource(dp=", ')', this.A00);
    }
}
