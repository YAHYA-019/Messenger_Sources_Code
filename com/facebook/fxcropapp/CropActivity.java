package com.facebook.fxcropapp;

import X.11T;
import X.C09h;
import X.C1io;
import X.DKD;
import X.DKF;
import X.DLQ;
import X.DNQ;
import X.EdC;
import X.F3n;
import X.F3z;
import X.FXr;
import X.Qzk;
import X.Rf8;
import X.RoV;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.fxcrop.SimpleCropView;
import com.facebook.resources.ui.FbButton;

/* loaded from: CropActivity.class */
public final class CropActivity extends FbFragmentActivity implements C1io {
    public static final float A02 = Qzk.A00(16);
    public SimpleCropView A00;
    public FbButton A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        if (C09h.A03().A04(this, getIntent(), this)) {
            super.A2y(bundle);
            setContentView(2132543344);
            str = "";
            Parcelable parcelableExtra = getIntent().getParcelableExtra(str);
            11T.A0D(parcelableExtra);
            Uri uri = (Uri) parcelableExtra;
            SimpleCropView simpleCropView = (SimpleCropView) findViewById(2131367402);
            this.A00 = simpleCropView;
            if (simpleCropView != null && uri != null) {
                simpleCropView.A09 = uri;
                Rf8.A06.A01(simpleCropView.getContext(), uri, new RoV(simpleCropView), "LOAD_SMALL_BITMAP_FOR_EDITING_PREVIEW", false, false);
            }
            TextView A0D = DKF.A0D(this, 2131362859);
            if (A0D != null) {
                DLQ dlq = F3z.A03;
                String str2 = str;
                if (dlq != null) {
                    str2 = DKD.A0t(dlq, str, 35);
                }
                A0D.setText(str2);
                FXr.A03(A0D, this, 45);
            }
            TextView A0D2 = DKF.A0D(this, 2131363693);
            if (A0D2 != null) {
                DLQ dlq2 = F3z.A03;
                String str3 = str;
                if (dlq2 != null) {
                    str3 = DKD.A0t(dlq2, str, 36);
                }
                A0D2.setText(str3);
                FXr.A03(A0D2, this, 46);
            }
            FbButton fbButton = (FbButton) findViewById(2131367022);
            this.A01 = fbButton;
            if (fbButton != null) {
                DLQ dlq3 = F3z.A03;
                fbButton.setText(dlq3 != null ? DKD.A0t(dlq3, str, 38) : "");
                FbButton fbButton2 = this.A01;
                11T.A0D(fbButton2);
                FXr.A03(fbButton2, this, 47);
                String A00 = F3z.A00(43);
                EdC edC = new EdC(this);
                AsyncTask asyncTask = new AsyncTask();
                ((DNQ) asyncTask).A02 = A00;
                ((DNQ) asyncTask).A01 = edC;
                ((DNQ) asyncTask).A00 = null;
                asyncTask.execute(new Void[0]);
            }
            overridePendingTransition(2130772046, 2130772047);
            F3n.A01("ON_SHOWN_CROPPER");
        }
    }
}
