package com.facebook.smartcapture.view;

import X.0FI;
import X.11T;
import X.1BK;
import X.7zU;
import X.AnonymousClass001;
import X.C06c;
import X.GUo;
import X.Gzb;
import X.H9j;
import X.HL9;
import X.JDO;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.IdCaptureStep;
import java.io.Serializable;

/* loaded from: PhotoReviewActivity.class */
public final class PhotoReviewActivity extends IdCaptureBaseActivity implements JDO {
    public Gzb A00;
    public String A01;

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity
    public IdCaptureStep A2e() {
        return getIntent().getSerializableExtra("capture_stage") == H9j.A03 ? IdCaptureStep.FIRST_PHOTO_CONFIRMATION : IdCaptureStep.SECOND_PHOTO_CONFIRMATION;
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Gzb gzb = this.A00;
        if (gzb == null || !gzb.A0a) {
            super.onBackPressed();
            return;
        }
        GUo gUo = gzb.A0U;
        if (gUo != null) {
            gUo.A00();
            gzb.A0U = null;
        }
        gzb.A0a = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [X.Gzb, androidx.fragment.app.Fragment] */
    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = 0FI.A00(-32020218);
        super.onCreate(bundle);
        setContentView(2132543109);
        Intent intent = getIntent();
        H9j h9j = (H9j) intent.getSerializableExtra("capture_stage");
        if (h9j == null) {
            throw AnonymousClass001.A0L("CaptureStage is required");
        }
        this.A01 = HL9.A00(h9j, A2c());
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("skewed_crop_points");
        if (this.A08 == null || this.A01 == null) {
            A2d().logError("IdCaptureUi and/or file path is null", null);
            throw AnonymousClass001.A0N("IdCaptureUi must not be null");
        }
        boolean booleanExtra = intent.getBooleanExtra("is_cancel_confirmation_action_sheet_enabled", false);
        try {
            11T.A0D(this.A08);
            ?? r0 = (Gzb) Gzb.class.newInstance();
            Serializable A002 = A2c().A00();
            String str = this.A01;
            11T.A0D(str);
            Bundle A05 = 1BK.A05();
            A05.putSerializable("capture_mode", A002);
            A05.putSerializable("capture_stage", h9j);
            A05.putString("photo_file_path", str);
            A05.putParcelableArray("skewed_crop_points", parcelableArrayExtra);
            A05.putString("sync_feedback_error", null);
            A05.putBoolean("is_cancel_confirmation_action_sheet_enabled", booleanExtra);
            r0.setArguments(A05);
            C06c A0D = 7zU.A0D(this);
            A0D.A0M(r0, 2131366452);
            A0D.A04();
            this.A00 = r0;
        } catch (IllegalAccessException | InstantiationException e) {
            IdCaptureLogger A2d = A2d();
            String message = e.getMessage();
            11T.A0D(message);
            A2d.logError(message, e);
        }
        0FI.A07(1100610643, A00);
    }
}
