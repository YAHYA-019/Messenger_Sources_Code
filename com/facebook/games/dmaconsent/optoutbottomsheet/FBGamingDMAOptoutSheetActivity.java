package com.facebook.games.dmaconsent.optoutbottomsheet;

import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Im;
import X.1Iw;
import X.2MR;
import X.2cK;
import X.2cM;
import X.3Eh;
import X.3vS;
import X.7zL;
import X.7zO;
import X.7zS;
import X.AbE;
import X.AbstractC2156Dfk;
import X.AbstractC2162Dfq;
import X.AbstractC2178Dg6;
import X.C00i;
import X.C0et;
import X.C2149Dfd;
import X.C2160Dfo;
import X.C2173Dg1;
import X.C2180Dg8;
import X.Cfi;
import X.DKU;
import X.DOD;
import X.DgB;
import X.ELb;
import X.EMb;
import X.ENu;
import X.ERC;
import X.ERE;
import X.EVq;
import X.EnN;
import X.ExT;
import X.F3o;
import X.F7z;
import X.FFw;
import X.Fdw;
import X.GEX;
import X.InterfaceC06574hb;
import android.content.Context;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import java.util.Map;

/* loaded from: FBGamingDMAOptoutSheetActivity.class */
public final class FBGamingDMAOptoutSheetActivity extends FbFragmentActivity {
    public final InterfaceC06574hb A03 = new Fdw(this, 1);
    public final GEX A02 = new Cfi(this, 1);
    public final 1Br A00 = 1Bq.A00(83604);
    public final 1Im A04 = new 3vS(new DKU(this, 10), (Object[]) null, -1);
    public final 1Im A06 = new 3vS(new DKU(this, 12), (Object[]) null, -1);
    public final 1Im A07 = new 3vS(new DKU(this, 13), (Object[]) null, -1);
    public final 1Im A05 = new 3vS(new DKU(this, 11), (Object[]) null, -1);
    public final CallerContext A01 = new CallerContext((ContextChain) null, "FBGamingDMAOptoutSheetActivity", "unknown", "unknown", (Map) null);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        1Im r303;
        super.A2y(bundle);
        1Iw A0W = 7zL.A0W(this);
        AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(A0W);
        abstractC2162Dfq.A0f(2131957157);
        ENu eNu = ENu.A02;
        abstractC2162Dfq.A03 = eNu;
        abstractC2162Dfq.A06 = this.A04;
        if (1Br.A0B(this.A00) == C0et.A0C) {
            C00i c00i = F3o.A00.A00;
            if (1BK.A0M(c00i).AZk(36322001551967227L)) {
                abstractC2162Dfq = new AbstractC2162Dfq(A0W);
                abstractC2162Dfq.A0f(2131957161);
                abstractC2162Dfq.A03 = eNu;
                r303 = this.A06;
            } else {
                String BCy = 1BK.A0M(c00i).BCy(36884951505176095L);
                if (BCy != null && BCy.length() != 0) {
                    abstractC2162Dfq = new AbstractC2162Dfq(A0W);
                    abstractC2162Dfq.A0f(2131957162);
                    abstractC2162Dfq.A03 = eNu;
                    r303 = this.A07;
                }
            }
            abstractC2162Dfq.A06 = r303;
        }
        ExT A00 = FFw.A00(A0W);
        A00.A02 = this;
        2cM A002 = 2cK.A00(A0W);
        2cM A003 = 2cK.A00(A0W);
        A003.A0W();
        A003.A12(16.0f);
        2cM A004 = 2cK.A00(A0W);
        A004.A1A(16.0f);
        A004.A0Q();
        C2173Dg1 A005 = C2173Dg1.A00(A0W);
        A005.A0h(3Eh.A0e);
        ((AbstractC2156Dfk) A005).A03 = ERE.A01;
        ((AbstractC2156Dfk) A005).A02 = ERC.A06;
        ((AbstractC2156Dfk) A005).A04 = 2MR.A01;
        CallerContext callerContext = this.A01;
        7zO.A1C(A004, A003, A005.A0O(callerContext));
        C2160Dfo A006 = EVq.A00(A0W);
        ELb eLb = ELb.A03;
        11T.A0F(eLb, 0);
        A006.A00 = eLb;
        C2180Dg8 c2180Dg8 = new C2180Dg8();
        ((EnN) c2180Dg8).A02 = A0W.A0D(2131957160);
        A006.A0h(new DgB(c2180Dg8));
        EMb eMb = EMb.A03;
        Context A0A = 7zL.A0A(A0W);
        String A0D = A0W.A0D(2131957158);
        A006.A0g(new F7z(eMb, 7zS.A0B(7zS.A0F(A0A, A0D), new DOD(A0A, this, 2), AbE.A00(40), A0W.A0D(2131957157)), false));
        AbstractC2178Dg6.A06(A006).A0Q();
        AbstractC2178Dg6.A07(callerContext, A006, A003);
        2cM A007 = 2cK.A00(A0W);
        A007.A19(16.0f);
        C2149Dfd c2149Dfd = new C2149Dfd(A0W);
        c2149Dfd.A01 = abstractC2162Dfq;
        AbstractC2162Dfq abstractC2162Dfq2 = new AbstractC2162Dfq(A0W);
        abstractC2162Dfq2.A0f(2131957159);
        abstractC2162Dfq2.A03 = ENu.A06;
        abstractC2162Dfq2.A06 = this.A05;
        c2149Dfd.A02 = abstractC2162Dfq2;
        AbstractC2178Dg6.A07(callerContext, c2149Dfd, A007);
        A003.A2d(A007);
        7zL.A1G(A003, A002);
        A00.A0D = A002.A00;
        A00.A07 = this.A03;
        A00.A06 = this.A02;
        A00.A00(callerContext).A04();
    }
}
