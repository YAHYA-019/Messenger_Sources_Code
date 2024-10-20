package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.widget.ImageView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import java.util.List;

/* loaded from: B0a.class */
public final class B0a extends C1rj {
    public static final CAN A04 = new Object();
    public BOX A00;
    public FbUserSession A01;
    public C1706Aqc A02;
    public C1u7 A03;

    public B0a() {
        super("CoplayPrivacyContentTextComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, this.A00, this.A03};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rh c1rh;
        2K3 r314;
        B1t b1t = (B1t) 4YU.A0P(r302);
        FbUserSession fbUserSession = this.A01;
        C1706Aqc c1706Aqc = this.A02;
        C1u7 c1u7 = this.A03;
        BOX box = this.A00;
        SpannableString spannableString = b1t.A00;
        boolean z = b1t.A03;
        List list = b1t.A02;
        String str = b1t.A01;
        int A05 = 7zP.A05(fbUserSession, c1706Aqc, 1);
        11T.A0F(c1u7, 3);
        if (!BTP.A00(c1706Aqc) || list == null) {
            C6J A02 = ((CNQ) 7zQ.A12(r302, 85227)).A02(BOk.A0D, fbUserSession);
            A02.A01 = box;
            A02.A03 = c1706Aqc.A0k();
            A02.A00();
            return null;
        }
        Context context = r302.A0D;
        MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0k(context, 16980);
        C1u2 A0I = 4YV.A0I();
        Object A03 = 1Bi.A03(6);
        FFo fFo = (FFo) 7zN.A0k(context, 67677);
        Object A042 = 1Lo.A04(context, fbUserSession, (1BY) null, 85234);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        2KD A012 = 2K3.A01(r302, 0);
        A012.A17(12.0f);
        C1ro c1ro = C1ro.CENTER;
        A012.A1y(c1ro);
        A012.A2z(spannableString);
        A012.A2x(migColorScheme);
        A012.A2w(c1u7);
        A012.A2i();
        A012.A2X();
        4YU.A1K(A01, A012);
        11T.A0F(fFo, A05);
        7zS.A17(3, A0I, migColorScheme, A042);
        if (FFo.A00(fFo).AZk(36313905540963530L)) {
            C1rq A013 = C1rg.A01(r302, null, 0);
            A013.A2h(c1ro);
            A013.A1y(c1ro);
            AbG.A1N(A013, r302, B0a.class, "CoplayPrivacyContentTextComponent", 1210675927);
            A013.A2T(1LI.A0C(r302, B0a.class, "CoplayPrivacyContentTextComponent", new Object[]{c1706Aqc, migColorScheme, A042, Boolean.valueOf(z), list, str}, 1604457100));
            C2cm A00 = C2cl.A00(r302);
            7zN.A18(A00, C1u3.A1q, A0I);
            A00.A2X(migColorScheme.AZc());
            A00.A0z(16.0f);
            A00.A0l(16.0f);
            A00.A2c(ImageView.ScaleType.FIT_XY);
            A013.A2e(A00);
            2KD A014 = 2K3.A01(r302, 0);
            7zN.A1F(r302, A014, 2131955091);
            A014.A2i();
            A014.A2w(C1u7.A06);
            A014.A2x(migColorScheme);
            7zN.A1T(A013, A014);
            c1rh = A013.A00;
        } else {
            c1rh = null;
        }
        A01.A2e(c1rh);
        2JX A0u = c1706Aqc.A0u();
        if (A0u != null && A0u.hasFieldValue(755439261) && A0u.getBooleanValue(755439261)) {
            String A0D = r302.A0D(2131955079);
            String A0D2 = r302.A0D(2131955077);
            String A0D3 = r302.A0D(2131955078);
            11T.A0F(A03, A05);
            C1357Aez c1357Aez = new C1357Aez(r302, A03, migColorScheme, "https://www.facebook.com/legal/Gaming_EEA_Disclosure", 1);
            C1357Aez c1357Aez2 = new C1357Aez(r302, A03, migColorScheme, "https://www.facebook.com/legal/Gaming_EU_Resident_Disclosure", 1);
            0Dc A0F = 7zS.A0F(context, A0D);
            A0F.A05(c1357Aez, "[[ndfc-eea-link]]", A0D2, 33);
            A0F.A05(c1357Aez2, "[[ndfc-eu-resident-link]]", A0D3, 33);
            2KD A015 = 2K3.A01(r302, 0);
            A015.A17(12.0f);
            A015.A1y(c1ro);
            A015.A2z(7zM.A0E(A0F));
            A015.A2x(migColorScheme);
            A015.A2w(c1u7);
            A015.A2i();
            A015.A2X();
            r314 = A015.A2W();
        } else {
            r314 = null;
        }
        return 7zL.A0V(A01, r314);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 1210675927) {
            1Iv r0 = r302.A00;
            1Is r02 = r0.A01;
            1Iw r03 = r0.A00;
            B0a b0a = (B0a) r02;
            BOX box = b0a.A00;
            C1706Aqc c1706Aqc = b0a.A02;
            4YV.A1N(r03, c1706Aqc);
            Context context = r03.A0D;
            C6J A03 = ((CNQ) 7zN.A0k(context, 85227)).A03(1Fw.A01(context));
            A03.A01 = box;
            A03.A00 = BOh.A0D;
            A03.A03 = c1706Aqc.A0k();
            A03.A00();
            return null;
        }
        if (i != 1604457100) {
            return null;
        }
        1Iv r04 = r302.A00;
        1Is r05 = r04.A01;
        1Iw r06 = r04.A00;
        Object[] objArr = r302.A03;
        C1706Aqc c1706Aqc2 = (C1706Aqc) objArr[0];
        MigColorScheme migColorScheme = (MigColorScheme) objArr[1];
        CNU cnu = (CNU) objArr[2];
        boolean A1Z = 7zO.A1Z(objArr, 3);
        List list = (List) objArr[4];
        String str = (String) objArr[5];
        BOX box2 = ((B0a) r05).A00;
        int A05 = 7zP.A05(r06, c1706Aqc2, 0);
        11T.A0F(cnu, 4);
        Context context2 = r06.A0D;
        C6J A02 = ((CNQ) 7zN.A0k(context2, 85227)).A02(BOk.A01, 1Fw.A01(context2));
        A02.A01 = box2;
        A02.A00 = BOh.A0D;
        A02.A03 = c1706Aqc2.A0k();
        A02.A00();
        Activity A00 = 0Dg.A00(context2);
        if (A00 == null) {
            return null;
        }
        1Iw A0W = 7zL.A0W(5YG.A01(context2));
        ExT A002 = FFw.A00(A0W);
        A002.A02 = A00;
        A002.A0F = true;
        C1rq A01 = C1rg.A01(A0W, null, 0);
        A01.A25(C26z.ALL, 8.0f);
        A01.A0L();
        A01.A2c();
        2KD A0X = 7zN.A0X(A0W, migColorScheme, 0);
        A0X.A2z(c1706Aqc2.A0j());
        A0X.A2e();
        A0X.A2g();
        A0X.A2Y();
        7zN.A1T(A01, A0X);
        A002.A0E = A01.A00;
        QC6 qc6 = new QC6(A0W, new QMx());
        QMx qMx = qc6.A01;
        qMx.A00 = c1706Aqc2;
        BitSet bitSet = qc6.A02;
        bitSet.set(0);
        qMx.A04 = A1Z;
        bitSet.set(A05);
        qMx.A02 = str;
        bitSet.set(3);
        qMx.A03 = list;
        bitSet.set(4);
        qMx.A01 = new C2k(r06, cnu);
        bitSet.set(1);
        C1rs.A05(bitSet, qc6.A03, 5);
        qc6.A0J();
        A002.A0D = qMx;
        A002.A07 = Cfj.A00;
        A002.A00(CallerContext.A0B("CoplayEditPermissionsComponent")).A04();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        if (r311 == null) goto L8;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1N(X.1Iw r302, X.2Yv r303) {
        /*
            r301 = this;
            r0 = r303
            X.B1t r0 = (X.B1t) r0
            r303 = r0
            r0 = r301
            X.Aqc r0 = r0.A02
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r304
            boolean r0 = X.7zP.A1Z(r0)
            r307 = r0
            r0 = r302
            android.content.Context r0 = X.7zL.A0A(r0)
            r308 = r0
            r0 = r304
            X.2JX r0 = r0.A0u()
            r309 = r0
            r0 = 0
            r310 = r0
            r0 = r309
            if (r0 == 0) goto L4e
            r0 = r309
            X.2JX r0 = r0.A1a()
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L4e
            r0 = 109264468(0x6833e54, float:4.9368306E-35)
            r305 = r0
            r0 = r311
            r1 = r305
            com.google.common.collect.ImmutableList r0 = r0.A0Z(r1)
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L53
        L4e:
            X.0ty r0 = X.C0ty.A00
            r311 = r0
        L53:
            r0 = 38
            r305 = r0
            r0 = r305
            java.lang.String r0 = X.DKB.A00(r0)
            r312 = r0
            r0 = r308
            r1 = r304
            r2 = r312
            r3 = r311
            r4 = r307
            android.text.SpannableString r0 = X.CAN.A00(r0, r1, r2, r3, r4)
            r308 = r0
            r0 = r309
            if (r0 == 0) goto L97
            r0 = r309
            X.2JX r0 = r0.A1a()
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L97
            r0 = 109264468(0x6833e54, float:4.9368306E-35)
            r305 = r0
            r0 = r311
            r1 = r305
            com.google.common.collect.ImmutableList r0 = r0.A0Z(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L97
            r0 = r306
            java.util.ArrayList r0 = X.1BK.A17(r0)
            r310 = r0
        L97:
            r0 = r303
            r1 = r308
            r0.A00 = r1
            r0 = r303
            r1 = r307
            r0.A03 = r1
            r0 = r303
            r1 = r310
            r0.A02 = r1
            r0 = r303
            r1 = r312
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0a.A1N(X.1Iw, X.2Yv):void");
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
