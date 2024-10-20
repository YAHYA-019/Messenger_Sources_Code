package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.MemberActionsState;
import com.facebook.messaging.customthreads.threadsettings.nicknames.SetNicknameLiveDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.publicchats.banuser.banuserconfirmation.BanUserConfirmationFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: B0x.class */
public final class B0x extends C1rj {
    public Bundle A00;
    public 06Z A01;
    public LifecycleOwner A02;
    public FbUserSession A03;
    public 1pI A04;
    public 1F9 A05;
    public ThreadSummary A06;
    public DJY A07;
    public MigColorScheme A08;
    public User A09;
    public Capabilities A0A;
    public ParcelableSecondaryData A0B;
    public boolean A0C;

    public B0x() {
        super("ThreadActionsMenuListComponent");
    }

    public static C1rh A00(2MQ r301, C1u3 c1u3, 1Iw r303, 1Im r304, MigColorScheme migColorScheme, String str) {
        CJ4 cj4 = new CJ4();
        cj4.A07 = migColorScheme;
        cj4.A04(str);
        cj4.A08 = str;
        cj4.A01 = Cvn.A00(r304, ActionId.HEADER_DATA_LOADED);
        if (((2Rd) 1Bi.A03(66609)).A00()) {
            cj4.A04 = new C58v(7zO.A0F(c1u3, 7zP.A0R(), migColorScheme), migColorScheme.B4h(), 0, false);
        } else {
            2Re r0 = 2Re.A02;
            Cx1 A01 = Cx1.A01(r304, 31);
            11T.A0F(migColorScheme, 2);
            cj4.A05 = new C59g(r301, r0, C83o.A02, A01, null, migColorScheme, 0S2.A0N, null, 0, true);
        }
        C1rq A012 = C1rg.A01(r303, null, 0);
        A012.A2f(7zM.A10(cj4.A01(), 55M.A00(r303)));
        A012.A2T(r304);
        A012.A0P();
        return A012.A00;
    }

    public static final boolean A01(ThreadKey threadKey) {
        if (threadKey != null) {
            return (threadKey.A1F() || threadKey.A1I() || threadKey.A0w() || threadKey.A11()) ? false : true;
        }
        return true;
    }

    public final Object[] A0k() {
        return new Object[]{this.A08, this.A04, this.A07, this.A0B, this.A03, this.A05, this.A01, Boolean.valueOf(this.A0C), this.A02, this.A00, this.A0A, this.A06, this.A09};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0962, code lost:
    
        if (r0 != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0594, code lost:
    
        if (r306.AZk(r340) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x05dd, code lost:
    
        if (r0 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03bd, code lost:
    
        if (r339.A03() != X.0S2.A0C) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x043e, code lost:
    
        if (((X.C60b) r0.get()).A04(r0) != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0947 A[LOOP:2: B:157:0x093a->B:159:0x0947, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x09b9  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 2962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0x.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        AlO alO;
        User A06;
        ThreadKey threadKey;
        AlO alO2;
        User A062;
        switch (r302.A01) {
            case -1123446137:
                1Iw r0 = r302.A00.A00;
                ((B1o) 4YU.A0P(r0)).A00.A01(r0.A0D, (String) r302.A03[0]);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -955965739:
                CoU coU = ((B0x) r302.A00.A01).A07;
                if (2 - coU.A00 != 0 || (A062 = AlO.A06((alO2 = (AlO) coU.A01))) == null || alO2.A07 == null) {
                    return null;
                }
                C00i c00i = alO2.A0N;
                long generateNewFlowId = AbG.A0r(c00i).generateNewFlowId(57147394);
                AbI.A1U(AbG.A0r(c00i), "profile", generateNewFlowId, false);
                6HL r02 = alO2.A0B;
                r02.getClass();
                r02.A00 = new Cuk(coU, A062);
                6HL r03 = alO2.A0B;
                r03.getClass();
                FbUserSession fbUserSession = alO2.A04;
                fbUserSession.getClass();
                r03.A01(alO2.A01, fbUserSession, alO2.A07, A062, generateNewFlowId);
                AlO.A08(alO2, A062, 0S2.A00);
                return null;
            case -816972052:
                CoU coU2 = ((B0x) r302.A00.A01).A07;
                if (2 - coU2.A00 != 0) {
                    return null;
                }
                AlO alO3 = (AlO) coU2.A01;
                if (alO3.A07 == null || alO3.A01 == null || alO3.mFragmentManager == null) {
                    return null;
                }
                C9A A01 = CLq.A01(alO3);
                A01.A00 = 1BJ.A00(465);
                A01.A00();
                CbX cbX = alO3.A06;
                cbX.getClass();
                cbX.A02(alO3.mFragmentManager, new ClF(coU2, 4), alO3.A07, (6HY) null, true);
                return null;
            case -664439284:
                B0x b0x = (B0x) r302.A00.A01;
                User user = b0x.A09;
                06Z r04 = b0x.A01;
                ThreadSummary threadSummary = b0x.A06;
                DJY djy = b0x.A07;
                if (threadSummary == null || (threadKey = threadSummary.A0n) == null) {
                    return null;
                }
                djy.Bu9("ban_user_dialog_open");
                long j = threadKey.A04;
                94S r05 = MigBottomSheetDialogFragment.A01;
                BanUserConfirmationFragment A00 = BV6.A00(user, j);
                11T.A0F(r04, 0);
                A00.A0m(r04, "BanUserConfirmationFragment");
                if (!2oI.A07(threadSummary)) {
                    return null;
                }
                C1306Adj.A0B((C1306Adj) 1Bi.A03(82310), 4YU.A0l(threadKey), null, 7zU.A0r(Long.parseLong(user.A13)), null, 71, 2, 35, 9, 1);
                return null;
            case -600400114:
                1Iv r06 = r302.A00;
                1Is r07 = r06.A01;
                1Iw r08 = r06.A00;
                Object[] objArr = r302.A03;
                Boolean bool = (Boolean) objArr[0];
                ThreadSummary threadSummary2 = (ThreadSummary) objArr[1];
                B0x b0x2 = (B0x) r07;
                FbUserSession fbUserSession2 = b0x2.A03;
                User user2 = b0x2.A09;
                DJY djy2 = b0x2.A07;
                Context context = r08.A0D;
                C9A c9a = (C9A) 1Hv.A02(context, 83092);
                djy2.Blm(new D1Y(1BQ.A02(82310), AbI.A0M(), threadSummary2, (23F) 1Lo.A04(context, fbUserSession2, (1BY) null, 33102), user2, c9a, bool));
                return null;
            case -111676229:
                1Iv r09 = r302.A00;
                1Is r010 = r09.A01;
                1Iw r011 = r09.A00;
                B0x b0x3 = (B0x) r010;
                User user3 = b0x3.A09;
                CoU coU3 = b0x3.A07;
                ClJ clJ = new ClJ(r011, user3, (C9A) 1Hv.A02(r011.A0D, 83092), 1);
                CoU coU4 = coU3;
                if (2 - coU4.A00 != 0) {
                    return null;
                }
                AlO alO4 = (AlO) coU4.A01;
                User A063 = AlO.A06(alO4);
                A063.getClass();
                C9A A012 = CLq.A01(alO4);
                A012.A00 = "remove_admin_dialog_open";
                A012.A00();
                CbX cbX2 = alO4.A06;
                cbX2.getClass();
                UserKey userKey = A063.A0k;
                String str = A063.A0X.displayName;
                ThreadSummary threadSummary3 = alO4.A07;
                threadSummary3.getClass();
                cbX2.A04(alO4.mFragmentManager, new ClH(coU4, clJ, 3), threadSummary3, userKey, str);
                return null;
            case 937251856:
                CoU coU5 = ((B0x) r302.A00.A01).A07;
                if (2 - coU5.A00 != 0 || (A06 = AlO.A06((alO = (AlO) coU5.A01))) == null || alO.A07 == null) {
                    return null;
                }
                ((6NA) alO.A0H.get()).A06(alO.A07.A0n, 4YT.A00(1520));
                SetNicknameLiveDialogFragment.A05(alO.A07, A06, null).A0m(alO.getChildFragmentManager(), "set_nickname");
                return null;
            case 1957836517:
                1Iv r012 = r302.A00;
                1Is r013 = r012.A01;
                1Iw r014 = r012.A00;
                B0x b0x4 = (B0x) r013;
                User user4 = b0x4.A09;
                CoU coU6 = b0x4.A07;
                ClJ clJ2 = new ClJ(r014, user4, (C9A) 1Hv.A02(r014.A0D, 83092), 0);
                CoU coU7 = coU6;
                if (2 - coU7.A00 != 0) {
                    return null;
                }
                AlO alO5 = (AlO) coU7.A01;
                User A064 = AlO.A06(alO5);
                A064.getClass();
                C9A A013 = CLq.A01(alO5);
                A013.A00 = "make_admin_dialog_open";
                A013.A00();
                CbX cbX3 = alO5.A06;
                cbX3.getClass();
                UserKey userKey2 = A064.A0k;
                String str2 = A064.A0X.displayName;
                ThreadSummary threadSummary4 = alO5.A07;
                threadSummary4.getClass();
                cbX3.A03(alO5.mFragmentManager, new ClH(coU7, clJ2, 2), threadSummary4, userKey2, str2);
                return null;
            case 1972666997:
                1Iw r015 = r302.A00.A00;
                ((B1o) 4YU.A0P(r015)).A00.A02(r015.A0D, (String) r302.A03[0]);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        MemberActionsState memberActionsState;
        B1o b1o = (B1o) r303;
        CCn cCn = null;
        FbUserSession fbUserSession = this.A03;
        User user = this.A09;
        ThreadSummary threadSummary = this.A06;
        1F9 r0 = this.A05;
        ParcelableSecondaryData parcelableSecondaryData = this.A0B;
        Bundle bundle = this.A00;
        Context context = r302.A0D;
        Object A0E = 1Bn.A0E(context, (1BY) null, 82031);
        C1zL A01 = (threadSummary == null || A01(threadSummary.A0n)) ? C1zL.A04 : ((C60b) 1Br.A0B(((CEs) 1Hv.A02(context, 68131)).A00)).A01(threadSummary, 1BK.A0X(user.A13));
        if (r0 != null && (r0 == 1F9.A0B || r0 == 1F9.A0C)) {
            if (bundle == null || (memberActionsState = (MemberActionsState) bundle.getParcelable("member_state_key")) == null) {
                cCn = new CCn(0);
                AnonymousClass001.A07().post(new DAN(bundle, fbUserSession, r302, r0, threadSummary, user, parcelableSecondaryData));
            } else {
                cCn = new CCn(memberActionsState);
            }
        }
        b1o.A01 = A01;
        if (cCn != null) {
            b1o.A02 = cCn;
        }
        if (A0E != null) {
            b1o.A00 = (6HT) A0E;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
