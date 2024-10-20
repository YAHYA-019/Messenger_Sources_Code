package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.3TH, reason: invalid class name */
/* loaded from: 3TH.class */
public final class C3TH {
    public final C00i A00 = 1BQ.A01();
    public final 1Ew A02 = (1Ew) 1Bi.A03(65755);
    public final 1Od A03 = (1Od) 1Bi.A03(16616);
    public final C00i A01 = 1BQ.A02(16634);
    public final C00i A04 = 1BQ.A02(16634);

    public static final C3TH A00() {
        return new C3TH();
    }

    public static void A01(C3TH c3th, String str, Throwable th, java.util.Map map) {
        1UG A08 = 1BK.A08(1BK.A07(c3th.A04), "android_messenger_failed_fetch");
        if (A08.isSampled()) {
            A08.A7R("action", str);
            A08.A7R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (th.getCause() == null ? th.getClass() : th.getCause().getClass()).getName());
            A08.A7R("reason", th.getMessage());
            A08.A7R("extra", map.toString());
            A08.BZL();
        }
    }

    public void A02(long j, String str, String str2, String str3, boolean z) {
        1UG A08 = 1BK.A08(1BK.A07(this.A01), "orca_thread_list_query");
        if (A08.isSampled()) {
            A08.A5H(DKB.A00(ActionId.RTMP_PACKET_RECEIVED), Boolean.valueOf(z));
            A08.A6H("latency", Long.valueOf(j));
            A08.A0A("is_resubmit");
            A08.A0A("is_split");
            A08.A7R("extra", str);
            A08.A7R("error", str2);
            A08.A7R("caller_context", str3);
            A08.BZL();
        }
    }

    public void A03(CallerContext callerContext) {
        C01s A09 = 1BK.A09(this.A00);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Got a null ViewerContextUser, caller context:");
        A0k.append(callerContext);
        A0k.append(", LoggedInUser: ");
        1Eu r0 = this.A02;
        A0k.append(r0.Auc());
        A0k.append(", ViewerContextUserId: ");
        A0k.append(r0.Aue() == ViewerContext.A01 ? null : r0.Aue().mUserId);
        A0k.append(", isMaskingCurrentCredentials: ");
        A0k.append(r0.A0J.A04);
        A0k.append(", hasReportedAuthSyncError: ");
        A0k.append(false);
        A0k.append(", isLoggedIn: ");
        A0k.append(r0.BTw());
        A0k.append(", isLoggingOut: ");
        A0k.append(r0.BU1());
        A0k.append(", isAppBackgrounded: ");
        1Od r02 = this.A03;
        A0k.append(r02.A0E());
        A0k.append(", isUserInApp: ");
        A0k.append(r02.A0F());
        A0k.append(", isAppInitialized: ");
        A0k.append(AnonymousClass001.A1P((r02.A0Y > 0L ? 1 : (r02.A0Y == 0L ? 0 : -1))));
        A0k.append(", isApplicationFirstRunOnInstall: ");
        A0k.append(r02.A0o);
        A0k.append(", isApplicationFirstRunOnUpgrade: ");
        A0k.append(r02.A0p);
        A0k.append(", isAppStartedInBackground: ");
        A09.D0v("null_logged_in_user", AnonymousClass001.A0a(r02.A0A(), A0k));
    }

    public void A04(String str) {
        str.getClass();
        1BK.A09(this.A00).D0u(0BR.A00("gql_threads_null", str));
    }

    public void A05(String str, Object... objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                1BK.A09(this.A00).D0u(0BR.A00("gql_threads_null", str));
                throw AnonymousClass001.A0Q(0Pz.A0j("gql_threads_null", ": ", str));
            }
        }
    }
}
