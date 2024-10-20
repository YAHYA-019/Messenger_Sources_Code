package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Dx8.class */
public final class Dx8 extends C1rj {
    public EffectAttribution A00;
    public 1Im A01;
    public MigColorScheme A02;

    public Dx8() {
        super("EffectProfileCardLicenseComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A02;
        EffectAttribution effectAttribution = this.A00;
        1Im r0 = this.A01;
        11T.A0F(r302, 0);
        1BL.A1H(migColorScheme, effectAttribution, r0);
        C1u2 A0I = 4YV.A0I();
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1M(2132279647);
        A01.A0e();
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A0j(1.0f);
        A012.A0S();
        A012.A0l(36.0f);
        A012.A0e();
        C2cm A00 = C2cl.A00(r302);
        A00.A2a(A0I.A03(C1u3.A1Z));
        A00.A2X(migColorScheme.B4h());
        A00.A1M(2132279449);
        A00.A1W(2132279449);
        A00.A2W();
        A00.A1J(2131956298);
        7zR.A1A(A00, new GAa(r302, 40));
        C26z c26z = C26z.BOTTOM;
        A00.A2B(c26z, 2132279379);
        A00.A0c();
        C26z c26z2 = C26z.START;
        2RH r02 = 2RH.A07;
        A00.A27(c26z2, 4YU.A00(r02));
        C26z c26z3 = C26z.TOP;
        A00.A27(c26z3, -4YU.A00(r02));
        A00.A2T(r0);
        A00.A0J();
        C2cl c2cl = A00.A00;
        11T.A0A(c2cl);
        A012.A2f(c2cl);
        2KD A0X = 7zN.A0X(r302, migColorScheme, 0);
        A0X.A2r(2131956302);
        A0X.A2b();
        A0X.A2g();
        A0X.A2X();
        A0X.A0L();
        A0X.A0e();
        7zN.A1T(A012, A0X);
        A012.A2c();
        2RH r03 = 2RH.A06;
        7zO.A1M(A012, r03, c26z3);
        A01.A2e(A012.A00);
        C2ki A002 = C2kV.A00(r302);
        2kW r04 = new 2kW();
        r04.A01 = 1;
        r04.A08 = false;
        A002.A2f(r04.A00());
        A002.A2j(true);
        A002.A2h(true);
        A002.A2i(false);
        7zO.A1K(A002, r03);
        7zO.A1M(A002, 2RH.A04, c26z3);
        4YU.A1O(A002, 2RH.A05, c26z);
        A002.A0k(1.0f);
        7zL.A1K(r302);
        C2he c2he = new C2he();
        c2he.A05 = ImmutableList.copyOf(effectAttribution.mLicenses);
        c2he.A02 = 1LI.A02(r302, Dx8.class, 0S2.A00, "EffectProfileCardLicenseComponent", AnonymousClass001.A1a(effectAttribution.mLicenses.length), 132246060);
        A002.A2d(c2he);
        return 7zL.A0V(A01, A002.A2W());
    }

    /* JADX WARN: Type inference failed for: r0v88, types: [X.2hj, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == -1025242482) {
            1Iw r0 = r302.A00.A00;
            String str = (String) r302.A03[0];
            11T.A0F(r0, 0);
            if (str == null) {
                return null;
            }
            0LS.A0C(r0.A0D, DKE.A0J(str));
            return null;
        }
        if (i != 132246060) {
            return null;
        }
        C2i6 c2i6 = (C2i6) obj;
        1Iv r02 = r302.A00;
        1Is r03 = r02.A01;
        1Iw r04 = r02.A00;
        EffectAttribution.License license = (EffectAttribution.License) c2i6.A01;
        int i2 = c2i6.A00;
        int A08 = 7zO.A08(r302.A03, 0);
        MigColorScheme migColorScheme = ((Dx8) r03).A02;
        int A05 = 7zP.A05(r04, license, 0);
        2cM A01 = 2cK.A01(r04, (String) null, 0);
        A01.A2T(1LI.A0C(r04, Dx8.class, "EffectProfileCardLicenseComponent", new Object[]{license.mUrl}, -1025242482));
        2KD A0X = 7zN.A0X(r04, migColorScheme, 0);
        A0X.A2z(license.mName);
        A0X.A2b();
        A0X.A2f();
        A0X.A2q(A05);
        4YU.A1M(A0X, 2RH.A09);
        A01.A2d(A0X);
        EffectAttribution.AttributedAsset[] attributedAssetArr = license.mAttributedAssets;
        11T.A0A(attributedAssetArr);
        for (EffectAttribution.AttributedAsset attributedAsset : attributedAssetArr) {
            C1rq A012 = C1rg.A01(r04, null, 0);
            A012.A00.A03 = EnumC00743oh.WRAP;
            2KD A0X2 = 7zN.A0X(r04, migColorScheme, 0);
            A0X2.A2z(attributedAsset.mTitle);
            A0X2.A2b();
            A0X2.A2k();
            A0X2.A14(4YU.A00(2RH.A07));
            A012.A2e(A0X2);
            2KD A0X3 = 7zN.A0X(r04, migColorScheme, 0);
            A0X3.A33(new Object[]{attributedAsset.mAuthor}, 2131956288);
            A0X3.A2d();
            A0X3.A2n();
            A012.A2e(A0X3);
            A01.A2d(A012);
        }
        if (i2 < A08 - 1) {
            8A3 A00 = 8A4.A00(r04);
            A00.A2X(migColorScheme);
            7zO.A1I(A00, 2RH.A05);
            A01.A2e(A00.A2W());
        }
        return 7zM.A0t(A01.A00, (C2hj) new Object());
    }
}
