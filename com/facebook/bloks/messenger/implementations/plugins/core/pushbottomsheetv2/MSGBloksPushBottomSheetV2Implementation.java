package com.facebook.bloks.messenger.implementations.plugins.core.pushbottomsheetv2;

import X.06Z;
import X.11T;
import X.1BK;
import X.7zL;
import X.85O;
import X.AnonymousClass016;
import X.C2050DaD;
import X.DKc;
import X.DLQ;
import X.Duf;
import X.EYS;
import X.FHf;
import X.FHh;
import X.FIv;
import X.FKB;
import X.Fwk;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.deprecated.bottomsheet.LegacyMigBottomSheetDialogFragment;
import java.util.List;
import java.util.Map;

/* loaded from: MSGBloksPushBottomSheetV2Implementation.class */
public final class MSGBloksPushBottomSheetV2Implementation {
    public static final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        06Z BDe;
        LegacyMigBottomSheetDialogFragment legacyMigBottomSheetDialogFragment;
        11T.A0F(fwk, 0);
        List list = dKc.A00;
        FHf fHf = (FHf) list.get(0);
        if (fHf == null) {
            return null;
        }
        Pair A00 = EYS.A00(fHf);
        list.get(1);
        DLQ A05 = ((DLQ) A00.first).A05();
        if (A05 == null) {
            throw 1BK.A0e();
        }
        Map A09 = FIv.A09(fHh, (DLQ) A00.first, 65);
        Object obj = A00.second;
        11T.A09(obj);
        FHf fHf2 = (FHf) obj;
        85O r0 = new 85O(12, fwk, A05, fHh);
        11T.A0F(fHf2, 1);
        if (!(fwk instanceof C2050DaD)) {
            FragmentActivity fragmentActivity = (FragmentActivity) AnonymousClass016.A00(fwk.A00, FbFragmentActivity.class);
            if (fragmentActivity != null) {
                BDe = fragmentActivity.BDe();
            }
            fwk.A00().A01("bk.action.bloks.OpenBottomSheetV2");
            return null;
        }
        BDe = ((C2050DaD) fwk).A02;
        Object A0b = BDe.A0b("MSG_BLOKS_BOTTOM_SHEET");
        if ((A0b instanceof LegacyMigBottomSheetDialogFragment) && (legacyMigBottomSheetDialogFragment = (LegacyMigBottomSheetDialogFragment) A0b) != null) {
            legacyMigBottomSheetDialogFragment.A00 = new FKB(r0, 1);
            Duf A06 = Duf.A06(7zL.A0W(fwk.A00));
            A06.A2Y(fwk);
            A06.A2X(fHf2);
            A06.A01.A05 = A09;
            legacyMigBottomSheetDialogFragment.A1D(A06.A2V());
        }
        fwk.A00().A01("bk.action.bloks.OpenBottomSheetV2");
        return null;
    }
}
