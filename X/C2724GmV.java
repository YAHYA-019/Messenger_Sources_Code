package X;

import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* renamed from: X.GmV, reason: case insensitive filesystem */
/* loaded from: GmV.class */
public final class C2724GmV extends HFp {
    public final User A00;
    public final ImmutableList A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public C2724GmV(User user, String str, boolean z) {
        String str2 = user.A13;
        11T.A0A(str2);
        String A07 = user.A07();
        Integer num = 0S2.A01;
        String str3 = z ? user.A0X.displayName : str;
        String str4 = z ? str : user.A0X.displayName;
        Integer num2 = 0S2.A00;
        ImmutableList of = ImmutableList.of((Object) HAC.A02, (Object) HAC.A03);
        11T.A0A(of);
        this.A00 = user;
        this.A06 = str;
        this.A09 = z;
        this.A04 = str2;
        this.A05 = A07;
        this.A03 = num;
        this.A08 = str3;
        this.A07 = str4;
        this.A02 = num2;
        this.A01 = of;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2724GmV)) {
                return false;
            }
            C2724GmV c2724GmV = (C2724GmV) obj;
            if (!11T.A0O(this.A00, c2724GmV.A00) || !11T.A0O(this.A06, c2724GmV.A06) || this.A09 != c2724GmV.A09 || !11T.A0O(this.A04, c2724GmV.A04) || !11T.A0O(this.A05, c2724GmV.A05) || this.A03 != c2724GmV.A03 || !11T.A0O(this.A08, c2724GmV.A08) || !11T.A0O(this.A07, c2724GmV.A07) || this.A02 != c2724GmV.A02 || !11T.A0O(this.A01, c2724GmV.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, (((((((((AnonymousClass002.A07(this.A04, (((1BL.A03(this.A00) + 1BL.A05(this.A06)) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31) + 1BL.A05(this.A05)) * 31) + BXy.A00(this.A03)) * 31) + 1BL.A05(this.A08)) * 31) + 7zN.A05(this.A07)) * 31) + R0N.A00(this.A02)) * 31);
    }
}
