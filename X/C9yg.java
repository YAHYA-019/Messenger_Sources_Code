package X;

import android.content.Context;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;

/* renamed from: X.9yg, reason: invalid class name */
/* loaded from: 9yg.class */
public final class C9yg implements C5wx {
    public final /* synthetic */ 2SP A00;
    public final /* synthetic */ C9cs A01;

    public C9yg(2SP r302, C9cs c9cs) {
        this.A00 = r302;
        this.A01 = c9cs;
    }

    @Override // X.C5wx
    public boolean onLongClick(View view) {
        2SP r0 = this.A00;
        9JS r02 = r0.A03;
        if (r02 != null) {
            final C9cs c9cs = this.A01;
            8GR r03 = r02.A00;
            Context requireContext = r03.requireContext();
            06Z BDe = r03.requireActivity().BDe();
            11T.A0A(BDe);
            final 9Qs r04 = new 9Qs(requireContext, BDe);
            final 9JR r05 = new 9JR(r03);
            Context context = r04.A01;
            MigColorScheme migColorScheme = (MigColorScheme) 1Bu.A06(context, 16979);
            DG3 dg3 = new DG3() { // from class: X.9xp
                /* JADX WARN: Removed duplicated region for block: B:23:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0210  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0204  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x027c  */
                @Override // X.DG3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void CAG(X.DJd r302) {
                    /*
                        Method dump skipped, instructions count: 641
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9xp.CAG(X.DJd):void");
                }
            };
            06Z r06 = r04.A02;
            Bwz A00 = 9DO.A00(r06);
            11T.A0F(migColorScheme, 0);
            A00.A03 = migColorScheme;
            boolean A02 = c9cs.A02();
            ArrayList A0s = AnonymousClass001.A0s();
            if (A02) {
                A0s.add(new C9xn(C1u3.A2X, 1BK.A0u(context, 2131958492), 8));
            }
            A0s.add(new C9xn(C1u3.A6a, 1BK.A0u(context, 2131958495), 74));
            A00.A04 = 1BL.A0a(A0s);
            A00.A02 = dg3;
            C8t c8t = new C8t(A00);
            r04.A00 = c8t;
            c8t.A02();
            r06.A0t();
            C8t c8t2 = r04.A00;
            if (c8t2 == null) {
                11T.A0L("simpleUserControlBottomSheet");
                throw 0Q8.createAndThrow();
            }
            c8t2.A01();
        }
        Long valueOf = Long.valueOf(r0.A0B());
        C9cs c9cs2 = this.A01;
        String str = c9cs2.A0B;
        String str2 = c9cs2.A0C;
        String str3 = c9cs2.A0D;
        boolean z = !c9cs2.A02();
        C2z3 c2z3 = c9cs2.A00;
        Long l = null;
        String str4 = c2z3 != null ? c2z3.A01 : null;
        String A002 = c9cs2.A00();
        Integer num = c9cs2.A01;
        if (num != null) {
            l = 7zP.A0g(num);
        }
        if (C3TS.A00 != null) {
            1UG A08 = 1BK.A08(1Br.A02(C3TS.A01), "messenger_jewel_notification_event");
            if (A08.isSampled()) {
                0DA r07 = new 0DA();
                r07.A01(3yU.A07, "major_surface");
                C34Q A003 = 1BM.A00(3yV.A0H, r07, valueOf);
                C34X A004 = C34X.A00(str, str2);
                A004.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
                8Fp A005 = 8Fp.A00(A004, l, str4, A002, z);
                0DA r08 = new 0DA();
                r08.A01(3yQ.A06, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                r08.A02(A003, "badging");
                r08.A02(A004, "jewel_notification");
                r08.A02(A005, "ranking");
                1UG.A00(3yM.A01, r07, r08, A08);
            }
        }
        return true;
    }
}
