package com.facebook.surveyplatform.remix.ui;

import X.06Z;
import X.0D2;
import X.0fH;
import X.1Bi;
import X.1iF;
import X.2Ov;
import X.AnonymousClass016;
import X.C1Ur;
import X.C1em;
import X.C1oi;
import X.C3o5;
import X.EOi;
import X.FHC;
import X.Fs8;
import X.GPH;
import X.HCx;
import X.Hgi;
import X.Igx;
import X.JDR;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.dextricks.LogcatReader;

/* loaded from: RemixSurveyDialogActivity.class */
public class RemixSurveyDialogActivity extends FbFragmentActivity {
    public final GPH A00 = (GPH) 1Bi.A03(116249);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(Long.toString(0L), 0L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        this.A00.A01 = null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        0D2 r308;
        06Z BDe;
        String str;
        super.A2y(bundle);
        C1oi.A00(this, 1);
        GPH gph = this.A00;
        if (gph.A01 != null) {
            C1em c1em = (C1em) AnonymousClass016.A00(this, C1em.class);
            JDR jdr = null;
            try {
                FHC fhc = gph.A01;
                fhc.A00.A01(EOi.A04);
                jdr = fhc.A04;
            } catch (HCx e) {
                0fH.A12("Survey Remix: ", "%s: Starting violated the state machine. %s %s PLEASE FIX.", e, new Object[]{"Survey Remix: ", "You might have started the survey mutiple times.", "We're dismissing the view since we're in an unknown state."});
            }
            if (jdr instanceof Igx) {
                FHC fhc2 = gph.A01;
                Hgi hgi = gph.A00;
                int A00 = C1Ur.A00(C3o5.A0F(gph.A02), LogcatReader.DEFAULT_WAIT_TIME, 36592219419509270L);
                r308 = new 2Ov();
                r308.A03 = fhc2;
                r308.A00 = A00;
                r308.A02 = hgi;
                BDe = c1em.BDe();
                str = "RemixFooterFragment";
            } else {
                if (!(jdr instanceof Fs8)) {
                    return;
                }
                FHC fhc3 = gph.A01;
                Hgi hgi2 = gph.A00;
                r308 = new 2Ov();
                r308.A01 = fhc3;
                r308.A00 = hgi2;
                BDe = c1em.BDe();
                str = "RemixComponentPopupModalFragment";
            }
            r308.A0m(BDe, str);
        }
    }
}
