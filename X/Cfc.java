package X;

import android.content.Context;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.messaging.accountswitch.protocol.GetUnseenCountsNotificationResult;
import com.facebook.messaging.accountswitch.protocol.SwitchAccountFetchResult;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Cfc.class */
public final class Cfc implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "SwitchAccountsServiceHandler";
    public final 1Rl A00;
    public final C00i A01 = 1BQ.A02(83207);
    public final C00i A02 = AbH.A0R();
    public final 4sV A03;
    public final InterfaceC09434q3 A04;
    public final Cgt A05;
    public final C15h A06;

    public Cfc(Context context) {
        1Rl A0I = AbJ.A0I();
        DBS dbs = new DBS(context, this, 1);
        InterfaceC09434q3 interfaceC09434q3 = (InterfaceC09434q3) 1Bi.A03(66417);
        4sV r0 = (4sV) 1Bi.A03(49326);
        Cgt cgt = (Cgt) 1Bn.A0E(context, (1BY) null, 84701);
        this.A00 = A0I;
        this.A06 = dbs;
        this.A04 = interfaceC09434q3;
        this.A03 = r0;
        this.A05 = cgt;
    }

    public OperationResult BMQ(1TC r302) {
        String str = r302.A06;
        if (!str.equals(1BJ.A00(236))) {
            throw 0Pz.A05("Unhandled operation type: ", str);
        }
        ViewerContext viewerContext = (ViewerContext) 1Bn.A0A(33059);
        ArrayList A0s = AnonymousClass001.A0s();
        String str2 = ((ViewerContext) this.A06.get()).mUserId;
        String str3 = viewerContext == null ? null : viewerContext.mUserId;
        InterfaceC09434q3 interfaceC09434q3 = this.A04;
        Iterator it = interfaceC09434q3.AVB().iterator();
        while (it.hasNext()) {
            MessengerAccountInfo A0W = AbF.A0W(it);
            String str4 = A0W.A0A;
            if (!Objects.equal(str4, str2)) {
                String str5 = A0W.A09;
                if (str5 == null) {
                    if (viewerContext != null && 1BK.A0N(((C2ib) this.A02.get()).A00).AZk(36310834637571308L) && Objects.equal(str4, str3)) {
                        str5 = viewerContext.mAuthToken;
                    }
                }
                A0s.add(new BoR(str4, str5, A0W.A02));
            }
        }
        if (A0s.isEmpty()) {
            0fH.A0j(__redex_internal_original_name, "Abandoned unseen count fetch for lack of eligible accounts");
            return OperationResult.A06(AnonymousClass001.A0s());
        }
        C04033zm c04033zm = new C04033zm();
        if (viewerContext != null) {
            c04033zm.A07 = viewerContext.mAuthToken;
        }
        Bk1 bk1 = (Bk1) this.A00.A06(CallerContext.A09(getClass(), __redex_internal_original_name), this.A05, c04033zm, A0s);
        ArrayList A0s2 = AnonymousClass001.A0s();
        ImmutableMap.Builder A0c = 1BK.A0c();
        for (BvV bvV : bk1.A01) {
            String str6 = bvV.A04;
            MessengerAccountInfo AVA = interfaceC09434q3.AVA(str6);
            if (AVA != null) {
                if (bvV.A05) {
                    A0c.put(str6, Integer.valueOf(bvV.A00));
                    long j = AVA.A02;
                    long j2 = bvV.A02;
                    if (j != j2 && j2 > j) {
                        String str7 = AVA.A0A;
                        String str8 = AVA.A05;
                        String str9 = AVA.A07;
                        long j3 = AVA.A01;
                        String str10 = AVA.A09;
                        interfaceC09434q3.CjN(new MessengerAccountInfo(AVA.A03, AVA.A04, str8, AVA.A06, str9, AVA.A08, str10, str7, AVA.A00, j3, j2, AVA.A0B, AVA.A0C, AVA.A0D, AVA.A0E));
                    }
                    String str11 = bvV.A03;
                    if (str11 != null) {
                        A0s2.add(new GetUnseenCountsNotificationResult(str6, str11, bvV.A01));
                    }
                } else {
                    String str12 = AVA.A0A;
                    String str13 = AVA.A05;
                    String str14 = AVA.A07;
                    long j4 = AVA.A01;
                    long j5 = AVA.A02;
                    interfaceC09434q3.CjN(new MessengerAccountInfo(AVA.A03, AVA.A04, str13, AVA.A06, str14, AVA.A08, null, str12, AVA.A00, j4, j5, AVA.A0B, AVA.A0C, AVA.A0D, AVA.A0E));
                }
            }
        }
        4sV r0 = this.A03;
        ImmutableMap build = A0c.build();
        1Ql A0V = 1BL.A0V(r0.A01);
        int A00 = r0.A00();
        1G2 r02 = C1f0.A0G;
        A0V.CfI(r02);
        1Du A0i = 4YU.A0i(build);
        int i = 0;
        while (A0i.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0i);
            A0V.CaE(1G3.A01(r02, AnonymousClass001.A0j(A0z)), AnonymousClass001.A03(A0z.getValue()));
            i += AnonymousClass001.A03(A0z.getValue());
            1PB r03 = r0.A03;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Badging - MessengerUnseenCountsStorageHandler - saveUnseenCount: ");
            A0k.append(AnonymousClass001.A0j(A0z));
            A0k.append(" - ");
            r03.BZQ(AnonymousClass001.A0a(A0z.getValue(), A0k));
        }
        A0V.commit();
        if (A00 != i && !((C09314po) r0.A00.get()).A00()) {
            ((C6q) r0.A02.get()).A01("switch_account", i);
        }
        if (((C09314po) this.A01.get()).A00()) {
            r0.A02(bk1.A00);
        }
        return OperationResult.A04(new SwitchAccountFetchResult(bk1.A00, A0s2));
    }
}
