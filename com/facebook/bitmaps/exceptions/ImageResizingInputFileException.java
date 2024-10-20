package com.facebook.bitmaps.exceptions;

/* loaded from: ImageResizingInputFileException.class */
public class ImageResizingInputFileException extends ImageResizingException {
    public ImageResizingInputFileException(String str) {
        super(str);
        this.mRetryMightWork = false;
    }
}
