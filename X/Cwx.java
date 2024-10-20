package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.cowatch.intent.model.CowatchShareModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.rtc.interfaces.CallSurfaceLoggingParams;
import com.facebook.user.model.User;

/* loaded from: Cwx.class */
public final class Cwx implements AnonymousClass553 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    public Cwx(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        this.A00 = i;
        this.A04 = obj2;
        this.A05 = obj5;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A01 = obj;
        this.A06 = obj6;
        this.A07 = z;
    }

    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                11T.A0F(view, 0);
                06Z r0 = (06Z) this.A04;
                if (r0 != null) {
                    int ordinal = ((1Kn) this.A05).ordinal();
                    if (ordinal == 5) {
                        CNl cNl = (CNl) this.A02;
                        FbUserSession fbUserSession = (FbUserSession) this.A03;
                        Context context = (Context) this.A01;
                        User user = (User) this.A06;
                        11T.A0D(user);
                        cNl.A03(context, 3yU.A04, 3yV.A0S, fbUserSession, (DFY) null, new CoT(context, view, 3), user, "MESSENGER_THREADVIEW_GROUP_MEMBERS", this.A07);
                        return;
                    }
                    if (ordinal == 3) {
                        CNl cNl2 = (CNl) this.A02;
                        User user2 = (User) this.A06;
                        11T.A0D(user2);
                        cNl2.A04(r0, EnumC3497Mfs.A04, 3yU.A04, 3yV.A0S, (DFY) null, new CoT((Context) this.A01, view, 4), user2, (CIh) null, this.A07);
                        return;
                    }
                    if (ordinal == 4) {
                        CNl cNl3 = (CNl) this.A02;
                        FbUserSession fbUserSession2 = (FbUserSession) this.A03;
                        Context context2 = (Context) this.A01;
                        User user3 = (User) this.A06;
                        11T.A0D(user3);
                        cNl3.A02(context2, 3yU.A04, 3yV.A0S, fbUserSession2, (DFY) null, new CoT(context2, view, 5), user3, "MESSENGER_THREADVIEW_GROUP_MEMBERS", this.A07);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Bq8 bq8 = (Bq8) this.A02;
                C6R c6r = bq8.A01;
                C7V c7v = (C7V) 1Br.A0B(c6r.A07);
                String str = c6r.A0D;
                1UG A08 = 1BK.A08(1Br.A02(c7v.A01), "biim_commerce_catalog");
                if (A08.isSampled()) {
                    CJT.A02(A08, c7v, str);
                    AbN.A11(A08, "product_delete_button");
                }
                Blu blu = (Blu) this.A01;
                Context context3 = (Context) this.A04;
                Object obj = this.A05;
                MigColorScheme migColorScheme = (MigColorScheme) this.A03;
                boolean z = this.A07;
                Object obj2 = this.A06;
                blu.A00.get();
                DR6 A01 = C5ic.A01(context3, migColorScheme);
                A01.A0K(true);
                A01.A00(2131967364);
                A01.A06(2131959816);
                A01.A0D(new CRK(1, obj2, blu, obj, bq8, z), 2131955705);
                A01.A08(new CSF(bq8, blu, 23));
                A01.A05();
                ((9YE) blu.A01.get()).A00();
                return;
            default:
                C4E c4e = (C4E) this.A01;
                CtF ctF = (CtF) this.A02;
                ThreadSummary threadSummary = (ThreadSummary) this.A03;
                ThreadKey threadKey = (ThreadKey) this.A04;
                FbUserSession fbUserSession3 = (FbUserSession) this.A05;
                boolean z2 = this.A07;
                Context context4 = (Context) this.A06;
                CowatchShareModel cowatchShareModel = ctF.Ay1().A02;
                06Z r02 = ctF.A03.A00;
                if (cowatchShareModel == null || r02 == null) {
                    return;
                }
                if (threadSummary == null || threadKey.A1K()) {
                    BsH bsH = (BsH) c4e.A01.get();
                    String str2 = cowatchShareModel.A03;
                    String str3 = cowatchShareModel.A02;
                    String str4 = cowatchShareModel.A04;
                    11T.A0G(fbUserSession3, 0, threadKey);
                    1BY r03 = bsH.A00.A00;
                    ((I46) 1Lo.A04((Context) null, fbUserSession3, r03, 115517)).A00(str2, str3, str4);
                    GP5.A01((GP5) 1Br.A0B(bsH.A01), "cowatch_omnipicker_call_tapped", "p2p");
                    ((C5V0) 1Lo.A04((Context) null, fbUserSession3, r03, 115765)).A0B(context4, fbUserSession3, new BHl(threadKey, (CallSurfaceLoggingParams) null, "cowatch_omnipicker", (String) null, "thread_nav_bar_icon", 4001, threadKey.A02, z2, false));
                } else {
                    BsH bsH2 = (BsH) c4e.A01.get();
                    String str5 = cowatchShareModel.A03;
                    String str6 = cowatchShareModel.A02;
                    String str7 = cowatchShareModel.A04;
                    11T.A0F(fbUserSession3, 0);
                    ((I46) 4YU.A0o(fbUserSession3, bsH2.A00, 115517)).A00(str5, str6, str7);
                    GP5.A01((GP5) 1Br.A0B(bsH2.A01), "cowatch_omnipicker_call_tapped", "group");
                    ((C7u) 1Br.A0B(bsH2.A03)).A01(context4, AbF.A0f(threadSummary), threadSummary, null, "cowatch_omnipicker", null, z2);
                }
                ctF.AGI();
                return;
        }
    }
}
