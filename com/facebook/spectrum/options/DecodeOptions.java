package com.facebook.spectrum.options;

import X.Gzk;
import X.Ho0;
import android.graphics.Bitmap;
import com.facebook.spectrum.image.ImagePixelSpecification;

/* loaded from: DecodeOptions.class */
public class DecodeOptions extends Options {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.Gzk, X.Ho0] */
    public static Gzk Builder() {
        ImagePixelSpecification from = ImagePixelSpecification.from(Bitmap.Config.ARGB_8888);
        ?? ho0 = new Ho0();
        ho0.A00 = from;
        return ho0;
    }

    @Override // com.facebook.spectrum.options.Options
    public String toString() {
        return toString("DecodeOptions");
    }
}
