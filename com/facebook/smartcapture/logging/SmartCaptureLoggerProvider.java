package com.facebook.smartcapture.logging;

import android.content.Context;
import android.os.Parcelable;

/* loaded from: SmartCaptureLoggerProvider.class */
public interface SmartCaptureLoggerProvider extends Parcelable {
    SmartCaptureLogger get(Context context);
}
