package com.facebook.messaging.rtc.incall.impl.dialog;

import X.0FI;
import X.0Q8;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.1Lm;
import X.2Qa;
import X.2Qn;
import X.7zL;
import X.7zN;
import X.7zO;
import X.7zT;
import X.AnonymousClass001;
import X.GyU;
import X.HgI;
import X.IDw;
import X.IYv;
import X.QGc;
import X.RJe;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;

/* loaded from: VideoQualityPickerSelectorDialog.class */
public final class VideoQualityPickerSelectorDialog extends MigBottomSheetDialogFragment {
    public int A00;
    public FbUserSession A01;
    public final 2Qn A02 = IYv.A00(this, 19);

    /* JADX WARN: Multi-variable type inference failed */
    public void A0z() {
        super.A0z();
        ((2Qa) 7zN.A0n(this, IDw.A02(this, "VideoQualityPickerSelectorDialog"), 33089)).A03(this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A10() {
        super.A10();
        ((2Qa) 7zN.A0n(this, IDw.A02(this, "VideoQualityPickerSelectorDialog"), 33089)).A02(this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        1Br A00 = 1Bu.A00(115730);
        GyU gyU = (GyU) 7zO.A0l(this, 82386);
        1Br A002 = 1Lm.A00(requireContext(), IDw.A02(this, "VideoQualityPickerSelectorDialog"), 82385);
        FbUserSession fbUserSession = this.A01;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        int A003 = gyU.A00(fbUserSession);
        ArrayList A0s = AnonymousClass001.A0s();
        boolean z = false;
        if ((this.A00 & 2) == 2) {
            A0s.add(new RJe(3, AnonymousClass001.A1Q(3, A003)));
        }
        if ((this.A00 & 1) == 1) {
            A0s.add(new RJe(1, AnonymousClass001.A1Q(1, A003)));
        }
        if ((this.A00 & 4) == 4) {
            if (2 == A003) {
                z = true;
            }
            A0s.add(new RJe(2, z));
        }
        return new QGc(new HgI(A00, A002, this, A003), A1F(), A0s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1218945737);
        super.onCreate(bundle);
        this.A01 = 7zT.A08(this);
        this.A00 = requireArguments().getInt("option_key");
        ((BaseMigBottomSheetDialogFragment) this).A00 = (MigColorScheme) 7zO.A0l(this, 16980);
        0FI.A08(994243214, A02);
    }
}
