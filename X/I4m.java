package X;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: I4m.class */
public final class I4m {
    public int A00;
    public Uri A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final boolean A05;

    public I4m(float f, float f2, float f3, int i, boolean z) {
        this.A00 = i;
        this.A05 = z;
        this.A02 = f;
        this.A04 = f2;
        this.A03 = f3;
    }

    public I4m(Uri uri, float f, float f2, float f3, boolean z) {
        this.A01 = uri;
        this.A05 = z;
        this.A02 = f;
        this.A04 = f2;
        this.A03 = f3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            I4m i4m = (I4m) obj;
            if (this.A05 != i4m.A05 || this.A00 != i4m.A00 || Float.compare(i4m.A02, this.A02) != 0 || Float.compare(i4m.A04, this.A04) != 0 || Float.compare(i4m.A03, this.A03) != 0 || !11T.A0O(this.A01, i4m.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A05), false, this.A01, Integer.valueOf(this.A00), Float.valueOf(this.A02), Float.valueOf(this.A04), Float.valueOf(this.A03)});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RtcTone{loop=");
        A0k.append(this.A05);
        4YV.A1Q(A0k, ", isAsset=");
        A0k.append(", fileUri=");
        A0k.append(this.A01);
        A0k.append(", resId=");
        A0k.append(this.A00);
        A0k.append(", earpieceVolume=");
        A0k.append(this.A02);
        A0k.append(", speakerVolume=");
        A0k.append(this.A04);
        A0k.append(", headsetVolume=");
        A0k.append(this.A03);
        return AnonymousClass001.A0f(A0k);
    }
}
