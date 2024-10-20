package com.facebook.payments.picker.model;

import android.os.Parcelable;
import com.facebook.payments.logging.PaymentsLoggingSessionData;

/* loaded from: PickerScreenConfig.class */
public interface PickerScreenConfig extends Parcelable {
    static PaymentsLoggingSessionData A00(PickerScreenConfig pickerScreenConfig) {
        return pickerScreenConfig.B2r().analyticsParams.paymentsLoggingSessionData;
    }

    PickerScreenCommonConfig B2r();
}
