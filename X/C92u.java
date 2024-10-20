package X;

import android.net.Uri;

/* renamed from: X.92u, reason: invalid class name */
/* loaded from: 92u.class */
public final class C92u extends 9Xd {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final Uri A03;
    public final Uri A04;
    public final Uri A05;
    public final C5fo A06;
    public final C5fo A07;
    public final 5aU A08;
    public final Long A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92u(Uri uri, Uri uri2, Uri uri3, Uri uri4, C5fo c5fo, C5fo c5fo2, 5aU r308, Long l, Long l2, String str, String str2, int i, int i2) {
        super(r308);
        7zR.A1O(r308, uri);
        4YV.A1M(c5fo, 5, uri3);
        7zP.A1P(c5fo2, 9, str2);
        this.A01 = i;
        this.A08 = r308;
        this.A03 = uri;
        this.A02 = uri2;
        this.A06 = c5fo;
        this.A09 = l;
        this.A05 = uri3;
        this.A04 = uri4;
        this.A07 = c5fo2;
        this.A0A = l2;
        this.A0B = str;
        this.A0C = str2;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C92u)) {
                return false;
            }
            C92u c92u = (C92u) obj;
            if (this.A01 != c92u.A01 || this.A08 != c92u.A08 || !11T.A0O(this.A03, c92u.A03) || !11T.A0O(this.A02, c92u.A02) || this.A06 != c92u.A06 || !11T.A0O(this.A09, c92u.A09) || !11T.A0O(this.A05, c92u.A05) || !11T.A0O(this.A04, c92u.A04) || this.A07 != c92u.A07 || !11T.A0O(this.A0A, c92u.A0A) || !11T.A0O(this.A0B, c92u.A0B) || !11T.A0O(this.A0C, c92u.A0C) || this.A00 != c92u.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A0C, AnonymousClass002.A07(this.A0B, (AnonymousClass002.A05(this.A07, (AnonymousClass002.A05(this.A05, (AnonymousClass002.A05(this.A06, (AnonymousClass002.A05(this.A03, AnonymousClass002.A05(this.A08, this.A01 * 31)) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A09)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 4YU.A03(this.A0A)) * 31)) + this.A00;
    }
}
