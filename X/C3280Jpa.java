package X;

import android.net.Uri;

/* renamed from: X.Jpa, reason: case insensitive filesystem */
/* loaded from: Jpa.class */
public final class C3280Jpa extends L41 {
    public final int A00;
    public final int A01;
    public final String A02;

    public C3280Jpa(Uri uri, String str, int i, int i2) {
        super(uri);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.L41
    public String toString() {
        String str = this.A02;
        return str != null ? 0Pz.A0j(str, ", ", super.toString()) : super.toString();
    }
}
