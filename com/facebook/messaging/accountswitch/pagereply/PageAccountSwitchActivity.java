package com.facebook.messaging.accountswitch.pagereply;

import X.0Pz;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1Kd;
import X.1Od;
import X.1PE;
import X.1SG;
import X.4IA;
import X.4YU;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbL;
import X.AnonymousClass001;
import X.ApQ;
import X.BLO;
import X.C00i;
import X.C15h;
import X.C1io;
import X.C1pq;
import X.C1yU;
import X.C3RE;
import X.C5c;
import X.Cat;
import X.Chc;
import X.Che;
import X.DGc;
import android.os.SystemClock;
import com.facebook.auth.component.AccountSwitchingAuthenticationResult;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.messaging.nativepagereply.accountswitch.model.MessengerAccountSwitchUiInfo;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: PageAccountSwitchActivity.class */
public class PageAccountSwitchActivity extends FbFragmentActivity implements C1io {
    public static final List A0X = Arrays.asList(BLO.A05, BLO.A04);
    public FbUserSession A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public C00i A0B;
    public C00i A0C;
    public MessengerAccountInfo A0D;
    public MessengerAccountSwitchUiInfo A0E;
    public String A0F;
    public String A0G;
    public C15h A0H;
    public C15h A0I;
    public C00i A0J;
    public C00i A0K;
    public C00i A0L;
    public final C00i A0Q = AbH.A0R();
    public final C00i A0O = 1BQ.A01();
    public final C00i A0T = AbH.A0D();
    public final C00i A0M = 1BQ.A02(16627);
    public final C00i A0N = 1BQ.A02(66591);
    public final C00i A0W = 1BQ.A02(17080);
    public final C00i A0U = 1BQ.A02(148033);
    public final C00i A0S = 1BQ.A02(49282);
    public final C00i A0R = 1BQ.A02(66658);
    public final C00i A0P = AbH.A0V();
    public final DGc A0V = new Chc(this);

    public static final 4IA A12(String str) {
        if (str.length() != 0) {
            for (4IA r0 : 4IA.values()) {
                String str2 = r0.sourceName;
                if (str2 != null && str2.equalsIgnoreCase(str)) {
                    return r0;
                }
            }
        }
        return 4IA.A0Z;
    }

    public static MessengerAccountInfo A15(PageAccountSwitchActivity pageAccountSwitchActivity, String str) {
        Iterator A0h = AbL.A0h(pageAccountSwitchActivity.A0P);
        while (A0h.hasNext()) {
            MessengerAccountInfo A0W = AbF.A0W(A0h);
            if (str.equals(A0W.A0A) && A0W.A04 != null) {
                return A0W;
            }
        }
        return null;
    }

    public static void A16(AccountSwitchingAuthenticationResult accountSwitchingAuthenticationResult, PageAccountSwitchActivity pageAccountSwitchActivity) {
        String str;
        int i;
        ((C5c) pageAccountSwitchActivity.A0K.get()).A00(accountSwitchingAuthenticationResult, pageAccountSwitchActivity.A0D, pageAccountSwitchActivity.A0F);
        if (pageAccountSwitchActivity.A0E.A00() != BLO.A02) {
            1PE.A00((1PE) pageAccountSwitchActivity.A0M.get(), "login_start");
            C1yU c1yU = (C1yU) pageAccountSwitchActivity.A0N.get();
            String str2 = pageAccountSwitchActivity.A0G;
            long uptimeMillis = SystemClock.uptimeMillis();
            0fH.A0j("BusinessInboxInMessengerInboxLoadingTTRCTracker", 0Pz.A0h("onAccountSwitch ", "()", uptimeMillis));
            if (str2 == null || !11T.A0O(A12(str2).destinationName, "inbox")) {
                str = "Flow destination is not inbox, return";
            } else {
                boolean A1G = AbL.A1G(c1yU.A03);
                if (A1G) {
                    c1yU.A0E(531045818, 0);
                    c1yU.A0G(uptimeMillis);
                    QuickPerformanceLogger A02 = 1SG.A02(c1yU);
                    Integer num = ((1SG) c1yU).A02;
                    if (num == null) {
                        throw 1BK.A0h();
                    }
                    MarkerEditor withMarker = A02.withMarker(num.intValue());
                    withMarker.annotate(1BJ.A00(1246), A1G);
                    C00i c00i = c1yU.A01.A00;
                    boolean z = ((1Od) c00i.get()).A0o;
                    String A00 = 1BJ.A00(968);
                    if (z) {
                        i = 1326;
                    } else {
                        if (((1Od) c00i.get()).A0p) {
                            i = 1327;
                        }
                        withMarker.markerEditingCompleted();
                        c1yU.A0T("thread_list", 1, System.currentTimeMillis() - SystemClock.elapsedRealtime());
                        c1yU.A0O("thread_list");
                    }
                    withMarker.annotate(A00, 1BJ.A00(i));
                    withMarker.markerEditingCompleted();
                    c1yU.A0T("thread_list", 1, System.currentTimeMillis() - SystemClock.elapsedRealtime());
                    c1yU.A0O("thread_list");
                } else {
                    str = "isDolphinEnabled = false, return";
                }
            }
            0fH.A0j("BusinessInboxInMessengerInboxLoadingTTRCTracker", str);
        }
        Cat cat = (Cat) pageAccountSwitchActivity.A0L.get();
        Che che = new Che(pageAccountSwitchActivity);
        1Kd.A0D(cat.A02, new ApQ(che, cat, 5), 4YU.A0M(1BK.A05(), CallerContext.A06(Cat.class), 4YU.A0L(cat.A01), "login", true));
    }

    public static void A1D(MessengerAccountInfo messengerAccountInfo, PageAccountSwitchActivity pageAccountSwitchActivity, BLO blo) {
        HashSet A0v = AnonymousClass001.A0v();
        String str = messengerAccountInfo.A05;
        AbF.A1U(str);
        String str2 = messengerAccountInfo.A0A;
        C1pq.A08("userId", str2);
        pageAccountSwitchActivity.A0E = new MessengerAccountSwitchUiInfo(blo, str, messengerAccountInfo.A06, str2, C1pq.A07(blo, "targetAccountType", A0v, A0v));
    }

    public static void A1F(PageAccountSwitchActivity pageAccountSwitchActivity, String str) {
        1PE r0 = (1PE) pageAccountSwitchActivity.A0M.get();
        if (r0.A00 != 0) {
            AbG.A0r(r0.A03).flowEndFail(r0.A00, "completion_failure", str);
            r0.A00 = 0L;
        }
        ((1SG) pageAccountSwitchActivity.A0N.get()).A0K("ACCOUNT_SWITCH_FAILED");
        C3RE c3re = (C3RE) pageAccountSwitchActivity.A06.get();
        FbUserSession fbUserSession = pageAccountSwitchActivity.A00;
        fbUserSession.getClass();
        c3re.A01(fbUserSession, pageAccountSwitchActivity.A0G, "completion_failure", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        if (r0.A00() != 190) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A1G(com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity r301, java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity.A1G(com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity, java.lang.Throwable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x01cd, code lost:
    
        if (A12(r310).destinationName.equals(X.1BJ.A00(233)) == false) goto L16;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
