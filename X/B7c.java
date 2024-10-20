package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.r2l.ui.Rooms2LiveLobbyJoinInterstitialDialogFragment;
import com.facebook.messaging.rtc.incall.impl.links.sharedstate.api.VideoChatLinkJoiningContext;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.rtc.interfaces.RtcCallVideoOptions;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: B7c.class */
public final class B7c extends CZq implements DIo {
    public final MutableLiveData A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final C1P A0L;
    public final C1P A0M;
    public final C15h A0N = DBe.A00(this, 97);
    public final FbUserSession A0O;
    public final 2JM A0P;
    public final 1qP A0Q;
    public final 3Fu A0R;
    public final 2QY A0S;

    public B7c(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A0I = 1Bu.A03(r0, 85079);
        this.A04 = 1Bu.A03(r0, 85153);
        this.A07 = AbG.A0V();
        this.A0F = 1Bq.A00(16909);
        this.A0C = 1Bu.A03(r0, 114960);
        this.A05 = 1Bu.A03(r0, 83329);
        this.A06 = 1Bu.A03(r0, 82460);
        this.A0E = 1Bq.A00(16461);
        this.A08 = 1Bu.A03(r0, 115683);
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A0K = A03;
        FbUserSession A032 = 1Br.A03(A03);
        this.A0O = A032;
        this.A09 = 1Lm.A03(A032, r0, 33088);
        this.A02 = 1Lm.A03(A032, r0, 99979);
        this.A0B = 1Lm.A03(A032, r0, 99977);
        this.A0A = 1Lm.A03(A032, r0, 99981);
        this.A0H = 1Lm.A03(A032, r0, 17016);
        this.A0G = 1Lm.A03(A032, r0, 85142);
        this.A0J = 1Lm.A03(A032, r0, 67965);
        this.A03 = 1Bq.A00(115041);
        this.A0D = 1Bq.A00(115040);
        this.A00 = 7zL.A0H();
        this.A0M = new C1P();
        this.A0L = new C1P();
        this.A0Q = new B7W(this, 5);
        this.A0P = new Cox(this);
        this.A0S = new BHi(this, 5);
        this.A0R = new Gyu(this, 8);
    }

    public static final C1796At5 A00(B7c b7c) {
        MutableLiveData mutableLiveData = b7c.A00;
        if (mutableLiveData.getValue() == null) {
            User A0x = AbF.A0x(b7c.A0N);
            return new C1796At5(null, null, null, null, null, null, null, null, null, null, A0x != null ? 7zL.A13(A0x) : null, null, null, null, null, null, 04R.A0G(), 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false);
        }
        Object value = mutableLiveData.getValue();
        11T.A0D(value);
        11T.A0D(value);
        return (C1796At5) value;
    }

    public static final 2Qb A01(B7c b7c) {
        return AbJ.A0X(b7c.A0H);
    }

    public static final void A02(B7c b7c, String str) {
        VideoChatLink A06;
        2JX r0;
        VideoChatLink A062 = CZq.A06(b7c);
        if (A062 != null) {
            1Br r02 = b7c.A0H;
            AbJ.A0X(r02).A0D((VideoChatLinkJoiningContext) null);
            IFc A0b = AbM.A0b(b7c.A0J);
            String str2 = A062.A0T;
            C00i c00i = b7c.A0B.A00;
            boolean BTq = ((2QO) c00i.get()).BTq();
            String str3 = BTq ? "link_join_with_video_clicked" : "link_join_without_video_clicked";
            AbN.A1H(A0b, str3, str2, str);
            4zI.A03.A05("VideoChatLinksAnalyticsLogger", "Event: %s. url: %s. video: %s", new Object[]{str3, str2, Boolean.valueOf(BTq)});
            1Br.A0C(b7c.A03);
            CEH ceh = (CEH) 1Br.A0B(b7c.A04);
            FbUserSession fbUserSession = b7c.A0O;
            QAR qar = new QAR(A062, new RtcCallVideoOptions(((2QO) c00i.get()).BTq(), false), AbJ.A0j(c00i).A0B, (!AbJ.A0X(r02).A0P() || (A06 = CZq.A06(b7c)) == null || (r0 = A06.A07) == null) ? null : r0.A0r(1485983433), (String) null, C0ty.A00, false);
            11T.A0F(fbUserSession, 0);
            47I A00 = CEH.A00((Context) null, fbUserSession, qar, ceh);
            C00i c00i2 = b7c.A0E.A00;
            47H.A00(new D2v(A062, b7c, str, 0), 2FP.A02(new D2v(A062, b7c, str, 1), A00, AbG.A1D(c00i2)), Throwable.class, AbG.A1D(c00i2));
            A01(b7c);
        }
    }

    public static final void A03(B7c b7c, String str, String str2, String str3) {
        AbM.A0b(b7c.A0J).A0O("room_enter_failure", 0Pz.A0W("Exception: ", str), str2, str3);
        ((IRF) 1Br.A0B(b7c.A02)).A0h(1, 0Pz.A0W("meetup_failed_to_join ", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        if (r0.A0c == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C1796At5 A04() {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7c.A04():X.At5");
    }

    public final String A05() {
        C28o c28o = (C28o) 1Br.A0B(this.A0F);
        VideoChatLink A06 = CZq.A06(this);
        return c28o.A03(A06 != null ? A06.A0B : null);
    }

    public final String A06() {
        CCG ccg = (CCG) 1Br.A0B(this.A05);
        Resources A09 = 4YV.A09(this.A07);
        VideoChatLink A06 = CZq.A06(this);
        String str = A06 != null ? A06.A0Q : null;
        String A05 = A05();
        11T.A0F(A09, 0);
        return CCG.A00(A09, ccg, str, A05);
    }

    public final ArrayList A07() {
        ImmutableList Aaq = ((2QU) 1Br.A0B(this.A0A)).Aaq();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = Aaq.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            I9O i9o = (I9O) next;
            2QW A00 = i9o.A03.A00();
            if (A00 == 2QW.A04 || A00 == 2QW.A0E) {
                if (i9o.A08 != null) {
                    A0s.add(next);
                }
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            String str = ((I9O) it2.next()).A08;
            if (str != null) {
                A0s2.add(str);
            }
        }
        A01(this);
        return A0s2;
    }

    @Override // X.DIo
    public C1P B5J() {
        return this.A0L;
    }

    @Override // X.DIo
    public C1P B5K() {
        return this.A0M;
    }

    @Override // X.DIo
    public void BLU() {
        ((C81) 1Br.A0B(this.A06)).A00();
    }

    @Override // X.DIo
    public void BMC(String str) {
        AbM.A0b(this.A0J).A0O("media_permission_error", "user_denied_permission", AbJ.A0X(this.A0H).A0A(), "messenger_lobby");
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.9Or] */
    @Override // X.DIo
    public void BXb(final String str, boolean z) {
        11T.A0F(str, 0);
        if (!z) {
            FbUserSession A03 = 1Br.A03(this.A0K);
            if (CZq.A06(this) != null && !((CJC) 1Br.A0B(this.A0I)).A03(A03).isEmpty()) {
                C1P c1p = this.A0L;
                8KW r0 = new 8KW(str);
                Iterator A1B = 1BK.A1B(c1p.A00);
                while (A1B.hasNext()) {
                    7zL.A1T(A1B.next(), r0);
                }
                return;
            }
        }
        if (!AbJ.A0X(this.A0H).A0P()) {
            A02(this, str);
            return;
        }
        I91 i91 = (I91) 1Br.A0B(this.A08);
        ?? r02 = new Object() { // from class: X.9Or
        };
        C00i c00i = i91.A01;
        HuL huL = (HuL) c00i.get();
        String A00 = 7zK.A00(70);
        0D2 A002 = huL.A00(A00);
        if (A002 == null) {
            A002 = new Rooms2LiveLobbyJoinInterstitialDialogFragment();
            Rooms2LiveLobbyJoinInterstitialDialogFragment.A03 = r02;
        }
        Rooms2LiveLobbyJoinInterstitialDialogFragment.A03 = r02;
        if (A002.isAdded()) {
            return;
        }
        ((HuL) c00i.get()).A01(A002, A00);
    }

    @Override // X.DIo
    public void BYB() {
        String str;
        if (((CJC) 1Br.A0B(this.A0I)).A08(1Br.A03(this.A0K))) {
            C1P c1p = this.A0M;
            8Lb r0 = new 8Lb("User leave call from confirmation dialog after clicked end call", true, 3);
            Iterator A1B = 1BK.A1B(c1p.A00);
            while (A1B.hasNext()) {
                7zL.A1T(A1B.next(), r0);
            }
            return;
        }
        boolean z = AbJ.A0X(this.A0H).A0G;
        String str2 = null;
        IFc A0b = AbM.A0b(this.A0J);
        VideoChatLink A06 = CZq.A06(this);
        if (z) {
            if (A06 != null) {
                str2 = A06.A0T;
            }
            str = "user_exited_lobby_in_ringback";
        } else {
            if (A06 != null) {
                str2 = A06.A0T;
            }
            str = "user_exited_lobby";
        }
        AbN.A1G(A0b, str, str2);
        4zI.A03.A05("VideoChatLinksAnalyticsLogger", "Event: %s", new Object[]{str});
        ((CP1) 1Br.A0B(this.A0G)).A05("meetup_left_lobby", true);
    }

    @Override // X.DIo
    public void Cij(String str) {
        IFc A0b = AbM.A0b(this.A0J);
        String A0A = AbJ.A0X(this.A0H).A0A();
        AbN.A1G(A0b, "button_ring_invitee_clicked", A0A);
        AbN.A1K(4zI.A03, "button_ring_invitee_clicked", A0A);
        ((IRF) 1Br.A0B(this.A02)).A0p(str);
    }

    @Override // X.DIo
    public ListenableFuture D4b() {
        return ((IRF) 1Br.A0B(this.A02)).A07.A02(!A00(this).A0T);
    }

    public void onAttach() {
        ((2QT) 1Br.A0B(this.A0A)).A67(this.A0S);
        2Qb A0X = AbJ.A0X(this.A0H);
        A0X.A0V.add(this.A0Q);
        ((2QO) 1Br.A0B(this.A0B)).A7G(this.A0R);
        ((2JN) 1Br.A0B(this.A09)).A03(this.A0P, C0uA.A00);
        if (CZq.A06(this) != null) {
            ((CP1) 1Br.A0B(this.A0G)).A03();
        }
        this.A00.postValue(A04());
    }

    public void onDetach() {
        1Br r0 = this.A0H;
        2Qb A0X = AbJ.A0X(r0);
        A0X.A0V.remove(this.A0Q);
        ((2QT) 1Br.A0B(this.A0A)).CeZ(this.A0S);
        ((2JN) 1Br.A0B(this.A09)).A02(this.A0P);
        if (AbJ.A0X(r0).A04 != null) {
            ((2Qb) ((CP1) 1Br.A0B(this.A0G)).A0B.get()).A0C();
        }
    }
}
