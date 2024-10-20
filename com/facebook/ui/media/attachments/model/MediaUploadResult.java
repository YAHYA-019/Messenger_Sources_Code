package com.facebook.ui.media.attachments.model;

import X.82N;
import X.AnonymousClass001;
import X.HkB;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* loaded from: MediaUploadResult.class */
public final class MediaUploadResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(11);
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final String A0F;
    public final String A0G;
    public final byte[] A0H;

    public MediaUploadResult(HkB hkB) {
        this.A00 = -1.0d;
        this.A0G = hkB.A05;
        this.A0H = null;
        this.A0F = null;
        this.A05 = 0L;
        this.A01 = hkB.A01;
        this.A02 = hkB.A02;
        this.A04 = hkB.A03;
        this.A0E = hkB.A0B;
        this.A0D = hkB.A0A;
        this.A03 = 0;
        this.A06 = hkB.A04;
        this.A0C = hkB.A09;
        this.A0B = false;
        this.A08 = hkB.A07;
        this.A07 = hkB.A06;
        this.A0A = false;
        this.A09 = hkB.A08;
        this.A00 = hkB.A00;
    }

    public MediaUploadResult(Parcel parcel) {
        this.A00 = -1.0d;
        this.A0G = parcel.readString();
        this.A0H = (byte[]) parcel.readValue(null);
        this.A0F = parcel.readString();
        this.A05 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt() != 0;
        this.A00 = parcel.readDouble();
        this.A0E = Boolean.parseBoolean(parcel.readString());
        this.A0D = Boolean.parseBoolean(parcel.readString());
        String readString = parcel.readString();
        if (!TextUtils.isEmpty(readString)) {
            this.A03 = Integer.parseInt(readString);
        }
        this.A06 = parcel.readString();
        this.A0C = Boolean.parseBoolean(parcel.readString());
        this.A0B = Boolean.parseBoolean(parcel.readString());
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0A = Boolean.parseBoolean(parcel.readString());
    }

    public MediaUploadResult(String str) {
        this.A00 = -1.0d;
        this.A0G = str;
        this.A0H = null;
        this.A0F = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A04 = 0;
    }

    public MediaUploadResult(String str, String str2, String str3, String str4, String str5, byte[] bArr, int i, int i2, int i3, int i4, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = -1.0d;
        Preconditions.checkArgument(AnonymousClass001.A1Q(bArr.length, 32));
        this.A0G = str;
        this.A0H = bArr;
        this.A0F = str2;
        this.A05 = j;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A09 = z;
        this.A00 = -1.0d;
        this.A0E = z2;
        this.A0D = z3;
        this.A03 = i4;
        this.A06 = str3;
        this.A0C = z4;
        this.A0B = z5;
        this.A08 = str4;
        this.A07 = str5;
        this.A0A = z6;
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
            MediaUploadResult mediaUploadResult = (MediaUploadResult) obj;
            if (this.A0G != mediaUploadResult.A0G || this.A0H != mediaUploadResult.A0H || this.A0F != mediaUploadResult.A0F || this.A05 != mediaUploadResult.A05 || this.A01 != mediaUploadResult.A01 || this.A02 != mediaUploadResult.A02 || this.A04 != mediaUploadResult.A04 || this.A0E != mediaUploadResult.A0E || this.A0D != mediaUploadResult.A0D || this.A03 != mediaUploadResult.A03 || this.A06 != mediaUploadResult.A06 || this.A0C != mediaUploadResult.A0C || this.A0B != mediaUploadResult.A0B || this.A08 != mediaUploadResult.A08 || this.A07 != mediaUploadResult.A07 || this.A0A != mediaUploadResult.A0A || this.A09 != mediaUploadResult.A09 || this.A00 != mediaUploadResult.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0G, this.A0H, this.A0F, Long.valueOf(this.A05), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A04), Boolean.valueOf(this.A0E), Boolean.valueOf(this.A0B), Integer.valueOf(this.A03), this.A06, Boolean.valueOf(this.A0C), this.A08, this.A07, Boolean.valueOf(this.A0A), Boolean.valueOf(this.A09), Double.valueOf(this.A00)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0G);
        parcel.writeValue(this.A0H);
        parcel.writeString(this.A0F);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeDouble(this.A00);
        parcel.writeString(String.valueOf(this.A0E));
        parcel.writeString(String.valueOf(this.A0D));
        parcel.writeString(String.valueOf(this.A03));
        parcel.writeString(this.A06);
        parcel.writeString(String.valueOf(this.A0C));
        parcel.writeString(String.valueOf(this.A0B));
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(String.valueOf(this.A0A));
    }
}
