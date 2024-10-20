package X;

import com.facebook.iabbwpextension.IABBwPExtension;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: DqM.class */
public final class DqM extends C04v {
    public final int A00 = 3;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public DqM(9Nm r302, String str, String str2, String str3, String str4) {
        this.A01 = r302;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public DqM(IABBwPExtension iABBwPExtension) {
        this(iABBwPExtension.A01, iABBwPExtension.A05, iABBwPExtension.A03, iABBwPExtension.A04, iABBwPExtension.A06);
    }

    public DqM(ImmutableMap immutableMap, String str, String str2, String str3) {
        this(immutableMap, str, str2, str3, (String) null);
    }

    public DqM(ImmutableMap immutableMap, String str, String str2, String str3, String str4) {
        7zR.A1N(str, str3);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A01 = immutableMap;
        this.A04 = str4;
    }

    public DqM(Integer num, String str, String str2, String str3, String str4) {
        11T.A0F(num, 1);
        this.A01 = num;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
    }

    public DqM(String str, String str2, String str3, String str4, List list) {
        11T.A0F(str, 1);
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A01 = list;
    }

    public DqM(String str, String str2, String str3, List list) {
        11T.A0G(str, 1, str2);
        11T.A0F(list, 4);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = list;
        this.A05 = 4YV.A0t(";", list, (Function1) null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DqM.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int hashCode() {
        int A05;
        String str;
        int A07;
        int A052;
        switch (this.A00) {
            case 0:
                Integer num = (Integer) this.A01;
                A05 = (((((C3o5.A05(num, EW1.A00(num)) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A03)) * 31;
                str = this.A05;
                return A05 + 7zN.A05(str);
            case 1:
                A07 = AnonymousClass002.A07(this.A04, 4YV.A02(this.A03));
                A052 = 1BL.A05(this.A02);
                return 1BK.A03(this.A01, (A07 + A052) * 31);
            case 2:
                A05 = (AnonymousClass002.A07(this.A05, (4YV.A02(this.A02) + 1BL.A05(this.A03)) * 31) + AnonymousClass001.A02(this.A01)) * 31;
                str = this.A04;
                return A05 + 7zN.A05(str);
            case 3:
            default:
                return super.hashCode();
            case 4:
                A052 = (((4YV.A02(this.A04) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A03)) * 31;
                A07 = 7zN.A05(this.A05);
                return 1BK.A03(this.A01, (A07 + A052) * 31);
        }
    }

    public String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BwPAdsInfo(bwPType=");
        Integer num = (Integer) this.A01;
        A0k.append(num != null ? EW1.A00(num) : "null");
        A0k.append(", initialUrl=");
        A0k.append(this.A04);
        A0k.append(", apiKey=");
        A0k.append(this.A02);
        A0k.append(", bauProductUrl=");
        A0k.append(this.A03);
        A0k.append(", pageName=");
        return DKH.A0o(this.A05, A0k);
    }
}
