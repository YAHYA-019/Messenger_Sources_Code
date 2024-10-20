package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.networkmonitor.NetworkConnectionMonitor;
import com.facebook.messaging.rtc.links.ui.dialog.RoomDialogFragment;
import com.facebook.rtc.interfaces.LinkLogMetadata;
import com.facebook.rtc.interfaces.RoomsJoinOptions;
import java.util.List;
import java.util.Set;

/* loaded from: I05.class */
public final class I05 {
    public final 1EZ A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06 = GOn.A0P();
    public final List A07;
    public final Set A08;
    public final C15h A09;

    public I05(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 114953);
        this.A04 = 1Bu.A03(r0, 85063);
        this.A05 = 1Bu.A03(r0, 115685);
        this.A02 = 1Bq.A00(115033);
        this.A09 = J5u.A03(this, 61);
        Set set = (Set) 1Bn.A0E((Context) null, r0, 190);
        11T.A0A(set);
        this.A08 = set;
        this.A00 = GOq.A0T(r0);
        this.A07 = 0QD.A0b(set, new J4h(6));
    }

    public static final boolean A00(I05 i05, RoomsJoinOptions roomsJoinOptions, String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        FragmentActivity fragmentActivity;
        String str5 = str3;
        C00i A0R = AbF.A0R(i05.A02);
        04R.A09(new 03Y[]{1BK.A1G("options", String.valueOf(roomsJoinOptions)), 1BK.A1G("isLinkMaybeEnded", Boolean.valueOf(z)), 1BK.A1G("errorMessage", String.valueOf(str2)), 1BK.A1G("errorDetails", String.valueOf(str3)), 1BK.A1G("shouldShowBloksJoinFailureDialog", Boolean.valueOf(z2))});
        A0R.get();
        String str6 = null;
        IAY iay = (IAY) 1Br.A0B(i05.A03);
        LinkLogMetadata linkLogMetadata = roomsJoinOptions.A01;
        if (z2) {
            FragmentActivity fragmentActivity2 = IAY.A00(iay).A00;
            if (fragmentActivity2 == null || (fragmentActivity = IAY.A00(iay).A00) == null) {
                str4 = "fragmentActivity";
                11T.A0L(str4);
                throw 0Q8.createAndThrow();
            }
            06Z BDe = fragmentActivity.BDe();
            11T.A0A(BDe);
            DKT dkt = (DKT) 1De.A00(iay.A01, 98520);
            CP0 cp0 = new CP0("com.bloks.www.rp.unsupported-link.entrypoint.dialog");
            cp0.A05("link_url", str);
            DKT.A02(fragmentActivity2, BDe, new IMQ(iay, 0), dkt, cp0.A03(), 50, 32);
            JQN BGd = I7M.A00(i05.A05).BGd(roomsJoinOptions.A05);
            BGd.Bcv("resolve_link", (String) null);
            BGd.ARr(str2);
            return false;
        }
        if (z) {
            if (linkLogMetadata != null) {
                str6 = linkLogMetadata.A04;
            }
            iay.A0D.A0O("link_resolve_failure", "invalid_link", str, str6);
            IAY.A02(iay, 2131965026, 2131965025);
        } else {
            if (linkLogMetadata != null) {
                str6 = linkLogMetadata.A04;
            }
            if (((NetworkConnectionMonitor) 1Br.A0B(iay.A07)).A00()) {
                1Br.A0C(iay.A03);
                IAY.A02(iay, 2131964846, 2131964845);
            } else {
                1Br.A0C(iay.A03);
                C00i c00i = iay.A0B.A00;
                Hqq hqq = (Hqq) c00i.get();
                C00i c00i2 = iay.A06.A00;
                0D2 A05 = RoomDialogFragment.A05(Qoj.A04, 2131964846, 2131965031, hqq.A01(7zM.A11(c00i2)), ((Hqq) c00i.get()).A00(7zM.A11(c00i2)), 2131967444);
                HVv hVv = IAY.A00(iay).A01;
                if (hVv == null) {
                    str4 = "roomDialogFragmentListener";
                    11T.A0L(str4);
                    throw 0Q8.createAndThrow();
                }
                ((RoomDialogFragment) A05).A01 = hVv;
                IAY.A00(iay).A01(A05, "LINK_INACTIVE_DIALOG_TAG");
                str5 = "no_network";
            }
            iay.A0D.A0O("link_resolve_failure", str5, str, str6);
        }
        JQN BGd2 = I7M.A00(i05.A05).BGd(roomsJoinOptions.A05);
        BGd2.Bcv("resolve_link", (String) null);
        BGd2.ARr(str2);
        return false;
    }
}
