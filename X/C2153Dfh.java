package X;

import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.Dfh, reason: case insensitive filesystem */
/* loaded from: Dfh.class */
public final class C2153Dfh extends AbstractC2178Dg6 {
    public ENk A00;
    public ENt A01;
    public REK A02;
    public 1Im A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final C1qo A08;

    public C2153Dfh(1Iw r302) {
        super(r302);
        this.A00 = ENk.A02;
        this.A08 = r302.A0E;
    }

    public static C1rq A00(EzJ ezJ, ENk eNk, 1Iw r303, String str) {
        2MR r0 = eNk.iconColor;
        2MR r02 = eNk.textColor;
        C2173Dg1 A00 = C2173Dg1.A00(r303);
        A00.A0h(3Eh.A4q);
        ((AbstractC2156Dfk) A00).A03 = ERE.A01;
        ((AbstractC2156Dfk) A00).A02 = ERC.A03;
        C2173Dg1 A0g = A00.A0g(r0);
        A0g.A0X(C26z.TOP, -8.0f);
        C26z c26z = C26z.BOTTOM;
        A0g.A0X(c26z, -4.0f);
        C1rs ACp = A0g.ACp(ezJ);
        C1rq A0L = AbJ.A0L(r303);
        A0L.A2b();
        if (ACp == null) {
            ACp = null;
        } else {
            ACp.A15(8.0f);
        }
        A0L.A2e(ACp);
        A0L.A2Q(AnonymousClass524.A00(r303.A0D));
        C2152Dfg c2152Dfg = new C2152Dfg(r303);
        if (str == null) {
            ((ESq) c2152Dfg).A00 = true;
        }
        c2152Dfg.A05 = str;
        AbstractC2178Dg6.A0C(r02, c2152Dfg, AbstractC2178Dg6.A05(c2152Dfg, EP4.A04));
        c2152Dfg.A0h(c26z, 4.0f);
        A0L.A2e(c2152Dfg.ACp(ezJ));
        return A0L;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        2cL r304;
        REK rek;
        this.A01.getClass();
        Object A0B = 1Br.A0B(A0M().A01);
        C1rs c1rs = null;
        if (A0B == null) {
            return null;
        }
        if (this.A03 != null) {
            C1qo c1qo = this.A08;
            String str = this.A07;
            String str2 = this.A05;
            if (str2 == null) {
                String A0D = c1qo.A0D(2131956699);
                str2 = (TextUtils.isEmpty(str) || TextUtils.isEmpty(A0D)) ? c1qo.A0D(2131956700) : StringFormatUtil.formatStrLocaleSafe(A0D, str);
            }
            if (str2 == null) {
                rek = null;
            } else {
                AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(super.A04);
                abstractC2162Dfq.A0h(str2);
                abstractC2162Dfq.A06 = this.A03;
                abstractC2162Dfq.A02 = ENn.A02;
                abstractC2162Dfq.A04 = ENO.A02;
                rek = new REK(abstractC2162Dfq);
            }
            this.A02 = rek;
        }
        EvK A02 = ezJ.A02();
        ELb eLb = ELb.A03;
        A02.A02 = eLb;
        EzJ A00 = A02.A00();
        2MR r0 = this.A00.textColor;
        1Iw r02 = super.A04;
        2cM A0M = 7zN.A0M(r02, "FDSFailedLoadingState");
        A0M.A0S();
        A0M.A2c();
        C1ro c1ro = C1ro.CENTER;
        A0M.A2g(c1ro);
        A0M.A2f(c1ro);
        float f = 24.0f;
        A0M.A1C(24.0f);
        A0M.A2O(false);
        A0M.A1H(A00.A00(this.A00.backgroundColor));
        ENt eNt = this.A01;
        ENk eNk = this.A00;
        8Sk A002 = 8oJ.A00(r02);
        8oJ r03 = A002.A00;
        r03.A06 = "fds";
        r03.A05 = "fds-failed-loading-state";
        A002.A2W(eNt.mIconResId);
        A002.A2X(new Dpw(0, A0B, A00, eNk, eNt));
        A002.A0z(112.0f);
        A002.A0l(112.0f);
        A002.A0J();
        A0M.A2e(A002.A00);
        C2160Dfo A003 = EVq.A00(r02);
        11T.A0F(eLb, 0);
        A003.A00 = eLb;
        C1qo c1qo2 = this.A08;
        ENt eNt2 = this.A01;
        String str3 = this.A07;
        String str4 = this.A06;
        if (str4 == null) {
            String A0D2 = c1qo2.A0D(eNt2.mSpecificTitleResId);
            str4 = (TextUtils.isEmpty(str3) || TextUtils.isEmpty(A0D2)) ? c1qo2.A0D(eNt2.mTitleResId) : StringFormatUtil.formatStrLocaleSafe(A0D2, str3);
        }
        str4.getClass();
        A003.A06 = str4;
        FAa A004 = FAa.A00();
        A004.A06(r0);
        A004.A04();
        A003.A0k(A004);
        A003.A0A = true;
        A003.A0B = false;
        ENt eNt3 = this.A01;
        String str5 = this.A04;
        if (TextUtils.isEmpty(str5)) {
            str5 = c1qo2.A0D(eNt3.mBodyResId);
        }
        str5.getClass();
        A003.A05 = str5;
        FAa A005 = FAa.A00();
        A005.A06(r0);
        A005.A04();
        A003.A0j(A005);
        C26z c26z = C26z.TOP;
        A003.A0X(c26z, 20.0f);
        AbstractC2178Dg6.A0B(A003, ((AbstractC2178Dg6) A003).A05, C26z.BOTTOM, 4.0f);
        AbstractC2178Dg6.A06(A003).A2Q(AnonymousClass524.A00(r02.A0D));
        A0M.A2d(A003.ACp(A00));
        ENk eNk2 = this.A00;
        ENt eNt4 = this.A01;
        ENt eNt5 = ENt.A02;
        C1rq c1rq = null;
        if (eNt4 == eNt5) {
            String A0D3 = c1qo2.A0D(2131956687);
            String A0D4 = c1qo2.A0D(2131956688);
            2cM A01 = 2cK.A01(r02, (String) null, 0);
            A01.A24(c26z, 28.0f);
            A01.A2d(TextUtils.isEmpty(A0D3) ? null : A00(A00, eNk2, r02, A0D3));
            if (!TextUtils.isEmpty(A0D4)) {
                c1rq = A00(A00, eNk2, r02, A0D4);
                float f2 = 20.0f;
                if (TextUtils.isEmpty(A0D3)) {
                    f2 = 0.0f;
                }
                c1rq.A24(c26z, f2);
            }
            A01.A2d(c1rq);
            r304 = A01.A00;
        } else {
            r304 = null;
        }
        A0M.A2e(r304);
        REK rek2 = this.A02;
        if (rek2 != null) {
            GKV gkv = rek2.A00;
            if (this.A01 != eNt5) {
                f = 16.0f;
            }
            gkv.BcJ(c26z, f);
            c1rs = gkv.ACp(A00);
        }
        A0M.A2d(c1rs);
        return A0M;
    }
}
