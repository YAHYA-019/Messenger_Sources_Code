package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rtc.activities.CallPermissionsActivity;

/* loaded from: Hrj.class */
public final class Hrj {
    public final 1Br A00 = 1BK.A0C();
    public final 1De A01;

    public Hrj(1De r302) {
        this.A01 = r302;
    }

    public final void A00(Activity activity, FbUserSession fbUserSession, Integer num, boolean z) {
        String str;
        11T.A0F(fbUserSession, 0);
        1BY r0 = this.A01.A00;
        2JN r02 = (2JN) 1Lo.A04((Context) null, fbUserSession, r0, 33088);
        2JS A01 = r02.A01();
        11T.A0F(A01, 0);
        CallModel A0j = GOq.A0j(A01);
        if (A0j == null || A0j.inCallState != 2) {
            HCL hcl = HCL.A02;
            2JS A012 = r02.A01();
            11T.A0F(A012, 0);
            I6E.A00(hcl, GOq.A0m(A012).localCallId, A0j != null ? A0j.sharedCallId : null, AbL.A0g("abort_reason", "call not ringing"));
            4zI.A03.A07("AnswerCall", "Skipping handling accept call since the call is not in an incoming ringing state", new Object[0]);
            return;
        }
        2QN r03 = (2QN) 1Lo.A04((Context) null, fbUserSession, r0, 99978);
        if (r03.A0B == null) {
            I7M i7m = (I7M) 1Bn.A0E((Context) null, r0, 115685);
            1Bn.A0E((Context) null, r0, 115368);
            r03.A0B = Long.valueOf(Hvr.A00(A0j, r03, I7M.A01(i7m)).BGc());
        }
        IRF irf = (IRF) 1Lo.A04((Context) null, fbUserSession, r0, 99979);
        irf.A1e.A0N = true;
        I9T i9t = (I9T) 1Lo.A04((Context) null, fbUserSession, r0, 115096);
        if (7zQ.A1a(i9t.A09)) {
            i9t.A03(I9T.A00(i9t), 12);
            String A00 = I9T.A00(i9t);
            switch (num.intValue()) {
                case 0:
                    str = "FULL_SCREEN_RING";
                    break;
                case 1:
                    str = 4YT.A00(730);
                    break;
                case 2:
                    str = "JOIN_BUTTON_INBOX";
                    break;
                case 3:
                    str = "JOIN_BUTTON_XMA";
                    break;
                case 4:
                    str = "JOIN_BUTTON_THREAD_HEADER";
                    break;
                default:
                    str = "HANDS_FREE_ACTION";
                    break;
            }
            i9t.A04(A00, 29, str);
        }
        1MV A0A = AbF.A0A(fbUserSession, r0, 17016);
        if (z && !((2Qb) A0A.get()).A0I()) {
            irf.A0i(activity);
            return;
        }
        BHq bHq = new BHq(activity, irf, 4);
        if (activity == null) {
            if (IRF.A0Y((Activity) null, irf, false)) {
                bHq.onPermissionsGranted();
                return;
            } else {
                bHq.onPermissionsCheckCanceled();
                return;
            }
        }
        IA7 A1A = AbJ.A0J(irf.A0i).A1A(activity);
        String[] strArr = CallPermissionsActivity.A08;
        11T.A0B(strArr);
        boolean A0Z = IRF.A0Z(activity, irf, strArr);
        Context context = A1A.A00;
        Resources resources = context.getResources();
        C01i c01i = A1A.A04;
        IA7.A00(activity, A1A, bHq, AbK.A14(resources, c01i.getValue(), 2131965090), AbK.A14(context.getResources(), c01i.getValue(), 2131965091), IA7.A07, false, A0Z);
    }

    public final void A01(FbUserSession fbUserSession, String str) {
        boolean A1X = 1BL.A1X(fbUserSession, str);
        1BY r0 = this.A01.A00;
        IRF irf = (IRF) 1Lo.A04((Context) null, fbUserSession, r0, 99979);
        irf.A1e.A0N = A1X;
        irf.A0h(0, str);
        2JN r02 = (2JN) 1Lo.A04((Context) null, fbUserSession, r0, 33088);
        I9T i9t = (I9T) 1Lo.A04((Context) null, fbUserSession, r0, 115096);
        2JS A01 = r02.A01();
        11T.A0F(A01, 0);
        String str2 = GOq.A0m(A01).localCallId;
        if (7zQ.A1a(i9t.A09)) {
            if (str2 == null) {
                str2 = I9T.A00(i9t);
            }
            i9t.A03(str2, 15);
        }
        if (1Br.A07(this.A00).AZk(36320803255762648L)) {
            return;
        }
        IRF.A0J(irf);
    }
}
