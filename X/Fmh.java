package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.model.P2pThemeOrGiftWrap;
import com.facebook.payments.p2p.paypal.PaypalFundingOptionPaymentMethod;
import com.facebook.payments.p2p.service.model.transactions.SendPaymentMessageParams;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fmh.class */
public final class Fmh implements GOL {
    public 1BY A00;
    public RTb A02;
    public final C00i A07 = 1BQ.A02(98927);
    public final C00i A0A = 1BQ.A02(Constants.LOAD_RESULT_PGO);
    public final C00i A03 = 1BV.A01((1BY) null, 83719);
    public final C00i A06 = DKD.A0P();
    public final C00i A08 = AbH.A0F();
    public final C00i A04 = 1BV.A01((1BY) null, 99425);
    public final C00i A09 = AbH.A0T();
    public final C00i A05 = AbH.A0S();
    public GFf A01 = new Fmt(this);
    public final C15h A0B = G7K.A01(this, 92);

    public Fmh(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public static ListenableFuture A00(Intent intent, Fmh fmh, int i) {
        FbFragmentActivity A0O = DKE.A0O(1BK.A04(fmh.A03));
        if (A0O == null) {
            return 1Kd.A0A(RYs.A00(false));
        }
        ?? A0j = 4YU.A0j();
        A0O.A5D(new C2056Dah(fmh, A0j, i));
        1BK.A0W().A09(A0O, intent, i);
        return A0j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.Er2, java.lang.Object] */
    @Override // X.GOL
    public ListenableFuture Bz7(Context context, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, String str) {
        ImmutableList immutableList = p2pPaymentData.A06;
        if (immutableList.isEmpty()) {
            return new 7hZ(AbF.A1D("No recipient"));
        }
        FbUserSession A0D = 4YV.A0D(context);
        PaypalFundingOptionPaymentMethod paypalFundingOptionPaymentMethod = p2pPaymentData.A04;
        String str2 = null;
        EfQ efQ = (EfQ) 1Lo.A04((Context) null, A0D, this.A00, 99226);
        ?? obj = new Object();
        obj.A06 = AnonymousClass001.A0b(paypalFundingOptionPaymentMethod != null ? paypalFundingOptionPaymentMethod.getId() : null, efQ.A00);
        obj.A00 = p2pPaymentData.A00();
        obj.A07 = p2pPaymentData.A0A;
        obj.A04 = p2pPaymentData.A08;
        obj.A0E = p2pPaymentData.A0D;
        obj.A08 = (paypalFundingOptionPaymentMethod == null || paypalFundingOptionPaymentMethod.BHR() != ERI.A06) ? null : paypalFundingOptionPaymentMethod.A00.A00;
        obj.A03 = p2pPaymentData.A05;
        obj.A0B = p2pPaymentData.A0B;
        String str3 = p2pPaymentConfig.A0N;
        if (TextUtils.isEmpty(str3)) {
            this.A0A.get();
            str3 = 4YU.A0s();
        }
        obj.A0C = str3;
        obj.A01 = DM3.A0M;
        obj.A0D = p2pPaymentData.A0C;
        obj.A0F = p2pPaymentData.A0E;
        obj.A0G = ((User) 1BK.A0r(immutableList)).A13;
        obj.A0I = paypalFundingOptionPaymentMethod == null ? null : paypalFundingOptionPaymentMethod.BHR() == ERI.A06 ? paypalFundingOptionPaymentMethod.A01.id : paypalFundingOptionPaymentMethod.getId();
        P2pThemeOrGiftWrap p2pThemeOrGiftWrap = p2pPaymentData.A03;
        obj.A0J = p2pThemeOrGiftWrap != null ? p2pThemeOrGiftWrap.A01 : null;
        obj.A0K = p2pThemeOrGiftWrap != null ? p2pThemeOrGiftWrap.A02 : null;
        if (p2pThemeOrGiftWrap != null && p2pThemeOrGiftWrap.A00 == Qnz.A01) {
            str2 = p2pThemeOrGiftWrap.A02;
        }
        obj.A09 = str2;
        obj.A05 = p2pPaymentData.A09;
        this.A01.Brw(p2pPaymentConfig, obj);
        SendPaymentMessageParams sendPaymentMessageParams = new SendPaymentMessageParams((Er2) obj);
        Fch fch = (Fch) this.A07.get();
        ListenableFuture A00 = G72.A00(AbF.A13(fch.A0A), sendPaymentMessageParams, fch, 10);
        6Gx A0a = DKC.A0a(this.A06);
        FHR A002 = F7K.A00(this.A02, "init");
        A002.A04(ER3.A0J);
        A002.A06(paypalFundingOptionPaymentMethod);
        A0a.A05(A002);
        1Kd.A0E(new FwH(6, p2pPaymentData, p2pPaymentConfig, this, sendPaymentMessageParams), A00);
        return 2FP.A00(new Fvn(sendPaymentMessageParams, this, 5), A00, 1BK.A1E(this.A08));
    }

    @Override // X.GOL
    public ListenableFuture Bz8(P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        if ("house_ads_incentive_campaign_2020".equals(null)) {
            AbK.A1O(1BL.A0V(this.A05), Fch.A0H);
        }
        return Fvf.A00(((Fch) this.A07.get()).A05(1Fw.A05(this.A00)), this, 14);
    }

    @Override // X.GFg
    public void Cqu(RTb rTb) {
        this.A02 = rTb;
    }
}
