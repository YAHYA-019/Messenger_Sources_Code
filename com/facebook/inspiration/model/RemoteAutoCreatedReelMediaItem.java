package com.facebook.inspiration.model;

import X.11T;
import X.AbF;
import X.AbI;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.creativeediting.model.MusicTrackParams;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: RemoteAutoCreatedReelMediaItem.class */
public final class RemoteAutoCreatedReelMediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(90);
    public final MusicTrackParams A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public RemoteAutoCreatedReelMediaItem(Parcel parcel) {
        Integer num = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = (MusicTrackParams) MusicTrackParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbI.A0z(parcel);
        }
        this.A05 = parcel.readString();
        this.A0A = AbN.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = AbI.A0z(parcel);
        }
        this.A04 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
    }

    public RemoteAutoCreatedReelMediaItem(MusicTrackParams musicTrackParams, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A00 = musicTrackParams;
        this.A01 = num;
        this.A02 = num2;
        AbF.A1T(str);
        this.A05 = str;
        this.A0A = z;
        this.A03 = num3;
        this.A04 = num4;
        C1pq.A08("thumbnailUri", str2);
        this.A06 = str2;
        C1pq.A08("token", str3);
        this.A07 = str3;
        C1pq.A08("typeOfHighlight", str4);
        this.A08 = str4;
        C1pq.A08(TraceFieldType.Uri, str5);
        this.A09 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RemoteAutoCreatedReelMediaItem)) {
                return false;
            }
            RemoteAutoCreatedReelMediaItem remoteAutoCreatedReelMediaItem = (RemoteAutoCreatedReelMediaItem) obj;
            if (!11T.A0O(this.A00, remoteAutoCreatedReelMediaItem.A00) || !11T.A0O(this.A01, remoteAutoCreatedReelMediaItem.A01) || !11T.A0O(this.A02, remoteAutoCreatedReelMediaItem.A02) || !11T.A0O(this.A05, remoteAutoCreatedReelMediaItem.A05) || this.A0A != remoteAutoCreatedReelMediaItem.A0A || !11T.A0O(this.A03, remoteAutoCreatedReelMediaItem.A03) || !11T.A0O(this.A04, remoteAutoCreatedReelMediaItem.A04) || !11T.A0O(this.A06, remoteAutoCreatedReelMediaItem.A06) || !11T.A0O(this.A07, remoteAutoCreatedReelMediaItem.A07) || !11T.A0O(this.A08, remoteAutoCreatedReelMediaItem.A08) || !11T.A0O(this.A09, remoteAutoCreatedReelMediaItem.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))), this.A0A)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        MusicTrackParams musicTrackParams = this.A00;
        if (musicTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicTrackParams.writeToParcel(parcel, i);
        }
        C3o5.A0f(parcel, this.A01);
        C3o5.A0f(parcel, this.A02);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0A ? 1 : 0);
        C3o5.A0f(parcel, this.A03);
        C3o5.A0f(parcel, this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
    }
}
