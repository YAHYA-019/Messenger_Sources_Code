package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.Gj8, reason: case insensitive filesystem */
/* loaded from: Gj8.class */
public final class C2619Gj8 extends C04v {
    public final int A00;
    public final Rect A01;
    public final Rect A02;
    public final 8Lb A03;
    public final C2627GjP A04;
    public final Hr2 A05;
    public final Hr2 A06;
    public final List A07;
    public final java.util.Map A08;
    public final java.util.Map A09;
    public final C00m A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C2619Gj8(Rect rect, Rect rect2, 8Lb r304, C2627GjP c2627GjP, Hr2 hr2, Hr2 hr22, List list, java.util.Map map, java.util.Map map2, C00m c00m, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        11T.A0F(list, 1);
        7zS.A18(7, rect, rect2, c00m);
        this.A07 = list;
        this.A08 = map;
        this.A03 = r304;
        this.A09 = map2;
        this.A00 = i;
        this.A0E = z;
        this.A01 = rect;
        this.A02 = rect2;
        this.A0A = c00m;
        this.A05 = hr2;
        this.A06 = hr22;
        this.A0G = z2;
        this.A0C = z3;
        this.A0F = z4;
        this.A0D = z5;
        this.A04 = c2627GjP;
        this.A0I = z6;
        this.A0B = true;
        this.A0H = z7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2619Gj8)) {
                return false;
            }
            C2619Gj8 c2619Gj8 = (C2619Gj8) obj;
            if (!11T.A0O(this.A07, c2619Gj8.A07) || !11T.A0O(this.A08, c2619Gj8.A08) || !11T.A0O(this.A03, c2619Gj8.A03) || !11T.A0O(this.A09, c2619Gj8.A09) || this.A00 != c2619Gj8.A00 || this.A0E != c2619Gj8.A0E || !11T.A0O(this.A01, c2619Gj8.A01) || !11T.A0O(this.A02, c2619Gj8.A02) || !11T.A0O(this.A0A, c2619Gj8.A0A) || !11T.A0O(this.A05, c2619Gj8.A05) || !11T.A0O(this.A06, c2619Gj8.A06) || this.A0G != c2619Gj8.A0G || this.A0C != c2619Gj8.A0C || this.A0F != c2619Gj8.A0F || this.A0D != c2619Gj8.A0D || !11T.A0O(this.A04, c2619Gj8.A04) || this.A0I != c2619Gj8.A0I || this.A0B != c2619Gj8.A0B || this.A0H != c2619Gj8.A0H) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        int A05 = (((((((((((AnonymousClass002.A05(this.A06, AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A0A, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A01, (((AnonymousClass002.A05(this.A09, (AnonymousClass002.A05(this.A08, 1BL.A03(this.A07)) + AnonymousClass001.A02(this.A03)) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A0E ? 1 : 0)) * 31))) * 31)) + AnonymousClass002.A00(this.A0G ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0C ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0F ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + 4YU.A03(this.A04)) * 31) + 1237) * 31;
        if (this.A0I) {
            i = 1231;
        }
        return ((((A05 + i) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0H ? 1 : 0);
    }
}
