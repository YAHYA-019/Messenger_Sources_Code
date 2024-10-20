package X;

import com.facebook.stickers.model.Sticker;

/* renamed from: X.7f6, reason: invalid class name */
/* loaded from: 7f6.class */
public final class C7f6 extends C04v {
    public final long A00;
    public final Sticker A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C7f6(Sticker sticker, Integer num, Long l, String str, String str2, String str3, String str4, long j) {
        11T.A0F(str, 2);
        this.A00 = j;
        this.A07 = str;
        this.A02 = num;
        this.A06 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A01 = sticker;
        this.A03 = l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7f6)) {
                return false;
            }
            C7f6 c7f6 = (C7f6) obj;
            if (this.A00 != c7f6.A00 || !11T.A0O(this.A07, c7f6.A07) || this.A02 != c7f6.A02 || !11T.A0O(this.A06, c7f6.A06) || !11T.A0O(this.A05, c7f6.A05) || !11T.A0O(this.A04, c7f6.A04) || !11T.A0O(this.A01, c7f6.A01) || !11T.A0O(this.A03, c7f6.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass002.A07(this.A07, 1BL.A01(this.A00) * 31) + 9EF.A00(this.A02)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A04)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 4YU.A03(this.A03);
    }
}
