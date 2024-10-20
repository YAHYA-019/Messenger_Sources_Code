package com.facebook.presence.note.music.musicpicker.model;

import X.11T;
import X.4YU;
import X.7zP;
import X.7zT;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MusicData.class */
public final class MusicData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(56);
    public final long A00;
    public final long A01;
    public final Long A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public MusicData(Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
        7zT.A1U(str, str2, str3);
        7zP.A1N(str4, 5, str5);
        this.A01 = j;
        this.A09 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = l;
        this.A03 = l2;
        this.A04 = l3;
        this.A00 = j2;
        this.A05 = str5;
        this.A0A = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MusicData)) {
                return false;
            }
            MusicData musicData = (MusicData) obj;
            if (this.A01 != musicData.A01 || !11T.A0O(this.A09, musicData.A09) || !11T.A0O(this.A08, musicData.A08) || !11T.A0O(this.A06, musicData.A06) || !11T.A0O(this.A07, musicData.A07) || !11T.A0O(this.A02, musicData.A02) || !11T.A0O(this.A03, musicData.A03) || !11T.A0O(this.A04, musicData.A04) || this.A00 != musicData.A00 || !11T.A0O(this.A05, musicData.A05) || this.A0A != musicData.A0A) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A05, AnonymousClass002.A02(this.A00, (((((AnonymousClass002.A07(this.A07, AnonymousClass002.A07(this.A06, AnonymousClass002.A07(this.A08, AnonymousClass002.A07(this.A09, AnonymousClass002.A01(this.A01))))) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 4YU.A03(this.A04)) * 31)) + AnonymousClass002.A00(this.A0A ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        C3o5.A0g(parcel, this.A02);
        C3o5.A0g(parcel, this.A03);
        C3o5.A0g(parcel, this.A04);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
