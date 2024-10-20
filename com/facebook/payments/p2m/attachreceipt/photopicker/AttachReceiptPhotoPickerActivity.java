package com.facebook.payments.p2m.attachreceipt.photopicker;

import X.1Lm;
import X.1pK;
import X.7zR;
import X.7zU;
import X.C06c;
import X.DKH;
import X.DKy;
import X.DZ9;
import X.GCz;
import X.GD0;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: AttachReceiptPhotoPickerActivity.class */
public final class AttachReceiptPhotoPickerActivity extends FbFragmentActivity implements GCz, GD0 {
    public String A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541528);
        ((DKy) 1Lm.A05(this, DKH.A0H(this), 99445)).A01(this);
        View findViewById = findViewById(2131365419);
        if (findViewById != null) {
            MigColorScheme.A00(findViewById, 7zR.A0c(this));
        }
        Fragment fragment = new 1pK();
        C06c A0D = 7zU.A0D(this);
        A0D.A0Q(fragment, "photo_picker_title_fragment", 2131366446);
        A0D.A04();
        Fragment dz9 = new DZ9();
        C06c A0D2 = 7zU.A0D(this);
        A0D2.A0Q(dz9, "photo_picker_body_fragment", 2131366440);
        A0D2.A04();
    }
}
