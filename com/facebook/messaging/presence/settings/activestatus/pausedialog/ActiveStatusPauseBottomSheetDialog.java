package com.facebook.messaging.presence.settings.activestatus.pausedialog;

import X.0Q8;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Iw;
import X.1LI;
import X.1X6;
import X.1iF;
import X.7zM;
import X.9De;
import X.AbF;
import X.AnonymousClass553;
import X.AxZ;
import X.BgS;
import X.C00i;
import X.C7l;
import X.Cx1;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: ActiveStatusPauseBottomSheetDialog.class */
public final class ActiveStatusPauseBottomSheetDialog extends MigBottomSheetDialogFragment {
    public int A00;
    public FbUserSession A01;
    public C00i A02;
    public ImmutableList A03;
    public String A04;
    public final 1Br A08 = 1HG.A01(this, 83270);
    public final 1Br A07 = 1Bu.A00(83582);
    public final 1Br A09 = 1Bq.A00(67984);
    public final 1Br A05 = 7zM.A0d();
    public final 1Br A06 = 1Bu.A02(this, 116336);
    public final 1Br A0A = 1Bq.A00(83274);
    public final BgS A0B = new BgS(this);
    public final AnonymousClass553 A0C = Cx1.A01(this, 30);

    public static final void A05(ActiveStatusPauseBottomSheetDialog activeStatusPauseBottomSheetDialog, long j) {
        C00i c00i = activeStatusPauseBottomSheetDialog.A09.A00;
        ((1X6) c00i.get()).A06(false);
        ((1X6) c00i.get()).A03(j);
        ((C7l) 1Br.A0B(activeStatusPauseBottomSheetDialog.A0A)).A01(j);
    }

    public 1iF A17() {
        return AbF.A0C(681066249448173L);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        MigColorScheme A1F = A1F();
        ImmutableList immutableList = this.A03;
        if (immutableList != null) {
            return new AxZ(this.A0B, this.A0C, A1F, immutableList, this.A00);
        }
        11T.A0L("pauseDialogOptionsData");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x02e1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028a  */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.presence.settings.activestatus.pausedialog.ActiveStatusPauseBottomSheetDialog.onCreate(android.os.Bundle):void");
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putInt("SelectedOptionKey", this.A00);
    }
}
