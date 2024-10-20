package com.facebook.smartcapture.ui;

import X.Gzd;
import X.JvS;
import X.Kr8;
import X.LGc;
import android.os.Parcelable;

/* loaded from: DefaultIdCaptureUi.class */
public class DefaultIdCaptureUi extends Kr8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGc(DefaultIdCaptureUi.class, 0);

    public Class A00() {
        return this instanceof FbCreditCardUi ? JvS.class : Gzd.class;
    }
}
