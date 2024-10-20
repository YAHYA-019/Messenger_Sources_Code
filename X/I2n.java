package X;

import com.google.common.base.MoreObjects;

/* loaded from: I2n.class */
public final class I2n {
    public final double A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final Exception A09;
    public final Integer A0A;
    public final byte[] A0B;

    public I2n(Exception exc, Integer num, byte[] bArr, double d, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2) {
        this.A0A = num;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A07 = j;
        this.A06 = i4;
        this.A04 = i5;
        this.A08 = j2;
        this.A05 = i6;
        this.A0B = bArr;
        this.A09 = exc;
        this.A00 = d;
    }

    public static I2n A00(Exception exc) {
        return new I2n(exc, 0S2.A01, new byte[0], -1.0d, 0, 0, 0, 0, 0, 0, 0L, 0L);
    }

    public String toString() {
        String str;
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(I2n.class);
        Integer num = this.A0A;
        switch (num.intValue()) {
            case 0:
                str = AnonymousClass000.A00(81);
                break;
            case 1:
                str = "Failed";
                break;
            default:
                str = "Skipped";
                break;
        }
        stringHelper.add("status", str);
        if (num == 0S2.A00) {
            stringHelper.add("sourceWidth", this.A03);
            stringHelper.add("sourceHeight", this.A01);
            stringHelper.add("sourceOrientation", this.A02);
            stringHelper.add("sourceFileSize", this.A07);
            stringHelper.add("targetWidth", this.A06);
            stringHelper.add("targetHeight", this.A04);
        } else {
            if (num != 0S2.A0C) {
                if (num == 0S2.A01) {
                    stringHelper.add(4YT.A00(435), false);
                    stringHelper.add("exception", this.A09);
                }
                return stringHelper.toString();
            }
            stringHelper.add("sourceWidth", this.A03);
            stringHelper.add("sourceHeight", this.A01);
            stringHelper.add("sourceOrientation", this.A02);
            stringHelper.add("sourceFileSize", this.A07);
        }
        stringHelper.add("targetOrientation", 0);
        stringHelper.add("targetFileSize", this.A08);
        stringHelper.add("targetQuality", this.A05);
        stringHelper.add("psnr", this.A00);
        return stringHelper.toString();
    }
}
