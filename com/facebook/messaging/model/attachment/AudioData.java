package com.facebook.messaging.model.attachment;

import X.1BL;
import X.C4Ny;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.threadview.model.audio.WaveformData;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: AudioData.class */
public final class AudioData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(12);
    public int A00;
    public int A01;
    public Uri A02;
    public WaveformData A03;
    public String A04;
    public boolean A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public AudioData(Uri uri, WaveformData waveformData, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z) {
        this.A05 = z;
        this.A04 = str;
        this.A02 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = waveformData;
        this.A06 = l;
        this.A08 = str2;
        this.A0B = str3;
        this.A07 = str4;
        this.A0A = str5;
        this.A09 = str6;
    }

    public AudioData(Parcel parcel) {
        this.A05 = parcel.readInt() > 0;
        this.A04 = parcel.readString();
        this.A02 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = (WaveformData) 1BL.A0C(parcel, WaveformData.class);
        long readLong = parcel.readLong();
        this.A06 = readLong <= 0 ? null : Long.valueOf(readLong);
        this.A08 = parcel.readString();
        this.A0B = parcel.readString();
        this.A07 = parcel.readString();
        this.A0A = parcel.readString();
        this.A09 = parcel.readString();
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
            AudioData audioData = (AudioData) obj;
            if (this.A05 != audioData.A05 || this.A01 != audioData.A01 || !Objects.equal(this.A02, audioData.A02) || !Objects.equal(this.A04, audioData.A04) || this.A00 != audioData.A00 || !Objects.equal(this.A03, audioData.A03) || !Objects.equal(this.A06, audioData.A06) || !Objects.equal(this.A08, audioData.A08) || !Objects.equal(this.A0B, audioData.A0B) || !Objects.equal(this.A07, audioData.A07) || !Objects.equal(this.A0A, audioData.A0A) || !Objects.equal(this.A09, audioData.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A05), Integer.valueOf(this.A01), this.A02, this.A04, Integer.valueOf(this.A00), this.A03, this.A06, this.A08, this.A0B, this.A07, this.A0A, this.A09});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        Long l = this.A06;
        parcel.writeLong(l == null ? -1 : l.longValue());
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
    }
}
