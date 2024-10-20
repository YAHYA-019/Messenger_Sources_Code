package com.facebook.messaging.highlightstab.xsharelibraries.bottomsheet;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.2Qz;
import X.9O6;
import X.ADI;
import X.ADJ;
import X.AXv;
import X.AnonymousClass001;
import X.C8e4;
import X.C9dF;
import X.QGQ;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.google.common.collect.ImmutableList;

/* loaded from: HighlightsFeedBottomSheetDialogFragment.class */
public final class HighlightsFeedBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public 9O6 A00;
    public HighlightsFeedContent A01;
    public AXv A02;
    public ImmutableList A03;
    public boolean A04 = true;
    public final 1Br A05 = 1Bq.A00(68110);

    public void A12(Bundle bundle) {
        MontageViewerFragment montageViewerFragment;
        if (bundle != null && this.A03 == null) {
            A0o();
        }
        9O6 r0 = this.A00;
        if (r0 != null) {
            C8e4 c8e4 = r0.A01;
            Object A0b = c8e4.A00.A0b(c8e4.A05);
            if (!(A0b instanceof MontageViewerFragment) || (montageViewerFragment = (MontageViewerFragment) A0b) == null) {
                return;
            }
            ((Handler) r0.A00.get()).post(new ADI(montageViewerFragment));
        }
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A1I() {
        9O6 r0;
        MontageViewerFragment montageViewerFragment;
        if (!this.A04 || (r0 = this.A00) == null) {
            return;
        }
        C8e4 c8e4 = r0.A01;
        Object A0b = c8e4.A00.A0b(c8e4.A05);
        if (!(A0b instanceof MontageViewerFragment) || (montageViewerFragment = (MontageViewerFragment) A0b) == null) {
            return;
        }
        ((Handler) r0.A00.get()).post(new ADJ(montageViewerFragment));
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AXv aXv = this.A02;
        if (aXv == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        QGQ qgq = new QGQ(aXv, A1F(), immutableList);
        HighlightsFeedContent highlightsFeedContent = this.A01;
        if (highlightsFeedContent != null) {
            qgq = C9dF.A01(qgq, ((2Qz) 1Br.A0B(this.A05)).A00(r302.A0D), highlightsFeedContent);
        }
        return (1LI) qgq;
    }
}
