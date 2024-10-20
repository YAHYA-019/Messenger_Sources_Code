package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.deprecated.bottomsheet.LegacyMigBottomSheetDialogFragment;

/* loaded from: F78.class */
public final class F78 {
    public static final F78 A00 = new Object();

    public final void A00(Fwk fwk, FHf fHf, java.util.Map map, C00m c00m) {
        06Z BDe;
        0D2 r0;
        11T.A0F(fHf, 1);
        if (fwk instanceof C2050DaD) {
            BDe = ((C2050DaD) fwk).A02;
        } else {
            FragmentActivity fragmentActivity = (FragmentActivity) AnonymousClass016.A00(fwk.A00, FbFragmentActivity.class);
            if (fragmentActivity == null) {
                return;
            } else {
                BDe = fragmentActivity.BDe();
            }
        }
        0D2 A0b = BDe.A0b("MSG_BLOKS_BOTTOM_SHEET");
        if ((A0b instanceof LegacyMigBottomSheetDialogFragment) && (r0 = A0b) != null) {
            r0.A0o();
        }
        LegacyMigBottomSheetDialogFragment A05 = LegacyMigBottomSheetDialogFragment.A05(fwk.A01.A01, true);
        A05.A00 = new FKB(c00m, 0);
        Duf A06 = Duf.A06(7zL.A0W(fwk.A00));
        A06.A2Y(fwk);
        A06.A2X(fHf);
        A06.A01.A05 = map;
        A05.A1C(BDe, A06.A2V(), "MSG_BLOKS_BOTTOM_SHEET");
    }
}
