package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.30p, reason: invalid class name */
/* loaded from: 30p.class */
public final class C30p extends 0KB {
    public final int A00;
    public final Object A01;

    public C30p(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A01(Context context, Fragment fragment, 06Z r304) {
        if (1 - this.A00 != 0) {
            super.A01(context, fragment, r304);
        } else if (fragment instanceof 2On) {
            2On r0 = (2On) fragment;
            MessageRequestsHomeFragment messageRequestsHomeFragment = (MessageRequestsHomeFragment) this.A01;
            r0.CvX(messageRequestsHomeFragment.A0L);
            r0.CuN(messageRequestsHomeFragment.A0K);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment, androidx.fragment.app.Fragment] */
    public void A02(Bundle bundle, View view, Fragment fragment, 06Z r305) {
        int i;
        if (1 - this.A00 != 0) {
            super.A02(bundle, view, fragment, r305);
            return;
        }
        ?? r0 = (MessageRequestsHomeFragment) this.A01;
        3Lq r02 = (3Lq) 1Br.A0B(r0.A0H);
        Context requireContext = r0.requireContext();
        if (((1Ew) 1Br.A0B(r02.A01)).AXy() != 0S2.A0C) {
            1G2 A00 = 1G3.A00(1G0.A03.A0D("reachability_settings/"), "reachability_settings_nux_upsell_shown_times");
            C00i c00i = r02.A02.A00;
            int ArU = 1BK.A0S(c00i).ArU(A00, 0);
            if (ArU < 1) {
                1Ql A0U = 1BL.A0U(c00i);
                int i2 = ArU + 1;
                A0U.CaE(A00, i2);
                A0U.commit();
                ((C9K) 1Br.A0B(r02.A00)).A01(1, i2);
                C4s1 c4s1 = (C4s1) 1Bi.A03(49322);
                DKT dkt = (DKT) 1Bn.A0A(98520);
                CP0 cp0 = new CP0("com.bloks.www.well_being.unknown_contacts.reachability_settings_upsell");
                cp0.A04 = true;
                DqD A03 = cp0.A03();
                int A08 = c4s1.A08();
                if (A08 >= 1080) {
                    i = 40;
                } else if (A08 >= 720) {
                    i = 50;
                } else {
                    i = 70;
                    if (A08 >= 480) {
                        i = 60;
                    }
                }
                DKT.A04(requireContext, r305, dkt, A03, i);
            }
        }
    }

    public void A08(Fragment fragment, 06Z r303) {
        if (this.A00 == 0) {
            C1pt.A05(fragment, (C1pt) this.A01);
            return;
        }
        MessageRequestsHomeFragment messageRequestsHomeFragment = (MessageRequestsHomeFragment) this.A01;
        if (messageRequestsHomeFragment.A05 == fragment || !(fragment instanceof 2On)) {
            return;
        }
        2On r0 = (2On) fragment;
        messageRequestsHomeFragment.A05 = r0;
        MessageRequestsHomeFragment.A07(messageRequestsHomeFragment);
        r0.Bdb();
        MessageRequestsHomeFragment.A06(messageRequestsHomeFragment);
    }

    public void A09(Fragment fragment, 06Z r303) {
        String str;
        if (1 - this.A00 != 0) {
            super.A09(fragment, r303);
            return;
        }
        MessageRequestsHomeFragment messageRequestsHomeFragment = (MessageRequestsHomeFragment) this.A01;
        C00i c00i = messageRequestsHomeFragment.A0D.A00;
        if (((BBm) c00i.get()).A01 || !messageRequestsHomeFragment.A07) {
            Integer num = messageRequestsHomeFragment.A08 ? 0S2.A0C : messageRequestsHomeFragment.A09 ? 0S2.A0N : ((BBm) c00i.get()).A01 ? 0S2.A01 : 0S2.A00;
            BBm bBm = (BBm) c00i.get();
            if (bBm.A00 != 0) {
                bBm.A01(CancelReason.SYSTEM_CANCELLED);
            }
            C00i c00i2 = bBm.A02.A00;
            bBm.A00 = ((UserFlowLogger) c00i2.get()).generateNewFlowId(70785807);
            UserFlowLogger userFlowLogger = (UserFlowLogger) c00i2.get();
            long j = bBm.A00;
            switch (num.intValue()) {
                case 0:
                    str = "ME_SETTINGS";
                    break;
                case 1:
                    str = "REQUEST_THREAD_VIEW";
                    break;
                case 2:
                    str = "NOTIFICATION";
                    break;
                default:
                    str = "DRAWER";
                    break;
            }
            userFlowLogger.flowStartIfNotOngoing(j, new UserFlowConfig(1BK.A13(str), false));
            bBm.A01 = false;
            messageRequestsHomeFragment.A07 = true;
        }
        C6ns c6ns = (C6ns) c00i.get();
        3L1 r0 = (3L1) 1Br.A0B(messageRequestsHomeFragment.A0J);
        ViewPager2 viewPager2 = messageRequestsHomeFragment.A00;
        if (viewPager2 == null) {
            11T.A0L("viewPager");
            throw 0Q8.createAndThrow();
        }
        c6ns.A03(1F9.A0Q == r0.A01[viewPager2.A00].A00 ? "open_pending" : "open_other", null);
        BBm bBm2 = (BBm) c00i.get();
        if (bBm2.A00) {
            bBm2.A03("return_from_reachability_settings", null);
            bBm2.A00 = false;
        }
    }

    public void A0C(Fragment fragment, 06Z r303) {
        if (this.A00 != 0) {
            super.A0C(fragment, r303);
        } else {
            C1pt.A04(fragment, (C1pt) this.A01);
        }
    }
}
