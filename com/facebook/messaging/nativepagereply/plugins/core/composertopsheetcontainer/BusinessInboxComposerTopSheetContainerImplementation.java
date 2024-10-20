package com.facebook.messaging.nativepagereply.plugins.core.composertopsheetcontainer;

import X.1LI;
import X.2RH;
import X.2S4;
import X.4YU;
import X.6Qc;
import X.6Qf;
import X.7zL;
import X.C1rs;
import X.COd;
import X.CZF;
import X.QC2;
import X.QM0;
import android.content.Context;
import com.facebook.litho.LithoView;
import com.facebook.messaging.composer.model.ComposerTopSheetOpenParams;
import com.facebook.messaging.nativepagereply.keyboard.topsheet.model.BusinessInboxComposerTopSheetOpenParams;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: BusinessInboxComposerTopSheetContainerImplementation.class */
public final class BusinessInboxComposerTopSheetContainerImplementation {
    public LithoView A00;
    public ThreadViewColorScheme A01;
    public final COd A02;
    public final 6Qf A03;
    public final Context A04;

    public BusinessInboxComposerTopSheetContainerImplementation(Context context, 2S4 r303, 6Qc r304, 6Qf r305) {
        this.A01 = r304.A00.A0O.Ad2();
        this.A02 = COd.A00(context, r303);
        this.A03 = r305;
        this.A04 = context;
    }

    public static void A00(ComposerTopSheetOpenParams composerTopSheetOpenParams, BusinessInboxComposerTopSheetContainerImplementation businessInboxComposerTopSheetContainerImplementation) {
        if (composerTopSheetOpenParams instanceof BusinessInboxComposerTopSheetOpenParams) {
            BusinessInboxComposerTopSheetOpenParams businessInboxComposerTopSheetOpenParams = (BusinessInboxComposerTopSheetOpenParams) composerTopSheetOpenParams;
            QC2 qc2 = new QC2(7zL.A0W(businessInboxComposerTopSheetContainerImplementation.A04), new QM0());
            MigColorScheme migColorScheme = businessInboxComposerTopSheetContainerImplementation.A01.A0F;
            1LI r0 = qc2.A01;
            ((QM0) r0).A03 = migColorScheme;
            BitSet bitSet = qc2.A02;
            bitSet.set(0);
            ((QM0) r0).A02 = CZF.A00(businessInboxComposerTopSheetContainerImplementation, 10);
            4YU.A1L(qc2, 2RH.A04);
            String str = businessInboxComposerTopSheetOpenParams.A02;
            if (str != null) {
                ((QM0) r0).A06 = str;
            }
            String str2 = businessInboxComposerTopSheetOpenParams.A01;
            if (str2 != null) {
                ((QM0) r0).A05 = str2;
            }
            String str3 = businessInboxComposerTopSheetOpenParams.A00;
            if (str3 != null) {
                ((QM0) r0).A04 = str3;
            }
            LithoView lithoView = businessInboxComposerTopSheetContainerImplementation.A00;
            if (lithoView != null) {
                lithoView.setVisibility(0);
                LithoView lithoView2 = businessInboxComposerTopSheetContainerImplementation.A00;
                C1rs.A01(bitSet, qc2.A03);
                qc2.A0J();
                lithoView2.A0x(r0);
            }
            businessInboxComposerTopSheetContainerImplementation.A02.A08 = null;
        }
    }
}
