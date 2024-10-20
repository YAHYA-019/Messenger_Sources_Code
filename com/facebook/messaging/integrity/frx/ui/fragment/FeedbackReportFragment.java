package com.facebook.messaging.integrity.frx.ui.fragment;

import X.06Z;
import X.0FI;
import X.0Pz;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Iw;
import X.1Js;
import X.1UG;
import X.1XU;
import X.1iF;
import X.1tC;
import X.2ZM;
import X.4YV;
import X.6In;
import X.6Io;
import X.7EN;
import X.7zL;
import X.7zO;
import X.7zP;
import X.7zR;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AbL;
import X.AbR;
import X.AeX;
import X.AnonymousClass001;
import X.BLo;
import X.BM9;
import X.BNT;
import X.BU9;
import X.BeX;
import X.BeY;
import X.BeZ;
import X.Bea;
import X.Bpn;
import X.BsZ;
import X.Byr;
import X.C00i;
import X.C0A2;
import X.C0o;
import X.C0p;
import X.C15h;
import X.C1ph;
import X.C1pq;
import X.C2p;
import X.C2s;
import X.C5M;
import X.C5ic;
import X.C5yl;
import X.C5yq;
import X.C5yr;
import X.C68t;
import X.C73;
import X.C8D;
import X.C8r;
import X.CC7;
import X.CFj;
import X.CIB;
import X.CIN;
import X.CIX;
import X.CLl;
import X.COr;
import X.COw;
import X.CPB;
import X.CQ2;
import X.CQD;
import X.CQd;
import X.CSF;
import X.CSG;
import X.CaE;
import X.ClM;
import X.Cle;
import X.Clg;
import X.Cll;
import X.Cnd;
import X.CwD;
import X.DBe;
import X.DDz;
import X.DFB;
import X.DFC;
import X.DFE;
import X.DGC;
import X.DH2;
import X.DR6;
import X.EAX;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.ignore.IgnoreMessagesDialogFragment;
import com.facebook.messaging.integrity.frx.model.AdditionalActionsPage;
import com.facebook.messaging.integrity.frx.model.EvidencePage;
import com.facebook.messaging.integrity.frx.model.EvidenceSearchPage;
import com.facebook.messaging.integrity.frx.model.FRXEvidencePrompt;
import com.facebook.messaging.integrity.frx.model.FRXPage;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.integrity.frx.model.FeedbackPage;
import com.facebook.messaging.integrity.frx.model.FeedbackSubmissionResult;
import com.facebook.messaging.integrity.frx.model.GroupMembersPage;
import com.facebook.messaging.integrity.frx.model.MarketplaceFeedbackPage;
import com.facebook.messaging.integrity.frx.model.ProactiveWarningParams;
import com.facebook.messaging.integrity.frx.ui.nav.FRXNavState;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.MarketplaceThreadData;
import com.facebook.messaging.model.threads.MarketplaceThreadUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.blocking.HideMontageDialogFragment;
import com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.orca.notify.mute.MuteNotificationsDialogFragment;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FeedbackReportFragment.class */
public class FeedbackReportFragment extends SlidingSheetFullScreenDialogFragment {
    public FbUserSession A00;
    public DDz A01;
    public EAX A02;
    public 1Iw A03;
    public LithoView A04;
    public C2p A05;
    public 6Io A06;
    public CQd A07;
    public CIN A08;
    public COr A09;
    public CFj A0A;
    public CQ2 A0B;
    public Byr A0C;
    public DFB A0D;
    public CQD A0E;
    public FRXParams A0F;
    public FeedbackSubmissionResult A0G;
    public FRXNavState A0H;
    public CC7 A0I;
    public BsZ A0J;
    public C73 A0K;
    public COw A0L;
    public ThreadKey A0M;
    public ThreadSummary A0N;
    public MigColorScheme A0O;
    public User A0P;
    public User A0Q;
    public ImmutableList A0R;
    public ImmutableList A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public C15h A0X;
    public boolean A0Y;
    public boolean A0Z;
    public AeX A0a;
    public 6In A0b;
    public BU9 A0c;
    public Boolean A0d;
    public final C0o A0n = new C0o(this);
    public final DFE A0s = new Cll(this);
    public final BeX A0o = new BeX(this);
    public final BeY A0y = new BeY(this);
    public final BeZ A0p = new BeZ(this);
    public final C0p A0q = new C0p(this);
    public final DH2 A0m = new ClM(this);
    public final Bea A0r = new Bea(this);
    public final DGC A0z = new CwD(this, 0);
    public final C00i A0w = 1BQ.A02(49965);
    public final C00i A0u = 1BV.A00(404);
    public final C00i A0j = 1BQ.A00();
    public final C00i A0k = 1BQ.A02(68198);
    public final C00i A0e = 1BQ.A02(83523);
    public final C00i A0l = AbF.A0S(this, 84911);
    public final C00i A0g = 1BV.A00(602);
    public final C00i A0f = 1BV.A00(85090);
    public final C00i A0h = 1BQ.A02(81940);
    public final C00i A0v = 1BQ.A02(84919);
    public final C00i A0x = 1BQ.A02(84920);
    public final C00i A0i = 1BQ.A02(66347);
    public final Set A0t = AnonymousClass001.A0v();
    public ArrayList A0W = AnonymousClass001.A0s();

    public static FRXPage A05(FeedbackReportFragment feedbackReportFragment) {
        FRXNavState fRXNavState = feedbackReportFragment.A0H;
        if (fRXNavState == null) {
            return null;
        }
        ArrayList arrayList = fRXNavState.A00;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (FRXPage) arrayList.get(arrayList.size() - 1);
    }

    public static void A06(FRXEvidencePrompt fRXEvidencePrompt, FeedbackReportFragment feedbackReportFragment, User user, ImmutableList immutableList, ImmutableList immutableList2, boolean z) {
        CQD cqd = feedbackReportFragment.A0E;
        cqd.getClass();
        boolean z2 = feedbackReportFragment.A0Y;
        Integer num = null;
        HashSet A0v = AnonymousClass001.A0v();
        ImmutableList.of();
        String str = fRXEvidencePrompt.A02;
        String str2 = fRXEvidencePrompt.A01;
        C1pq.A08("topContactsList", immutableList);
        BM9 A00 = fRXEvidencePrompt.A00();
        HashSet A07 = C1pq.A07(A00, "evidenceType", A0v, A0v);
        if (user != null) {
            int i = 2131960050;
            if (((CIX) cqd.A03.get()).A03(z2, user.A0D(), AnonymousClass001.A1W(A00, BM9.A02))) {
                i = 2131960051;
            }
            num = Integer.valueOf(i);
            A07 = 4YV.A10("pageTitleResId", A07);
        }
        EvidencePage evidencePage = new EvidencePage(A00, user, immutableList2, immutableList, num, null, str2, str, A07, z2, false);
        FRXPage fRXPage = new FRXPage(evidencePage.A00(), null);
        fRXPage.A02 = evidencePage;
        if (z) {
            A0C(fRXPage, feedbackReportFragment);
        } else {
            A08(fRXPage, feedbackReportFragment);
        }
    }

    public static void A07(FRXEvidencePrompt fRXEvidencePrompt, FeedbackReportFragment feedbackReportFragment, User user, boolean z) {
        CFj cFj = feedbackReportFragment.A0A;
        if (cFj != null) {
            BM9 A00 = fRXEvidencePrompt.A00();
            if (A00 == BM9.A02 || A00 == BM9.A04) {
                A06(fRXEvidencePrompt, feedbackReportFragment, user, ImmutableList.of(), ImmutableList.of(), z);
                return;
            }
            Clg clg = new Clg(fRXEvidencePrompt, feedbackReportFragment, user, z);
            String str = cFj.A0B;
            if (str != null) {
                Bpn bpn = cFj.A05;
                bpn.A00 = clg;
                bpn.A02.A08();
                bpn.A01 = str;
            }
        }
    }

    public static void A08(FRXPage fRXPage, FeedbackReportFragment feedbackReportFragment) {
        CC7 cc7 = feedbackReportFragment.A0I;
        cc7.getClass();
        FRXNavState fRXNavState = feedbackReportFragment.A0H;
        if (fRXNavState != null) {
            fRXNavState.A00.add(fRXPage);
            CC7.A00(fRXPage, cc7, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if (r301.A04 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r301.A06 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r301.A00 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r301.A01 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r301.A05 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        if (r301.A02 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        if (r301.A03 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0C(com.facebook.messaging.integrity.frx.model.FRXPage r301, com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment r302) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment.A0C(com.facebook.messaging.integrity.frx.model.FRXPage, com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        if (X.7zK.A00(362).equalsIgnoreCase(r317) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b8, code lost:
    
        if (((X.AcJ) r302.A0e.get()).A00() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010b, code lost:
    
        if (((X.AcJ) r302.A0e.get()).A00() == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0E(com.facebook.messaging.integrity.frx.model.FeedbackSubmissionResult r301, com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment r302, com.facebook.user.model.User r303, com.facebook.user.model.User r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment.A0E(com.facebook.messaging.integrity.frx.model.FeedbackSubmissionResult, com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment, com.facebook.user.model.User, com.facebook.user.model.User, java.lang.String):void");
    }

    public static void A0F(FeedbackReportFragment feedbackReportFragment) {
        FRXPage A05 = A05(feedbackReportFragment);
        if (feedbackReportFragment.A0M != null && A05 != null) {
            FeedbackPage feedbackPage = A05.A04;
            if (feedbackPage != null) {
                AbH.A0i(feedbackReportFragment).A01();
                if (feedbackReportFragment.A0F != null) {
                    C8r c8r = new C8r(feedbackPage.A00);
                    6Io r0 = feedbackReportFragment.A06;
                    r0.getClass();
                    FbUserSession fbUserSession = feedbackReportFragment.A00;
                    fbUserSession.getClass();
                    r0.A0D(fbUserSession, feedbackReportFragment.A0F.A00, feedbackReportFragment.A0M, feedbackReportFragment.A0T, c8r.A01());
                }
            } else {
                MarketplaceFeedbackPage marketplaceFeedbackPage = A05.A06;
                if (marketplaceFeedbackPage == null) {
                    AdditionalActionsPage additionalActionsPage = A05.A00;
                    if (additionalActionsPage != null) {
                        AbH.A0i(feedbackReportFragment).A00();
                        BLo bLo = BLo.A08;
                        ImmutableList immutableList = additionalActionsPage.A01;
                        if (A0I(bLo, immutableList)) {
                            A0H(0S2.A01, feedbackReportFragment.A0t);
                        }
                        if (A0I(BLo.A0B, immutableList)) {
                            A0H(0S2.A0C, feedbackReportFragment.A0t);
                        }
                        if (A0I(BLo.A0D, immutableList)) {
                            A0H(0S2.A00, feedbackReportFragment.A0t);
                        }
                        if (A0I(BLo.A0A, immutableList)) {
                            A0H(0S2.A0C, feedbackReportFragment.A0t);
                        }
                    } else if (A05.A01 == null && A05.A05 == null) {
                        EvidencePage evidencePage = A05.A02;
                        if (evidencePage != null) {
                            User user = evidencePage.A01;
                            AbH.A0i(feedbackReportFragment).A01();
                            if (user != null && feedbackReportFragment.A0F != null) {
                                6Io r02 = feedbackReportFragment.A06;
                                r02.getClass();
                                FbUserSession fbUserSession2 = feedbackReportFragment.A00;
                                fbUserSession2.getClass();
                                ThreadKey threadKey = feedbackReportFragment.A0M;
                                String str = user.A13;
                                C5yq c5yq = feedbackReportFragment.A0F.A00;
                                String str2 = feedbackReportFragment.A0T;
                                11T.A0F(c5yq, 3);
                                1UG A08 = 1BK.A08(r02.A00, "frx_messenger_feedback_impersonation_evidence_closed");
                                if (A08.isSampled() && threadKey != null) {
                                    7zL.A1F(A08, String.valueOf(CPB.A01(threadKey)));
                                    6Io.A01(A08, fbUserSession2, r02, c5yq, threadKey);
                                    A08.A7R("impersonated_user_id", str);
                                    6Io.A03(A08, r02);
                                    A08.A7R("other_user_id", String.valueOf(CPB.A02(threadKey, str2)));
                                    A08.A5H("is_other_user_mo", 6Io.A00(fbUserSession2, r02, threadKey, str2));
                                    A08.BZL();
                                }
                            }
                        } else if (A05.A03 == null) {
                            throw AnonymousClass001.A0N("No valid page to visit!");
                        }
                    }
                } else if (feedbackReportFragment.A0F != null) {
                    C8r c8r2 = new C8r(marketplaceFeedbackPage.A00);
                    6Io r03 = feedbackReportFragment.A06;
                    r03.getClass();
                    FbUserSession fbUserSession3 = feedbackReportFragment.A00;
                    fbUserSession3.getClass();
                    r03.A0D(fbUserSession3, feedbackReportFragment.A0F.A00, feedbackReportFragment.A0M, feedbackReportFragment.A0T, c8r2.A01());
                }
            }
            ThreadKey threadKey2 = feedbackReportFragment.A0M;
            if (threadKey2 != null && threadKey2.A1K()) {
                ((2ZM) 1Bi.A03(33215)).A04(feedbackReportFragment.A16(), "713973163322179");
            }
        }
        ImmutableList immutableList2 = feedbackReportFragment.A0S;
        if (immutableList2 != null && !immutableList2.isEmpty()) {
            A0H(0S2.A0Y, feedbackReportFragment.A0t);
        }
        A0H(0S2.A0j, feedbackReportFragment.A0t);
        feedbackReportFragment.A0d = AnonymousClass001.A0K();
    }

    public static void A0G(FeedbackReportFragment feedbackReportFragment) {
        1Iw r0 = feedbackReportFragment.A03;
        if (r0 == null || feedbackReportFragment.A04 == null) {
            return;
        }
        Object systemService = r0.A0D.getSystemService("input_method");
        systemService.getClass();
        7zR.A12(feedbackReportFragment.A04, (InputMethodManager) systemService);
    }

    public static void A0H(Integer num, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((DFC) it.next()).BxG(num);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r304.A09 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0I(X.BLo r301, com.google.common.collect.ImmutableList r302) {
        /*
            r0 = r302
            X.1Du r0 = r0.iterator()
            r303 = r0
            r0 = 0
            r304 = r0
        L7:
            r0 = r303
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
            r0 = r303
            java.lang.Object r0 = r0.next()
            com.facebook.messaging.integrity.frx.model.AdditionalAction r0 = (com.facebook.messaging.integrity.frx.model.AdditionalAction) r0
            r306 = r0
            r0 = r306
            X.BLo r0 = r0.A01()
            r307 = r0
            r0 = r307
            r1 = r301
            if (r0 != r1) goto L7
            r0 = r306
            r304 = r0
            goto L7
        L32:
            r0 = r304
            if (r0 == 0) goto L44
            r0 = r304
            boolean r0 = r0.A09
            r308 = r0
            r0 = 1
            r305 = r0
            r0 = r308
            if (r0 == 0) goto L4a
        L44:
            r0 = 0
            r305 = r0
            r0 = 0
            r307 = r0
        L4a:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment.A0I(X.BLo, com.google.common.collect.ImmutableList):boolean");
    }

    public void A0m(06Z r302, String str) {
        if (r302.A0B) {
            return;
        }
        super/*X.2Ow*/.A15(r302, str);
        this.A0Z = true;
    }

    public void A0o() {
        super/*X.0D2*/.A0p();
        this.A0Z = false;
    }

    public 1iF A17() {
        return AbF.A0C(876431843082365L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r0 == null) goto L20;
     */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1C() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.integrity.frx.model.FRXPage r0 = A05(r0)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r302
            com.facebook.messaging.integrity.frx.model.FeedbackPage r0 = r0.A04
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L7a
            r0 = r302
            com.facebook.messaging.integrity.frx.model.MarketplaceFeedbackPage r0 = r0.A06
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L7a
            r0 = r302
            com.facebook.messaging.integrity.frx.model.AdditionalActionsPage r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L7a
            r0 = r302
            com.facebook.messaging.integrity.frx.model.BlockPage r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L6e
            r0 = r302
            com.facebook.messaging.integrity.frx.model.GroupMembersPage r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L6e
            r0 = r302
            com.facebook.messaging.integrity.frx.model.EvidencePage r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L5e
            r0 = r303
            com.facebook.user.model.User r0 = r0.A01
            r303 = r0
            r0 = r301
            X.C0p r0 = r0.A0q
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L73
        L4f:
            r0 = r302
            com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment r0 = r0.A00
            r303 = r0
            r0 = r303
            A0F(r0)
            r0 = r303
            r0.A0o()
        L5c:
            r0 = 1
            return r0
        L5e:
            r0 = r302
            com.facebook.messaging.integrity.frx.model.EvidenceSearchPage r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L6e
            java.lang.String r0 = "No valid page to visit!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        L6e:
            r0 = r301
            X.C0p r0 = r0.A0q
            r302 = r0
        L73:
            r0 = r302
            r0.A00()
            goto L5c
        L7a:
            r0 = r301
            X.C0p r0 = r0.A0q
            r302 = r0
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment.A1C():boolean");
    }

    public void A1D() {
        AbH.A0i(this).A00();
        A0H(0S2.A0N, this.A0t);
        A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1E() {
        MarketplaceThreadData marketplaceThreadData;
        MarketplaceThreadUserData marketplaceThreadUserData;
        super/*X.0D2*/.A0o();
        this.A0Z = false;
        ThreadSummary threadSummary = this.A0N;
        if (threadSummary == null || (marketplaceThreadData = threadSummary.A0r) == null || (marketplaceThreadUserData = marketplaceThreadData.A00) == null || marketplaceThreadUserData.A08 == null || this.mFragmentManager == null) {
            return;
        }
        6In r0 = this.A0b;
        r0.getClass();
        ThreadSummary threadSummary2 = this.A0N;
        String str = threadSummary2.A0r.A00.A08;
        r0.Czp(this.mFragmentManager, C5yq.A0U, threadSummary2, C5yl.A0E, str);
        Set<DFC> set = this.A0t;
        for (DFC dfc : set) {
            6In r02 = this.A0b;
            r02.getClass();
            r02.A5K(dfc);
        }
        set.clear();
    }

    public void A1F() {
        GroupMembersPage groupMembersPage;
        if (A05(this) == null || (groupMembersPage = A05(this).A05) == null) {
            return;
        }
        this.A0E.getClass();
        A0C(CQD.A03(groupMembersPage, this.A0W), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1G() {
        CIB.A00(getContext(), CSG.A00(this, 90), CSG.A00(this, 91), (CIB) 7zO.A0l(this, 82631), 2131957336);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1H(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, String str, boolean z) {
        AbH.A0i(this).A03("report_confirmation_shown");
        CIB cib = (CIB) 7zO.A0l(this, 82631);
        Context requireContext = requireContext();
        int i = 2131964418;
        if (z) {
            i = 2131964419;
        }
        DR6 A01 = C5ic.A01(requireContext, cib.A02);
        A01.A03(1BK.A0v(requireContext, str, 2131964420));
        A01.A06(i);
        A01.A0D(onClickListener2, R.string.cancel);
        A01.A0B(onClickListener, 2131964417);
        A01.A05();
    }

    public void A1I(BLo bLo) {
        AdditionalActionsPage additionalActionsPage;
        FRXPage A05 = A05(this);
        if (A05 == null || (additionalActionsPage = A05.A00) == null) {
            return;
        }
        CQD cqd = this.A0E;
        cqd.getClass();
        BLo[] bLoArr = {BLo.A0G, bLo};
        cqd.A02.get();
        A0C(CQD.A00(additionalActionsPage, CLl.A01(additionalActionsPage.A01, bLoArr, true)), this);
    }

    public void A1J(BLo bLo) {
        AdditionalActionsPage additionalActionsPage;
        FRXPage A05 = A05(this);
        if (A05 == null || (additionalActionsPage = A05.A00) == null) {
            return;
        }
        CQD cqd = this.A0E;
        cqd.getClass();
        A0C(cqd.A07(additionalActionsPage, new BLo[]{BLo.A0G, bLo}), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1K(BLo bLo) {
        CIB.A00(getContext(), new CSF(bLo, this, 20), (DialogInterface.OnClickListener) null, (CIB) 7zO.A0l(this, 82631), 2131960073);
    }

    public void A1L(FeedbackSubmissionResult feedbackSubmissionResult, String str) {
        ProactiveWarningParams proactiveWarningParams;
        FRXParams fRXParams = this.A0F;
        String str2 = (fRXParams == null || (proactiveWarningParams = fRXParams.A02) == null) ? null : proactiveWarningParams.A00;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(this.A0T)) {
            A0E(feedbackSubmissionResult, this, null, null, str);
            return;
        }
        C5M c5m = (C5M) this.A0l.get();
        FbUserSession fbUserSession = this.A00;
        fbUserSession.getClass();
        Cle cle = new Cle(feedbackSubmissionResult, this, str, str2);
        1Js r0 = 1Js.A03;
        c5m.A00(fbUserSession, cle, ImmutableList.of((Object) new UserKey(r0, str2), (Object) new UserKey(r0, this.A0T)), 30277637);
    }

    public void A1M(C8D c8d, String str, String str2, String str3, String str4) {
        C8D c8d2 = c8d;
        this.A0F.getClass();
        FRXParams fRXParams = this.A0F;
        ThreadKey threadKey = fRXParams.A04;
        if (threadKey != null && this.A03 != null && fRXParams.A0G && threadKey.A0w() && this.A01 == null && 1BK.A0N(this.A0j).AZk(2342163868304031483L)) {
            String str5 = c8d.A01;
            ImmutableList immutableList = c8d.A00;
            String str6 = c8d.A02;
            String str7 = c8d.A03;
            String str8 = c8d.A04;
            c8d2 = new C8D(immutableList, str5, str6, str7, 0Pz.A0Y(str8, this.A03.A0D(2131964390), '\n'), c8d.A05);
        }
        this.A0E.getClass();
        HashSet A0v = AnonymousClass001.A0v();
        ImmutableList.of();
        String str9 = c8d2.A05;
        String str10 = c8d2.A04;
        ImmutableList immutableList2 = c8d2.A00;
        C1pq.A08("feedbackTags", immutableList2);
        FeedbackPage feedbackPage = new FeedbackPage(immutableList2, null, str2, str, str4, str3, str10, str9, A0v, false, false);
        FRXPage fRXPage = new FRXPage(feedbackPage.A00(), feedbackPage.A03);
        fRXPage.A04 = feedbackPage;
        A08(fRXPage, this);
        C2s c2s = (C2s) this.A0v.get();
        if (C5yr.A00((C5yr) 1Br.A0B(c2s.A01)).AZk(36315451727553438L)) {
            7zP.A0e(c2s.A00).markerEnd(948451198, (short) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1N(User user) {
        ((7EN) 7zO.A0l(this, 50188)).A06(getChildFragmentManager(), this.A0N, BNT.A0C, (DGC) null, this.A0O, (C1ph) null, user);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x017b, code lost:
    
        if (r302.A02().equals(X.C1z1.BLOCKED_ON_MESSENGER) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1O(com.facebook.user.model.User r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment.A1O(com.facebook.user.model.User, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1P(String str) {
        try {
            Uri A03 = C0A2.A03(str);
            if (A03 != null) {
                ((C68t) this.A0w.get()).A0E(getContext(), A03);
            }
        } catch (SecurityException unused) {
        }
    }

    public void A1Q(String str, boolean z) {
        FRXEvidencePrompt fRXEvidencePrompt;
        FeedbackSubmissionResult feedbackSubmissionResult = this.A0G;
        if (feedbackSubmissionResult == null) {
            FRXParams fRXParams = this.A0F;
            if (fRXParams == null || !fRXParams.A0I) {
                return;
            }
            fRXEvidencePrompt = fRXParams.A01;
            if (fRXEvidencePrompt == null) {
                return;
            }
        } else {
            fRXEvidencePrompt = feedbackSubmissionResult.A00;
        }
        if (fRXEvidencePrompt != null) {
            this.A0E.getClass();
            ImmutableList immutableList = fRXEvidencePrompt.A00;
            HashSet A0v = AnonymousClass001.A0v();
            ImmutableList.of();
            C1pq.A08("searchDataSourceTypes", immutableList);
            EvidenceSearchPage evidenceSearchPage = new EvidenceSearchPage(immutableList, str, A0v);
            FRXPage fRXPage = new FRXPage(evidenceSearchPage.A00(), evidenceSearchPage.A01);
            fRXPage.A03 = evidenceSearchPage;
            if (z) {
                A0C(fRXPage, this);
            } else {
                A08(fRXPage, this);
            }
        }
    }

    public void A1R(boolean z) {
        EvidencePage evidencePage;
        if (A05(this) == null || (evidencePage = A05(this).A02) == null) {
            return;
        }
        this.A0E.getClass();
        FRXPage A01 = CQD.A01(evidencePage, z);
        CC7 cc7 = this.A0I;
        cc7.getClass();
        CC7.A00(A01, cc7, false);
    }

    public void A1S(boolean z) {
        FeedbackPage feedbackPage;
        if (A05(this) == null || (feedbackPage = A05(this).A04) == null) {
            return;
        }
        this.A0E.getClass();
        String str = feedbackPage.A02;
        String str2 = feedbackPage.A03;
        FeedbackPage feedbackPage2 = new FeedbackPage(feedbackPage.A00, feedbackPage.A01, str, str2, feedbackPage.A04, feedbackPage.A05, feedbackPage.A06, feedbackPage.A07, AbF.A1E(feedbackPage.A08), feedbackPage.A09, z);
        FRXPage fRXPage = new FRXPage(feedbackPage2.A00(), feedbackPage2.A03);
        fRXPage.A04 = feedbackPage2;
        CC7 cc7 = this.A0I;
        cc7.getClass();
        CC7.A00(fRXPage, cc7, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof IgnoreMessagesDialogFragment) {
            ((IgnoreMessagesDialogFragment) fragment).A01 = this.A0m;
            return;
        }
        if (fragment instanceof HideMontageDialogFragment) {
            ((HideMontageDialogFragment) fragment).A00 = this.A0r;
        } else if (fragment instanceof MuteNotificationsDialogFragment) {
            ((MuteNotificationsDialogFragment) fragment).A06 = new Cnd(this, 0);
        } else if (fragment instanceof BlockUserFragment) {
            ((BlockUserFragment) fragment).A07 = this.A0z;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        A0F(this);
        this.A0t.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment, com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        ProactiveWarningParams proactiveWarningParams;
        int A02 = 0FI.A02(1155943464);
        super.onCreate(bundle);
        this.A0K = (C73) 7zO.A0l(this, 83012);
        this.A0E = (CQD) 7zO.A0l(this, 84917);
        this.A06 = (6Io) 7zO.A0l(this, 67893);
        this.A05 = (C2p) 7zO.A0l(this, 82648);
        this.A0c = (BU9) 1Bn.A0A(84921);
        this.A0I = (CC7) 1Bn.A0A(84360);
        this.A0b = (6In) 7zO.A0l(this, 68120);
        this.A0X = DBe.A00(this, 63);
        this.A0k.get();
        if (bundle != null) {
            this.A0F = (FRXParams) bundle.getParcelable("frx_params_key");
            this.A0U = bundle.getString("prompt_token_id_key");
            this.A0H = (FRXNavState) bundle.getParcelable("nav_state_key");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("reported_user_ids");
            stringArrayList.getClass();
            this.A0W = stringArrayList;
            this.A0G = (FeedbackSubmissionResult) bundle.getParcelable("feedback_submission_result");
            this.A0V = bundle.getString("evidence_source");
            this.A0Z = bundle.getBoolean("is_showing");
            this.A0P = (User) bundle.getParcelable("block_page_blockee");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("frx_reported_tags");
            if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                this.A0S = ImmutableList.copyOf((Collection) stringArrayList2);
            }
        } else {
            FRXParams fRXParams = (FRXParams) requireArguments().getParcelable("frx_params_key");
            this.A0F = fRXParams;
            if (fRXParams != null && (proactiveWarningParams = fRXParams.A02) != null) {
                this.A0U = proactiveWarningParams.A02;
            }
        }
        FRXParams fRXParams2 = this.A0F;
        if (fRXParams2 != null) {
            this.A0N = fRXParams2.A05;
            this.A0M = fRXParams2.A04;
            UserKey userKey = fRXParams2.A08;
            if (userKey != null) {
                this.A0T = userKey.id;
            }
            this.A0Q = fRXParams2.A07;
            this.A0R = fRXParams2.A0A;
            this.A0O = fRXParams2.A06;
        }
        CC7 cc7 = this.A0I;
        if (cc7 != null) {
            cc7.A00 = this.A0y;
        }
        if (this.A0H == null) {
            this.A0H = new FRXNavState();
        }
        AbR abR = (AbR) this.A0u.get();
        MigColorScheme migColorScheme = this.A0O;
        migColorScheme.getClass();
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            COw cOw = new COw(migColorScheme);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0L = cOw;
            this.A0a = (AeX) 7zO.A0l(this, 82710);
            this.A00 = 1BL.A0G(this);
            this.A0d = 1BK.A0d();
            0FI.A08(437285213, A02);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1743840448);
        FrameLayout frameLayout = new FrameLayout(getContext());
        LithoView A0O = AbK.A0O(this);
        this.A04 = A0O;
        frameLayout.addView(A0O);
        LithoView lithoView = this.A04;
        1Iw r0 = lithoView.A09;
        this.A03 = r0;
        AbL.A11(r0, lithoView);
        if (this.A0O != null && A16() != null && this.A00 != null) {
            MigColorScheme.A00(frameLayout, this.A0O);
            FRXParams fRXParams = this.A0F;
            if (fRXParams == null || !fRXParams.A0H) {
                1tC r02 = (1tC) 1Bn.A0A(16838);
                Window window = A16().getWindow();
                window.getClass();
                r02.A03(window, this.A0O);
            }
        }
        User user = this.A0Q;
        if (user != null) {
            CaE.A03(getViewLifecycleOwner(), this.A0a.A00.ASZ(user.A0k), this, 91);
        }
        0FI.A08(346615109, A02);
        return frameLayout;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-976268242);
        super.onDestroy();
        if (!this.A0d.booleanValue()) {
            A0F(this);
        }
        this.A0t.clear();
        0FI.A08(-131127785, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-274432677);
        super.onDestroyView();
        this.A04 = null;
        BsZ bsZ = this.A0J;
        if (!bsZ.A01) {
            bsZ.A00.A05(-1);
        }
        CQ2 cq2 = this.A0B;
        if (cq2 != null) {
            cq2.A00 = null;
            this.A0B = null;
        }
        CIN cin = this.A08;
        if (cin != null) {
            cin.A00 = null;
        }
        CQd cQd = this.A07;
        if (cQd != null) {
            cQd.A02 = null;
        }
        COr cOr = this.A09;
        if (cOr != null) {
            cOr.A00 = null;
        }
        Byr byr = this.A0C;
        if (byr != null) {
            byr.A02 = null;
        }
        CFj cFj = this.A0A;
        if (cFj != null) {
            cFj.A00 = null;
        }
        0FI.A08(-1519912560, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(448986661);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A0G(this);
        EAX eax = this.A02;
        if (eax != null && eax.isShowing()) {
            this.A02.dismiss();
        }
        0FI.A08(2076806814, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(64558389);
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (A05(this) != null && A05(this).A01 != null && this.A0P != null) {
            this.A08.getClass();
            CIN cin = this.A08;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            User user = this.A0P;
            cin.A00.getClass();
            if (user != null) {
                AeX aeX = cin.A03;
                CaE.A03(viewLifecycleOwner, aeX.A00.ASZ(user.A0k), cin, 90);
            }
        }
        0FI.A08(1236248682, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable("frx_params_key", this.A0F);
        bundle.putParcelable("nav_state_key", this.A0H);
        bundle.putString("prompt_token_id_key", this.A0U);
        bundle.putStringArrayList("reported_user_ids", this.A0W);
        bundle.putParcelable("feedback_submission_result", this.A0G);
        bundle.putString("evidence_source", this.A0V);
        bundle.putBoolean("is_showing", this.A0Z);
        bundle.putParcelable("block_page_blockee", this.A0P);
        ImmutableList immutableList = this.A0S;
        if (immutableList != null) {
            bundle.putStringArrayList("frx_reported_tags", 1BK.A17(immutableList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0F.getClass();
        this.A03.getClass();
        this.A0c.getClass();
        this.A0J = new BsZ(requireContext(), this.A0F.A00.serverLocation, 1XU.A00(this.A03.A0D));
        this.A0F.getClass();
        this.A0M.getClass();
        this.A0O.getClass();
        this.A00.getClass();
        this.A0B = new CQ2(AbG.A04(this, 148023), this.A0F, this.A0J, this.A0U);
        this.A07 = new CQd(AbG.A04(this, 148019), this.A00, this.A0F);
        this.A08 = new CIN(AbG.A04(this, 148020), this.A00, this.A0N, this.A0T);
        this.A09 = new COr(AbG.A04(this, 148021), this.A0F);
        this.A0C = new Byr(AbG.A04(this, 148024), this.A00, this.A0F, this.A0M);
        CFj cFj = new CFj(AbG.A04(this, 148022), this.A00, this.A0O, this.A0T);
        this.A0A = cFj;
        CQ2 cq2 = this.A0B;
        if (cq2 != null) {
            cq2.A00 = this;
        }
        CIN cin = this.A08;
        if (cin != null) {
            cin.A00 = this;
        }
        CQd cQd = this.A07;
        if (cQd != null) {
            cQd.A02 = this;
        }
        COr cOr = this.A09;
        if (cOr != null) {
            cOr.A00 = this;
        }
        Byr byr = this.A0C;
        if (byr != null) {
            byr.A02 = this;
        }
        cFj.A00 = this;
        FRXParams fRXParams = this.A0F;
        if (!fRXParams.A0I || fRXParams.A01 == null) {
            FRXPage A05 = A05(this);
            if (A05 != null) {
                CC7 cc7 = this.A0I;
                cc7.getClass();
                CC7.A00(A05, cc7, false);
            }
            CQ2 cq22 = this.A0B;
            if (cq22 != null) {
                FbUserSession fbUserSession = this.A00;
                fbUserSession.getClass();
                boolean z = true;
                boolean A1U = AnonymousClass001.A1U(this.A0U);
                if (A05(this) == null) {
                    z = false;
                }
                cq22.A05(fbUserSession, A1U, z);
            }
        } else {
            AbH.A0i(this).A03("impersonation_flow_started");
            A07(this.A0F.A01, this, null, true);
        }
        BsZ bsZ = this.A0J;
        if (bsZ.A02) {
            bsZ.A00.A02();
        }
    }
}
