package com.facebook.payments.checkout;

import android.view.MotionEvent;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: FbPaymentsFragmentActivity.class */
public abstract class FbPaymentsFragmentActivity extends FbFragmentActivity {
    public boolean A00 = true;

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A00) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
