package X;

import android.graphics.Bitmap;

/* loaded from: Lig.class */
public final class Lig implements Cloneable {
    public final Bitmap A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public Lig(Bitmap bitmap, String str, String str2, String str3) {
        1BL.A1H(str, str2, str3);
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = bitmap;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return new Lig(this.A00, this.A03, this.A01, this.A02);
    }
}
