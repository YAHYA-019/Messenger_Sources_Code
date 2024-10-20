package X;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* renamed from: X.2r9, reason: invalid class name */
/* loaded from: 2r9.class */
public class C2r9 {
    public static final C2r9 A0D = new C2r9(new 2rA());
    public final int A00;
    public final int A01;
    public final Bitmap.Config A02;
    public final Bitmap.Config A03;
    public final ColorSpace A04;
    public final C03183xW A05;
    public final 2DS A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C2r9(2rA r302) {
        this.A01 = r302.A01;
        this.A00 = r302.A00;
        this.A08 = r302.A08;
        this.A0B = r302.A0C;
        this.A0A = r302.A0B;
        this.A07 = r302.A07;
        this.A09 = r302.A0A;
        this.A03 = r302.A03;
        this.A02 = r302.A02;
        this.A06 = r302.A06;
        this.A05 = r302.A05;
        this.A04 = r302.A04;
        this.A0C = r302.A09;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2r9 c2r9 = (C2r9) obj;
            if (this.A01 != c2r9.A01 || this.A00 != c2r9.A00 || this.A08 != c2r9.A08 || this.A0B != c2r9.A0B || this.A0A != c2r9.A0A || this.A07 != c2r9.A07 || this.A09 != c2r9.A09) {
                return false;
            }
            if ((!this.A0C && (this.A03 != c2r9.A03 || this.A02 != c2r9.A02)) || this.A06 != c2r9.A06 || this.A05 != c2r9.A05 || this.A04 != c2r9.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (((((((((((this.A01 * 31) + this.A00) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0);
        boolean z = this.A0C;
        if (!z) {
            i = (i * 31) + this.A03.ordinal();
        }
        int i2 = 0;
        if (!z) {
            int i3 = i * 31;
            Bitmap.Config config = this.A02;
            i = i3 + (config != null ? config.ordinal() : 0);
        }
        int i4 = i * 31;
        2DS r0 = this.A06;
        int hashCode = (i4 + (r0 != null ? r0.hashCode() : 0)) * 31;
        C03183xW c03183xW = this.A05;
        int hashCode2 = (hashCode + (c03183xW != null ? c03183xW.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.A04;
        if (colorSpace != null) {
            i2 = colorSpace.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        C46q A00 = C2qv.A00(this);
        A00.A01("minDecodeIntervalMs", this.A01);
        A00.A01("maxDimensionPx", this.A00);
        A00.A02("decodePreviewFrame", this.A08);
        A00.A02("useLastFrameForPreview", this.A0B);
        A00.A02("useEncodedImageForPreview", this.A0A);
        A00.A02("decodeAllFrames", this.A07);
        A00.A02("forceStaticImage", this.A09);
        C46q.A00(A00, this.A03.name(), "bitmapConfigName");
        C46q.A00(A00, this.A02.name(), "animatedBitmapConfigName");
        C46q.A00(A00, this.A06, "customImageDecoder");
        C46q.A00(A00, this.A05, "bitmapTransformation");
        C46q.A00(A00, this.A04, "colorSpace");
        return 0Pz.A0j("ImageDecodeOptions{", A00.toString(), "}");
    }
}
