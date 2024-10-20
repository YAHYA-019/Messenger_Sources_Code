package com.facebook.images.encoder;

import X.1BQ;
import X.C00i;
import X.GHs;
import X.JEg;
import X.JL1;
import android.graphics.Bitmap;
import java.io.File;
import java.io.OutputStream;

/* loaded from: EncoderShim.class */
public class EncoderShim implements JL1, GHs, JEg {
    public final C00i A00 = 1BQ.A02(116437);
    public final C00i A01 = 1BQ.A02(116441);

    @Override // X.JL1
    public boolean AH0(Bitmap bitmap, File file, int i) {
        return AH1(bitmap, file, i, false);
    }

    @Override // X.JL1
    public boolean AH1(Bitmap bitmap, File file, int i, boolean z) {
        return ((JL1) ((Bitmap.Config.ARGB_8888 == bitmap.getConfig() && z) ? this.A01 : this.A00).get()).AH1(bitmap, file, i, z);
    }

    @Override // X.JL1
    public boolean AH2(Bitmap bitmap, OutputStream outputStream, int i) {
        return AH3(bitmap, outputStream, 70, false);
    }

    @Override // X.JL1
    public boolean AH3(Bitmap bitmap, OutputStream outputStream, int i, boolean z) {
        bitmap.getConfig();
        return ((JL1) this.A00.get()).AH3(bitmap, outputStream, 70, false);
    }

    @Override // X.GHs
    public boolean AH4(Bitmap bitmap, File file) {
        return ((AndroidSystemEncoder) this.A00.get()).AH4(bitmap, file);
    }

    @Override // X.GHs
    public boolean AH5(Bitmap bitmap, OutputStream outputStream) {
        return ((AndroidSystemEncoder) this.A00.get()).AH5(bitmap, outputStream);
    }

    @Override // X.JEg
    public boolean AH6(Bitmap bitmap, OutputStream outputStream, int i) {
        return ((AndroidSystemEncoder) this.A00.get()).AH6(bitmap, outputStream, 90);
    }
}
