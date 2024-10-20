package X;

import android.content.ContentValues;

/* loaded from: Jt1.class */
public final class Jt1 extends C04v {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public Jt1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, long j, long j2, boolean z) {
        this.A05 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = str5;
        this.A07 = str6;
        this.A04 = str7;
        this.A03 = str8;
        this.A00 = i;
        this.A0B = z;
    }

    public final ContentValues A00() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tab_id", this.A05);
        contentValues.put("tab_url", this.A0A);
        contentValues.put("tab_title", this.A08);
        contentValues.put("tracking_codes", this.A09);
        4YV.A16(contentValues, "created_timestamp", this.A01);
        4YV.A16(contentValues, "last_accessed_timestamp", this.A02);
        contentValues.put("parent_tab_id", this.A06);
        contentValues.put("parent_tab_url", this.A07);
        contentValues.put("business_name", this.A04);
        contentValues.put("business_image_url", this.A03);
        4YU.A1E(contentValues, "tab_type", this.A00);
        contentValues.put("is_business_verified", Boolean.valueOf(this.A0B));
        return contentValues;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jt1)) {
                return false;
            }
            Jt1 jt1 = (Jt1) obj;
            if (!11T.A0O(this.A05, jt1.A05) || !11T.A0O(this.A0A, jt1.A0A) || !11T.A0O(this.A08, jt1.A08) || !11T.A0O(this.A09, jt1.A09) || this.A01 != jt1.A01 || this.A02 != jt1.A02 || !11T.A0O(this.A06, jt1.A06) || !11T.A0O(this.A07, jt1.A07) || !11T.A0O(this.A04, jt1.A04) || !11T.A0O(this.A03, jt1.A03) || this.A00 != jt1.A00 || this.A0B != jt1.A0B) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A07, AnonymousClass002.A07(this.A06, AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A01, AnonymousClass002.A07(this.A09, AnonymousClass002.A07(this.A08, AnonymousClass002.A07(this.A0A, 4YV.A02(this.A05)))))))))) + this.A00) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0);
    }
}
