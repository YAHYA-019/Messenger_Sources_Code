package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.Gj7, reason: case insensitive filesystem */
/* loaded from: Gj7.class */
public final class C2618Gj7 extends C04v {
    public final 91G A00;
    public final HXb A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final C00m A05;
    public final C00m A06;
    public final Function1 A07;
    public final boolean A08;

    public C2618Gj7(91G r302, HXb hXb, String str, String str2, String str3, C00m c00m, C00m c00m2, Function1 function1, boolean z) {
        7zR.A1N(str, str3);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = r302;
        this.A05 = c00m;
        this.A01 = hXb;
        this.A07 = function1;
        this.A08 = z;
        this.A06 = c00m2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2618Gj7)) {
                return false;
            }
            C2618Gj7 c2618Gj7 = (C2618Gj7) obj;
            if (!11T.A0O(this.A02, c2618Gj7.A02) || !11T.A0O(this.A03, c2618Gj7.A03) || !11T.A0O(this.A04, c2618Gj7.A04) || !11T.A0O(this.A00, c2618Gj7.A00) || !11T.A0O(this.A05, c2618Gj7.A05) || !11T.A0O(this.A01, c2618Gj7.A01) || !11T.A0O(this.A07, c2618Gj7.A07) || this.A08 != c2618Gj7.A08 || !11T.A0O(this.A06, c2618Gj7.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A07, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A00, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A03, 4YV.A02(this.A02))))))) + AnonymousClass002.A00(this.A08 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A06);
    }
}
