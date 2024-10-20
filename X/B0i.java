package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: B0i.class */
public final class B0i extends C1rj {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public QAd A03;
    public BmZ A04;
    public JKE A05;
    public AnonymousClass553 A06;
    public AnonymousClass553 A07;
    public AnonymousClass553 A08;
    public AnonymousClass553 A09;
    public MigColorScheme A0A;

    public B0i() {
        super("OnlyActiveAdminLobbyLayout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.2iw, java.lang.Object] */
    public static final C2018Azf A00(FbUserSession fbUserSession, 1Iw r302, QAd qAd, BmZ bmZ, IFc iFc, CPV cpv, MigColorScheme migColorScheme, boolean z) {
        ?? obj = new Object();
        AvN avN = new AvN(r302, new C2018Azf());
        ImmutableList Atu = qAd.Atu();
        C2018Azf c2018Azf = avN.A01;
        c2018Azf.A03 = Atu;
        BitSet bitSet = avN.A02;
        bitSet.set(5);
        c2018Azf.A07 = z;
        bitSet.set(3);
        avN.A2L("ringable_user_list_key");
        c2018Azf.A05 = qAd.B1W();
        bitSet.set(8);
        c2018Azf.A06 = qAd.BR5();
        bitSet.set(2);
        c2018Azf.A00 = fbUserSession;
        bitSet.set(1);
        String str = qAd.A07;
        if (str == null) {
            str = "";
        }
        c2018Azf.A04 = str;
        bitSet.set(7);
        c2018Azf.A09 = qAd.BAu();
        bitSet.set(9);
        c2018Azf.A08 = true;
        bitSet.set(4);
        c2018Azf.A01 = new Cp2(r302, qAd, bmZ, iFc, cpv);
        bitSet.set(6);
        c2018Azf.A02 = migColorScheme;
        bitSet.set(0);
        avN.A1w(obj);
        7zP.A19(avN, bitSet, avN.A03);
        return c2018Azf;
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A04, this.A06, this.A0A, this.A01, this.A03, this.A07, this.A08, this.A02, this.A09, this.A05};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rq c1rq;
        QIc qIc;
        Az6 az6;
        QDB qdb;
        QKi A00;
        B1U A0P = 4YU.A0P(r302);
        QAd qAd = this.A03;
        View.OnClickListener onClickListener = this.A00;
        AnonymousClass553 anonymousClass553 = this.A06;
        BmZ bmZ = this.A04;
        AnonymousClass553 anonymousClass5532 = this.A07;
        AnonymousClass553 anonymousClass5533 = this.A09;
        MigColorScheme migColorScheme = this.A0A;
        JKE jke = this.A05;
        AnonymousClass553 anonymousClass5534 = this.A08;
        View.OnClickListener onClickListener2 = this.A02;
        View.OnClickListener onClickListener3 = this.A01;
        boolean z = A0P.A00;
        11T.A0G(qAd, 1, onClickListener);
        7zT.A11(3, anonymousClass553, bmZ, anonymousClass5532, anonymousClass5533);
        11T.A0F(migColorScheme, 7);
        Context A0A = 7zL.A0A(r302);
        FbUserSession A002 = IDw.A00(A0A, "OnlyActiveAdminLobbyLayoutSpec");
        11T.A0F(A002, 1);
        1MV A09 = AbF.A09(A002, 84148);
        1MV A003 = 1Lo.A00(A0A, A002, 67965);
        1Bi.A03(115042);
        C8nq c8nq = null;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        if (z) {
            int i = 1442840576;
            if (qAd.A09) {
                i = 2130706432;
            }
            A01.A1H(i);
            A01.A2e(A00(A002, r302, qAd, bmZ, (IFc) A003.get(), (CPV) A09.get(), migColorScheme, z));
        } else {
            boolean z2 = qAd.A09;
            int i2 = 1442840576;
            if (z2) {
                i2 = 2130706432;
            }
            A01.A1H(i2);
            A01.A1v(1LI.A05(r302, B0i.class, "OnlyActiveAdminLobbyLayout"));
            boolean BAj = qAd.BAj();
            A01.A2d(CAy.A01(r302, qAd, jke, anonymousClass553, anonymousClass5532, anonymousClass5534, migColorScheme, BAj ? qAd.A07 : null, false, true));
            if (BAj) {
                c1rq = null;
            } else {
                c1rq = CAy.A00(A002, qAd.A00, r302, migColorScheme, qAd.Aeu(), qAd.AuP(), qAd.A07, qAd.A06, qAd.BKH(), false, z2, false, qAd.A0B, true, false, qAd.BRn());
            }
            A01.A2d(c1rq);
            Integer num = qAd.A04;
            if (num != null || BAj) {
                qIc = null;
            } else {
                QD6 qd6 = new QD6(r302, new QIc());
                qd6.A0L();
                qd6.A17(6.0f);
                qIc = qd6.A01;
                qIc.A01 = migColorScheme;
                BitSet bitSet = qd6.A02;
                bitSet.set(1);
                qIc.A00 = onClickListener;
                bitSet.set(0);
                C1rs.A00(bitSet, qd6.A03);
                qd6.A0J();
            }
            A01.A2e(qIc);
            A01.A2d(7zM.A0m(r302));
            if (num != null) {
                String A0D = r302.A0D(2131958742);
                8Th A004 = C8nq.A00(r302);
                A004.A2a(A0D);
                A004.A0L();
                A004.A17(16.0f);
                A004.A2Z(migColorScheme);
                A004.A2Y(onClickListener3);
                c8nq = A004.A2W();
            }
            A01.A2e(c8nq);
            if (qAd.A08) {
                C2671Gkn c2671Gkn = new C2671Gkn(r302, new Az6());
                c2671Gkn.A0L();
                Az6 az62 = c2671Gkn.A01;
                az62.A01 = migColorScheme;
                c2671Gkn.A02.set(0);
                az62.A00 = onClickListener2;
                az6 = c2671Gkn.A2V();
            } else {
                az6 = null;
            }
            A01.A2e(az6);
            if (qAd.BAu()) {
                qdb = new QDB(r302, new QId());
                int Atg = qAd.Atg();
                QId qId = qdb.A01;
                qId.A00 = Atg;
                BitSet bitSet2 = qdb.A02;
                bitSet2.set(1);
                qId.A01 = migColorScheme;
                bitSet2.set(0);
                qdb.A16(9.0f);
                qdb.A18(12.0f);
            } else {
                qdb = null;
            }
            A01.A2d(qdb);
            if (BAj) {
                QD5 qd5 = new QD5(r302, new QKi());
                String B8C = qAd.B8C();
                if (B8C == null) {
                    throw 1BK.A0h();
                }
                A00 = qd5.A01;
                A00.A00 = B8C;
                BitSet bitSet3 = qd5.A02;
                bitSet3.set(0);
                qd5.A0j(100.0f);
                C1rs.A05(bitSet3, qd5.A03, 1);
                qd5.A0J();
            } else {
                A00 = A00(A002, r302, qAd, bmZ, (IFc) A003.get(), (CPV) A09.get(), migColorScheme, false);
            }
            A01.A2e(A00);
        }
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        5X3 A00 = C3s9.A00(C3s9.A04, "ringable_user_list_key");
        A00.A03(C2jm.A09);
        return A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1803022739) {
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        QAd qAd = ((B0i) r02).A03;
        11T.A0H(r03, qAd);
        CPV cpv = (CPV) 1Lm.A06(IDw.A00(7zL.A0A(r03), "OnlyActiveAdminLobbyLayoutSpec"), 84148);
        String B8C = qAd.B8C();
        1UG A0A = AbG.A0A(1ZG.A03, 1Br.A02(cpv.A00), "room_lobby_sheet_impression");
        if (!A0A.isSampled()) {
            return null;
        }
        0DA r04 = new 0DA();
        String A00 = Hmi.A00(cpv);
        if (A00 == null) {
            throw 1BK.A0h();
        }
        r04.A07("tray_session_id", CPV.A03(r04, cpv, A00));
        A0A.A7T(r04, "session_ids");
        A0A.A5c(BNx.A01, "surface");
        A0A.A5c(BOd.A04, "sheet_type");
        A0A.A5c(BOG.A01, "creation_version");
        if (B8C != null) {
            A0A.A7R("room_url", B8C);
        }
        A0A.BZL();
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((B1U) r303).A00 = false;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
