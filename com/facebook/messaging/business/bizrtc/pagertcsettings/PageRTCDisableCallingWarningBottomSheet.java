package com.facebook.messaging.business.bizrtc.pagertcsettings;

import X.1Iw;
import X.1LI;
import X.8OZ;
import X.C1rs;
import X.C8k9;
import X.C9py;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: PageRTCDisableCallingWarningBottomSheet.class */
public class PageRTCDisableCallingWarningBottomSheet extends MigBottomSheetDialogFragment {
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8OZ r0 = new 8OZ(r302, new C8k9());
        MigColorScheme A1F = A1F();
        C8k9 c8k9 = r0.A01;
        c8k9.A01 = A1F;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        c8k9.A00 = C9py.A03(this, 23);
        bitSet.set(1);
        C1rs.A00(bitSet, r0.A03);
        r0.A0J();
        return c8k9;
    }

    public void A1M() {
        super.A0o();
    }
}
