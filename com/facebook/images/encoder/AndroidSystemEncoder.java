package com.facebook.images.encoder;

import X.0fH;
import X.11T;
import X.1BK;
import X.1BQ;
import X.2Jy;
import X.AbH;
import X.AbJ;
import X.C00i;
import X.C05004ck;
import X.C0dr;
import X.C1kw;
import X.C2J3;
import X.GHs;
import X.GOn;
import X.GYT;
import X.H9w;
import X.Hti;
import X.JEg;
import X.JL1;
import android.graphics.Bitmap;
import com.facebook.common.callercontext.CallerContextable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: AndroidSystemEncoder.class */
public class AndroidSystemEncoder implements JL1, GHs, JEg, CallerContextable {
    public final C00i A01 = AbH.A0P();
    public final C00i A00 = 1BQ.A02(84488);

    private Hti A00(Bitmap.CompressFormat compressFormat, Bitmap bitmap, String str) {
        C0dr c0dr = (C0dr) this.A00.get();
        11T.A0F(c0dr, 3);
        Hti hti = new Hti(c0dr, AndroidSystemEncoder.class.getName(), str);
        2Jy r0 = hti.A01;
        r0.A0D("input_type", "BITMAP");
        r0.A0C("input_length", bitmap.getByteCount());
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        r0.A0B("input_width", width);
        r0.A0B("input_height", height);
        String valueOf = String.valueOf(compressFormat);
        if (valueOf != null) {
            r0.A0D("output_type", AbJ.A1A(valueOf));
        }
        return hti;
    }

    private void A01(Hti hti, Boolean bool) {
        hti.A00();
        if (bool != null) {
            Map A00 = C05004ck.A00("containsGraphics", String.valueOf(bool));
            11T.A0F(A00, 0);
            Map map = hti.A03;
            map.putAll(A00);
            hti.A01.A09(map, "transcoder_extra");
        }
        C1kw A06 = 1BK.A06(this.A01);
        if (GYT.A00 == null) {
            synchronized (GYT.class) {
                if (GYT.A00 == null) {
                    GYT.A00 = new C2J3(A06);
                }
            }
        }
        GYT gyt = GYT.A00;
        2Jy r0 = hti.A01;
        gyt.A03(r0);
        if (0fH.A01.BTv(2)) {
            0fH.A0D(AndroidSystemEncoder.class, 2Jy.A01(r0));
        }
    }

    private boolean A02(Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file, Boolean bool, String str, int i) {
        FileOutputStream A14;
        Hti A00 = A00(compressFormat, bitmap, str);
        try {
            try {
                A00.A01(H9w.A04);
                2Jy r0 = A00.A01;
                r0.A0B("transcoder_quality", i);
                try {
                    A14 = GOn.A14(file);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    boolean compress = bitmap.compress(compressFormat, i, A14);
                    A14.close();
                    r0.A0F("transcoder_success", compress);
                    r0.A0C("output_length", file.length());
                    A01(A00, bool);
                    return compress;
                } catch (Throwable th2) {
                    th = th2;
                    A14.close();
                    throw th;
                }
            } catch (Exception e) {
                A00.A01.A0F("transcoder_success", false);
                A00.A02(e);
                throw e;
            }
        } catch (Throwable th3) {
            A00.A01.A0C("output_length", file.length());
            A01(A00, bool);
            throw th3;
        }
    }

    private boolean A03(Bitmap.CompressFormat compressFormat, Bitmap bitmap, OutputStream outputStream, Boolean bool, String str, int i) {
        Hti A00 = A00(compressFormat, bitmap, str);
        try {
            try {
                A00.A01(H9w.A04);
                2Jy r0 = A00.A01;
                r0.A0B("transcoder_quality", i);
                boolean compress = bitmap.compress(compressFormat, i, outputStream);
                r0.A0F("transcoder_success", compress);
                return compress;
            } catch (Exception e) {
                A00.A01.A0F("transcoder_success", false);
                A00.A02(e);
                throw e;
            }
        } finally {
            A01(A00, bool);
        }
    }

    @Override // X.JL1
    public boolean AH0(Bitmap bitmap, File file, int i) {
        return AH1(bitmap, file, i, false);
    }

    @Override // X.JL1
    public boolean AH1(Bitmap bitmap, File file, int i, boolean z) {
        return A02(Bitmap.CompressFormat.JPEG, bitmap, file, Boolean.valueOf(z), "compressJpeg", i);
    }

    @Override // X.JL1
    public boolean AH2(Bitmap bitmap, OutputStream outputStream, int i) {
        return AH3(bitmap, outputStream, 70, false);
    }

    @Override // X.JL1
    public boolean AH3(Bitmap bitmap, OutputStream outputStream, int i, boolean z) {
        return A03(Bitmap.CompressFormat.JPEG, bitmap, outputStream, false, "compressJpeg", 70);
    }

    @Override // X.GHs
    public boolean AH4(Bitmap bitmap, File file) {
        return A02(Bitmap.CompressFormat.PNG, bitmap, file, null, "compressPng", 100);
    }

    @Override // X.GHs
    public boolean AH5(Bitmap bitmap, OutputStream outputStream) {
        return A03(Bitmap.CompressFormat.PNG, bitmap, outputStream, null, "compressPng", 100);
    }

    @Override // X.JEg
    public boolean AH6(Bitmap bitmap, OutputStream outputStream, int i) {
        return A03(Bitmap.CompressFormat.WEBP, bitmap, outputStream, null, "compressWebp", 90);
    }
}
