package com.facebook.bitmaps.exceptions;

import X.0Pz;
import X.AnonymousClass001;

/* loaded from: ImageResizingException.class */
public class ImageResizingException extends Exception {
    public boolean mRetryMightWork;

    public ImageResizingException(String str, Throwable th, boolean z) {
        super(0Pz.A0z(AnonymousClass001.A0X(th), ", ", th.getMessage(), ", ", str), th);
        this.mRetryMightWork = z;
    }
}
