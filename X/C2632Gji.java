package X;

import android.graphics.Rect;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import java.util.List;

/* renamed from: X.Gji, reason: case insensitive filesystem */
/* loaded from: Gji.class */
public final class C2632Gji extends C04v {
    public Rect A00;
    public List A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final GridSelfViewLocation A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final List A09;
    public final boolean A0A;

    public C2632Gji(Rect rect, GridSelfViewLocation gridSelfViewLocation, Integer num, Integer num2, Integer num3, List list, List list2, int i, int i2, int i3, boolean z) {
        11T.A0F(gridSelfViewLocation, 8);
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A09 = list;
        this.A06 = num;
        this.A0A = z;
        this.A07 = num2;
        this.A05 = gridSelfViewLocation;
        this.A00 = rect;
        this.A01 = list2;
        this.A08 = num3;
    }

    public static int A00(OmniGridLayoutManager omniGridLayoutManager) {
        return Math.max(-omniGridLayoutManager.A0X(), (omniGridLayoutManager.A07.A03 - ((2XA) omniGridLayoutManager).A03) + omniGridLayoutManager.A0Y());
    }

    public static int A01(OmniGridLayoutManager omniGridLayoutManager) {
        return Math.max(-omniGridLayoutManager.A0Z(), (omniGridLayoutManager.A07.A02 - ((2XA) omniGridLayoutManager).A00) + omniGridLayoutManager.A0W());
    }

    public static C2628GjQ A02(C2632Gji c2632Gji, int i) {
        return (C2628GjQ) c2632Gji.A09.get(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2632Gji)) {
                return false;
            }
            C2632Gji c2632Gji = (C2632Gji) obj;
            if (this.A03 != c2632Gji.A03 || this.A02 != c2632Gji.A02 || this.A04 != c2632Gji.A04 || !11T.A0O(this.A09, c2632Gji.A09) || this.A06 != c2632Gji.A06 || this.A0A != c2632Gji.A0A || this.A07 != c2632Gji.A07 || this.A05 != c2632Gji.A05 || !11T.A0O(this.A00, c2632Gji.A00) || !11T.A0O(this.A01, c2632Gji.A01) || !11T.A0O(this.A08, c2632Gji.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A05 = AnonymousClass002.A05(this.A09, ((((this.A03 * 31) + this.A02) * 31) + this.A04) * 31);
        int intValue = this.A06.intValue();
        switch (intValue) {
            case 1:
                str = "ON_SCROLL";
                break;
            case 2:
                str = "ALWAYS";
                break;
            default:
                str = "NEVER";
                break;
        }
        int A07 = (7zR.A07(str, intValue, A05) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31;
        int intValue2 = this.A07.intValue();
        return (((((AnonymousClass002.A05(this.A05, 7zR.A07(1 != intValue2 ? "ASPECT_FIT" : "SQUARE", intValue2, A07)) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A08)) * 31;
    }
}
