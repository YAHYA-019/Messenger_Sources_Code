package X;

import android.net.Uri;

/* renamed from: X.4b0, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4b0.class */
public final class C04454b0 extends 2Dp {
    public final Uri A00;
    public final Uri A01;
    public final Uri A02;
    public final GjF A03;
    public final Integer A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04454b0(Uri uri, Uri uri2, Uri uri3, 2rB r305, 2IA r306, GjF gjF, Integer num) {
        super(r306);
        11T.A0F(num, 6);
        r306.A0A = r305;
        r306.A0F = "e2ee_cache_id";
        this.A03 = gjF;
        this.A00 = uri;
        this.A02 = uri2;
        this.A01 = uri3;
        this.A04 = num;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof C04454b0) && super.equals(obj)) {
            C04454b0 c04454b0 = (C04454b0) obj;
            if (11T.A0O(this.A03, c04454b0.A03) && 11T.A0O(this.A00, c04454b0.A00) && 11T.A0O(this.A02, c04454b0.A02) && 11T.A0O(this.A01, c04454b0.A01) && this.A04 == c04454b0.A04) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A03 = 1BK.A03(this.A00, (super.hashCode() * 31) + AnonymousClass002.A04(this.A03)) + AnonymousClass002.A04(this.A02);
        Uri uri = this.A01;
        if (uri != null) {
            i = uri.hashCode();
        }
        int i2 = A03 + i;
        Integer num = this.A04;
        return i2 + R0A.A00(num).hashCode() + num.intValue();
    }
}
