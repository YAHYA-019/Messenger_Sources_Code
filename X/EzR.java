package X;

import java.util.Set;

/* loaded from: EzR.class */
public final class EzR {
    public final GJj A00;
    public final GJj A01;
    public final GJj A02;
    public final GJj A03;
    public final String A04;
    public final java.util.Map A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public EzR(GJj gJj, GJj gJj2, GJj gJj3, GJj gJj4, String str, java.util.Map map, Set set, boolean z, boolean z2) {
        this.A04 = str;
        this.A00 = gJj;
        this.A03 = gJj2;
        this.A02 = gJj3;
        this.A06 = set;
        this.A05 = map;
        this.A01 = gJj4;
        this.A07 = z;
        this.A08 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EzR)) {
                return false;
            }
            EzR ezR = (EzR) obj;
            if (!11T.A0O(this.A04, ezR.A04) || !11T.A0O(this.A00, ezR.A00) || !11T.A0O(this.A03, ezR.A03) || !11T.A0O(this.A02, ezR.A02) || !11T.A0O(this.A06, ezR.A06) || !11T.A0O(this.A05, ezR.A05) || !11T.A0O(this.A01, ezR.A01) || this.A07 != ezR.A07 || this.A08 != ezR.A08) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass002.A05(this.A00, 4YV.A02(this.A04)) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + 4YU.A03(this.A01)) * 31) + AnonymousClass002.A00(this.A07 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A08 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ScopedBloksComponentQueryDefinition(id=");
        A0k.append(this.A04);
        A0k.append(", appIdExpression=");
        A0k.append(this.A00);
        A0k.append(", paramsExpression=");
        A0k.append(this.A03);
        A0k.append(", clientParamsExpression=");
        A0k.append(this.A02);
        A0k.append(", dependencies=");
        A0k.append(this.A06);
        A0k.append(", targets=");
        A0k.append(this.A05);
        A0k.append(", cacheTTLExpression=");
        A0k.append(this.A01);
        A0k.append(", isDiskCacheEnabled=");
        A0k.append(this.A07);
        A0k.append(", isScoped=");
        return DKH.A0q(A0k, this.A08);
    }
}
