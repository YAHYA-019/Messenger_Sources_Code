package com.facebook.messaging.msys.thread.aibot.nux.fragment;

import X.0D2;
import X.0FI;
import X.11T;
import X.1BJ;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.5SW;
import X.7zL;
import X.7zM;
import X.7zU;
import X.83Z;
import X.8Cf;
import X.8Cp;
import X.9De;
import X.9TI;
import X.9Up;
import X.AQa;
import X.AQd;
import X.C00m;
import X.C01i;
import X.C03i;
import X.C06074fs;
import X.C5x8;
import X.C8uT;
import X.DKB;
import X.DR7;
import X.E7o;
import X.FFG;
import X.FHL;
import X.JVb;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.Map;

/* loaded from: AiBotInterstitialNuxFragment.class */
public final class AiBotInterstitialNuxFragment extends BaseMigBottomSheetDialogFragment {
    public 9TI A00;
    public C8uT A01;
    public boolean A02;
    public boolean A03;
    public final C01i A08;
    public final 1Br A04 = 7zM.A0a();
    public final 1Br A05 = 1Bu.A02(this, 68283);
    public final 1Br A07 = 7zM.A0U();
    public final 1Br A06 = 1Bq.A00(68748);

    public AiBotInterstitialNuxFragment() {
        AQa aQa = new AQa(this, 19);
        C01i A00 = AQa.A00(new AQa(this, 16), C03i.A02, 17);
        this.A08 = 7zU.A0F(new AQa(A00, 18), aQa, new AQd(null, A00, 46), 7zL.A18(8Cp.class));
    }

    public static final void A05(AiBotInterstitialNuxFragment aiBotInterstitialNuxFragment, String str) {
        C06074fs c06074fs;
        aiBotInterstitialNuxFragment.A03 = true;
        C8uT c8uT = aiBotInterstitialNuxFragment.A01;
        if (c8uT != null && (c06074fs = ((8Cf) c8uT).A04) != null) {
            JVb jVb = c06074fs.A00;
            if (jVb != null) {
                jVb.stop();
            }
            JVb jVb2 = c06074fs.A00;
            if (jVb2 != null) {
                jVb2.A01();
            }
        }
        9TI r0 = aiBotInterstitialNuxFragment.A00;
        if (r0 != null) {
            83Z.A02(r0.A00, r0.A01, r0.A02, r0.A03, str != null ? str.toString() : null, 5SW.A19.toString(), true, false, false);
            FHL fhl = r0.A04.A04;
            if (str != null) {
                fhl.A06((Map) null);
            } else {
                fhl.A05((Map) null);
            }
        }
        aiBotInterstitialNuxFragment.A0o();
    }

    public void A0v() {
        super.A0v();
        8Cf r0 = this.A01;
        if (r0 != null) {
            C5x8.A01(r0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00fe, code lost:
    
        if (X.1qI.A02(r0).AZk(36322796129568674L) == false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.0D2, androidx.fragment.app.Fragment, java.lang.Object, com.facebook.messaging.msys.thread.aibot.nux.fragment.AiBotInterstitialNuxFragment] */
    /* JADX WARN: Type inference failed for: r306v2, types: [android.view.View, X.8uT] */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A1C() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.thread.aibot.nux.fragment.AiBotInterstitialNuxFragment.A1C():android.view.View");
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A1I() {
        9TI r0;
        if (this.A02 || (r0 = this.A00) == null) {
            return;
        }
        Context context = r0.A00;
        11T.A0I(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).finish();
    }

    public void onDestroyView() {
        C8uT c8uT;
        int A02 = 0FI.A02(-303022209);
        super.onDestroyView();
        if (!this.A03 && (c8uT = this.A01) != null) {
            c8uT.A0H();
        }
        9TI r0 = this.A00;
        if (r0 != null) {
            boolean z = !this.A02;
            9Up r02 = r0.A04;
            r02.A04.A07((Map) null);
            if (z) {
                FFG.A01(r02.A00, r02.A02, r02.A05, (C00m) null);
            }
        }
        this.A01 = null;
        this.A00 = null;
        this.A03 = false;
        0FI.A08(846642894, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        9TI r0 = this.A00;
        if (r0 != null) {
            9Up r02 = r0.A04;
            E7o A00 = FFG.A00(r02.A02);
            QuickPromotionDefinition quickPromotionDefinition = r02.A01;
            A00.A07(quickPromotionDefinition.promotionId, 1BJ.A00(484));
            r02.A04.A04((Map) null);
            r02.A03.A03(quickPromotionDefinition);
        }
        DR7 dr7 = ((0D2) this).A01;
        if (dr7 instanceof DR7) {
            11T.A0I(dr7, DKB.A00(4));
            DR7 dr72 = dr7;
            dr72.A05().A0I(true);
            dr72.A05().A0O = true;
            dr72.A05().A0H = null;
            dr72.setCancelable(true);
        }
    }
}
