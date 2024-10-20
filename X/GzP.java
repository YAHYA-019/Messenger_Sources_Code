package X;

import com.facebook.messaging.media.mediapicker.dialog.PickMediaDialogFragment;
import com.facebook.resources.ui.FbImageButton;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: GzP.class */
public final class GzP extends GzQ {
    public final int A00;
    public final Object A01;

    public GzP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.Frf
    public void onPermissionsGranted() {
        if (this.A00 == 0) {
            PickMediaDialogFragment pickMediaDialogFragment = (PickMediaDialogFragment) this.A01;
            ListenableFuture D3B = pickMediaDialogFragment.A0D.D3B(new G0E(pickMediaDialogFragment));
            pickMediaDialogFragment.A0C = D3B;
            1Kd.A0F(new Inj(0, pickMediaDialogFragment, AnonymousClass001.A1T(pickMediaDialogFragment.A03)), D3B, pickMediaDialogFragment.A0E);
            return;
        }
        IEh iEh = (IEh) this.A01;
        I2s i2s = iEh.A0A;
        if (i2s != null) {
            i2s.A01(false);
        }
        I47 i47 = iEh.A07;
        if (i47 != null) {
            i47.A01();
        }
        FbImageButton fbImageButton = iEh.A0F;
        if (fbImageButton != null) {
            fbImageButton.setVisibility(0);
        }
    }
}
