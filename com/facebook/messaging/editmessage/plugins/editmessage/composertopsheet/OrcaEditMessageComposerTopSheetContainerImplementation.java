package com.facebook.messaging.editmessage.plugins.editmessage.composertopsheet;

import X.0Q8;
import X.11T;
import X.1Iw;
import X.5zD;
import X.6Qc;
import X.6Qf;
import X.7zL;
import X.7zO;
import X.7zR;
import X.8PI;
import X.8mW;
import X.AV4;
import X.C1rs;
import android.content.Context;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: OrcaEditMessageComposerTopSheetContainerImplementation.class */
public final class OrcaEditMessageComposerTopSheetContainerImplementation {
    public LithoView A00;
    public MigColorScheme A01;
    public final Context A02;
    public final 6Qf A03;

    public OrcaEditMessageComposerTopSheetContainerImplementation(Context context, 6Qc r303, 6Qf r304) {
        7zR.A1O(r304, r303);
        this.A02 = context;
        this.A03 = r304;
        this.A01 = 5zD.A00(r303.A00.A0O);
    }

    public static final void A00(OrcaEditMessageComposerTopSheetContainerImplementation orcaEditMessageComposerTopSheetContainerImplementation) {
        Context context = orcaEditMessageComposerTopSheetContainerImplementation.A02;
        if (context != null) {
            1Iw A0W = 7zL.A0W(context);
            LithoView lithoView = orcaEditMessageComposerTopSheetContainerImplementation.A00;
            if (lithoView == null) {
                11T.A0L("view");
                throw 0Q8.createAndThrow();
            }
            8PI r0 = new 8PI(A0W, new 8mW());
            MigColorScheme migColorScheme = orcaEditMessageComposerTopSheetContainerImplementation.A01;
            8mW r02 = r0.A01;
            r02.A03 = migColorScheme;
            BitSet bitSet = r0.A02;
            bitSet.set(1);
            r02.A01 = 7zO.A0U(AV4.A00(orcaEditMessageComposerTopSheetContainerImplementation, 36));
            r02.A00 = orcaEditMessageComposerTopSheetContainerImplementation.A01.B4h();
            bitSet.set(0);
            C1rs.A00(bitSet, r0.A03);
            r0.A0J();
            lithoView.A0x(r02);
        }
    }
}
