package X;

import android.net.Uri;

/* loaded from: I8g.class */
public final class I8g {
    public static final 2EW A01 = IQe.A00;
    public static final float[] A02 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public JGn A00;
    public Uri overlayUri;
    public float[] positionData;

    public I8g() {
        float[] fArr = A02;
        11T.A0F(fArr, 3);
        this.overlayUri = null;
        this.positionData = fArr;
    }

    public I8g(Uri uri) {
        float[] fArr = A02;
        11T.A0F(fArr, 3);
        this.overlayUri = uri;
        this.positionData = fArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            I8g i8g = (I8g) obj;
            float[] fArr = i8g.positionData;
            int length = fArr.length;
            float[] fArr2 = this.positionData;
            int length2 = fArr2.length;
            if (length != length2) {
                return false;
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length2) {
                    Uri uri = this.overlayUri;
                    Uri uri2 = i8g.overlayUri;
                    if (uri != null) {
                        return uri.equals(uri2);
                    }
                    if (uri2 != null) {
                        return false;
                    }
                } else {
                    if (Float.compare(fArr[i2], fArr2[i2]) != 0) {
                        return false;
                    }
                    i = i2 + 1;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = AnonymousClass002.A04(this.overlayUri);
        float[] fArr = this.positionData;
        int length = fArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A04;
            }
            int i3 = A04 * 31;
            float f = fArr[i2];
            A04 = i3 + (f == 0.0f ? 0 : Float.floatToIntBits(f));
            i = i2 + 1;
        }
    }
}
