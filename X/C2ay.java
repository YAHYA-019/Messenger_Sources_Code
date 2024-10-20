package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.time.Duration;

/* renamed from: X.2ay, reason: invalid class name */
/* loaded from: 2ay.class */
public final class C2ay implements 1Vf {
    public final Context A00;

    public C2ay(Context context) {
        this.A00 = context;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        FragmentActivity fragmentActivity;
        C2b5 c2b5;
        C1wk c1wk;
        FbSharedPreferences A03;
        1G9 r0;
        Object obj;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
        }
        0fH.A0j("EbDefaultUpsellLifecycleEventHandler", "onInboxVisible");
        Context context = this.A00;
        if (!(context instanceof FragmentActivity) || (fragmentActivity = (FragmentActivity) context) == null) {
            return;
        }
        1BQ r02 = new 1BQ(65997);
        FbUserSession A05 = ((1Fv) 1Bi.A03(66351)).A05(fragmentActivity);
        1BV r03 = new 1BV(66524);
        1BQ r04 = new 1BQ(99390);
        C2b0 c2b0 = new C2b0();
        try {
            try {
                c1wk = (C1wk) r03.get();
                A03 = C1wk.A03(c1wk);
                r0 = 1NK.A4j;
                11T.A0F(C1wk.A01(c1wk), 1);
            } catch (C2az e) {
                c2b0.A00();
                c2b5 = new C2b5(C2b4.A00(c2b0, e));
            }
            if (A03.AZn(C1wg.A02(r0), false)) {
                FbSharedPreferences A032 = C1wk.A03(c1wk);
                1G9 r05 = 1NK.A4k;
                11T.A0F(C1wk.A01(c1wk), 1);
                if (A032.AZn(C1wg.A02(r05), false)) {
                    C1wv c1wv = (C1wv) 1Lm.A05(context, A05, 68883);
                    C1wv.A04(c1wv);
                    if (c1wv.A02.getValue() == C1wj.A04) {
                        99P r06 = (99P) ((C9c4) 1Lm.A05(context, A05, 68884)).A03.getValue();
                        if (!(r06 instanceof C8sp)) {
                            obj = "VD list is not loaded yet";
                        } else if (((C8sp) r06).A00.contains(C96p.A08)) {
                            obj = "Backup already has PIN set up";
                        } else {
                            C1wk A0G = 1BK.A0G(r03);
                            if (!(!C1wk.A03(A0G).AZn(C1wg.A01(A0G, 1NK.A4g, 1), false))) {
                                obj = "User completed bottom sheet upsell successfully";
                            } else if (C1wk.A03(A0G).ArU(C1wg.A01(A0G, 1NK.A4h, 1), 0) < 2) {
                                C1wk A0G2 = 1BK.A0G(r03);
                                C0dp c0dp = (C0dp) r04.get();
                                C1ud c1ud = (C1ud) r02.get();
                                FbSharedPreferences A033 = C1wk.A03(A0G2);
                                1G9 A01 = C1wg.A01(A0G2, 1NK.A4i, 1);
                                long j = -1;
                                long Av1 = A033.Av1(A01, j);
                                if (Av1 != j && Long.valueOf(Av1) != null) {
                                    long Av9 = C1ud.A00(c1ud).Av9(c1ud.A02, 36597901674745662L);
                                    Duration ofMinutes = Av9 >= 0 ? Duration.ofMinutes(Av9) : Duration.ZERO;
                                    11T.A0D(ofMinutes);
                                    if (c0dp.now() - Av1 < ofMinutes.getSeconds()) {
                                        obj = "Default EB Upsell cooldown not met";
                                    }
                                }
                                C1ud c1ud2 = (C1ud) r02.get();
                                if (C1ud.A00(c1ud2).AZr(c1ud2.A02, 36316426697844788L)) {
                                    0fH.A0j("EbDefaultUpsellLifecycleEventHandler", "should show Default EB Upsell bottom sheet");
                                    06Z BDe = fragmentActivity.BDe();
                                    11T.A0A(BDe);
                                    String A00 = 7zK.A00(ActionId.OFFLINE);
                                    if (BDe.A0b(A00) == null) {
                                        new BaseMigBottomSheetDialogFragment().A0m(fragmentActivity.BDe(), A00);
                                    } else {
                                        0fH.A0l("EbDefaultUpsellLifecycleEventHandler", "Bottom sheet already shown");
                                    }
                                    04S r07 = 04S.A00;
                                    c2b0.A00();
                                    new JjV(r07);
                                    if (!(c2b5 instanceof C2b5)) {
                                        if (!(c2b5 instanceof JjV)) {
                                            throw 1BK.A1F();
                                        }
                                        return;
                                    }
                                    C2b0 c2b02 = new C2b0();
                                    try {
                                        0fH.A0j("EbDefaultUpsellLifecycleEventHandler", (String) c2b5.A00);
                                        0fH.A0j("EbDefaultUpsellLifecycleEventHandler", "Skip showing the bottom sheet");
                                        c2b02.A00();
                                        return;
                                    } catch (C2az e2) {
                                        c2b02.A00();
                                        C2b4.A00(c2b02, e2);
                                        return;
                                    }
                                }
                                obj = "Default EB Upsell MC is disabled";
                            } else {
                                obj = "User has reached the impression limit";
                            }
                        }
                    } else {
                        obj = "Device not onboarded, cannot amend backup";
                    }
                } else {
                    obj = "User canceled Default EB Upsell NUX";
                }
            } else {
                obj = "User has not completed the Default EB Upsell NUX";
            }
            c2b0.Cal(obj);
            throw 0Q8.createAndThrow();
        } catch (Throwable th) {
            c2b0.A00();
            KVT.A00(th);
            throw th;
        }
    }
}
