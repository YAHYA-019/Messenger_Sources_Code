package X;

import java.util.List;

/* loaded from: Ktt.class */
public final class Ktt {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public java.util.Map A0K;
    public java.util.Map A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;

    public static void A00(Ktt ktt, List list) {
        ktt.A02("num_contact_entries", String.valueOf(list.size()));
    }

    public final L2l A01() {
        String str = this.A0I;
        String str2 = this.A0B;
        String str3 = this.A0G;
        String str4 = this.A0F;
        String str5 = this.A06;
        String str6 = this.A07;
        String str7 = this.A0C;
        String str8 = this.A08;
        String str9 = this.A0D;
        String str10 = this.A0A;
        String str11 = this.A09;
        String str12 = this.A0H;
        String str13 = this.A0E;
        boolean z = this.A0P;
        long j = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        long j2 = this.A03;
        java.util.Map map = this.A0K;
        String str14 = this.A0J;
        boolean z2 = this.A0O;
        boolean z3 = this.A0N;
        return new L2l(this.A04, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, this.A05, map, this.A0L, i, i2, j, j2, z, z2, z3, this.A0M);
    }

    public final void A02(String str, String str2) {
        11T.A0H(str, str2);
        java.util.Map map = this.A0K;
        if (map == null) {
            map = AnonymousClass001.A0u();
            this.A0K = map;
        }
        map.put(str, str2);
    }

    public final void A03(java.util.Map map) {
        java.util.Map map2 = this.A0K;
        if (map2 == null) {
            map2 = AnonymousClass001.A0u();
            this.A0K = map2;
        }
        map2.putAll(map);
    }
}
