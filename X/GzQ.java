package X;

import android.content.Context;
import com.facebook.messaging.media.mediapicker.dialog.PickMediaDialogFragment;
import com.facebook.messaging.montage.composer.MontageComposerActivity;

/* loaded from: GzQ.class */
public abstract class GzQ extends Frf {
    public void A00() {
        if (!(this instanceof GzP)) {
            if (!(this instanceof GzO)) {
                ((GzN) this).A00.A0p();
                return;
            }
            GzO gzO = (GzO) this;
            MontageComposerActivity montageComposerActivity = gzO.A01;
            if (MontageComposerActivity.A1F(gzO.A00, montageComposerActivity)) {
                MontageComposerActivity.A16(montageComposerActivity);
                return;
            } else {
                montageComposerActivity.setResult(0);
                montageComposerActivity.finish();
                return;
            }
        }
        GzP gzP = (GzP) this;
        if (gzP.A00 == 0) {
            PickMediaDialogFragment.A06((PickMediaDialogFragment) gzP.A01);
            return;
        }
        IEh iEh = (IEh) gzP.A01;
        Context context = iEh.A0V.getContext();
        if (((I8d) iEh.A0a.get()).A02()) {
            I2s i2s = iEh.A0A;
            if (i2s != null) {
                i2s.A01(true);
                return;
            }
            return;
        }
        Integer num = iEh.A0f.A03;
        int intValue = num != null ? num.intValue() : 2131957115;
        if (context != null) {
            AbF.A0v(iEh.A0e).A01(new FEd(new Object[]{context.getString(2131952789)}, intValue));
        }
    }

    @Override // X.Frf
    public final void onPermissionsCheckCanceled() {
        A00();
    }

    @Override // X.Frf
    public final void onPermissionsNotGranted(String[] strArr, String[] strArr2) {
        A00();
    }
}
