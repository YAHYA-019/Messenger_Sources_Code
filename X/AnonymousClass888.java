package X;

import java.util.List;

/* renamed from: X.888, reason: invalid class name */
/* loaded from: 888.class */
public final class AnonymousClass888 extends C04v {
    public final float A00;
    public final int A01;
    public final C6ni A02;
    public final 7LX A03;
    public final 7LX A04;
    public final 8Jo A05;
    public final 88A A06;
    public final C1ro A07;
    public final C1rp A08;
    public final Boolean A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final List A0K;
    public final List A0L;
    public final java.util.Map A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public AnonymousClass888(C6ni c6ni, 7LX r303, 7LX r304, 8Jo r305, 88A r306, C1ro c1ro, C1rp c1rp, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, java.util.Map map, float f, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        7zP.A1O(str, 1, list);
        11T.A0F(list2, 24);
        11T.A0F(r306, 25);
        this.A0H = str;
        this.A0F = str2;
        this.A09 = bool;
        this.A0J = str3;
        this.A0I = str4;
        this.A0D = str5;
        this.A01 = i;
        this.A0G = str6;
        this.A05 = r305;
        this.A0A = num;
        this.A0K = list;
        this.A0E = str7;
        this.A03 = r303;
        this.A04 = r304;
        this.A0O = z;
        this.A0Q = z2;
        this.A0N = z3;
        this.A0C = num2;
        this.A00 = f;
        this.A02 = c6ni;
        this.A07 = c1ro;
        this.A08 = c1rp;
        this.A0B = num3;
        this.A0L = list2;
        this.A06 = r306;
        this.A0M = map;
        this.A0P = z4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass888)) {
                return false;
            }
            AnonymousClass888 anonymousClass888 = (AnonymousClass888) obj;
            if (!11T.A0O(this.A0H, anonymousClass888.A0H) || !11T.A0O(this.A0F, anonymousClass888.A0F) || !11T.A0O(this.A09, anonymousClass888.A09) || !11T.A0O(this.A0J, anonymousClass888.A0J) || !11T.A0O(this.A0I, anonymousClass888.A0I) || !11T.A0O(this.A0D, anonymousClass888.A0D) || this.A01 != anonymousClass888.A01 || !11T.A0O(this.A0G, anonymousClass888.A0G) || !11T.A0O(this.A05, anonymousClass888.A05) || !11T.A0O(this.A0A, anonymousClass888.A0A) || !11T.A0O(this.A0K, anonymousClass888.A0K) || !11T.A0O(this.A0E, anonymousClass888.A0E) || !11T.A0O(this.A03, anonymousClass888.A03) || !11T.A0O(this.A04, anonymousClass888.A04) || this.A0O != anonymousClass888.A0O || this.A0Q != anonymousClass888.A0Q || this.A0N != anonymousClass888.A0N || this.A0C != anonymousClass888.A0C || Float.compare(this.A00, anonymousClass888.A00) != 0 || !11T.A0O(this.A02, anonymousClass888.A02) || this.A07 != anonymousClass888.A07 || this.A08 != anonymousClass888.A08 || !11T.A0O(this.A0B, anonymousClass888.A0B) || !11T.A0O(this.A0L, anonymousClass888.A0L) || this.A06 != anonymousClass888.A06 || !11T.A0O(this.A0M, anonymousClass888.A0M) || this.A0P != anonymousClass888.A0P) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04;
        int A05 = (((((((((((AnonymousClass002.A05(this.A0K, (((((((((((((((((4YV.A02(this.A0H) + 1BL.A05(this.A0F)) * 31) + AnonymousClass001.A02(this.A09)) * 31) + 1BL.A05(this.A0J)) * 31) + 1BL.A05(this.A0I)) * 31) + 1BL.A05(this.A0D)) * 31) + this.A01) * 31) + 1BL.A05(this.A0G)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A0A)) * 31) + 1BL.A05(this.A0E)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass002.A00(this.A0O ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0Q ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0N ? 1 : 0)) * 31;
        Integer num = this.A0C;
        if (num == null) {
            A04 = 0;
        } else {
            int intValue = num.intValue();
            A04 = 7zM.A04(1 != intValue ? "LOADING" : "ERROR", intValue);
        }
        return ((AnonymousClass002.A05(this.A06, AnonymousClass002.A05(this.A0L, (AnonymousClass002.A05(this.A08, AnonymousClass002.A05(this.A07, (1BL.A00((A05 + A04) * 31, this.A00) + AnonymousClass001.A02(this.A02)) * 31)) + AnonymousClass001.A02(this.A0B)) * 31)) + 4YU.A03(this.A0M)) * 31) + AnonymousClass002.A00(this.A0P ? 1 : 0);
    }
}
