package com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist;

import X.0FI;
import X.0KB;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1F9;
import X.1Fv;
import X.1Hv;
import X.1Iw;
import X.1Lo;
import X.1Um;
import X.1X9;
import X.1iF;
import X.1pK;
import X.1pN;
import X.2MX;
import X.2OV;
import X.2On;
import X.2Oo;
import X.2Op;
import X.2QA;
import X.2RF;
import X.2yD;
import X.33Q;
import X.3EX;
import X.3L0;
import X.3L1;
import X.3aM;
import X.3aO;
import X.3aR;
import X.3lT;
import X.3wJ;
import X.3wK;
import X.4uZ;
import X.5dU;
import X.8TK;
import X.AnonymousClass553;
import X.BBm;
import X.Bim;
import X.C04I;
import X.C09s;
import X.C1251Abt;
import X.C1266Ac8;
import X.C1t1;
import X.C1t3;
import X.C30p;
import X.C3b3;
import X.C5xv;
import X.C66Z;
import X.C9K;
import X.C9dX;
import X.Cwg;
import X.Cxe;
import X.DG2;
import X.GWk;
import X.HFy;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.google.common.collect.ImmutableList;

/* loaded from: MessageRequestsHomeFragment.class */
public final class MessageRequestsHomeFragment extends 1pK implements 1pN, 2Oo, 2Op {
    public ViewPager2 A00;
    public FbUserSession A01;
    public 1Iw A02;
    public LithoView A03;
    public 2MX A04;
    public 2On A05;
    public MigColorScheme A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public LithoView A0A;
    public C1t3 A0B;
    public final 2OV A0T;
    public final DG2 A0L = new DG2() { // from class: X.3a8
        @Override // X.DG2
        public void ChG() {
            MessageRequestsHomeFragment.A07(MessageRequestsHomeFragment.this);
        }
    };
    public final 3lT A0K = new 3lT() { // from class: X.3a7
        public void ChF() {
            MessageRequestsHomeFragment.A06(MessageRequestsHomeFragment.this);
        }
    };
    public final C1t1 A0U = new 3aM(this, 2);
    public final 3wJ A0V = new 3aO(this);
    public final Bim A0M = new Bim(this);
    public final AnonymousClass553 A0O = new Cwg(this, 1);
    public final HFy A0S = new 33Q(this);
    public final C5xv A0Q = new 3aR(this, 3);
    public final AnonymousClass553 A0P = new Cwg(this, 2);
    public final AnonymousClass553 A0N = new Cwg(this, 0);
    public final 0KB A0R = new C30p(this, 1);
    public final 1Br A0J = 1Bu.A00(83340);
    public final 1Br A0F = 1Bq.A00(16839);
    public final 1Br A0C = 1Bu.A00(83023);
    public final 1Br A0D = 1Bq.A00(83213);
    public final 1Br A0G = 1Bq.A00(66265);
    public final 1Br A0E = 1Bu.A00(82479);
    public final 1Br A0H = 1Bu.A00(83336);
    public final 1Br A0I = 1Bu.A00(83025);

    public MessageRequestsHomeFragment() {
        final int i = 4;
        this.A0T = new 2OV(this, i) { // from class: X.3Z8
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = this;
            }

            public final void Bkl() {
                2N1 r304;
                switch (this.A00) {
                    case 0:
                        2Rz r0 = (2Rz) this.A01;
                        CallerContext callerContext = 2Rz.A1U;
                        2OX r02 = r0.A0O;
                        if (r02 != null) {
                            r304 = r02.A00;
                            break;
                        } else {
                            return;
                        }
                    case 1:
                        2Rz r03 = (2Rz) this.A01;
                        CallerContext callerContext2 = 2Rz.A1U;
                        C00i c00i = r03.A0r.A00;
                        if (11T.A0O(((2QB) c00i.get()).A00, 2QC.A03)) {
                            return;
                        }
                        Integer num = r03.A0a;
                        int i2 = ((2QB) c00i.get()).A00.A01;
                        r03.A0a = Integer.valueOf(i2);
                        if (num == null) {
                            2SF r04 = r03.A0U;
                            if (r04 == null) {
                                11T.A0L("unreadSortLogger");
                                throw 0Q8.createAndThrow();
                            }
                            boolean A1W = AnonymousClass001.A1W(r03.A0M, 1Hb.A0J);
                            r04.A00 = 1BK.A0t();
                            2SF.A00(r04, 0, i2, A1W);
                            return;
                        }
                        return;
                    case 2:
                        2Om r05 = (2Om) this.A01;
                        if (r05.A05 != null) {
                            2Om.A0E(r05, r05.A0A.A00().A01, false);
                            return;
                        }
                        return;
                    case 3:
                        r304 = (2N1) this.A01;
                        break;
                    default:
                        MessageRequestsHomeFragment.A07((MessageRequestsHomeFragment) this.A01);
                        return;
                }
                if (r304.A09 != null) {
                    2N1.A0G(r304);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A03() {
        if (((2yD) ((C66Z) this.A0E.A00.get()).A00.A00.get()).AZk(72341362527244896L)) {
            FbUserSession fbUserSession = this.A01;
            if (fbUserSession == null) {
                11T.A0L("fbUserSession");
                throw 0Q8.createAndThrow();
            }
            MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04(requireContext(), fbUserSession, (1BY) null, 82471);
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, new Cxe(mailboxFeature, A0P, 2), A0P, false);
        }
    }

    public static final void A06(MessageRequestsHomeFragment messageRequestsHomeFragment) {
        LithoView lithoView = messageRequestsHomeFragment.A0A;
        String str = "segmentedControls";
        if (lithoView != null) {
            MigColorScheme migColorScheme = messageRequestsHomeFragment.A06;
            String str2 = "colorScheme";
            if (migColorScheme != null) {
                lithoView.setBackground(new ColorDrawable(migColorScheme.BDl()));
                LithoView lithoView2 = messageRequestsHomeFragment.A0A;
                if (lithoView2 != null) {
                    1Iw r0 = messageRequestsHomeFragment.A02;
                    if (r0 == null) {
                        str = "componentContext";
                    } else {
                        8TK A00 = 3wK.A00(r0);
                        3L1 r02 = (3L1) messageRequestsHomeFragment.A0J.A00.get();
                        ImmutableList.Builder builder = ImmutableList.builder();
                        3L0[] r03 = r02.A01;
                        int i = 0;
                        do {
                            builder.m11011add((Object) r03[i].A01);
                            i++;
                        } while (i < 2);
                        ImmutableList build = builder.build();
                        11T.A0A(build);
                        A00.A2Z(C9dX.A00(build));
                        MigColorScheme migColorScheme2 = messageRequestsHomeFragment.A06;
                        if (migColorScheme2 != null) {
                            A00.A2X(migColorScheme2);
                            ViewPager2 viewPager2 = messageRequestsHomeFragment.A00;
                            if (viewPager2 != null) {
                                A00.A01.A00 = viewPager2.A00;
                                A00.A2Y(messageRequestsHomeFragment.A0V);
                                A00.A2U(!(messageRequestsHomeFragment.A05 != null ? r0.BUL() : false));
                                lithoView2.A0x(A00.A2W());
                                return;
                            }
                            str2 = "viewPager";
                        }
                    }
                }
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x022d, code lost:
    
        if (r0.A01() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A07(com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment r301) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment.A07(com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment):void");
    }

    public static final void A08(MessageRequestsHomeFragment messageRequestsHomeFragment, int i) {
        2On r0 = messageRequestsHomeFragment.A05;
        if (r0 != null) {
            String obj = C04I.A00().toString();
            11T.A0A(obj);
            C1266Ac8 c1266Ac8 = (C1266Ac8) messageRequestsHomeFragment.A0I.A00.get();
            3EX r308 = messageRequestsHomeFragment.A08 ? 3EX.A01 : 3EX.A02;
            3L1 r02 = (3L1) messageRequestsHomeFragment.A0J.A00.get();
            ViewPager2 viewPager2 = messageRequestsHomeFragment.A00;
            if (viewPager2 == null) {
                11T.A0L("viewPager");
                throw 0Q8.createAndThrow();
            }
            c1266Ac8.A01(r308, r02.A01[viewPager2.A00].A00, obj, i, r0.BFU(), r0.BI4());
        }
    }

    public 1iF A1R() {
        return new 1iF(131090082449123L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        if (r0.A04() == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = r301
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r303
            android.content.Intent r0 = r0.getIntent()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L22
            java.lang.String r0 = "from_notification"
            r303 = r0
            r0 = r305
            r1 = r303
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r304 = r0
        L22:
            r0 = r301
            r1 = r304
            r0.A08 = r1
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r305 = r0
            X.1Iw r0 = new X.1Iw
            r303 = r0
            r0 = r303
            r1 = r305
            r0.<init>(r1)
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = 68519(0x10ba7, float:9.6016E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2Mb r0 = (X.2Mb) r0
            r305 = r0
            r0 = r305
            boolean r0 = r0.A00()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L62
            r0 = r305
            boolean r0 = r0.A04()
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L67
        L62:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L67:
            r0 = r301
            r1 = r306
            r0.A09 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment.A1S(android.os.Bundle):void");
    }

    public DrawerFolderKey AiR() {
        return new FolderNameDrawerFolderKey(1F9.A0Q);
    }

    public boolean Bkd() {
        BBm bBm = (BBm) 1Br.A0B(this.A0D);
        bBm.A01 = false;
        bBm.A01("back_out");
        return false;
    }

    public void CpV(2MX r302) {
        11T.A0F(r302, 0);
        this.A04 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        getChildFragmentManager().A1K(this.A0R, false);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-717956222);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542556, viewGroup, false);
        0FI.A08(131498102, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(1943259932);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        C1t3 c1t3 = this.A0B;
        if (c1t3 != null) {
            c1t3.A01(this.A0U);
        }
        A03();
        0FI.A08(339754777, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1511269631);
        super/*androidx.fragment.app.Fragment*/.onPause();
        2QA A00 = ((2RF) 1Bi.A03(33095)).A00(requireContext());
        if (A00 != null) {
            A00.A02(this.A0T);
        }
        0FI.A08(27968076, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-216374335);
        super/*androidx.fragment.app.Fragment*/.onResume();
        2QA A00 = ((2RF) 1Bi.A03(33095)).A00(requireContext());
        if (A00 != null) {
            A00.A03(this.A0T);
            ((5dU) 1Hv.A02(requireContext(), 83210)).A00(new FolderNameDrawerFolderKey(1F9.A0Q));
        }
        ((C9K) 1Bn.A0A(83286)).A01(3, -1);
        0FI.A08(-502847810, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_qpl_flow_started", this.A07);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A06 = (MigColorScheme) 1Bn.A0E(requireContext(), (1BY) null, 16979);
        LithoView lithoView = (LithoView) C09s.A01(this.mView, 2131365652);
        11T.A0F(lithoView, 0);
        this.A03 = lithoView;
        A07(this);
        ViewPager2 viewPager2 = (ViewPager2) C09s.A01(this.mView, 2131365653);
        11T.A0F(viewPager2, 0);
        this.A00 = viewPager2;
        viewPager2.A06(new GWk(this));
        ViewPager2 viewPager22 = this.A00;
        if (viewPager22 != null) {
            viewPager22.A07(this.A0S);
            ViewPager2 viewPager23 = this.A00;
            if (viewPager23 != null) {
                viewPager23.A0B = false;
                viewPager23.A09.A00();
                this.A0A = (LithoView) C09s.A01(this.mView, 2131365651);
                A06(this);
                FbUserSession A06 = ((1Fv) 1Bi.A03(66351)).A06(this);
                this.A01 = A06;
                if (A06 != null) {
                    C1t3 c1t3 = (C1t3) 1Lo.A04(requireContext(), A06, (1BY) null, 33086);
                    this.A0B = c1t3;
                    if (c1t3 != null) {
                        c1t3.A00(this.A0U);
                    }
                    if (((2yD) ((C66Z) this.A0E.A00.get()).A01.A00.get()).AZk(36322564192355997L)) {
                        FbUserSession fbUserSession = this.A01;
                        if (fbUserSession != null) {
                            MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04(requireContext(), fbUserSession, (1BY) null, 65962);
                            C3b3 c3b3 = new MailboxCallback() { // from class: X.3b3
                                @Override // com.facebook.msys.mca.MailboxCallback
                                public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                                }
                            };
                            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
                            int A00 = 4uZ.A00(mailboxFutureImpl, (1X9) null);
                            TraceInfo A02 = 4uZ.A02(mailboxFutureImpl, (LoggingOption) null, "MailboxTam", "runTamClientThreadBannerMigrateToMessageRequestExplicitAccept");
                            mailboxFutureImpl.Cu4(c3b3);
                            if (!AQV.Cj2(new C1251Abt(A00, 4, mailboxFeature, mailboxFutureImpl))) {
                                mailboxFutureImpl.cancel(false);
                                4uZ.A03(A00);
                                4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamClientThreadBannerMigrateToMessageRequestExplicitAccept");
                            }
                            PlatformLogger.platformEventLog(5);
                        }
                    }
                    A03();
                    return;
                }
                str = "fbUserSession";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        }
        str = "viewPager";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
