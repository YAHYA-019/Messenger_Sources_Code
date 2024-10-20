package X;

import android.graphics.Bitmap;

/* renamed from: X.Jd4, reason: case insensitive filesystem */
/* loaded from: Jd4.class */
public final class C2916Jd4 extends Krv {
    public float A00;
    public int A01;
    public Kdj A02;
    public final long A03;
    public final long A04;
    public final MLM A05;

    public /* synthetic */ C2916Jd4(MLM mlm) {
        int i;
        int A0I;
        Bitmap bitmap = ((LOP) mlm).A00;
        long A0S = JR1.A0S(bitmap.getWidth(), bitmap.getHeight());
        this.A05 = mlm;
        this.A04 = A0S;
        this.A01 = 1;
        if (((int) (0 >> 32)) < 0 || (i = (int) (A0S >> 32)) < 0 || (A0I = JR0.A0I(A0S)) < 0 || i > bitmap.getWidth() || A0I > bitmap.getHeight()) {
            throw AnonymousClass001.A0L(AnonymousClass000.A00(13));
        }
        this.A03 = A0S;
        this.A00 = 1.0f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2916Jd4)) {
                return false;
            }
            C2916Jd4 c2916Jd4 = (C2916Jd4) obj;
            if (!11T.A0O(this.A05, c2916Jd4.A05) || this.A04 != c2916Jd4.A04 || this.A01 != c2916Jd4.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A04, (1BL.A03(this.A05) + ((int) (0 >>> 32))) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BitmapPainter(image=");
        A0k.append(this.A05);
        A0k.append(", srcOffset=");
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append('(');
        A0k2.append((int) (0 >> 32));
        AnonymousClass001.A1H(A0k2);
        A0k2.append(0);
        A0k.append((Object) AnonymousClass001.A0g(A0k2, ')'));
        A0k.append(", srcSize=");
        long j = this.A04;
        A0k.append((Object) 0Pz.A0B((int) (j >> 32), JR0.A0I(j), " x "));
        A0k.append(", filterQuality=");
        A0k.append(this.A01 == 0 ? "None" : "Low");
        return AnonymousClass001.A0g(A0k, ')');
    }
}
