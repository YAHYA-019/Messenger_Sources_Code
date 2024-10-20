package com.facebook.smartcapture.logging;

import X.11T;
import X.1BY;
import X.1Bn;
import X.Kr8;
import X.LGc;
import android.content.Context;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: DefaultSmartCaptureLoggerProvider.class */
public final class DefaultSmartCaptureLoggerProvider extends Kr8 implements SmartCaptureLoggerProvider {
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = new LGc(DefaultSmartCaptureLoggerProvider.class, 0);

    /* loaded from: DefaultSmartCaptureLoggerProvider$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLoggerProvider
    public SmartCaptureLogger get(Context context) {
        11T.A0F(context, 0);
        return (SmartCaptureLogger) 1Bn.A0E(context, (1BY) null, 116430);
    }
}
