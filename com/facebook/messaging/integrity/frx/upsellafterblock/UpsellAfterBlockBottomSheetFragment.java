package com.facebook.messaging.integrity.frx.upsellafterblock;

import X.11T;
import X.1BV;
import X.1Iw;
import X.1LI;
import X.7zN;
import X.7zU;
import X.8P5;
import X.8mO;
import X.9zG;
import X.AZO;
import X.C1rs;
import X.DGJ;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: UpsellAfterBlockBottomSheetFragment.class */
public final class UpsellAfterBlockBottomSheetFragment extends MigBottomSheetDialogFragment {
    public AZO A00;

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new 9zG(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        1BV A0G = 7zU.A0G(r302, 16979);
        8P5 r0 = new 8P5(r302, new 8mO());
        MigColorScheme A0W = 7zN.A0W(A0G);
        8mO r02 = r0.A01;
        r02.A01 = A0W;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        Bundle bundle = this.mArguments;
        r02.A02 = bundle != null ? Boolean.valueOf(bundle.getBoolean("is_third_party_upsell", false)) : null;
        bitSet.set(1);
        AZO azo = this.A00;
        if (azo != null) {
            r02.A00 = azo;
        }
        C1rs.A00(bitSet, r0.A03);
        r0.A0J();
        return r02;
    }
}
