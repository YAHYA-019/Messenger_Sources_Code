package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.browser.lite.BrowserLiteActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.browser.model.MessengerInAppBrowserLaunchParam;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: E18.class */
public final class E18 extends BRX {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final CIs A05;
    public final Bre A06;
    public final C5ic A07;
    public final 1GU A08;
    public final 1Br A09;
    public final 1CO A0A;

    public E18(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A09 = 1Bu.A03(r0, 16428);
        this.A04 = 1Bq.A00(83604);
        this.A03 = 1Bu.A03(r0, 100013);
        this.A02 = 1Bu.A03(r0, 100011);
        this.A01 = 1Bu.A03(r0, 84928);
        this.A07 = (C5ic) 1Bn.A0E((Context) null, r0, 67527);
        this.A05 = (CIs) 1Bn.A0E((Context) null, r0, 84927);
        this.A08 = 7zQ.A0Q();
        this.A0A = (1CO) 1Bi.A03(16385);
        this.A06 = (Bre) 1Bn.A0E((Context) null, r0, 82040);
    }

    public static final void A00(final Context context, Intent intent, Uri uri, final FbUserSession fbUserSession, CallToActionContextParams callToActionContextParams, E18 e18) {
        MessengerInAppBrowserLaunchParam A00 = ((C2a) 1Br.A0B(e18.A01)).A00(callToActionContextParams);
        ThreadKey threadKey = callToActionContextParams.A06;
        String str = (e18.A01(fbUserSession, threadKey) || 1Br.A0B(e18.A04) == C0et.A0U) ? callToActionContextParams.A0F : (String) 4YU.A0q(uri.getPathSegments(), 0);
        BMF bmf = callToActionContextParams.A04;
        boolean A01 = e18.A01(fbUserSession, threadKey);
        boolean A1W = AnonymousClass001.A1W(1Br.A0B(e18.A04), C0et.A0U);
        if (str != null && (A01 || A1W)) {
            Bre bre = e18.A06;
            07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "element_id");
            if (bmf != null) {
                07S.A00(A0J, bmf.dbValue, 4YT.A00(ActionId.MISSED_EVENT));
            }
            C2197Dgp c2197Dgp = new C2197Dgp();
            4YV.A1A(A0J, ((2Jf) c2197Dgp).A00, "inputs");
            ENj eNj = ENj.A02;
            AbI.A0o(bre.A02).A08(new C2069Dau(bre, eNj, 5), 0Pz.A0j(eNj.taskKey, "_interaction_", str), new DBG(7, c2197Dgp, bre, fbUserSession));
            if (!A1W) {
                5Uf r0 = (5Uf) 4YU.A0n(fbUserSession, e18.A00, 83803);
                5Ug r02 = eNj.badgingType;
                11T.A0F(r02, 0);
                C00i c00i = r0.A01.A00;
                Iterator it = 1BK.A0S(c00i).Asu(5Uf.A00(r0.A00, r02, 0S2.A01)).iterator();
                while (it.hasNext()) {
                    AbK.A1O(1BL.A0U(c00i), (1G2) it.next());
                }
            }
        }
        final FIu fIu = (FIu) 1Br.A0B(e18.A02);
        if (intent.getComponent() == null || !intent.getComponent().getClassName().equals(BrowserLiteActivity.class.getName())) {
            1BK.A09(fIu.A06).D11("MessengerBrowserLauncher", 0Pz.A0W("Intent is not valid: ", intent.getComponent() == null ? "Intent component is null." : intent.getComponent().getClassName()));
            return;
        }
        final MessengerInAppBrowserLaunchParam A012 = FIu.A01(A00);
        if (FIu.A05(context, intent, (Uri) null, fbUserSession, fIu, A012.A02)) {
            return;
        }
        final Intent A002 = FIu.A00(context, intent.getData(), fbUserSession, fIu, A012);
        Bundle A05 = 1BK.A05();
        String A003 = JQw.A00(13);
        if (intent.hasExtra(A003)) {
            A05.putAll(intent.getBundleExtra(A003));
        }
        if (A002.hasExtra(A003)) {
            A05.putAll(A002.getBundleExtra(A003));
        }
        A002.putExtras(intent);
        A002.putExtra(A003, A05);
        if (FIu.A06(fbUserSession, fIu, A012)) {
            ((Erz) fIu.A03.get()).A00(fbUserSession, new GFB() { // from class: X.Fk8
                public final void CHf(HashSet hashSet) {
                    FIu fIu2 = fIu;
                    Intent intent2 = A002;
                    FbUserSession fbUserSession2 = fbUserSession;
                    MessengerInAppBrowserLaunchParam messengerInAppBrowserLaunchParam = A012;
                    Context context2 = context;
                    intent2.putExtra("BrowserLiteIntent.EXTRA_BLACK_HOLE_LIST", hashSet);
                    FIu.A04(fbUserSession2, fIu2, messengerInAppBrowserLaunchParam, "");
                    FIu.A02((Activity) null, context2, intent2, (Fragment) null, fIu2, messengerInAppBrowserLaunchParam, (Integer) null);
                }
            });
        } else {
            FIu.A02((Activity) null, context, A002, (Fragment) null, fIu, A012, (Integer) null);
        }
    }

    private final boolean A01(FbUserSession fbUserSession, ThreadKey threadKey) {
        User A0t;
        boolean z = false;
        if (threadKey != null && threadKey.A1K() && (A0t = AbK.A0t((23F) 4YU.A0n(fbUserSession, this.A00, 33102), String.valueOf(threadKey.A02))) != null && A0t.A0E()) {
            z = true;
        }
        return z;
    }

    public String A02() {
        return "business_extensions";
    }

    public String A03() {
        return "*";
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x07dc, code lost:
    
        if (r333 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0878, code lost:
    
        if (r333 != null) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(android.content.Context r302, android.net.Uri r303, com.facebook.messaging.business.common.calltoaction.CallToActionContextParams r304, com.facebook.messaging.business.common.calltoaction.model.CallToAction r305) {
        /*
            Method dump skipped, instructions count: 2243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E18.A04(android.content.Context, android.net.Uri, com.facebook.messaging.business.common.calltoaction.CallToActionContextParams, com.facebook.messaging.business.common.calltoaction.model.CallToAction):boolean");
    }
}
