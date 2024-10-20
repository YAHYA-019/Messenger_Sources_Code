package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.87g, reason: invalid class name */
/* loaded from: 87g.class */
public final class C87g extends C04v {
    public final int A00;
    public final int A01;
    public final C70t A02;
    public final C6yo A03;
    public final 2Og A04;
    public final 87M A05;
    public final 6oP A06;
    public final Function1 A07;
    public final Function2 A08;
    public final 0Be A09;
    public final boolean A0A;
    public final boolean A0B;

    public C87g(C70t c70t, C6yo c6yo, 2Og r304, 87M r305, 6oP r306, Function1 function1, Function2 function2, 0Be r309, int i, int i2, boolean z, boolean z2) {
        11T.A0F(r305, 1);
        1BK.A1L(function1, 6, c6yo);
        11T.A0F(c70t, 10);
        this.A05 = r305;
        this.A01 = i;
        this.A00 = i2;
        this.A0A = z;
        this.A0B = z2;
        this.A07 = function1;
        this.A03 = c6yo;
        this.A04 = r304;
        this.A02 = c70t;
        this.A06 = r306;
        this.A08 = function2;
        this.A09 = r309;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C87g)) {
                return false;
            }
            C87g c87g = (C87g) obj;
            if (this.A05 != c87g.A05 || this.A01 != c87g.A01 || this.A00 != c87g.A00 || this.A0A != c87g.A0A || this.A0B != c87g.A0B || !11T.A0O(this.A07, c87g.A07) || !11T.A0O(this.A03, c87g.A03) || !11T.A0O(this.A04, c87g.A04) || !11T.A0O(this.A02, c87g.A02) || !11T.A0O(this.A06, c87g.A06) || !11T.A0O(this.A08, c87g.A08) || !11T.A0O(this.A09, c87g.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A05(this.A02, (AnonymousClass002.A05(this.A03, (AnonymousClass002.A05(this.A07, (((((((1BL.A03(this.A05) + this.A01) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + 1237) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A08)) * 31) + 4YU.A03(this.A09);
    }
}
