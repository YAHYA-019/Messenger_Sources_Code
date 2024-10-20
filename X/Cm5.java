package X;

import android.view.View;
import com.facebook.messaging.photos.editing.photolayer.photopicker.PhotoPickerBottomSheetFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: Cm5.class */
public final class Cm5 implements JK0 {
    public final /* synthetic */ PhotoPickerBottomSheetFragment A00;

    public Cm5(PhotoPickerBottomSheetFragment photoPickerBottomSheetFragment) {
        this.A00 = photoPickerBottomSheetFragment;
    }

    @Override // X.JK0
    public 06Z AnP() {
        return 7zN.A08(this.A00);
    }

    @Override // X.JK0
    public boolean BRK() {
        PhotoPickerBottomSheetFragment photoPickerBottomSheetFragment = this.A00;
        2qR r0 = BaseMigBottomSheetDialogFragment.A06;
        return AnonymousClass001.A1T(photoPickerBottomSheetFragment.A00);
    }

    @Override // X.JK0
    public boolean BRL() {
        if (!BRK()) {
            return false;
        }
        PhotoPickerBottomSheetFragment photoPickerBottomSheetFragment = this.A00;
        2qR r0 = BaseMigBottomSheetDialogFragment.A06;
        View view = photoPickerBottomSheetFragment.A00;
        return view != null && view.getVisibility() == 0;
    }
}
