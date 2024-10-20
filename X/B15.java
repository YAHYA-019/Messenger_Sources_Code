package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.BitSet;
import java.util.Calendar;

/* loaded from: B15.class */
public final class B15 extends C1rj {
    public static final CallerContext A08 = CallerContext.A0B("MeetingPlanComponentSpec");
    public FbUserSession A00;
    public Bez A01;
    public RNi A02;
    public MigColorScheme A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    public B15() {
        super("MeetingPlanComponent");
    }

    public static void A00(1Iw r301) {
        if (r301.A02 != null) {
            r301.A0G(new C2l4(AnonymousClass001.A1Z(), 3), "updateState:MeetingPlanComponent.showLoadingSpinner");
        }
    }

    public static void A01(1Iw r301, MigColorScheme migColorScheme) {
        DR6 A01 = C5ic.A01(r301.A0D, migColorScheme);
        A01.A03(r301.A0D(2131959356));
        A01.A0J(r301.A0D(2131959355));
        A01.A0G((DialogInterface.OnClickListener) null, r301.A0D(2131959354));
        7zN.A13(A01);
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A00, this.A02, Boolean.valueOf(this.A07), this.A01, this.A04, this.A05, this.A06};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C26z c26z;
        1LI A0Z;
        C1rh A0V;
        1LI A2W;
        1LI r308;
        B1i b1i = (B1i) 4YU.A0P(r302);
        Bez bez = this.A01;
        String str = this.A05;
        String str2 = this.A06;
        boolean z = this.A07;
        MigColorScheme migColorScheme = this.A03;
        RNi rNi = b1i.A00;
        boolean z2 = b1i.A01;
        if (z2) {
            C1rq A01 = C1rg.A01(r302, null, 0);
            C53p A012 = C53o.A01(r302, 0);
            A012.A0C(100);
            A012.A1L(100);
            A012.A20(C26z.LEFT);
            A012.A20(C26z.RIGHT);
            A012.A0J();
            A01.A2f(A012.A01);
            c26z = C26z.TOP;
            A01.A20(c26z);
            A01.A20(C26z.BOTTOM);
            A0V = A01.A00;
        } else {
            2cM A013 = 2cK.A01(r302, (String) null, 0);
            2RH r0 = 2RH.A03;
            A013.A1D(4YU.A00(r0));
            2KD A014 = 2K3.A01(r302, 0);
            A014.A2r(2131959156);
            A014.A2b();
            A014.A2l();
            2RH r02 = 2RH.A04;
            4YU.A1M(A014, r02);
            A014.A2x(migColorScheme);
            4YU.A1K(A013, A014);
            C1rq A015 = C1rg.A01(r302, null, 0);
            QCd qCd = new QCd(r302, new QLr());
            long j = rNi.A00;
            QLr qLr = qCd.A01;
            qLr.A00 = j;
            BitSet bitSet = qCd.A02;
            bitSet.set(1);
            qLr.A01 = 1LI.A09(r302, B15.class, "MeetingPlanComponent", 22340470);
            qLr.A03 = str2;
            bitSet.set(2);
            qLr.A02 = migColorScheme;
            bitSet.set(0);
            C1rs.A03(bitSet, qCd.A03);
            qCd.A0J();
            A015.A2f(qLr);
            7zO.A1I(A015, r02);
            2RH r03 = 2RH.A05;
            7zO.A1H(A015, r03);
            7zL.A1I(A013, A015);
            2cM A016 = 2cK.A01(r302, (String) null, 0);
            8TS A00 = 8oX.A00(r302);
            String str3 = rNi.A04;
            8oX r04 = A00.A01;
            r04.A0N = str3;
            A00.A2X(2131959357);
            r04.A0C = 1LI.A09(r302, B15.class, "MeetingPlanComponent", -821066400);
            c26z = C26z.TOP;
            7zO.A1M(A00, r02, c26z);
            A00.A2Z(migColorScheme);
            A016.A2d(A00);
            if (TextUtils.isEmpty(str)) {
                A0Z = null;
            } else {
                2KD A017 = 2K3.A01(r302, 0);
                A017.A2z(7zN.A0u(r302, str, 2131959358));
                A017.A2d();
                A017.A2i();
                7zO.A1H(A017, r0);
                7zO.A1M(A017, r03, c26z);
                A0Z = 7zN.A0Z(migColorScheme, A017);
            }
            7zO.A1C(A016, A013, A0Z);
            8TI A002 = 8oZ.A00(r302);
            String str4 = rNi.A02;
            8oZ r05 = A002.A01;
            r05.A0I = str4;
            r05.A0J = 7zL.A12(A002, 2131959353);
            r05.A0O = true;
            r05.A02 = ActionId.VIDEO_SET_RENDERER_CONTEXT;
            r05.A0A = 1LI.A09(r302, B15.class, "MeetingPlanComponent", 445242564);
            A002.A2Z(migColorScheme);
            7zO.A1M(A002, r0, c26z);
            A0V = 7zL.A0V(A013, A002.A2W());
        }
        2cM A018 = 2cK.A01(r302, (String) null, 0);
        7zM.A1O(A018, migColorScheme);
        int i = 2131959154;
        Integer num = rNi.A01;
        if (num.equals(0S2.A0C)) {
            i = 2131959168;
        } else if (num.equals(0S2.A01)) {
            i = 2131959155;
        }
        C5yw A0b = 7zN.A0b(r302, false);
        A0b.A2b(migColorScheme);
        A0b.A2a(i);
        A0b.A2i(false);
        CxE.A01(A0b, bez, 58);
        A0b.A2b(migColorScheme);
        AbH.A1Q(A018, A0b);
        A018.A2e(A0V);
        if (z2) {
            r308 = null;
        } else {
            if (z) {
                C1rq A019 = C1rg.A01(r302, null, 0);
                8Au A003 = 8Av.A00(r302);
                A003.A2a(r302.A0D(2131959366));
                A003.A0Q();
                A003.A2T(1LI.A0C(r302, B15.class, "MeetingPlanComponent", new Object[]{bez}, 1670328522));
                A003.A2Z(migColorScheme);
                A019.A2f(A003.A2W());
                8Th A004 = C8nq.A00(r302);
                A004.A2a(r302.A0D(2131959368));
                7zU.A1D(A004, 2RH.A05);
                A004.A0Q();
                A004.A2T(1LI.A0C(r302, B15.class, "MeetingPlanComponent", new Object[]{bez}, -519914011));
                A004.A2Z(migColorScheme);
                A2W = 7zL.A0d(A004.A2W(), A019);
            } else {
                8Th A005 = C8nq.A00(r302);
                A005.A2a(r302.A0D(2131959367));
                A005.A2T(1LI.A0C(r302, B15.class, "MeetingPlanComponent", new Object[]{bez}, 79320454));
                A005.A2Z(migColorScheme);
                A2W = A005.A2W();
            }
            2cM A0110 = 2cK.A01(r302, (String) null, 0);
            2cM A0111 = 2cK.A01(r302, (String) null, 0);
            A0111.A2e(A2W);
            7zO.A1K(A0111, 2RH.A03);
            7zO.A1I(A0111, 2RH.A05);
            7zL.A1G(A0111, A0110);
            A0110.A20(c26z);
            r308 = A0110.A00;
        }
        return 7zL.A0V(A018, r308);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Iw r321;
        MigColorScheme migColorScheme;
        1Iw r309;
        C2l4 A0V;
        String str;
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -821066400:
                r309 = r302.A00.A00;
                String str2 = ((C9Mz) obj).A01;
                if (r309.A02 == null) {
                    return null;
                }
                A0V = 7zQ.A0V(str2, 1);
                str = "updateState:MeetingPlanComponent.updateLocation";
                r309.A0G(A0V, str);
                return null;
            case -519914011:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                r321 = r0.A00;
                Bez bez = (Bez) r302.A03[0];
                B15 b15 = (B15) r02;
                B1i b1i = (B1i) 4YU.A0P(r321);
                FbUserSession fbUserSession = b15.A00;
                migColorScheme = b15.A03;
                String str3 = b15.A06;
                RNi rNi = b1i.A00;
                C3x c3x = (C3x) 1Bn.A0E(r321.A0D, (1BY) null, 82020);
                C6l c6l = (C6l) 1Bn.A0A(83504);
                C5ic A0c = AbJ.A0c();
                c6l.A00(str3, "door_exchange_submit_button");
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                long j = 2592000000L + timeInMillis;
                long j2 = rNi.A00;
                if (j2 > timeInMillis && j2 < j) {
                    A00(r321);
                    int A06 = (int) 4YU.A06(j2);
                    String str4 = rNi.A03;
                    String str5 = rNi.A04;
                    String str6 = rNi.A02;
                    Cm2 cm2 = new Cm2(r321, bez, A0c, migColorScheme, 1);
                    11T.A0F(fbUserSession, 0);
                    07S A0J = 4YU.A0J(GraphQlCallInput.A02, str4, "marketplace_meeting_plan_id");
                    07S.A00(A0J, Integer.valueOf(A06), "meeting_time");
                    07S.A00(A0J, str5, "location_name");
                    GraphQlQueryParamSet A0N = 4YU.A0N(A0J, str6, "notes");
                    4YV.A1A(A0J, A0N, "input");
                    ListenableFuture A0z = AbK.A0z(1VX.A06(AbJ.A05(c3x.A01), fbUserSession), 5Dh.A00(A0N, new C01643sd(Q8G.class, "UpdateMarketplaceMeetingPlanMutation", null, "input", "fbandroid", -1319287824, 384, 2941294866L, 2941294866L, false, true)), 4235075889840483L);
                    1Kd.A0D(c3x.A00, D4q.A00(cm2, 42), A0z);
                    return null;
                }
                DR6 A01 = C5ic.A01(r321.A0D, migColorScheme);
                A01.A03(r321.A0D(2131959361));
                A01.A0J(r321.A0D(2131959360));
                A01.A0G((DialogInterface.OnClickListener) null, r321.A0D(2131959359));
                7zN.A13(A01);
                return null;
            case 22340470:
                r309 = r302.A00.A00;
                long j3 = ((RFg) obj).A00;
                if (r309.A02 == null) {
                    return null;
                }
                A0V = 7zQ.A0V(Long.valueOf(j3), 0);
                str = "updateState:MeetingPlanComponent.updateTimeSelected";
                r309.A0G(A0V, str);
                return null;
            case 79320454:
                1Iv r03 = r302.A00;
                1Is r04 = r03.A01;
                r321 = r03.A00;
                Bez bez2 = (Bez) r302.A03[0];
                B15 b152 = (B15) r04;
                B1i b1i2 = (B1i) 4YU.A0P(r321);
                FbUserSession fbUserSession2 = b152.A00;
                migColorScheme = b152.A03;
                String str7 = b152.A04;
                String str8 = b152.A06;
                RNi rNi2 = b1i2.A00;
                C3x c3x2 = (C3x) 1Bn.A0E(r321.A0D, (1BY) null, 82020);
                C6l c6l2 = (C6l) 1Bn.A0A(83504);
                C5ic A0c2 = AbJ.A0c();
                c6l2.A00(str8, "door_exchange_submit_button");
                long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                long j4 = 2592000000L + timeInMillis2;
                long j5 = rNi2.A00;
                if (j5 > timeInMillis2 && j5 < j4) {
                    A00(r321);
                    int A062 = (int) 4YU.A06(j5);
                    String str9 = rNi2.A04;
                    String str10 = rNi2.A02;
                    Cm2 cm22 = new Cm2(r321, bez2, A0c2, migColorScheme, 0);
                    11T.A0F(fbUserSession2, 0);
                    07S A0J2 = 4YU.A0J(GraphQlCallInput.A02, Integer.valueOf(A062), "meeting_time");
                    07S.A00(A0J2, str9, "location_name");
                    07S.A00(A0J2, str10, "notes");
                    07S.A00(A0J2, str8, "thread_id");
                    07S.A00(A0J2, str7, "recipient_id");
                    07S.A00(A0J2, "Meeting Plan", "title");
                    GraphQlQueryParamSet A0N2 = 4YU.A0N(A0J2, 3600, "seconds_to_notify_before");
                    4YV.A1A(A0J2, A0N2, "input");
                    ListenableFuture A0z2 = AbK.A0z(1VX.A06(AbJ.A05(c3x2.A01), fbUserSession2), 5Dh.A00(A0N2, new C01643sd(Q8E.class, "CreateMarketplaceMeetingPlanMutation", null, "input", "fbandroid", 1584799464, 384, 1361520883L, 1361520883L, false, true)), 4235075889840483L);
                    1Kd.A0D(c3x2.A00, D4q.A00(cm22, 40), A0z2);
                    return null;
                }
                DR6 A012 = C5ic.A01(r321.A0D, migColorScheme);
                A012.A03(r321.A0D(2131959361));
                A012.A0J(r321.A0D(2131959360));
                A012.A0G((DialogInterface.OnClickListener) null, r321.A0D(2131959359));
                7zN.A13(A012);
                return null;
            case 445242564:
                r309 = r302.A00.A00;
                String str11 = ((C9Mz) obj).A01;
                if (r309.A02 == null) {
                    return null;
                }
                A0V = 7zQ.A0V(str11, 2);
                str = "updateState:MeetingPlanComponent.updateExtraNotes";
                r309.A0G(A0V, str);
                return null;
            case 1670328522:
                1Iv r05 = r302.A00;
                1Is r06 = r05.A01;
                1Iw r07 = r05.A00;
                Bez bez3 = (Bez) r302.A03[0];
                B15 b153 = (B15) r06;
                B1i b1i3 = (B1i) 4YU.A0P(r07);
                FbUserSession fbUserSession3 = b153.A00;
                MigColorScheme migColorScheme2 = b153.A03;
                String str12 = b153.A06;
                RNi rNi3 = b1i3.A00;
                Context context = r07.A0D;
                C3x c3x3 = (C3x) 1Bn.A0E(context, (1BY) null, 82020);
                C6l c6l3 = (C6l) 1Bn.A0A(83504);
                C5ic A0l = 7zQ.A0l();
                c6l3.A00(str12, "door_exchange_delete_button");
                DR6 A013 = C5ic.A01(context, migColorScheme2);
                A013.A03(r07.A0D(2131959365));
                A013.A0J(r07.A0D(2131959363));
                A013.A0D(new CRN(fbUserSession3, r07, bez3, rNi3, c3x3, A0l, migColorScheme2), 2131959364);
                A013.A0B((DialogInterface.OnClickListener) null, 2131959362);
                7zN.A13(A013);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1C(1Iw r302) {
        String str = this.A06;
        C6l c6l = (C6l) 1Bn.A0A(83504);
        c6l.A01(str, "door_exchange_time_field");
        c6l.A01(str, "door_exchange_location_text_field");
        c6l.A01(str, "door_exchange_notes_text_view");
        c6l.A01(str, "door_exchange_submit_button");
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1i b1i = (B1i) r303;
        b1i.A00 = new RNi(new RZ1(this.A02));
        b1i.A01 = false;
    }

    @Override // X.C1rj
    public boolean A1R() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
