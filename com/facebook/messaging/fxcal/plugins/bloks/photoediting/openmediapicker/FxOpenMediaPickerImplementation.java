package com.facebook.messaging.fxcal.plugins.bloks.photoediting.openmediapicker;

import X.11T;
import X.1Bn;
import X.48U;
import X.53T;
import X.AnonymousClass000;
import X.C2050DaD;
import X.C2xd;
import X.DKC;
import X.DKc;
import X.E9P;
import X.E9Q;
import X.FHh;
import X.Fwk;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: FxOpenMediaPickerImplementation.class */
public final class FxOpenMediaPickerImplementation {
    public static final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        53T A0M;
        String[] A00;
        E9P e9q;
        11T.A0F(fwk, 0);
        if (!(fwk instanceof C2050DaD)) {
            return null;
        }
        FragmentActivity requireActivity = ((C2050DaD) fwk).A01.requireActivity();
        if (!(requireActivity instanceof FbFragmentActivity)) {
            return null;
        }
        Object A10 = DKC.A10(dKc, 4);
        if (!(A10 instanceof String)) {
            return null;
        }
        if (11T.A0O(A10, "CAMERA")) {
            Context context = fwk.A00;
            FbFragmentActivity fbFragmentActivity = (FbFragmentActivity) requireActivity;
            11T.A0F(fbFragmentActivity, 2);
            A0M = ((C2xd) 1Bn.A0A(306)).A0M(fbFragmentActivity);
            A00 = new String[]{"android.permission.CAMERA"};
            e9q = new E9P(context, fbFragmentActivity, A0M, fHh, dKc);
        } else {
            if (!11T.A0O(A10, "MEDIA_PICKER")) {
                return null;
            }
            Context context2 = fwk.A00;
            A0M = ((C2xd) 1Bn.A0A(306)).A0M(requireActivity);
            A00 = 48U.A00(context2, new String[]{AnonymousClass000.A00(4)});
            e9q = new E9Q(2, context2, requireActivity, fHh, dKc);
        }
        A0M.AHR(e9q, A00);
        return null;
    }
}
