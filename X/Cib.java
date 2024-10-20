package X;

import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: Cib.class */
public final class Cib implements AXg {
    public final /* synthetic */ QrCodeBottomSheetFragment A00;

    public Cib(QrCodeBottomSheetFragment qrCodeBottomSheetFragment) {
        this.A00 = qrCodeBottomSheetFragment;
    }

    @Override // X.AXg
    public void CJ3() {
        QrCodeBottomSheetFragment qrCodeBottomSheetFragment = this.A00;
        94S r0 = MigBottomSheetDialogFragment.A01;
        C1296Ad8 c1296Ad8 = qrCodeBottomSheetFragment.A00;
        if (c1296Ad8 == null) {
            11T.A0L("communityMessagingLogger");
            throw 0Q8.createAndThrow();
        }
        C1296Ad8.A02(c1296Ad8, new CommunityMessagingLoggerModel(null, null, QrCodeBottomSheetFragment.A08(qrCodeBottomSheetFragment), null, QrCodeBottomSheetFragment.A0E(qrCodeBottomSheetFragment), null, null, qrCodeBottomSheetFragment.A1N(), "save_qr_code", QrCodeBottomSheetFragment.A0C(qrCodeBottomSheetFragment), null, null), "screenshot");
    }
}
