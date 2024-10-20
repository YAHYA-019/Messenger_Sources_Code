package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.account.login.encryption.protocol.PasswordEncryptionKeyFetchMethod$Params;
import com.facebook.account.login.encryption.protocol.PasswordEncryptionKeyFetchResult;
import com.facebook.acra.constants.ActionId;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.component.AccountSwitchingAuthenticationResult;
import com.facebook.auth.component.ReauthResult;
import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.credentials.BrowserToNativeSSOCredentials;
import com.facebook.auth.credentials.DeviceBasedLoginCredentials;
import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.auth.credentials.NonceCredentials;
import com.facebook.auth.credentials.OpenIDLoginCredentials;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.auth.credentials.WorkUserSwitchCredentials;
import com.facebook.auth.protocol.AuthCredentialCheckResult;
import com.facebook.auth.protocol.AuthIdentifyUserResult;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.auth.protocol.ConfirmedMessengerCredentials;
import com.facebook.auth.protocol.ConfirmedMessengerOnlyUserCredentials;
import com.facebook.auth.protocol.CreateMessengerAccountCredentials;
import com.facebook.auth.protocol.InstagramPasswordCredentials;
import com.facebook.auth.protocol.InstagramUserInfo;
import com.facebook.auth.protocol.MsgrDeviceSharingFilterResult;
import com.facebook.auth.protocol.UserTypeResult;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.common.util.TriState;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.inject.FbInjector;
import com.facebook.omnistore.Omnistore;
import com.facebook.openidconnect.model.OpenIDCredential;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.user.model.User;
import com.facebook.workshared.auth.community.WorkCommunity;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest;

/* loaded from: Fck.class */
public final class Fck implements CallerContextable {
    public static final String A0z = GCN.class.getSimpleName();
    public static final String __redex_internal_original_name = "AuthOperations";
    public final AtomicReference A0v = new AtomicReference(null);
    public final AtomicInteger A0u = DKD.A14();
    public final 1Ew A04 = AbI.A09();
    public final C00i A0b = 1BQ.A02(100141);
    public final C00i A0c = AbH.A0S();
    public final Fgp A0I = (Fgp) 1Bn.A0A(99383);
    public final Fhw A0B = (Fhw) 1Bn.A0A(100142);
    public final Fhv A0C = (Fhv) 1Bn.A0A(100148);
    public final C00i A0W = 1BV.A00(85019);
    public final C00i A0V = 1BV.A00(85018);
    public final C00i A0U = 1BV.A00(85017);
    public final C00i A0T = 1BV.A00(100147);
    public final C00i A0P = 1BV.A00(85251);
    public final C00i A0m = 1BV.A00(100145);
    public final Fhp A09 = (Fhp) 1Bn.A0A(100149);
    public final Fhr A08 = (Fhr) 1Bn.A0A(100143);
    public final FhX A0E = (FhX) 1Bn.A0A(100155);
    public final FhY A0F = (FhY) 1Bn.A0A(100154);
    public final C15h A0x = G7K.A01(this, 6);
    public final CgO A0A = (CgO) 1Bn.A0A(85175);
    public final C00i A0N = 1BV.A00(85250);
    public final C00i A0i = 1BV.A00(85246);
    public final C00i A0X = AbH.A0a();
    public final C0et A0L = AbJ.A0E();
    public final C00i A0O = 1BV.A00(84738);
    public final F46 A06 = (F46) 1Bi.A03(82341);
    public final C00i A0q = 1BQ.A02(82047);
    public final C15h A0y = G7K.A01(this, 7);
    public final 3OS A07 = (3OS) 1Bn.A0A(98936);
    public final FhW A0D = (FhW) 1Bn.A0A(100150);
    public final C00i A0Y = 1BV.A00(100223);
    public final C00i A0M = 1BQ.A02(33136);
    public final Fhf A0G = (Fhf) 1Bn.A0A(100152);
    public final Cgu A0H = (Cgu) 1Bn.A0A(85193);
    public final Ebm A0K = (Ebm) 1Bn.A0A(100246);
    public final Fho A0J = (Fho) 1Bn.A0A(100151);
    public final C00i A0a = 1BQ.A01();
    public final EwB A05 = DKD.A0G();
    public final C00i A0S = 1BV.A00(100144);
    public final C00i A0R = 1BV.A00(100153);
    public final C00i A0Q = 1BV.A00(100146);
    public final Set A0t = 1Kr.A00(new Set[]{1Bn.A0I(ActionId.DATA_LOAD_START), 1Bi.A06(212)});
    public final C00i A0l = AbH.A0M();
    public final C00i A0s = AbH.A0P();
    public final C15h A0w = G7K.A01(this, 8);
    public Context A00 = FbInjector.A00();
    public final C00i A0k = 1BV.A00(85252);
    public final C00i A0d = 1BV.A00(84778);
    public final C00i A0e = AbH.A0E();
    public final C00i A0h = 1BQ.A00();
    public final C00i A0j = 1BV.A00(100112);
    public final C00i A0o = 1BQ.A02(131252);
    public final C00i A0g = 1BQ.A02(49315);
    public final C00i A0f = 1BQ.A02(131081);
    public final C00i A0p = 1BV.A00(16478);
    public final C00i A0n = 1BQ.A02(66658);
    public final C00i A0Z = FbInjector.A00;
    public C00i A01 = 1BQ.A02(82541);
    public final FAA A02 = (FAA) 1Bn.A0A(100222);
    public final C00i A03 = 1BQ.A02(66265);
    public final C00i A0r = 1BV.A00(16669);

    public static /* synthetic */ AccountSwitchingAuthenticationResult A00(AuthenticationResult authenticationResult, Fck fck, EnC enC, FbUserSession fbUserSession, String str) {
        return fck.A02(authenticationResult, enC, fbUserSession, str, true, false);
    }

    public static AccountSwitchingAuthenticationResult A01(AuthenticationResult authenticationResult, Fck fck, FbUserSession fbUserSession, String str, String str2) {
        return fck.A02(authenticationResult, new EnC(str), fbUserSession, str2, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (r0.BHt().equals(r310.mUserId) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.auth.component.AccountSwitchingAuthenticationResult A02(com.facebook.auth.component.listener.interfaces.AuthenticationResult r302, X.EnC r303, com.facebook.auth.usersession.FbUserSession r304, java.lang.String r305, boolean r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fck.A02(com.facebook.auth.component.listener.interfaces.AuthenticationResult, X.EnC, com.facebook.auth.usersession.FbUserSession, java.lang.String, boolean, boolean):com.facebook.auth.component.AccountSwitchingAuthenticationResult");
    }

    private AuthenticationResult A03() {
        return (AuthenticationResult) this.A0v.getAndSet(null);
    }

    private AuthenticationResult A04(AuthenticationResult authenticationResult, String str) {
        ImmutableList build;
        WorkCommunity workCommunity;
        Context A00 = FbInjector.A00();
        FbUserSession A0F = 1BL.A0F();
        AbstractC05414dq A03 = 1VX.A03(A00, A0F);
        try {
            C3sa A0L = 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "WorkCommunityPeekQuery", (String) null, "fbandroid", -838422335, 0, 4230452226L, 4230452226L, false, true));
            A0L.A00 = A0F.BKF();
            4YU.A1J(A0L, 338399944209237L);
            2JX r0 = (2JX) ((AbstractC08294mh) ((GraphQLResult) A03.A03(A0L).get())).A03;
            Ebm ebm = this.A0K;
            2JX A0P = r0.A0P(2JX.class, -629088858);
            boolean booleanValue = A0P.getBooleanValue(-220546204);
            if (booleanValue) {
                2JX A0L2 = 1BL.A0L(A0P, 1621168187, 1580861552);
                if (A0L2 != null) {
                    2JX A0L3 = 1BL.A0L(A0L2, 1282260843, 716356992);
                    if (A0L3 != null) {
                        A0L3.A0r(116076);
                    }
                    A0L2.A0r(3373707);
                    A0L2.A0r(3355);
                }
                build = null;
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                1Du A0v = AbI.A0v(A0P, 2JX.class, -552376486, -189377375);
                while (A0v.hasNext()) {
                    2JX A0D = AbG.A0D(A0v);
                    2JX A0L4 = 1BL.A0L(A0D, -1480249367, -1252706798);
                    if (A0L4 != null) {
                        2JX A0L5 = 1BL.A0L(A0L4, 3327403, -1428939582);
                        builder.m11011add((Object) new WorkCommunity(A0L4.A0j(), A0L4.A0r(40011583), A0L5 != null ? A0L5.A0l() : null, A0D.A0r(96619420)));
                    }
                }
                build = builder.build();
            }
            ((C0dp) ebm.A00.get()).now();
            if (booleanValue) {
                A0x(authenticationResult, null);
                return authenticationResult;
            }
            if (build == null || build.isEmpty()) {
                A1y("SwitchToWorkAccountFailed", false);
                throw new ERh((Bundle) null, 29B.A0P);
            }
            if (str != null) {
                1Du it = build.iterator();
                while (it.hasNext()) {
                    workCommunity = (WorkCommunity) it.next();
                    if (str.equalsIgnoreCase(workCommunity.A01)) {
                    }
                }
                A1y("SwitchToWorkAccountFailed", false);
                throw new ERh((Bundle) null, 29B.A0P);
            }
            if (build.size() != 1) {
                A1y("SwitchToWorkAccountFailed", false);
                Bundle A05 = 1BK.A05();
                FacebookCredentials facebookCredentials = ((AuthenticationResultImpl) authenticationResult).A00;
                A05.putString("username", facebookCredentials.A08);
                A05.putString("token", facebookCredentials.A06);
                A05.putParcelableArrayList("work_communities_param", 1BK.A17(build));
                throw new ERh(A05, 29B.A0O);
            }
            workCommunity = (WorkCommunity) build.get(0);
            return A07(new WorkUserSwitchCredentials(workCommunity.A02, workCommunity.A00, ((AuthenticationResultImpl) authenticationResult).A00.A06));
        } catch (Exception e) {
            0fH.A0s(A0z, "workCommunityPeekResult error", e);
            throw new ERh((Bundle) null, 29B.A05);
        }
    }

    private AuthenticationResult A05(DeviceBasedLoginCredentials deviceBasedLoginCredentials, String str, String str2) {
        if (str == null) {
            str = "logged_in_account_switcher";
        }
        return new Fag(deviceBasedLoginCredentials, this, str, str2).A00();
    }

    private AuthenticationResult A06(DeviceBasedLoginCredentials deviceBasedLoginCredentials, String str, String str2) {
        A0u();
        AuthenticationResult A03 = A03();
        if (A03 == null) {
            this.A0u.incrementAndGet();
            A03 = A05(deviceBasedLoginCredentials, str, str2);
        }
        A0t();
        return A03;
    }

    private AuthenticationResult A07(WorkUserSwitchCredentials workUserSwitchCredentials) {
        return A09(new FaO(workUserSwitchCredentials, this));
    }

    private AuthenticationResult A08(GOk gOk) {
        return A0E(gOk, null, false);
    }

    private AuthenticationResult A09(GOk gOk) {
        return A0G(gOk, null);
    }

    public static /* synthetic */ AuthenticationResult A0A(GOk gOk, Fck fck) {
        return fck.A08(gOk);
    }

    public static /* synthetic */ AuthenticationResult A0B(GOk gOk, Fck fck) {
        return fck.A0E(gOk, null, true);
    }

    public static /* synthetic */ AuthenticationResult A0C(GOk gOk, Fck fck, String str) {
        return fck.A0F(gOk, str);
    }

    private AuthenticationResult A0D(GOk gOk, EnC enC) {
        return A0E(gOk, enC, false);
    }

    private AuthenticationResult A0E(GOk gOk, EnC enC, boolean z) {
        if (this.A04.Aue() != ViewerContext.A01 && !z && !1XR.A00() && !A1A()) {
            A0y(new EnC("auth_logout"));
            1BK.A09(this.A0a).D0v("LogoutDidNotComplete", "Trying to login, but logout did not complete.");
        }
        Ezc A0K = DKC.A0K(this.A0Y);
        Iterator A1D = DKC.A1D(new DVJ(A0K, DKD.A0j(A0K.A02)), AnonymousClass001.A0s());
        while (A1D.hasNext()) {
            try {
                DKC.A14(A1D).run();
            } catch (Exception unused) {
            }
        }
        AuthenticationResult authenticationResult = (AuthenticationResult) gOk.call();
        if (!z) {
            authenticationResult = A1R(authenticationResult, enC, null, false);
        }
        return authenticationResult;
    }

    private AuthenticationResult A0F(GOk gOk, String str) {
        return A0G(gOk, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
    
        if (r301.A04.Aue() == com.facebook.auth.viewercontext.ViewerContext.A01) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.auth.component.listener.interfaces.AuthenticationResult A0G(X.GOk r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fck.A0G(X.GOk, java.lang.String):com.facebook.auth.component.listener.interfaces.AuthenticationResult");
    }

    public static final Fck A0I() {
        return new Fck();
    }

    private ListenableFuture A0l(String str, String str2, String str3, String str4, boolean z) {
        return AbF.A13(this.A0e).D3C(new G6r(this, CallerContext.A09(getClass(), str), str2, str3, str4, z));
    }

    public static Integer A0m(EnC enC) {
        if (enC != null) {
            String str = enC.A00;
            if (1BJ.A00(80).equals(str)) {
                return 0S2.A01;
            }
            if (1BJ.A00(81).equals(str)) {
                return 0S2.A0C;
            }
        }
        return 0S2.A00;
    }

    private Integer A0n(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.equals("FACEWEB_NONSPECIFIC")) {
                return 0S2.A00;
            }
            if (str.equals("ACCOUNT_REMOVED")) {
                return 0S2.A01;
            }
            if (str.equals("USER_INITIATED")) {
                return 0S2.A0C;
            }
            if (str.equals("USER_INITIATED_LIAS")) {
                return 0S2.A0N;
            }
            if (str.equals("PTU_SWITCH_LIAS")) {
                return 0S2.A0Y;
            }
            if (str.equals("USER_INITIATED_PROFILE_SWITCHING")) {
                return 0S2.A0j;
            }
            if (str.equals("USER_INITIATED_PROFILE_SWITCHING_SKIP_DATA_CLEANING")) {
                return 0S2.A0u;
            }
            if (str.equals("FORCED_ERROR_INVALID_SESSION")) {
                return 0S2.A15;
            }
            if (str.equals("FORCED_FACEWEB_AUTHENTICATION_FAILED")) {
                return 0S2.A1G;
            }
            if (str.equals("FORCED_FACEWEB_COMPONENTS_STORE_ERROR")) {
                return 0S2.A1J;
            }
            if (str.equals("FORCED_SYNC_ADAPTER_SERVICE_SESSION_ERROR")) {
                return 0S2.A02;
            }
            if (str.equals("WORK_DBL_MULTI_ACCOUNT_SWITCH")) {
                return 0S2.A03;
            }
            if (str.equals("BEFORE_AUTH_COMPLETE")) {
                return 0S2.A04;
            }
            throw AnonymousClass001.A0L(str);
        } catch (IllegalArgumentException unused) {
            1BK.A09(this.A0a).D0v("LogoutReasonNotRecognised", 0Pz.A0W("Logout reason not recognised:", str));
            return null;
        }
    }

    private void A0t() {
        Ezc A0K = DKC.A0K(this.A0Y);
        Iterator A1D = DKC.A1D(new DVH(A0K, DKD.A0j(A0K.A02)), AnonymousClass001.A0s());
        while (A1D.hasNext()) {
            try {
                DKC.A14(A1D).run();
            } catch (Exception unused) {
            }
        }
    }

    private void A0u() {
        Ezc A0K = DKC.A0K(this.A0Y);
        Iterator A1D = DKC.A1D(new DVG(A0K, DKD.A0j(A0K.A02)), AnonymousClass001.A0s());
        while (A1D.hasNext()) {
            try {
                DKC.A14(A1D).run();
            } catch (Exception unused) {
            }
        }
    }

    private void A0v() {
        if (A16()) {
            1Bn.A0A(83429);
            ((1CQ) 1Bi.A03(131252)).A05(63);
        }
    }

    public static void A0w() {
        1Lo.A0D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r303.A03 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0x(com.facebook.auth.component.listener.interfaces.AuthenticationResult r302, X.EnC r303) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fck.A0x(com.facebook.auth.component.listener.interfaces.AuthenticationResult, X.EnC):void");
    }

    private void A0y(EnC enC) {
        A1x(enC, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        if (X.0S2.A0u == r303) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0z(final X.EnC r302, java.lang.Integer r303, java.lang.String r304, java.lang.String r305, boolean r306, boolean r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 3417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fck.A0z(X.EnC, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    private void A10(EnC enC, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        A0z(enC, num, str, str2, z, z2, z3);
    }

    private void A11(EnC enC, Integer num, boolean z) {
        A10(enC, num, null, null, z, false, true);
    }

    private void A12(EnC enC, boolean z, boolean z2) {
        QuickPerformanceLogger A0U = 1BK.A0U(this.A0l);
        A0U.markerStart(9699335);
        3OS r0 = this.A07;
        AbG.A0B(r0.A01).AAq();
        FAA faa = (FAA) 1Bn.A0E((Context) null, r0.A00, 100222);
        if (!z) {
            try {
                r0.A01();
                try {
                    r0.A00();
                } finally {
                    ((C2tx) r0.A03.get()).exitLameDuckMode();
                }
            } catch (Throwable th) {
                faa.A01();
                throw th;
            }
        }
        A1x(enC, z2);
        C00i c00i = r0.A02;
        boolean z3 = true;
        Preconditions.checkState(AnonymousClass001.A1O(DKE.A1Y(c00i) ? 1 : 0));
        if (((1Ex) c00i.get()).Aue() != ViewerContext.A01) {
            z3 = false;
        }
        Preconditions.checkState(z3);
        1Lo.A0D();
        faa.A01();
        A0U.markerEnd(9699335, (short) 2);
    }

    private void A13(String str, String str2) {
        A10(null, null, str, str2, true, false, true);
    }

    private void A14(String str, String str2, String str3, boolean z, boolean z2) {
        short s;
        if (A19()) {
            return;
        }
        this.A0q.get();
        String A00 = 1BJ.A00(27);
        QuickPerformanceLogger A0V = 1BK.A0V(this.A0l);
        A0V.markerStart(9699334);
        if (!z2) {
            A00 = "AUTH_OPERATION";
        }
        ListenableFuture A0l = A0l(A00, str, str2, str3, z);
        if (z2) {
            FAA faa = this.A02;
            1Kd.A0D(faa.A03, FwL.A00(faa, 0), A0l);
        } else {
            if (AnonymousClass001.A1V(A0l.get())) {
                s = 2;
            } else {
                A0V.markerAnnotate(9699334, "logout_error", "Expire Session Sync failed.");
                s = 3;
            }
            A0V.markerEnd(9699334, s);
        }
    }

    private void A15(boolean z, Integer num) {
        A10(new EnC("auth_logout"), num, null, null, true, z, true);
    }

    private boolean A16() {
        return AnonymousClass001.A1W(this.A0L, C0et.A0C);
    }

    private boolean A17() {
        return AnonymousClass001.A1W(this.A0L, C0et.A0P);
    }

    private boolean A18() {
        if (this.A04.AXy() == 0S2.A00) {
            return false;
        }
        0fH.A0l(A0z, "Skipping onClearUserData for non-FB network user");
        return true;
    }

    private boolean A19() {
        1Ew r0 = this.A04;
        if (r0.Auc() != null) {
            this.A01.get();
        }
        if (r0.AXy() == 0S2.A00) {
            return false;
        }
        0fH.A0l(A0z, "Skipping session expiry for non-FB network user");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00eb, code lost:
    
        if (X.11T.A0P("generic", 1, r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fe, code lost:
    
        if (r0.equals(android.os.Build.PRODUCT) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A1A() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fck.A1A():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r301 == X.EPM.A0S) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A1B(X.EPM r301) {
        /*
            X.EPM r0 = X.EPM.A0L
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
            X.EPM r0 = X.EPM.A0S
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L18
        L16:
            r0 = 1
            r304 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fck.A1B(X.EPM):boolean");
    }

    private boolean A1C(PasswordCredentials passwordCredentials) {
        boolean z = false;
        if (!((1CQ) this.A0o.get()).A09(3, false) && A1B(passwordCredentials.A01)) {
            z = true;
        }
        return z;
    }

    private void A1x(final EnC enC, final boolean z) {
        QuickPerformanceLogger A0U;
        short s;
        ErT erT = (ErT) 1Hv.A02(FbInjector.A00(), 100108);
        FAA faa = (FAA) 1Bn.A0A(100222);
        QuickPerformanceLogger A0U2 = 1BK.A0U(this.A0l);
        erT.A00("clear_data_start");
        C00i c00i = faa.A08;
        1BK.A0U(c00i).markerStart(9699340);
        C00i c00i2 = faa.A02;
        Ezc A0K = DKC.A0K(c00i2);
        Iterator A1D = DKC.A1D(new DV9(A0K, DKD.A0j(A0K.A02)), AnonymousClass001.A0s());
        while (A1D.hasNext()) {
            try {
                DKC.A14(A1D).run();
            } catch (Exception unused) {
            }
        }
        Ezc A0K2 = DKC.A0K(c00i2);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new DVB(A0K2, DKD.A0j(A0K2.A0n)));
        A0s.add(new C1507AjU(A0K2, DKD.A0j(A0K2.A0k)));
        A0s.add(new DVC(A0K2, DKD.A0j(A0K2.A0w)));
        Iterator A1D2 = DKC.A1D(new DVD(A0K2, DKD.A0j(A0K2.A0a)), A0s);
        boolean z2 = false;
        while (A1D2.hasNext()) {
            try {
                DKC.A14(A1D2).run();
            } catch (Exception e) {
                1BK.A0U(c00i).markerAnnotate(9699340, "logout_error", e.getMessage());
                z2 = true;
            }
        }
        Ezc A0K3 = DKC.A0K(c00i2);
        Iterator A1D3 = DKC.A1D(new DVA(A0K3, DKD.A0j(A0K3.A02)), AnonymousClass001.A0s());
        while (A1D3.hasNext()) {
            try {
                DKC.A14(A1D3).run();
            } catch (Exception unused2) {
            }
        }
        QuickPerformanceLogger A0U3 = 1BK.A0U(c00i);
        short s2 = 2;
        if (z2) {
            s2 = 3;
        }
        A0U3.markerEnd(9699340, s2);
        erT.A00("clear_privacy_data_done");
        if (!A18()) {
            AtomicBoolean A1E = DKC.A1E(false);
            1BK.A0U(c00i).markerStart(9699342);
            AtomicBoolean A1E2 = DKC.A1E(false);
            final Ezc A0K4 = DKC.A0K(c00i2);
            ArrayList A0s2 = AnonymousClass001.A0s();
            final AtomicInteger atomicInteger = new AtomicInteger(LogcatReader.DEFAULT_WAIT_TIME);
            Class A0j = DKD.A0j(A0K4.A0K);
            C00i c00i3 = A0K4.A0r;
            A0s2.add(new DWB(A0K4, 1BK.A0V(c00i3), A0j, atomicInteger, atomicInteger, z));
            A0s2.add(new DWC(A0K4, 1BK.A0V(c00i3), DKD.A0j(A0K4.A0n), atomicInteger, atomicInteger, z));
            A0s2.add(new DWE(A0K4, 1BK.A0V(c00i3), DKD.A0j(A0K4.A0Y), atomicInteger, atomicInteger, z));
            A0s2.add(new DWF(A0K4, 1BK.A0V(c00i3), DKD.A0j(A0K4.A0f), atomicInteger, atomicInteger, z));
            A0s2.add(new DWG(A0K4, 1BK.A0V(c00i3), DKD.A0j(A0K4.A0i), atomicInteger, atomicInteger, z));
            final Class A0j2 = DKD.A0j(A0K4.A10);
            final QuickPerformanceLogger A0V = 1BK.A0V(c00i3);
            A0s2.add(new G6Y(A0V, A0j2, atomicInteger) { // from class: X.34l
                public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$93";

                public void A02() {
                    Ezc ezc = Ezc.this;
                    QuickPerformanceLogger A0U4 = 1BK.A0U(ezc.A0r);
                    int i = atomicInteger.get();
                    boolean z3 = z;
                    A0U4.markerAnnotate(9699343, i, "isProfileSwitch", z3);
                    C1oA c1oA = (C1oA) ezc.A10.get();
                    synchronized (c1oA) {
                        c1oA.A04 = false;
                    }
                    Iterator it = C1oA.A00(c1oA).iterator();
                    while (it.hasNext()) {
                        try {
                            ((3qP) it.next()).C9r();
                        } catch (Throwable th) {
                            c1oA.A05.softReport("SynchronousOmnistoreWrapper_delete_ComponentThrew", th);
                        }
                    }
                    synchronized (c1oA) {
                        Omnistore omnistore = c1oA.A00;
                        if (omnistore != null) {
                            try {
                                omnistore.close();
                            } catch (IOException e2) {
                                0fH.A0N(C1oA.class, "Error while closing omnistore", e2, new Object[0]);
                            }
                            c1oA.A00 = null;
                        }
                        c1oA.A03 = false;
                        if (!z3) {
                            try {
                                c1oA.A08.A00.A01();
                            } catch (AnonymousClass483 e3) {
                                0fH.A0N(C1oA.class, "Missing viewer context when deleting Omnistore", e3, new Object[0]);
                            }
                        }
                    }
                }
            });
            A0s2.add(new DWH(A0K4, 1BK.A0V(c00i3), DKD.A0j(A0K4.A0X), atomicInteger, atomicInteger, z));
            final Class A0j3 = DKD.A0j(A0K4.A0J);
            final QuickPerformanceLogger A0V2 = 1BK.A0V(c00i3);
            A0s2.add(new G6Y(A0V2, A0j3, atomicInteger) { // from class: X.34m
                public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$95";

                public void A02() {
                    Ezc ezc = Ezc.this;
                    QuickPerformanceLogger A0U4 = 1BK.A0U(ezc.A0r);
                    int i = atomicInteger.get();
                    boolean z3 = z;
                    A0U4.markerAnnotate(9699343, i, "isProfileSwitch", z3);
                    1aO r0 = (1aO) ezc.A0J.get();
                    if (!z3) {
                        r0.A02((1Zj) null, (String) null);
                        return;
                    }
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) r0.A00.get();
                    try {
                        lightweightQuickPerformanceLogger.markerStart(38469646);
                        long A00 = 1aP.A00(new 3cS(r0, new C3k5(r0)), r0);
                        lightweightQuickPerformanceLogger.markerAnnotate(38469646, "isSpecificUser", false);
                        lightweightQuickPerformanceLogger.markerAnnotate(38469646, "isSpecificUserToKeep", false);
                        lightweightQuickPerformanceLogger.markerAnnotate(38469646, "isSessionSwitch", true);
                        lightweightQuickPerformanceLogger.markerAnnotate(38469646, "removalCount", A00);
                        lightweightQuickPerformanceLogger.markerEnd(38469646, (short) 2);
                    } catch (Throwable th) {
                        lightweightQuickPerformanceLogger.markerAnnotate(38469646, "isSpecificUser", false);
                        lightweightQuickPerformanceLogger.markerAnnotate(38469646, "isSpecificUserToKeep", false);
                        lightweightQuickPerformanceLogger.markerAnnotate(38469646, "isSessionSwitch", true);
                        lightweightQuickPerformanceLogger.markerAnnotate(38469646, "removalCount", 0L);
                        lightweightQuickPerformanceLogger.markerEnd(38469646, (short) 2);
                        throw th;
                    }
                }
            });
            final Class A0j4 = DKD.A0j(A0K4.A0I);
            final QuickPerformanceLogger A0V3 = 1BK.A0V(c00i3);
            A0s2.add(new G6Y(A0V3, A0j4, atomicInteger) { // from class: X.34n
                public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$96";

                public void A02() {
                    Ezc ezc = Ezc.this;
                    QuickPerformanceLogger A0U4 = 1BK.A0U(ezc.A0r);
                    int i = atomicInteger.get();
                    boolean z3 = z;
                    A0U4.markerAnnotate(9699343, i, "isProfileSwitch", z3);
                    1aP r0 = (1aP) ezc.A0I.get();
                    if (z3) {
                        1aP.A00(new 3cS(r0, new C3k5(r0)), r0);
                    } else {
                        r0.A02((1Zj) null, (String) null);
                    }
                }
            });
            A0s2.add(new DWI(A0K4, 1BK.A0V(c00i3), DKD.A0j(A0K4.A0N), atomicInteger, atomicInteger, z));
            final Class A0j5 = DKD.A0j(A0K4.A0L);
            final QuickPerformanceLogger A0V4 = 1BK.A0V(c00i3);
            A0s2.add(new G6Y(A0V4, A0j5, atomicInteger) { // from class: X.34o
                public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$98";

                public void A02() {
                    Ezc ezc = Ezc.this;
                    QuickPerformanceLogger A0U4 = 1BK.A0U(ezc.A0r);
                    int i = atomicInteger.get();
                    boolean z3 = z;
                    A0U4.markerAnnotate(9699343, i, "isProfileSwitch", z3);
                    1aP r0 = (1aP) ezc.A0L.get();
                    if (z3) {
                        return;
                    }
                    1aP.A00(new 3cR(r0), r0);
                }
            });
            A0s2.add(new DWJ(A0K4, 1BK.A0V(c00i3), DKD.A0j(A0K4.A14), atomicInteger, atomicInteger, z));
            final Class A0j6 = DKD.A0j(A0K4.A13);
            final QuickPerformanceLogger A0V5 = 1BK.A0V(c00i3);
            Iterator A1D4 = DKC.A1D(new G6Y(A0V5, A0j6, atomicInteger) { // from class: X.34h
                public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$100";

                /* JADX WARN: Type inference failed for: r0v32, types: [X.0lf, java.lang.Object] */
                public void A02() {
                    boolean z3;
                    Ezc ezc = Ezc.this;
                    1BK.A0U(ezc.A0r).markerAnnotate(9699343, atomicInteger.get(), "isProfileSwitch", z);
                    3L9 r0 = (3L9) ezc.A13.get();
                    if (0Gw.A06()) {
                        ((03D) r0.A01.get()).A04("TraceCleaner", "clearUserData()");
                        ((3VP) r0.A00.get()).A08 = null;
                        0Gw A00 = 0Gw.A00();
                        A00.A0A((C0lf) new Object());
                        0H4 r02 = 0H4.A0C;
                        if (r02 != null) {
                            for (TraceContext traceContext : r02.A0B()) {
                                0H4.A07(r02, traceContext.A0B, traceContext.A01, 0, 9, traceContext.A05);
                            }
                        }
                        synchronized (A00) {
                            0Gy r03 = A00.A03;
                            Iterator it = r03.A04().iterator();
                            z3 = true;
                            while (it.hasNext()) {
                                File file = (File) it.next();
                                if (file.exists() && !file.delete()) {
                                    z3 = false;
                                    r03.A02.A02++;
                                }
                            }
                        }
                        if (z3) {
                            return;
                        }
                        0fH.A0n("ProfiloTraceCleaner", "Could not clear config or traces!");
                    }
                }
            }, A0s2);
            while (A1D4.hasNext()) {
                enC.A02.add(((ExecutorService) faa.A0A.get()).submit(new G4r(faa, DKC.A14(A1D4), A1E2, 9699342)));
            }
            boolean z3 = A1E2.get();
            if (z) {
                C00i c00i4 = faa.A07;
                if (((FEt) c00i4.get()).A00) {
                    final FFM ffm = (FFM) 1Bi.A03(100249);
                    Runnable runnable = new Runnable() { // from class: X.G1m
                        public static final String __redex_internal_original_name = "AuthLogoutCommonHelper$$ExternalSyntheticLambda1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            ffm.A01(enC, true);
                        }
                    };
                    if (((FEt) c00i4.get()).A02) {
                        faa.A02(runnable, A1E, 9699342);
                    } else {
                        enC.A02.add(((ExecutorService) faa.A0A.get()).submit(new G4r(faa, runnable, A1E, 9699342)));
                    }
                }
                if (((FEt) c00i4.get()).A01) {
                    faa.A02(new FzP((FFM) 1Bi.A03(100249)), A1E, 9699342);
                }
            }
            if (A1E.get() || z3) {
                A0U = 1BK.A0U(c00i);
                s = 3;
            } else {
                A0U = 1BK.A0U(c00i);
                s = 2;
            }
            A0U.markerEnd(9699342, s);
            try {
                Er7 er7 = (Er7) faa.A05.get();
                List list = enC.A02;
                er7.A00(list);
                list.clear();
                DKE.A1N(c00i, 9699330);
            } catch (RuntimeException e2) {
                1BK.A0U(c00i).markerAnnotate(9699330, "logout_error", e2.getMessage());
                DKE.A1O(c00i, 9699330);
            }
            erT.A00("clear_user_data_done");
        }
        A0U2.markerStart(9699344);
        1Eu r0 = this.A04;
        EoW eoW = (EoW) 1Br.A0B(r0.A05);
        String A00 = 1BJ.A00(781);
        C67Z c67z = eoW.A03;
        if (c67z != null) {
            FFq fFq = (FFq) 1Br.A0B(eoW.A01);
            Context A09 = 7zL.A09();
            ArrayList A0s3 = AnonymousClass001.A0s();
            A0s3.add(new F5b(c67z, EMr.A01));
            ReplicatedStorageRequest replicatedStorageRequest = new ReplicatedStorageRequest(A0s3);
            FIm fIm = (FIm) 1Br.A0B(eoW.A00);
            11T.A0I(fIm, AnonymousClass000.A00(ActionId.RTMP_CONNECTION_CONNECTED));
            fFq.A01(A09, 7zR.A0s(), A00, fIm, replicatedStorageRequest);
        }
        synchronized (r0.A0E) {
            ViewerContext viewerContext = ViewerContext.A01;
            11T.A0D(viewerContext);
            ViewerContext viewerContext2 = z ? r0.A0J.A02 : viewerContext;
            11T.A0D(viewerContext2);
            r0.A0J = new 1Go(viewerContext, viewerContext2, (ViewerContext) null, (User) null, true);
        }
        1FI r02 = r0.A01;
        InterfaceC00051a0 AP5 = r02.A01.AP5();
        AP5.Cdi(ErrorReportingConstants.USER_ID_KEY);
        AP5.Cdi(1BJ.A00(1892));
        AP5.Cdi(1BJ.A00(1891));
        AP5.Cdi("access_token");
        AP5.Cdi(1BJ.A00(2029));
        AP5.Cdi("secret");
        AP5.Cdi("session_key");
        AP5.Cdi("username");
        AP5.Cdi("analytics_claim");
        AP5.commit();
        if (!z) {
            InterfaceC00051a0 AP52 = 1FI.A00(r02).A00.AP5();
            AP52.AFD();
            AP52.commit();
        }
        1Ql A08 = 1Br.A08(r0.A06);
        A08.Cdj(C1mC.A07);
        A08.commit();
        if (!z) {
            r0.A0F.clear();
        }
        1Fv r03 = r0.A02;
        r03.A0A(r03.A02.A03, new DKb(r03, 9));
        C00i c00i5 = r0.A08.A00;
        ((Ewu) c00i5.get()).A00();
        ((Ewu) c00i5.get()).A00();
        ((Ewu) c00i5.get()).A00();
        A0U2.markerEnd(9699344, (short) 2);
        erT.A00("clear_auth_data_done");
    }

    public PasswordEncryptionKeyFetchResult A1D(PasswordEncryptionKeyFetchMethod$Params passwordEncryptionKeyFetchMethod$Params) {
        return (PasswordEncryptionKeyFetchResult) DKF.A0m(DKC.A0S(this.A0k), (1Rl) this.A0x.get(), this, passwordEncryptionKeyFetchMethod$Params);
    }

    public AccountSwitchingAuthenticationResult A1E(BrowserToNativeSSOCredentials browserToNativeSSOCredentials, String str) {
        return A01(new Fab(browserToNativeSSOCredentials, this, "browser_to_native_app_sso_account_switch").A00(), this, 1Fw.A00(), "auth_switch_accounts", str);
    }

    public AccountSwitchingAuthenticationResult A1F(DeviceBasedLoginCredentials deviceBasedLoginCredentials, FbUserSession fbUserSession, String str, String str2, String str3) {
        return A01(A06(deviceBasedLoginCredentials, str2, str3), this, fbUserSession, 1BJ.A00(42), str);
    }

    public AccountSwitchingAuthenticationResult A1G(OpenIDLoginCredentials openIDLoginCredentials, String str, List list) {
        return A01(new Fae(openIDLoginCredentials, this, 0S2.A0u, "account_switcher_oauth", list).A00(), this, 1Fw.A00(), AbE.A00(11), str);
    }

    public AccountSwitchingAuthenticationResult A1H(OpenIDLoginCredentials openIDLoginCredentials, String str, List list) {
        return A01(new Fae(openIDLoginCredentials, this, 0S2.A0u, "account_switcher_auto_login_oauth", list).A00(), this, 1Fw.A00(), 1BJ.A00(ActionId.ACTION_BAR_COMPLETE), str);
    }

    public AccountSwitchingAuthenticationResult A1I(PasswordCredentials passwordCredentials, String str, boolean z) {
        AccountSwitchingAuthenticationResult A02;
        String str2 = passwordCredentials.A04;
        if (1JF.A0B(str2)) {
            str2 = z ? "logged_in_messenger_only_account_switcher" : "logged_in_account_switcher";
        }
        FbUserSession A00 = 1Fw.A00();
        if (A1C(passwordCredentials)) {
            FEg fEg = (FEg) this.A0j.get();
            boolean A1C = A1C(passwordCredentials);
            String str3 = passwordCredentials.A03;
            String str4 = str3;
            if (A1C) {
                str4 = FEg.A01(fEg, str3);
            }
            A02 = null;
            int i = 0;
            int i2 = 0;
            do {
                try {
                    C00i c00i = fEg.A02;
                    FIO.A03(c00i, i2);
                    AccountSwitchingAuthenticationResult A002 = A00(new Fah(new PasswordCredentials(passwordCredentials.A01, passwordCredentials.A02, str4, str2, passwordCredentials.A00), this, str2).A00(), this, new EnC("auth_switch_accounts"), A00, str);
                    FIO.A04(c00i, i2);
                    return A002;
                } catch (2L0 e) {
                    ApiErrorResult apiErrorResult = e.result;
                    if (apiErrorResult != null) {
                        if (apiErrorResult.A00() == 418) {
                            FIO.A01(fEg, 418, i2);
                            if (i2 == 0) {
                                str4 = FEg.A00(fEg, e, str3);
                            } else {
                                if (i2 != 1) {
                                    throw e;
                                }
                                str4 = str3;
                            }
                            i2++;
                        } else {
                            i = apiErrorResult.A00();
                        }
                    }
                    FIO.A01(fEg, i, i2);
                    throw e;
                }
            } while (i2 < 3);
        }
        A02 = A02(new Fah(passwordCredentials, this, str2).A00(), new EnC("auth_switch_accounts"), A00, str, true, false);
        return A02;
    }

    public AccountSwitchingAuthenticationResult A1J(FbUserSession fbUserSession, String str, String str2, String str3) {
        if (1JF.A0B(str) || 1JF.A0B(str2)) {
            throw AnonymousClass001.A0L("Both Access Token and UserId are required for Horizon Account switch");
        }
        return A02(new AuthenticationResultImpl(new FacebookCredentials(str, str2, null, null, str3, null, null, null, null, false), null, str, null, null, null), new EnC(1BJ.A00(80)), fbUserSession, null, false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009c, code lost:
    
        if (com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt.CAMERA_ID_FRONT.equals(r0.mUserId) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        if (com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt.CAMERA_ID_FRONT.equals(r0.mUserId) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006d, code lost:
    
        if (com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt.CAMERA_ID_FRONT.equals(r0.mUserId) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.auth.component.AccountSwitchingAuthenticationResult A1K(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fck.A1K(java.lang.String):com.facebook.auth.component.AccountSwitchingAuthenticationResult");
    }

    public AccountSwitchingAuthenticationResult A1L(String str, String str2) {
        if (1JF.A0B(str) || 1JF.A0B(str2)) {
            throw AnonymousClass001.A0L("AccessToken and EIMU are required for IG account switch");
        }
        return A02(new AuthenticationResultImpl(new FacebookCredentials(str, str2, null, null, null, null, null, null, "", false), TriState.UNSET, str, null, null, null), new EnC(1BJ.A00(81)), 1Fw.A00(), null, false, true);
    }

    public AccountSwitchingAuthenticationResult A1M(String str, String str2) {
        FbUserSession A00 = 1Fw.A00();
        ViewerContext Aue = this.A04.Aue();
        if (Aue != ViewerContext.A01) {
            return A02(new AuthenticationResultImpl(new FacebookCredentials(str, str2, Aue.mUserId, Aue.mAuthToken, null, null, null, null, Aue.A00, false), TriState.UNSET, str, null, null, null), new EnC(1BJ.A00(ActionId.APPLY_FINISHED_LIST)), A00, null, false, true);
        }
        throw AnonymousClass001.A0N("Viewer context should not be null when account switching");
    }

    public AccountSwitchingAuthenticationResult A1N(String str, String str2) {
        return A01(new Fad(this, str, "sso_switch_account").A00(), this, 1Fw.A00(), 1BJ.A00(ActionId.FUTURE_LISTENERS_COMPLETE), str2);
    }

    public AccountSwitchingAuthenticationResult A1O(String str, String str2, String str3) {
        AuthenticationResult A00;
        ViewerContext Aue = this.A04.Aue();
        if (Aue != ViewerContext.A01 && Aue.mIsPageContext) {
            Aue = (ViewerContext) 1Bn.A0A(33059);
        }
        C00i c00i = this.A0g;
        if (((C09794rj) c00i.get()).A04) {
            FaS faS = new FaS(this, str);
            Fck fck = faS.A01;
            A00 = (AuthenticationResult) DKF.A0m(DKC.A0S(fck.A0U), DKE.A0Y(fck), faS, faS.A00);
        } else {
            A00 = new Faf(this, Aue, str, str2, str3).A00();
        }
        FbUserSession A002 = 1Fw.A00();
        boolean z = ((C09794rj) c00i.get()).A02;
        EnC enC = new EnC("auth_messenger_page_account_switch");
        enC.A03 = z;
        return A02(A00, enC, A002, null, false, true);
    }

    public AccountSwitchingAuthenticationResult A1P(String str, String str2, String str3) {
        return A02(new AuthenticationResultImpl(new FacebookCredentials(str, str2, null, null, str3, null, null, null, null, false), null, str, null, null, null), new EnC("auth_messenger_soap_account_switch"), 1Fw.A00(), null, false, true);
    }

    public ReauthResult A1Q(String str) {
        return (ReauthResult) DKF.A0m(this.A0I, (1Rl) this.A0x.get(), this, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ce A[Catch: Exception -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01e0, blocks: (B:2:0x0000, B:3:0x0006, B:4:0x000f, B:6:0x0019, B:7:0x001f, B:8:0x0026, B:9:0x002c, B:11:0x0037, B:13:0x003e, B:14:0x0043, B:17:0x004f, B:18:0x0055, B:19:0x005c, B:21:0x0063, B:22:0x006c, B:25:0x0078, B:27:0x0083, B:29:0x008d, B:31:0x0093, B:32:0x0098, B:33:0x009f, B:35:0x00a6, B:37:0x00b0, B:41:0x00c1, B:43:0x00c9, B:45:0x00de, B:51:0x00fe, B:52:0x0104, B:53:0x010b, B:54:0x0112, B:56:0x0121, B:58:0x0126, B:59:0x012b, B:64:0x013e, B:66:0x0146, B:68:0x014f, B:70:0x0158, B:72:0x015e, B:73:0x0163, B:74:0x016a, B:75:0x016f, B:80:0x0199, B:82:0x01a3, B:84:0x01aa, B:87:0x01ce, B:89:0x01d3, B:93:0x01da, B:97:0x01bf), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.auth.component.listener.interfaces.AuthenticationResult A1R(com.facebook.auth.component.listener.interfaces.AuthenticationResult r302, X.EnC r303, java.lang.String r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fck.A1R(com.facebook.auth.component.listener.interfaces.AuthenticationResult, X.EnC, java.lang.String, boolean):com.facebook.auth.component.listener.interfaces.AuthenticationResult");
    }

    public AuthenticationResult A1S(BrowserToNativeSSOCredentials browserToNativeSSOCredentials) {
        return A08(new Fab(browserToNativeSSOCredentials, this, "browser_to_native_app_sso"));
    }

    public AuthenticationResult A1T(DeviceBasedLoginCredentials deviceBasedLoginCredentials) {
        return A0F(new Fag(deviceBasedLoginCredentials, this, null, FFU.A01(this.A0b)), null);
    }

    public AuthenticationResult A1U(NonceCredentials nonceCredentials) {
        return A08(new FaT(nonceCredentials, this));
    }

    public AuthenticationResult A1V(OpenIDLoginCredentials openIDLoginCredentials, Integer num, List list) {
        return A08(new Fae(openIDLoginCredentials, this, num, "login_oauth", list));
    }

    public AuthenticationResult A1W(PasswordCredentials passwordCredentials) {
        AuthenticationResult A00 = new Fah(passwordCredentials, this, null).A00();
        FacebookCredentials facebookCredentials = ((AuthenticationResultImpl) A00).A00;
        String str = facebookCredentials.A07;
        String str2 = facebookCredentials.A06;
        C00i c00i = this.A0c;
        1Ql A0V = 1BL.A0V(c00i);
        1G2 r0 = C1mC.A00;
        AbK.A1O(A0V, r0);
        A13(str, str2);
        this.A05.A01();
        AuthenticationResult A08 = A08(new FaR(A00, this));
        1Ql A0V2 = 1BL.A0V(c00i);
        A0V2.Cdj(r0);
        A0V2.commit();
        return A08;
    }

    public AuthenticationResult A1X(PasswordCredentials passwordCredentials) {
        return A08(new FaU(passwordCredentials, this));
    }

    public AuthenticationResult A1Y(PasswordCredentials passwordCredentials) {
        AuthenticationResult A08;
        if (A1C(passwordCredentials)) {
            FEg fEg = (FEg) this.A0j.get();
            boolean A1C = A1C(passwordCredentials);
            String str = passwordCredentials.A03;
            String str2 = str;
            if (A1C) {
                str2 = FEg.A01(fEg, str);
            }
            A08 = null;
            int i = 0;
            int i2 = 0;
            do {
                try {
                    C00i c00i = fEg.A02;
                    FIO.A03(c00i, i2);
                    AuthenticationResult A0A = A0A(new Fah(new PasswordCredentials(passwordCredentials.A01, passwordCredentials.A02, str2, passwordCredentials.A04, passwordCredentials.A00), this, null), this);
                    FIO.A04(c00i, i2);
                    return A0A;
                } catch (2L0 e) {
                    ApiErrorResult apiErrorResult = e.result;
                    if (apiErrorResult != null) {
                        if (apiErrorResult.A00() == 418) {
                            FIO.A01(fEg, 418, i2);
                            if (i2 == 0) {
                                str2 = FEg.A00(fEg, e, str);
                            } else {
                                if (i2 != 1) {
                                    throw e;
                                }
                                str2 = str;
                            }
                            i2++;
                        } else {
                            i = apiErrorResult.A00();
                        }
                    }
                    FIO.A01(fEg, i, i2);
                    throw e;
                }
            } while (i2 < 3);
        }
        A08 = A08(new Fah(passwordCredentials, this, null));
        return A08;
    }

    public AuthenticationResult A1Z(PasswordCredentials passwordCredentials) {
        AuthenticationResult A0E;
        if (A1C(passwordCredentials)) {
            FEg fEg = (FEg) this.A0j.get();
            boolean A1C = A1C(passwordCredentials);
            String str = passwordCredentials.A03;
            String str2 = str;
            if (A1C) {
                str2 = FEg.A01(fEg, str);
            }
            A0E = null;
            int i = 0;
            int i2 = 0;
            do {
                try {
                    C00i c00i = fEg.A02;
                    FIO.A03(c00i, i2);
                    AuthenticationResult A0B = A0B(new Fah(new PasswordCredentials(passwordCredentials.A01, passwordCredentials.A02, str2, passwordCredentials.A04, passwordCredentials.A00), this, null), this);
                    FIO.A04(c00i, i2);
                    return A0B;
                } catch (2L0 e) {
                    ApiErrorResult apiErrorResult = e.result;
                    if (apiErrorResult != null) {
                        if (apiErrorResult.A00() == 418) {
                            FIO.A01(fEg, 418, i2);
                            if (i2 == 0) {
                                str2 = FEg.A00(fEg, e, str);
                            } else {
                                if (i2 != 1) {
                                    throw e;
                                }
                                str2 = str;
                            }
                            i2++;
                        } else {
                            i = apiErrorResult.A00();
                        }
                    }
                    FIO.A01(fEg, i, i2);
                    throw e;
                }
            } while (i2 < 3);
        }
        A0E = A0E(new Fah(passwordCredentials, this, null), null, true);
        return A0E;
    }

    public AuthenticationResult A1a(PasswordCredentials passwordCredentials) {
        AuthenticationResult A08;
        if (A1C(passwordCredentials)) {
            FEg fEg = (FEg) this.A0j.get();
            boolean A1C = A1C(passwordCredentials);
            String str = passwordCredentials.A03;
            String str2 = str;
            if (A1C) {
                str2 = FEg.A01(fEg, str);
            }
            A08 = null;
            int i = 0;
            int i2 = 0;
            do {
                try {
                    C00i c00i = fEg.A02;
                    FIO.A03(c00i, i2);
                    AuthenticationResult A0A = A0A(new Fah(new PasswordCredentials(passwordCredentials.A01, passwordCredentials.A02, str2), this, "messenger_registration_softmatch_result"), this);
                    FIO.A04(c00i, i2);
                    return A0A;
                } catch (2L0 e) {
                    ApiErrorResult apiErrorResult = e.result;
                    if (apiErrorResult != null) {
                        if (apiErrorResult.A00() == 418) {
                            FIO.A01(fEg, 418, i2);
                            if (i2 == 0) {
                                str2 = FEg.A00(fEg, e, str);
                            } else {
                                if (i2 != 1) {
                                    throw e;
                                }
                                str2 = str;
                            }
                            i2++;
                        } else {
                            i = apiErrorResult.A00();
                        }
                    }
                    FIO.A01(fEg, i, i2);
                    throw e;
                }
            } while (i2 < 3);
        }
        A08 = A08(new Fah(passwordCredentials, this, "messenger_registration_softmatch_result"));
        return A08;
    }

    public AuthenticationResult A1b(PasswordCredentials passwordCredentials, String str, String str2) {
        return (AuthenticationResult) new FaZ(passwordCredentials, this, str, str2, (String) null, (String) null, (String) null).call();
    }

    public AuthenticationResult A1c(PasswordCredentials passwordCredentials, String str, String str2, String str3, String str4, String str5) {
        return A08(new FaZ(passwordCredentials, this, str, str2, str3, str4, str5));
    }

    public AuthenticationResult A1d(PasswordCredentials passwordCredentials, String str, String str2, String str3, String str4, String str5) {
        AuthenticationResult A0F;
        if (A1C(passwordCredentials)) {
            FEg fEg = (FEg) this.A0j.get();
            String str6 = passwordCredentials.A03;
            String str7 = FHp.A03(str6, fEg.A03, (F5N) null).A00;
            A0F = null;
            int i = 0;
            int i2 = 0;
            do {
                try {
                    C00i c00i = fEg.A02;
                    FIO.A03(c00i, i2);
                    AuthenticationResult A0C = A0C(new Fah(new PasswordCredentials(passwordCredentials.A01, passwordCredentials.A02, str7), this, str2, null, str3, str4, null), this, str);
                    FIO.A04(c00i, i2);
                    return A0C;
                } catch (2L0 e) {
                    ApiErrorResult apiErrorResult = e.result;
                    if (apiErrorResult != null) {
                        if (apiErrorResult.A00() == 418) {
                            FIO.A01(fEg, 418, i2);
                            if (i2 == 0) {
                                str7 = FEg.A00(fEg, e, str6);
                            } else {
                                if (i2 != 1) {
                                    throw e;
                                }
                                str7 = str6;
                            }
                            i2++;
                        } else {
                            i = apiErrorResult.A00();
                        }
                    }
                    FIO.A01(fEg, i, i2);
                    throw e;
                }
            } while (i2 < 3);
        }
        A0F = A0F(new Fah(passwordCredentials, this, str2, null, str3, str4, str5), str);
        return A0F;
    }

    public AuthenticationResult A1e(WorkUserSwitchCredentials workUserSwitchCredentials) {
        return A07(workUserSwitchCredentials);
    }

    public AuthenticationResult A1f(ConfirmedMessengerCredentials confirmedMessengerCredentials) {
        return A08(new FaP(this, confirmedMessengerCredentials));
    }

    public AuthenticationResult A1g(ConfirmedMessengerOnlyUserCredentials confirmedMessengerOnlyUserCredentials) {
        return A08(new FaQ(this, confirmedMessengerOnlyUserCredentials));
    }

    public AuthenticationResult A1h(CreateMessengerAccountCredentials createMessengerAccountCredentials, InstagramUserInfo instagramUserInfo, String str, boolean z) {
        return A08(new FaY(this, createMessengerAccountCredentials, instagramUserInfo, str, z));
    }

    public AuthenticationResult A1i(String str) {
        return A08(new FaV(this, str));
    }

    public AuthenticationResult A1j(String str) {
        return A08(new Fad(this, str, "sso_login"));
    }

    public AuthenticationResult A1k(String str) {
        return A0E(new Fad(this, str, "sso_login"), null, true);
    }

    public AuthenticationResult A1l(String str) {
        return A08(new Fad(this, str, AbE.A00(735)));
    }

    public AuthenticationResult A1m(String str, String str2) {
        return A08(new FaW(this, str, str2));
    }

    public AuthenticationResult A1n(String str, String str2) {
        return A0F(new Fad(this, str, "work_sso_login"), str2);
    }

    public AuthenticationResult A1o(String str, String str2, String str3) {
        return A0E(new FaX(this, str, str2, str3), null, false);
    }

    public AuthenticationResult A1p(String str, String str2, String str3, String str4, String str5, String str6) {
        return A08(new Faa(this, str, str2, str3, str4, str5, str6));
    }

    public AuthCredentialCheckResult A1q(PasswordCredentials passwordCredentials, OpenIDCredential openIDCredential) {
        FEg fEg = (FEg) this.A0j.get();
        String str = passwordCredentials.A03;
        String str2 = FHp.A03(str, fEg.A03, (F5N) null).A00;
        AuthCredentialCheckResult authCredentialCheckResult = null;
        int i = 0;
        int i2 = 0;
        do {
            try {
                C00i c00i = fEg.A02;
                FIO.A03(c00i, i2);
                AuthCredentialCheckResult authCredentialCheckResult2 = (AuthCredentialCheckResult) DKE.A0Y(this).A07(CallerContext.A09(Fck.class, __redex_internal_original_name), DKC.A0S(this.A0P), (C04033zm) null, new Bjd(new PasswordCredentials(EPM.A0L, passwordCredentials.A02, str2), openIDCredential));
                authCredentialCheckResult = authCredentialCheckResult2;
                FIO.A04(c00i, i2);
                return authCredentialCheckResult2;
            } catch (2L0 e) {
                ApiErrorResult apiErrorResult = e.result;
                if (apiErrorResult != null) {
                    if (apiErrorResult.A00() == 418) {
                        FIO.A01(fEg, 418, i2);
                        if (i2 == 0) {
                            str2 = FEg.A00(fEg, e, str);
                        } else {
                            if (i2 != 1) {
                                throw e;
                            }
                            str2 = str;
                        }
                        i2++;
                    } else {
                        i = apiErrorResult.A00();
                    }
                }
                FIO.A01(fEg, i, i2);
                throw e;
            }
        } while (i2 < 3);
        return authCredentialCheckResult;
    }

    public AuthIdentifyUserResult A1r(PasswordCredentials passwordCredentials, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        FEg fEg = (FEg) this.A0j.get();
        String str2 = passwordCredentials.A03;
        String str3 = FHp.A03(str2, fEg.A03, (F5N) null).A00;
        AuthIdentifyUserResult authIdentifyUserResult = null;
        int i = 0;
        int i2 = 0;
        do {
            try {
                C00i c00i = fEg.A02;
                FIO.A03(c00i, i2);
                AuthIdentifyUserResult authIdentifyUserResult2 = (AuthIdentifyUserResult) DKE.A0Y(this).A07(CallerContext.A09(Fck.class, __redex_internal_original_name), DKC.A0S(this.A0N), (C04033zm) null, new Btd(new PasswordCredentials(EPM.A0L, passwordCredentials.A02, str3), str, arrayList, arrayList2, arrayList3));
                authIdentifyUserResult = authIdentifyUserResult2;
                FIO.A04(c00i, i2);
                return authIdentifyUserResult2;
            } catch (2L0 e) {
                ApiErrorResult apiErrorResult = e.result;
                if (apiErrorResult != null) {
                    if (apiErrorResult.A00() == 418) {
                        FIO.A01(fEg, 418, i2);
                        if (i2 == 0) {
                            str3 = FEg.A00(fEg, e, str2);
                        } else {
                            if (i2 != 1) {
                                throw e;
                            }
                            str3 = str2;
                        }
                        i2++;
                    } else {
                        i = apiErrorResult.A00();
                    }
                }
                FIO.A01(fEg, i, i2);
                throw e;
            }
        } while (i2 < 3);
        return authIdentifyUserResult;
    }

    public MsgrDeviceSharingFilterResult A1s(Bo9 bo9) {
        return (MsgrDeviceSharingFilterResult) DKF.A0m(DKC.A0S(this.A0i), (1Rl) this.A0x.get(), this, bo9);
    }

    public UserTypeResult A1t(InstagramPasswordCredentials instagramPasswordCredentials) {
        G76 g76 = new G76(this, instagramPasswordCredentials);
        Ebl ebl = new Ebl(g76.A00);
        Fck fck = g76.A01;
        return (UserTypeResult) DKF.A0m(fck.A0F, DKE.A0Y(fck), g76, ebl);
    }

    public UserTypeResult A1u(String str, String str2) {
        G77 g77 = new G77(this, str, str2);
        EhD ehD = new EhD(g77.A01, g77.A00);
        Fck fck = g77.A02;
        return (UserTypeResult) DKF.A0m(fck.A0E, DKE.A0Y(fck), g77, ehD);
    }

    public ArrayList A1v(Bte bte) {
        return (ArrayList) DKF.A0m(DKC.A0S(this.A0d), (1Rl) this.A0x.get(), this, bte);
    }

    public void A1w(DeviceBasedLoginCredentials deviceBasedLoginCredentials) {
        1Kd.A0E(new Fvv(this.A0u.get(), 0, this), MoreExecutors.listeningDecorator((ExecutorService) this.A0e.get()).D3C(new Fag(deviceBasedLoginCredentials, this)));
    }

    public void A1y(String str, boolean z) {
        A15(z, A0n(str));
    }

    public /* synthetic */ void A1z(List list, List list2) {
        list.clear();
        list2.clear();
        ((C1vf) this.A0M.get()).A01("login_complete", 338399944209237L);
    }
}
