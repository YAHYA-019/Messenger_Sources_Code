package X;

import android.content.Context;
import com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;

/* renamed from: X.Gjg, reason: case insensitive filesystem */
/* loaded from: Gjg.class */
public final class C2631Gjg extends C04v {
    public final Hr2 A00;
    public final Hr2 A01;
    public final boolean A02;
    public final GridSelfViewLocation A03;
    public final Hr2 A04;
    public final Hr2 A05;
    public final Hr2 A06;
    public final Hr2 A07;
    public final Hr2 A08;
    public final Hr2 A09;
    public final Object A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C2631Gjg() {
        this(GridSelfViewLocation.TOP_RIGHT, GOn.A10(0), GOn.A10(0), GOn.A10(0), GOn.A10(0), GOn.A10(0), GOn.A10(0), GOn.A10(0), GOn.A10(0), null, false, false, false, false);
    }

    public C2631Gjg(GridSelfViewLocation gridSelfViewLocation, Hr2 hr2, Hr2 hr22, Hr2 hr23, Hr2 hr24, Hr2 hr25, Hr2 hr26, Hr2 hr27, Hr2 hr28, Object obj, boolean z, boolean z2, boolean z3, boolean z4) {
        1BL.A1G(hr25, hr26);
        11T.A0F(hr27, 7);
        this.A07 = hr2;
        this.A08 = hr22;
        this.A09 = hr23;
        this.A05 = hr24;
        this.A00 = hr25;
        this.A01 = hr26;
        this.A04 = hr27;
        this.A06 = hr28;
        this.A02 = z;
        this.A0D = z2;
        this.A0B = z3;
        this.A0C = z4;
        this.A03 = gridSelfViewLocation;
        this.A0A = obj;
    }

    public static C2631Gjg A00() {
        return new C2631Gjg(GridSelfViewLocation.TOP_RIGHT, new GzB(0), new GzB(0), new GzB(0), new GzB(0), new GzB(0), new GzB(0), new GzB(0), new GzB(0), null, false, false, false, false);
    }

    public final GridLayoutConfigForLayoutInput A01(Context context) {
        11T.A0F(context, 0);
        return new GridLayoutConfigForLayoutInput(this.A07.A00(context), this.A08.A00(context), this.A09.A00(context), this.A05.A00(context), this.A00.A00(context), this.A01.A00(context), this.A04.A00(context), this.A06.A00(context), this.A02, this.A0D, false, this.A0B, this.A0C, this.A03, this.A0A);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2631Gjg)) {
                return false;
            }
            C2631Gjg c2631Gjg = (C2631Gjg) obj;
            if (!11T.A0O(this.A07, c2631Gjg.A07) || !11T.A0O(this.A08, c2631Gjg.A08) || !11T.A0O(this.A09, c2631Gjg.A09) || !11T.A0O(this.A05, c2631Gjg.A05) || !11T.A0O(this.A00, c2631Gjg.A00) || !11T.A0O(this.A01, c2631Gjg.A01) || !11T.A0O(this.A04, c2631Gjg.A04) || !11T.A0O(this.A06, c2631Gjg.A06) || this.A02 != c2631Gjg.A02 || this.A0D != c2631Gjg.A0D || this.A0B != c2631Gjg.A0B || this.A0C != c2631Gjg.A0C || this.A03 != c2631Gjg.A03 || !11T.A0O(this.A0A, c2631Gjg.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        int A05 = (((((AnonymousClass002.A05(this.A06, AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A09, AnonymousClass002.A05(this.A08, 1BL.A03(this.A07)))))))) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + 1237) * 31;
        if (this.A0B) {
            i = 1231;
        }
        return AnonymousClass002.A05(this.A03, (((A05 + i) * 31) + AnonymousClass002.A00(this.A0C ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A0A);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GridLayoutConfig(leftPadding=");
        A0k.append(this.A07);
        A0k.append(", rightPadding=");
        A0k.append(this.A08);
        A0k.append(", topPadding=");
        A0k.append(this.A09);
        A0k.append(", bottomPadding=");
        A0k.append(this.A05);
        A0k.append(", horizontalSpacing=");
        A0k.append(this.A00);
        A0k.append(", verticalSpacing=");
        A0k.append(this.A01);
        A0k.append(", bottomInset=");
        A0k.append(this.A04);
        A0k.append(", itemHeightOffset=");
        A0k.append(this.A06);
        A0k.append(", disablesFloatingSelfView=");
        A0k.append(this.A02);
        A0k.append(", skipsDefaultGridLayout=");
        A0k.append(this.A0D);
        4YV.A1Q(A0k, ", forcesHorizontalLayoutForTwoPersonLayout=");
        A0k.append(", appliesPaddingToFullscreenLayout=");
        A0k.append(this.A0B);
        A0k.append(", aspectFillFullscreenSingleItem=");
        A0k.append(this.A0C);
        A0k.append(", selfViewLocation=");
        A0k.append(this.A03);
        A0k.append(", layoutExtras=");
        return AnonymousClass002.A0K(this.A0A, A0k);
    }
}
