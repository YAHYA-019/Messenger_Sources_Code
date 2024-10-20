package X;

/* renamed from: X.Day, reason: case insensitive filesystem */
/* loaded from: Day.class */
public final class C2073Day extends 1RM {
    public final /* synthetic */ FHD A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C2073Day(FHD fhd, String str, String str2, boolean z, boolean z2) {
        this.A00 = fhd;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A02 = str2;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        2JY A0B;
        C2250Di6 c2250Di6;
        2JX A0M;
        2JY A0B2;
        2JY A0B3;
        DkU A0M2;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        11T.A0F(abstractC08294mh, 0);
        FHD fhd = this.A00;
        boolean A02 = FHD.A02(fhd, this.A04, this.A03);
        2JY r0 = (2JY) abstractC08294mh.A03;
        if (A02) {
            if (r0 == null || (A0B2 = 1BK.A0B(r0, DiC.class, 666631660, -687329746)) == null || (A0B3 = 1BK.A0B(A0B2, C2251Di7.class, -1635691518, 1085932985)) == null || (A0M2 = A0B3.A0M(-2001937414, DkU.class, 1015453512)) == null) {
                return;
            }
            fhd.A05 = new EmB(A0M2, this.A01, this.A02);
            Ew5 ew5 = fhd.A06;
            if (ew5 != null) {
                ew5.A00(A0M2);
                return;
            }
            return;
        }
        if (r0 == null || (A0B = 1BK.A0B(r0, DiC.class, 666631660, -687329746)) == null) {
            return;
        }
        2JY A0B4 = 1BK.A0B(A0B, C2253Di9.class, 1080452988, 1064323692);
        2JY r308 = null;
        Dky A0P = A0B4 != null ? DKG.A0P(A0B4) : null;
        2JY A0B5 = 1BK.A0B(A0B, C2252Di8.class, 94431075, -1962575040);
        if (A0B5 != null) {
            c2250Di6 = (C2250Di6) A0B5.A0M(69956432, C2250Di6.class, -1060643098);
            if (c2250Di6 != null) {
                r308 = 1BK.A0B(c2250Di6, C2249Di5.class, 883555422, 1125496911);
            }
        } else {
            c2250Di6 = null;
        }
        if (A0P == null || r308 == null) {
            return;
        }
        fhd.A04 = new Ep0(DKI.A0B(A0B, DiA.class, -2035993834, 1202326070), A0P, c2250Di6, this.A01, this.A02);
        fhd.A07 = r308.A0r(-77796550);
        fhd.A08 = !r308.getBooleanValue(-1575811850);
        2JY A0B6 = 1BK.A0B(A0B, DiB.class, -2052810813, 1847509262);
        if (A0B6 != null && (A0M = A0B6.A0M(-650232105, 2JX.class, -988564847)) != null) {
            4YV.A11(fhd.A0J).execute(new G2n(A0M, fhd));
        }
        Ew5 ew52 = fhd.A06;
        if (ew52 != null) {
            DZV dzv = ew52.A00;
            dzv.A00 = A0P;
            DZV.A03(dzv, false);
            Ew5 ew53 = fhd.A06;
            if (ew53 != null) {
                ew53.A01(c2250Di6);
            }
        }
    }

    public void A03(Throwable th) {
        Ew5 ew5 = this.A00.A06;
        if (ew5 != null) {
            DZV.A03(ew5.A00, true);
        }
    }
}
