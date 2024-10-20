package X;

import com.facebook.ui.emoji.model.Emoji;
import java.util.List;

/* renamed from: X.As4, reason: case insensitive filesystem */
/* loaded from: As4.class */
public final class C1770As4 extends C04v {
    public final int A00;
    public final int A01;
    public final C1u3 A02;
    public final C1u3 A03;
    public final DF0 A04;
    public final C1p8 A05;
    public final Emoji A06;
    public final CharSequence A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    public C1770As4(C1u3 c1u3, C1u3 c1u32, DF0 df0, C1p8 c1p8, Emoji emoji, CharSequence charSequence, String str, String str2, String str3, List list, int i, int i2) {
        1BK.A1K(str, 3, str2);
        11T.A0F(str3, 10);
        this.A02 = c1u3;
        this.A06 = emoji;
        this.A08 = str;
        this.A09 = str2;
        this.A07 = charSequence;
        this.A0B = list;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = c1u32;
        this.A0A = str3;
        this.A04 = df0;
        this.A05 = c1p8;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1770As4)) {
                return false;
            }
            C1770As4 c1770As4 = (C1770As4) obj;
            if (this.A02 != c1770As4.A02 || !11T.A0O(this.A06, c1770As4.A06) || !11T.A0O(this.A08, c1770As4.A08) || !11T.A0O(this.A09, c1770As4.A09) || !11T.A0O(this.A07, c1770As4.A07) || !11T.A0O(this.A0B, c1770As4.A0B) || this.A01 != c1770As4.A01 || this.A00 != c1770As4.A00 || this.A03 != c1770As4.A03 || !11T.A0O(this.A0A, c1770As4.A0A) || !11T.A0O(this.A04, c1770As4.A04) || !11T.A0O(this.A05, c1770As4.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A05, AnonymousClass002.A05(this.A04, AnonymousClass002.A07(this.A0A, AnonymousClass002.A05(this.A03, (((AnonymousClass002.A05(this.A0B, (AnonymousClass002.A07(this.A09, AnonymousClass002.A07(this.A08, (1BL.A03(this.A02) + AnonymousClass001.A02(this.A06)) * 31)) + 4YU.A03(this.A07)) * 31) + this.A01) * 31) + this.A00) * 31))));
    }
}
