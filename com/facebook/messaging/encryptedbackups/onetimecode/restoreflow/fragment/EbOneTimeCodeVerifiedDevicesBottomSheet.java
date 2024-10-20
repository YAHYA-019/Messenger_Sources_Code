package com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.fragment;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zP;
import X.8Z6;
import X.9Nt;
import X.C96b;
import X.C9ku;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model.BottomSheetState;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.viewdata.EbOneTimeCodeRestoreViewData;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: EbOneTimeCodeVerifiedDevicesBottomSheet.class */
public final class EbOneTimeCodeVerifiedDevicesBottomSheet extends MigBottomSheetDialogFragment {
    public 9Nt A00;
    public BottomSheetState A01;
    public C9ku A02;
    public final 1Br A03 = 7zM.A0b();

    public static final 1LI A05(9Nt r301, EbOneTimeCodeVerifiedDevicesBottomSheet ebOneTimeCodeVerifiedDevicesBottomSheet, BottomSheetState bottomSheetState) {
        BottomSheetState.Visible visible;
        if (bottomSheetState == null || r301 == null) {
            return 7zL.A0Y();
        }
        MigColorScheme A1F = ebOneTimeCodeVerifiedDevicesBottomSheet.A1F();
        C9ku c9ku = ebOneTimeCodeVerifiedDevicesBottomSheet.A02;
        if (c9ku == null) {
            11T.A0L("restoreBtnUtil");
            throw 0Q8.createAndThrow();
        }
        C96b c96b = C96b.A04;
        BottomSheetState bottomSheetState2 = ebOneTimeCodeVerifiedDevicesBottomSheet.A01;
        return new 8Z6(r301, bottomSheetState, c9ku.A01(c96b, (!(bottomSheetState2 instanceof BottomSheetState.Visible) || (visible = (BottomSheetState.Visible) bottomSheetState2) == null) ? false : visible.A01), A1F);
    }

    public void A0x() {
        super.A0x();
        7zO.A0Z(this.A03).A07("OTC_VIEW_ALL_DEVICES_SCREEN");
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return A05(this.A00, this, this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-473761177);
        super.onCreate(bundle);
        this.A02 = new C9ku(7zM.A0C(this, 147597), 1BM.A01(this));
        0FI.A08(-227610738, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        9Nt r0 = this.A00;
        if (r0 != null) {
            EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData = r0.A01;
            7zO.A0Z(ebOneTimeCodeRestoreViewData.A0K).A07("OTC_VIEW_ALL_DEVICES_SCREEN_DISMISS_HALF_SHEET");
            7zP.A0O(ebOneTimeCodeRestoreViewData.A0H).A01(ebOneTimeCodeRestoreViewData.A0A, BottomSheetState.Hidden.A00);
        }
    }
}
