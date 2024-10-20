package X;

import android.graphics.Bitmap;
import android.graphics.Color;

/* loaded from: I89.class */
public final class I89 {
    public final 1Br A00 = 1Bq.A00(16442);
    public final 1Br A01 = 1Bu.A00(49829);

    public static final Ha8 A00(Bitmap bitmap, int i, boolean z) {
        Ha8 ha8;
        11T.A0F(bitmap, 0);
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            0fH.A14("InspirationMediaBackgroundGenerator", "Cannot extract colors from bitmap of [width = %s, height = %s]", AnonymousClass001.A1b(Integer.valueOf(bitmap.getWidth()), bitmap.getHeight()));
            ha8 = new Ha8(i, i);
        } else {
            try {
                HsW hsW = new HsW(bitmap);
                hsW.A01(0, 0, bitmap.getWidth(), (int) (bitmap.getHeight() * 0.05f));
                HzK A00 = hsW.A00();
                HsW hsW2 = new HsW(bitmap);
                hsW2.A01(0, (int) (bitmap.getHeight() * 0.95f), bitmap.getWidth(), bitmap.getHeight());
                HzK A002 = hsW2.A00();
                int i2 = i;
                I5J i5j = A00.A01;
                if (i5j != null) {
                    i2 = i5j.A05;
                }
                int i3 = i;
                I5J i5j2 = A002.A01;
                if (i5j2 != null) {
                    i3 = i5j2.A05;
                }
                new Ha8(i2, i3);
            } catch (IllegalArgumentException e) {
                0fH.A0z("InspirationMediaBackgroundGenerator", "Couldn't extract colors from bitmap of [width = %s, height = %s]", e, AnonymousClass001.A1b(Integer.valueOf(bitmap.getWidth()), bitmap.getHeight()));
                ha8 = new Ha8(i, i);
            }
            if (z) {
                int i4 = ha8.A01;
                int i5 = ha8.A00;
                if (A01(i4, i5)) {
                    float[] fArr = new float[3];
                    Color.colorToHSV(i4, fArr);
                    float f = fArr[2];
                    fArr[2] = ((double) f) > 0.5d ? f - 0.15f : f + 0.15f;
                    i4 = Color.HSVToColor(fArr);
                    float[] fArr2 = new float[3];
                    Color.colorToHSV(i5, fArr2);
                    float f2 = fArr2[2];
                    fArr2[2] = ((double) f2) > 0.5d ? f2 - 0.15f : f2 + 0.15f;
                    i5 = Color.HSVToColor(fArr2);
                }
                float f3 = 0.0f / 0.0f;
                float f4 = 0.9f;
                if (A01(i4, -1)) {
                    f4 = 0.7f;
                }
                Color.colorToHSV(i4, r0);
                float[] fArr3 = {0.0f, 0.0f, 07C.A01(fArr3[2], 0.1f, f4)};
                int HSVToColor = Color.HSVToColor(fArr3);
                float f5 = 0.9f;
                if (A01(i5, -1)) {
                    f5 = 0.7f;
                }
                Color.colorToHSV(i5, r0);
                float[] fArr4 = {0.0f, 0.0f, 07C.A01(fArr4[2], 0.1f, f5)};
                return new Ha8(HSVToColor, Color.HSVToColor(fArr4));
            }
        }
        return ha8;
    }

    public static final boolean A01(int i, int i2) {
        return DKD.A1U(((Math.pow(Color.red(i) - Color.red(i2), 2.0d) + Math.pow(Color.green(i) - Color.green(i2), 2.0d) + Math.pow(Color.blue(i) - Color.blue(i2), 2.0d)) > 0.009999999776482582d ? 1 : ((Math.pow(Color.red(i) - Color.red(i2), 2.0d) + Math.pow(Color.green(i) - Color.green(i2), 2.0d) + Math.pow(Color.blue(i) - Color.blue(i2), 2.0d)) == 0.009999999776482582d ? 0 : -1)));
    }

    public final void A02(2EU r302, JID jid, String str, int i, boolean z) {
        11T.A0F(str, 0);
        2EU A07 = r302.A07();
        ((5iG) 1Br.A0B(this.A01)).A04(new C2478GeZ(jid, 2), AbJ.A0u(this.A00).D3C(new J51(A07, this, i, z)), str);
    }
}
