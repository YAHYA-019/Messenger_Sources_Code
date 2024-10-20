package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.rsys.livevideo.gen.LiveVideoApi;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Azd, reason: case insensitive filesystem */
/* loaded from: Azd.class */
public final class C2016Azd extends C1rj {
    public BLd A00;
    public ImmutableList A01;
    public ImmutableList A02;
    public boolean A03;

    public C2016Azd() {
        super("Rooms2LiveNegotiationComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, Boolean.valueOf(this.A03), this.A00, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ImmutableList of;
        1LI A2W;
        C8nq c8nq;
        1LI A0d;
        BLd bLd = this.A00;
        boolean z = this.A03;
        ImmutableList immutableList = this.A02;
        ImmutableList immutableList2 = this.A01;
        Context context = r302.A0D;
        MigColorScheme A0o = AbF.A0o(context, 16980);
        C65 c65 = (C65) 1Bn.A0E(context, (1BY) null, 85080);
        1Bn.A0A(147952);
        if (immutableList != null && immutableList.isEmpty()) {
            c65.A00(IDw.A00(context, "Rooms2LiveNegotiationComponentSpec"));
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0V();
        A01.A18(16.0f);
        AwR A00 = B12.A00(r302);
        A00.A2X(r302.A0D(2131966227));
        4YU.A1M(A00, 2RH.A07);
        A00.A0S();
        A01.A2e(A00.A2W());
        if (immutableList == null || immutableList.isEmpty()) {
            of = ImmutableList.of((Object) new C56k(z));
        } else {
            HashSet A0v = immutableList2 == null ? AnonymousClass001.A0v() : AbF.A1E(immutableList2);
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                I9O i9o = (I9O) it.next();
                if (I6L.A02(i9o)) {
                    builder.m11011add((Object) new C56i(i9o, A0v.contains(i9o.A03.A03)));
                }
            }
            of = AbG.A0z(builder, new C56k(z));
        }
        C2ki A002 = C2kV.A00(r302);
        A002.A0j(1.0f);
        A002.A12(16.0f);
        7zL.A1K(r302);
        5P2 r0 = new 5P2();
        if (of != null) {
            AbL.A0k(r0).add(of);
        }
        A002.A2d(r0);
        A002.A2j(true);
        A002.A1v(1LI.A0C(r302, C2016Azd.class, "Rooms2LiveNegotiationComponent", AnonymousClass001.A1a(of.size() - 1), 319114624));
        AbG.A1M(A01, A002);
        boolean z2 = true;
        if (immutableList != null && !immutableList.isEmpty()) {
            HashSet A0v2 = AnonymousClass001.A0v();
            1Du it2 = immutableList.iterator();
            while (it2.hasNext()) {
                I9O i9o2 = (I9O) it2.next();
                if (I6L.A02(i9o2)) {
                    A0v2.add(i9o2.A03.A03);
                }
            }
            if (!A0v2.isEmpty()) {
                if (immutableList2 == null || immutableList2.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator it3 = immutableList2.iterator();
                    while (it3.hasNext()) {
                        A0v2.remove(it3.next());
                    }
                    z2 = A0v2.isEmpty();
                }
            }
        }
        int AZc = A0o.AZc();
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        A012.A0W();
        BLd bLd2 = BLd.A0A;
        if (bLd != bLd2) {
            A2W = null;
        } else {
            2KD A0Y = 7zN.A0Y(r302, false);
            A0Y.A2i();
            A0Y.A2w(C1u7.A05);
            A0Y.A2X();
            A0Y.A2x(A0o);
            7zN.A1F(r302, A0Y, 2131962051);
            A0Y.A18(8.0f);
            A2W = A0Y.A2W();
        }
        A012.A2e(A2W);
        if (bLd == BLd.A09) {
            8Tj A003 = C8m4.A00(r302);
            A003.A2Y(AZc);
            A0d = 8Tj.A06(A003, A0o);
        } else {
            C1rq A013 = C1rg.A01(r302, null, 0);
            A013.A2b();
            A013.A2d();
            8Au A004 = 8Av.A00(r302);
            A004.A2a(r302.A0D(2131962047));
            A004.A0U();
            A004.A14((z2 && (bLd == BLd.A07 || bLd == bLd2)) ? 7zM.A01() : 0.0f);
            A004.A0j(1.0f);
            A004.A0k(1.0f);
            A004.A2Z(A0o);
            7zN.A1D(A004, r302, C2016Azd.class, "Rooms2LiveNegotiationComponent", 45733405);
            AbG.A1N(A004, r302, C2016Azd.class, "Rooms2LiveNegotiationComponent", -2070186969);
            A013.A2f(A004.A2W());
            if (z2 && (bLd == BLd.A07 || bLd == bLd2)) {
                8Th A005 = C8nq.A00(r302);
                A005.A2a(r302.A0D(2131962052));
                A005.A0U();
                7zU.A1D(A005, 2RH.A05);
                A005.A0j(1.0f);
                A005.A0k(1.0f);
                A005.A2Z(A0o);
                7zN.A1D(A005, r302, C2016Azd.class, "Rooms2LiveNegotiationComponent", 1132795559);
                AbG.A1N(A005, r302, C2016Azd.class, "Rooms2LiveNegotiationComponent", -2122772515);
                c8nq = A005.A2W();
            } else {
                c8nq = null;
            }
            A0d = 7zL.A0d(c8nq, A013);
        }
        7zO.A1C(A012, A01, A0d);
        AbG.A1N(A01, r302, C2016Azd.class, "Rooms2LiveNegotiationComponent", 1611659444);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        IFc iFc;
        String str;
        String str2;
        Hs1 hs1;
        String str3;
        switch (r302.A01) {
            case -2122772515:
                1Iw r0 = r302.A00.A00;
                hs1 = (Hs1) 1Bi.A03(68474);
                Context context = r0.A0D;
                ((IFc) 1Lo.A04(context, IDw.A00(context, "Rooms2LiveNegotiationComponentSpec"), (1BY) null, 67965)).A0J("r2l_ready_for_live_dialog", "r2l_ready_for_live_dialog_start_button");
                str3 = "negotiation_finished";
                hs1.A01(str3);
                return null;
            case -2070186969:
                Context context2 = r302.A00.A00.A0D;
                iFc = (IFc) 1Lo.A04(context2, IDw.A00(context2, "Rooms2LiveNegotiationComponentSpec"), (1BY) null, 67965);
                str = "r2l_ready_for_live_dialog";
                str2 = "r2l_ready_for_live_dialog_cancel_button";
                iFc.A0J(str, str2);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 45733405:
                1Iw r02 = r302.A00.A00;
                C65 c65 = 4YU.A0P(r02).A00;
                Context context3 = r02.A0D;
                FbUserSession A00 = IDw.A00(context3, "Rooms2LiveNegotiationComponentSpec");
                AbM.A0b(CLr.A00(context3, A00).A00).A0M("r2l_ready_for_live_dialog", "r2l_ready_for_live_dialog_cancel_button");
                c65.A00(A00);
                return null;
            case 319114624:
                1Iw r03 = r302.A00.A00;
                int A08 = 7zO.A08(r302.A03, 0);
                Context context4 = r03.A0D;
                iFc = (IFc) 1Lo.A04(context4, IDw.A00(context4, "Rooms2LiveNegotiationComponentSpec"), (1BY) null, 67965);
                if (A08 <= 0) {
                    return null;
                }
                str = "r2l_ready_for_live_dialog";
                str2 = "r2l_ready_for_live_dialog_participant_list";
                iFc.A0J(str, str2);
                return null;
            case 1132795559:
                1Iw r04 = r302.A00.A00;
                View view = ((3xC) obj).A00;
                C65 c652 = 4YU.A0P(r04).A00;
                Context context5 = r04.A0D;
                MigColorScheme A0o = AbF.A0o(context5, 16979);
                hs1 = (Hs1) 1Bi.A03(68474);
                1G1 A002 = IDw.A00(context5, "Rooms2LiveNegotiationComponentSpec");
                CLr A003 = CLr.A00(context5, A002);
                if (IFr.A0A(AbL.A0W(1Lo.A04(context5, A002, (1BY) null, 33088)), true).size() < 2) {
                    11T.A0F(view, 0);
                    AbO.A0P(view, A0o, 4YU.A0t(view.getResources(), 2131966396));
                    return null;
                }
                AbM.A0b(A003.A00).A0M("r2l_ready_for_live_dialog", "r2l_ready_for_live_dialog_start_button");
                CJA cja = (CJA) 1Lo.A04((Context) null, A002, c652.A00, 84219);
                BLd bLd = cja.A01;
                if ((bLd == BLd.A07 || bLd == BLd.A0A) && cja.A08 != null) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    builder.m11011add((Object) A002.A05);
                    ImmutableList immutableList = cja.A03;
                    if (immutableList != null) {
                        builder.addAll(immutableList);
                    }
                    Hs1 hs12 = (Hs1) c652.A05.get();
                    String A0D = 0Pz.A0D(builder.build().size(), "");
                    synchronized (hs12) {
                        C7z0 c7z0 = hs12.A01;
                        if (c7z0 != null) {
                            c7z0.Bch("live_participants_count", A0D);
                        }
                    }
                    cja.A03(BLd.A09);
                    ((LiveVideoApi) c652.A04.get()).startBroadcast(1BK.A17(builder.build()));
                }
                str3 = "tap_on_start_broadcast";
                hs1.A01(str3);
                return null;
            case 1611659444:
                Context context6 = r302.A00.A00.A0D;
                CLr A004 = CLr.A00(context6, IDw.A00(context6, "Rooms2LiveNegotiationComponentSpec"));
                hs1 = (Hs1) 1Bi.A03(68474);
                AbM.A0b(A004.A00).A0J("r2l_ready_for_live_dialog", "r2l_ready_for_live_dialog");
                str3 = "waiting_for_negotiation";
                hs1.A01(str3);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1R b1r = (B1R) r303;
        Object A0E = 1Bn.A0E(r302.A0D, (1BY) null, 85080);
        if (A0E != null) {
            b1r.A00 = (C65) A0E;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
