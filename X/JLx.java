package X;

import android.graphics.Bitmap;
import com.facebook.spectrum.BitmapTarget;
import com.facebook.spectrum.SpectrumResult;
import com.facebook.spectrum.image.ImageFormat;
import com.facebook.spectrum.options.DecodeOptions;
import com.facebook.spectrum.options.EncodeOptions;
import com.facebook.spectrum.options.TranscodeOptions;

/* loaded from: JLx.class */
public interface JLx {
    SpectrumResult ALk(BitmapTarget bitmapTarget, Ins ins, DecodeOptions decodeOptions, Object obj);

    SpectrumResult APd(Bitmap bitmap, Ino ino, EncodeOptions encodeOptions, Object obj);

    boolean BTM(ImageFormat imageFormat);

    SpectrumResult D4m(Ino ino, Ins ins, TranscodeOptions transcodeOptions, Object obj);

    boolean isAvailable();
}
