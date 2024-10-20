package com.google.android.exoplayer2.video;

import X.6pW;
import X.6pX;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: ColorInfo.class */
public final class ColorInfo implements Parcelable {
    public static final ColorInfo A05 = new ColorInfo(1, 2, 3, null);
    public static final ColorInfo A06 = new ColorInfo(1, 1, 2, null);
    public static final 6pX CREATOR = new 6pW();
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r301 == 7) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(int r301) {
        /*
            r0 = 1
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L31
            r0 = 9
            r302 = r0
            r0 = 6
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L33
            r0 = 4
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L2f
            r0 = 5
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L2f
            r0 = r301
            r1 = r303
            if (r0 == r1) goto L2f
            r0 = 7
            r303 = r0
            r0 = -1
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L31
        L2f:
            r0 = 2
            r302 = r0
        L31:
            r0 = r302
            return r0
        L33:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.ColorInfo.A00(int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r301 == 7) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(int r301) {
        /*
            r0 = 1
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L38
            r0 = 4
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L42
            r0 = 13
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L40
            r0 = 16
            r302 = r0
            r0 = 6
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3e
            r0 = 18
            r302 = r0
            r0 = 7
            r304 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3c
            r0 = r301
            r1 = r303
            if (r0 == r1) goto L38
            r0 = -1
            r302 = r0
            r0 = r301
            r1 = r304
            if (r0 != r1) goto L3a
        L38:
            r0 = 3
            r302 = r0
        L3a:
            r0 = r302
            return r0
        L3c:
            r0 = r304
            return r0
        L3e:
            r0 = r303
            return r0
        L40:
            r0 = 2
            return r0
        L42:
            r0 = 10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.ColorInfo.A01(int):int");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.A02 != colorInfo.A02 || this.A01 != colorInfo.A01 || this.A03 != colorInfo.A03 || !Arrays.equals(this.A04, colorInfo.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            i = ((((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + Arrays.hashCode(this.A04);
            this.A00 = i;
        }
        return i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ColorInfo(");
        int i = this.A02;
        A0k.append(i != -1 ? i != 6 ? i != 1 ? i != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space");
        A0k.append(", ");
        int i2 = this.A01;
        A0k.append(i2 != -1 ? i2 != 1 ? i2 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range");
        A0k.append(", ");
        int i3 = this.A03;
        A0k.append(i3 != -1 ? i3 != 10 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 6 ? i3 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer");
        A0k.append(", ");
        A0k.append(AnonymousClass001.A1T(this.A04));
        return AnonymousClass001.A0d(")", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A04;
        parcel.writeInt(AnonymousClass001.A1T(bArr) ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
