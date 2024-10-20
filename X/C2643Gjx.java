package X;

import java.util.List;

/* renamed from: X.Gjx, reason: case insensitive filesystem */
/* loaded from: Gjx.class */
public final class C2643Gjx extends C04v implements JDB {
    public final HDc A00;
    public final GjV A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C2643Gjx(HDc hDc, GjV gjV, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A0C = z5;
        this.A0B = z6;
        this.A05 = list;
        this.A01 = gjV;
        this.A06 = z7;
        this.A02 = str;
        this.A00 = hDc;
        this.A03 = str2;
        this.A04 = str3;
    }

    public static void A00(HDc hDc, C2643Gjx c2643Gjx, GS2 gs2) {
        boolean z = c2643Gjx.A08;
        boolean z2 = c2643Gjx.A07;
        boolean z3 = c2643Gjx.A09;
        boolean z4 = c2643Gjx.A0A;
        boolean z5 = c2643Gjx.A0C;
        boolean z6 = c2643Gjx.A0B;
        List list = c2643Gjx.A05;
        GjV gjV = c2643Gjx.A01;
        boolean z7 = c2643Gjx.A06;
        String str = c2643Gjx.A02;
        String str2 = c2643Gjx.A03;
        String str3 = c2643Gjx.A04;
        11T.A0F(list, 6);
        gs2.A0Z(new C2643Gjx(hDc, gjV, str, str2, str3, list, z, z2, z3, z4, z5, z6, z7));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2643Gjx)) {
                return false;
            }
            C2643Gjx c2643Gjx = (C2643Gjx) obj;
            if (this.A08 != c2643Gjx.A08 || this.A07 != c2643Gjx.A07 || this.A09 != c2643Gjx.A09 || this.A0A != c2643Gjx.A0A || this.A0C != c2643Gjx.A0C || this.A0B != c2643Gjx.A0B || !11T.A0O(this.A05, c2643Gjx.A05) || !11T.A0O(this.A01, c2643Gjx.A01) || this.A06 != c2643Gjx.A06 || !11T.A0O(this.A02, c2643Gjx.A02) || !11T.A0O(this.A00, c2643Gjx.A00) || !11T.A0O(this.A03, c2643Gjx.A03) || !11T.A0O(this.A04, c2643Gjx.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A00, (((((AnonymousClass002.A05(this.A05, ((((((((((AnonymousClass002.A00(this.A08 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A07 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0C ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A03)) * 31) + 7zN.A05(this.A04);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MediaSyncReelsPlaybackViewState(isDrawerGestureAllowed=");
        A0k.append(this.A08);
        A0k.append(", isCallControlsVisible=");
        A0k.append(this.A07);
        A0k.append(", isInPipMode=");
        A0k.append(this.A09);
        A0k.append(", isReactionsEnabled=");
        A0k.append(this.A0A);
        A0k.append(", shouldShowEndExperienceButton=");
        A0k.append(this.A0C);
        A0k.append(", shouldShowBottomBar=");
        A0k.append(this.A0B);
        A0k.append(", contentList=");
        A0k.append(this.A05);
        A0k.append(", currentItem=");
        A0k.append(this.A01);
        A0k.append(", hasSwipedRecently=");
        A0k.append(this.A06);
        A0k.append(", adminMessageActorProfilePictureUrl=");
        A0k.append(this.A02);
        A0k.append(", bottomBarViewType=");
        A0k.append(this.A00);
        A0k.append(", suggestedContext=");
        A0k.append(this.A03);
        A0k.append(", tabLoggingName=");
        return DKH.A0o(this.A04, A0k);
    }
}
