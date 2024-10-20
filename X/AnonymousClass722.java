package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.722, reason: invalid class name */
/* loaded from: 722.class */
public final class AnonymousClass722 extends C04v implements AnonymousClass720 {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final 6Pp A03;
    public final 6C9 A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnonymousClass722() {
        /*
            r301 = this;
            java.lang.String r0 = ""
            r302 = r0
            r0 = -1
            r1 = 1
            int r0 = r0 >>> r1
            r303 = r0
            X.0ty r0 = X.C0ty.A00
            r304 = r0
            r0 = r301
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r302
            r6 = r302
            r7 = 0
            r8 = r304
            r9 = r303
            r10 = r303
            r11 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass722.<init>():void");
    }

    public AnonymousClass722(Uri uri, 6Pp r303, 6C9 r304, Integer num, String str, String str2, String str3, List list, int i, int i2, boolean z) {
        this.A03 = r303;
        this.A04 = r304;
        this.A08 = str;
        this.A01 = i;
        this.A07 = str2;
        this.A00 = i2;
        this.A06 = str3;
        this.A05 = num;
        this.A02 = uri;
        this.A0A = z;
        this.A09 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass722)) {
                return false;
            }
            AnonymousClass722 anonymousClass722 = (AnonymousClass722) obj;
            if (!11T.A0O(this.A03, anonymousClass722.A03) || !11T.A0O(this.A04, anonymousClass722.A04) || !11T.A0O(this.A08, anonymousClass722.A08) || this.A01 != anonymousClass722.A01 || !11T.A0O(this.A07, anonymousClass722.A07) || this.A00 != anonymousClass722.A00 || !11T.A0O(this.A06, anonymousClass722.A06) || this.A05 != anonymousClass722.A05 || !11T.A0O(this.A02, anonymousClass722.A02) || this.A0A != anonymousClass722.A0A || !11T.A0O(this.A09, anonymousClass722.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A07 = (((AnonymousClass002.A07(this.A07, (AnonymousClass002.A07(this.A08, ((AnonymousClass001.A02(this.A03) * 31) + AnonymousClass001.A02(this.A04)) * 31) + this.A01) * 31) + this.A00) * 31) + 1BL.A05(this.A06)) * 31;
        Integer num = this.A05;
        return 1BK.A03(this.A09, (((((A07 + (num == null ? 0 : 7mL.A00(num))) * 31) + 4YU.A03(this.A02)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31);
    }
}
