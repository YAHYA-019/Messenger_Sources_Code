package com.facebook.images.encoder;

import X.1BQ;
import X.AnonymousClass001;
import X.C00i;
import X.Ino;
import X.JL1;
import X.JLx;
import android.graphics.Bitmap;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.spectrum.Configuration;
import com.facebook.spectrum.SpectrumException;
import com.facebook.spectrum.image.EncodedImageFormat;
import com.facebook.spectrum.image.ImageChromaSamplingMode;
import com.facebook.spectrum.options.Options;
import com.facebook.spectrum.requirements.CropRequirement;
import com.facebook.spectrum.requirements.EncodeRequirement;
import com.facebook.spectrum.requirements.ResizeRequirement;
import com.facebook.spectrum.requirements.RotateRequirement;
import java.io.File;
import java.io.OutputStream;

/* loaded from: SpectrumJpegEncoder.class */
public class SpectrumJpegEncoder implements JL1, CallerContextable {
    public static final CallerContext A01 = CallerContext.A06(SpectrumJpegEncoder.class);
    public final C00i A00 = 1BQ.A02(116448);

    @Override // X.JL1
    public boolean AH0(Bitmap bitmap, File file, int i) {
        return AH1(bitmap, file, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0024: THROW (r0 I:java.lang.Throwable), block:B:15:0x0024 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, java.io.OutputStream, java.io.FileOutputStream] */
    @Override // X.JL1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AH1(android.graphics.Bitmap r302, java.io.File r303, int r304, boolean r305) {
        /*
            r301 = this;
            r0 = r303
            java.io.FileOutputStream r0 = X.GOn.A14(r0)     // Catch: java.lang.Throwable -> L24
            r306 = r0
            r0 = r301
            r1 = r302
            r2 = r306
            r3 = r304
            r4 = r305
            boolean r0 = r0.AH3(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1a
            r307 = r0
            r0 = r306
            r0.close()
            r0 = r307
            return r0
        L1a:
            r308 = move-exception
            r0 = r306
            r0.close()
            r0 = r308
            throw r0
        L24:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.images.encoder.SpectrumJpegEncoder.AH1(android.graphics.Bitmap, java.io.File, int, boolean):boolean");
    }

    @Override // X.JL1
    public boolean AH2(Bitmap bitmap, OutputStream outputStream, int i) {
        return AH3(bitmap, outputStream, 70, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.facebook.spectrum.options.Options, com.facebook.spectrum.options.EncodeOptions] */
    @Override // X.JL1
    public boolean AH3(Bitmap bitmap, OutputStream outputStream, int i, boolean z) {
        EncodeRequirement encodeRequirement = new EncodeRequirement(EncodedImageFormat.JPEG, i, EncodeRequirement.Mode.LOSSY);
        Configuration configuration = null;
        if (z) {
            Boolean A0K = AnonymousClass001.A0K();
            configuration = new Configuration(null, null, null, null, ImageChromaSamplingMode.S444, A0K, null, null, null, A0K, null, null, null, null);
        }
        try {
            ((JLx) this.A00.get()).APd(bitmap, new Ino(outputStream, false), new Options(configuration, (CropRequirement) null, encodeRequirement, (ResizeRequirement) null, (RotateRequirement) null), A01);
            return true;
        } catch (SpectrumException unused) {
            return false;
        }
    }
}
