package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.model.GraphQLMedia;
import com.facebook.rsys.cowatchad.gen.CowatchAd;
import com.facebook.video.subtitles.request.SubtitleDialog;
import com.facebook.xapp.messaging.browser.model.MessengerInAppBrowserLaunchParam;
import com.google.common.collect.ImmutableList;

/* loaded from: Fcc.class */
public final class Fcc implements CallerContextable {
    public static final CallerContext A0B = CallerContext.A06(Fcc.class);
    public static final String __redex_internal_original_name = "MediaSyncOverflowMenuHelper";
    public FFw A00;
    public SubtitleDialog A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final Context A09;
    public final 1De A0A;

    public Fcc(1De r302) {
        this.A0A = r302;
        1BY r0 = r302.A00;
        this.A07 = 1Bu.A03(r0, 100011);
        this.A03 = 1Bu.A03(r0, 115390);
        this.A05 = 1Bq.A00(115793);
        this.A06 = 1Bu.A03(r0, 68120);
        Context A0I = 7zQ.A0I(r0);
        this.A09 = A0I;
        this.A08 = 1HG.A00(A0I, 67720);
        this.A02 = 1Bq.A00(49736);
        this.A04 = 1Bu.A03(r0, 67593);
    }

    public static final void A00(Context context, Fcc fcc, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        MessengerInAppBrowserLaunchParam messengerInAppBrowserLaunchParam = new MessengerInAppBrowserLaunchParam(null, null, C5id.A10, MessengerInAppBrowserLaunchParam.A0F, null, null, null, null, null, null, null, false, true, false);
        FIu fIu = (FIu) 1Br.A0B(fcc.A07);
        Uri uri = null;
        try {
            uri = C0A2.A03(str);
        } catch (SecurityException unused) {
        }
        fIu.A0A(context, uri, messengerInAppBrowserLaunchParam);
        GP5.A00((GP5) 1Br.A0B(fcc.A03), "reporting_flow_launched");
    }

    public final void A01(Context context, I9A i9a, CowatchAd cowatchAd, String str, boolean z) {
        ImmutableList of;
        GraphQLMedia A01;
        ImmutableList A0c;
        Activity A00 = 0Dg.A00(context);
        if (A00 != null) {
            if (i9a != null || z) {
                1Iw A0W = 7zL.A0W(5YG.A01(context));
                DfK dfK = new DfK(A0W);
                if (cowatchAd == null || !cowatchAd.isSponsored) {
                    C2164Dfs c2164Dfs = new C2164Dfs(A0W);
                    C2169Dfx A002 = C2169Dfx.A00(c2164Dfs, A0W, 2131959335);
                    3Eh r0 = 3Eh.AFM;
                    A002.A0f(r0);
                    c2164Dfs.A03 = new REF(A002);
                    c2164Dfs.A02 = new FXb(A0W, this, str, 4);
                    c2164Dfs.A0f(2131959334);
                    c2164Dfs.A01 = 2;
                    REE ree = new REE(c2164Dfs);
                    if (ICR.A01((ICR) 1Br.A0B(this.A04)).AZk(2342157400085831598L)) {
                        C2164Dfs c2164Dfs2 = new C2164Dfs(A0W);
                        C2169Dfx A003 = C2169Dfx.A00(c2164Dfs2, A0W, 2131959333);
                        A003.A0f(r0);
                        c2164Dfs2.A03 = new REF(A003);
                        c2164Dfs2.A02 = FXs.A00(this, A0W, 28);
                        c2164Dfs2.A0f(2131959332);
                        of = ImmutableList.of((Object) new REE(c2164Dfs2), (Object) ree);
                    } else {
                        of = ImmutableList.of((Object) ree);
                    }
                    11T.A0D(of);
                } else {
                    IK1 ik1 = new IK1(4, A0W, this, cowatchAd);
                    C2164Dfs c2164Dfs3 = new C2164Dfs(A0W);
                    C2169Dfx A004 = C2169Dfx.A00(c2164Dfs3, A0W, 2131959927);
                    A004.A0f(3Eh.AAJ);
                    c2164Dfs3.A03 = new REF(A004);
                    c2164Dfs3.A02 = ik1;
                    AbstractC2178Dg6.A06(c2164Dfs3).A0E("hide");
                    REE ree2 = new REE(c2164Dfs3);
                    C2164Dfs c2164Dfs4 = new C2164Dfs(A0W);
                    C2169Dfx A005 = C2169Dfx.A00(c2164Dfs4, A0W, 2131959928);
                    A005.A0f(3Eh.AFM);
                    c2164Dfs4.A03 = new REF(A005);
                    c2164Dfs4.A02 = ik1;
                    AbstractC2178Dg6.A06(c2164Dfs4).A0E("report");
                    REE ree3 = new REE(c2164Dfs4);
                    C2164Dfs c2164Dfs5 = new C2164Dfs(A0W);
                    C2169Dfx A006 = C2169Dfx.A00(c2164Dfs5, A0W, 2131959930);
                    A006.A0f(3Eh.AAW);
                    c2164Dfs5.A03 = new REF(A006);
                    c2164Dfs5.A02 = ik1;
                    AbstractC2178Dg6.A06(c2164Dfs5).A0E("why");
                    REE ree4 = new REE(c2164Dfs5);
                    C2164Dfs c2164Dfs6 = new C2164Dfs(A0W);
                    C2169Dfx A007 = C2169Dfx.A00(c2164Dfs6, A0W, 2131959929);
                    A007.A0f(3Eh.AEv);
                    c2164Dfs6.A03 = new REF(A007);
                    c2164Dfs6.A02 = ik1;
                    AbstractC2178Dg6.A06(c2164Dfs6).A0E("what");
                    of = ImmutableList.of((Object) ree2, (Object) ree3, (Object) ree4, (Object) new REE(c2164Dfs6));
                    11T.A0A(of);
                }
                dfK.A01(of);
                if (i9a != null && (A01 = 6US.A01(i9a.A00)) != null && (A0c = A01.A0c()) != null && !A0c.isEmpty()) {
                    C2164Dfs c2164Dfs7 = new C2164Dfs(A0W);
                    C2169Dfx A008 = C2169Dfx.A00(c2164Dfs7, A0W, 2131955154);
                    A008.A0f(3Eh.A5P);
                    c2164Dfs7.A03 = new REF(A008);
                    c2164Dfs7.A02 = new IK2(2, A0W, this, A01, i9a);
                    dfK.A02.m11011add((Object) new REE(c2164Dfs7));
                }
                ExT A009 = FFw.A00(A0W);
                A009.A02 = A00;
                A009.A0C = dfK;
                A009.A07 = new Fdw(this, 2);
                FFw A0010 = A009.A00(A0B);
                A0010.A04();
                this.A00 = A0010;
            }
        }
    }
}
