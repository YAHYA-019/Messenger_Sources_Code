package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceInfo;
import java.util.concurrent.ExecutionException;

/* renamed from: X.Akm, reason: case insensitive filesystem */
/* loaded from: Akm.class */
public abstract class AbstractC1533Akm extends 1pK {
    public static final String __redex_internal_original_name = "GroupInviteFragment";
    public FbUserSession A00;
    public 1pI A01;
    public CfG A02;
    public LithoView A03;
    public ThreadSummary A04;
    public C57q A05;
    public 7EM A06;
    public C07884l6 A07;
    public C07924lC A08;
    public 4lA A09;
    public MigColorScheme A0A;
    public String A0B;
    public boolean A0C;
    public 5I5 A0D;
    public C1266Ac8 A0E;
    public final RGN A0G = new RGN(this);
    public final MailboxCallback A0H = Czk.A00(this, ActionId.NEW_START_FOUND);
    public final Handler A0F = AnonymousClass001.A07();

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        setRetainInstance(true);
        this.A0A = 7zS.A0j(this);
        FbUserSession A01 = 1BM.A01(this);
        11T.A0F(A01, 0);
        this.A00 = A01;
        this.A0B = A1X().A02;
        this.A05 = (C57q) 1Bi.A03(68640);
        7EM r0 = (7EM) 7zO.A0l(this, 83021);
        11T.A0F(r0, 0);
        this.A06 = r0;
        this.A0D = (5I5) 7zN.A0n(this, A1X(), 49665);
        this.A0E = (C1266Ac8) 1Bn.A0A(83025);
    }

    public final FbUserSession A1X() {
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession != null) {
            return fbUserSession;
        }
        7zL.A1C();
        throw 0Q8.createAndThrow();
    }

    public final ThreadSummary A1Y() {
        ThreadSummary threadSummary = this.A04;
        if (threadSummary != null) {
            return threadSummary;
        }
        11T.A0L("threadSummary");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1Z() {
        CfG cfG = this.A02;
        if (cfG == null) {
            cfG = ((CHy) 7zO.A0l(this, 82650)).A01(requireContext(), 2131957466);
            this.A02 = cfG;
        }
        cfG.ABm();
        7EM r0 = this.A06;
        if (r0 == null) {
            11T.A0L("messageRequestsActionHelper");
            throw 0Q8.createAndThrow();
        }
        ThreadKey A0f = AbF.A0f(A1Y());
        String A0s = 7zR.A0s();
        1F9 r305 = A1Y().A0g;
        MailboxCallback mailboxCallback = this.A0H;
        FbUserSession A1X = A1X();
        11T.A0F(mailboxCallback, 3);
        5Q3 r02 = (5Q3) 4YU.A0o(A1X, r0.A02, 84053);
        if (!ThreadKey.A0P(A0f)) {
            throw 1BK.A0g();
        }
        CIT A02 = 5Q3.A02(r02);
        if (1BK.A0N(A02.A07).AZk(36319978623613465L)) {
            MailboxFeature mailboxFeature = (MailboxFeature) A02.A05.get();
            C00i c00i = A02.A09;
            AnonymousClass224 anonymousClass224 = (AnonymousClass224) c00i.get();
            String l = Long.toString(798981217579266L);
            PrivacyContext A00 = anonymousClass224.A00(l);
            A02.A08.get();
            String A002 = 5QA.A00(A0f);
            A02.A03.get();
            LoggingOption A003 = 5Q5.A00(((AnonymousClass224) c00i.get()).A00(l), (Integer) null, 320, (Number) null, ((5Et) A02.A0A.get()).A00(320), (String) null, (String) null);
            1Um A0O = 1BK.A0O(mailboxFeature, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            MailboxFutureImpl A0P2 = 1BK.A0P(A0O);
            1Um.A01(A0O, new IbV(mailboxFeature, A0P2, A003, A0P, A00, A002, 2), A0P, A0P2);
            Czk.A02(A0P, mailboxCallback, 68);
        } else {
            MailboxFeature mailboxFeature2 = (MailboxFeature) A02.A06.get();
            long j = A0f.A01;
            PrivacyContext A004 = ((AnonymousClass224) A02.A09.get()).A00(Long.toString(798981217579266L));
            1Um AQV = mailboxFeature2.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P3 = 1BK.A0P(AQV);
            int A005 = 4uZ.A00(A0P3, (1X9) null);
            TraceInfo A022 = 4uZ.A02(A0P3, (LoggingOption) null, "MailboxTam", "runTamClientJoinGroupThreadUsingGroupInviteCode");
            if (!AQV.Cj2(new CyA(A005, 6, j, mailboxFeature2, A004, A0P3))) {
                A0P3.cancel(false);
                4uZ.A03(A005);
                4uZ.A05((LoggingOption) null, A022, "MailboxTam", "runTamClientJoinGroupThreadUsingGroupInviteCode");
            }
            PlatformLogger.platformEventLog(5);
            A0P3.addResultCallback(mailboxCallback);
        }
        C1266Ac8 c1266Ac8 = (C1266Ac8) 1Br.A0B(r0.A05);
        if (r305 == null) {
            r305 = 1F9.A0N;
        }
        c1266Ac8.A04(r305, A0f, A0s, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 403489702);
        super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView lithoView = new LithoView(7zP.A0T(this));
        7zR.A11(lithoView);
        this.A03 = lithoView;
        0FI.A08(1331785139, A04);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1442613667);
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (this.A0C) {
            1pI r0 = this.A01;
            if (r0 == null) {
                11T.A0L("contentViewManager");
                throw 0Q8.createAndThrow();
            }
            r0.CeH("group_invite_fragment");
        }
        0FI.A08(-1839078288, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(-1764151804);
        super/*androidx.fragment.app.Fragment*/.onStop();
        CfG cfG = this.A02;
        if (cfG != null) {
            cfG.D2v();
        }
        0FI.A08(1984876323, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        LithoView lithoView = this.A03;
        if (lithoView != null) {
            this.A01 = new C5xd(lithoView);
            super.onViewCreated(view, bundle);
            5P7 r0 = (5P7) 7zN.A0n(this, A1X(), 49711);
            long j = A1Y().A0n.A01;
            try {
                MailboxFeature mailboxFeature = (MailboxFeature) r0.A05.get();
                1Um A0O = 1BK.A0O(mailboxFeature, 0);
                MailboxFutureImpl A0P = 1BK.A0P(A0O);
                int A00 = 4uZ.A00(A0P, (1X9) null);
                TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamClientGroupInviteFetchInfo");
                if (!A0O.Cj2(new CzV(A00, 10, j, mailboxFeature, A0P))) {
                    A0P.cancel(false);
                    4uZ.A03(A00);
                    4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamClientGroupInviteFetchInfo");
                }
                PlatformLogger.platformEventLog(5);
                A0P.get();
                AcC A05 = r0.A05(A1Y().A0n);
                if (A05 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                C07924lC c07924lC = A05.A03;
                if (c07924lC == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                this.A08 = c07924lC;
                C07884l6 c07884l6 = A05.A02;
                11T.A09(c07884l6);
                this.A07 = c07884l6;
                4lA r02 = A05.A04;
                if (r02 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                this.A09 = r02;
                LithoView lithoView2 = this.A03;
                if (lithoView2 != null) {
                    lithoView2.postDelayed(new S8Y(this), 100);
                    C1266Ac8 c1266Ac8 = this.A0E;
                    if (c1266Ac8 == null) {
                        str = "messageRequestsAnalyticsLogger";
                    } else {
                        ThreadKey A0f = AbF.A0f(A1Y());
                        1F9 r304 = A1Y().A0g;
                        if (r304 == null) {
                            r304 = 1F9.A0N;
                        }
                        c1266Ac8.A02(r304, A0f, 7zR.A0s());
                        1pI r03 = this.A01;
                        str = "contentViewManager";
                        if (r03 != null) {
                            if (r03.BVa()) {
                                1pI r04 = this.A01;
                                if (r04 != null) {
                                    r04.CeH(1BJ.A00(494));
                                }
                            }
                            7EM r05 = this.A06;
                            if (r05 != null) {
                                r05.A00 = new Rs9(this);
                                5I5 r06 = this.A0D;
                                if (r06 != null) {
                                    5I5.A03(A1Y(), r06, true, true);
                                    return;
                                }
                                str = "readThreadManager";
                            } else {
                                str = "messageRequestsActionHelper";
                            }
                        }
                    }
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException("fetchGroupInviteInfoImmediate failed: Error while getting thread for threadPk", e);
            }
        }
        str = "lithoView";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
