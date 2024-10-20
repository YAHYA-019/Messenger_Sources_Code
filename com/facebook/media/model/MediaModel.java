package com.facebook.media.model;

import X.11T;
import X.1BL;
import X.AbF;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MimeType;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MediaModel.class */
public final class MediaModel implements Parcelable {
    public static volatile MimeType A0A;
    public static volatile String A0B;
    public static final Parcelable.Creator CREATOR = CSR.A00(74);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final MimeType A07;
    public final String A08;
    public final Set A09;

    public MediaModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A05 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A06 = parcel.readString();
        MimeType mimeType = null;
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A07 = parcel.readInt() != 0 ? (MimeType) MimeType.CREATOR.createFromParcel(parcel) : mimeType;
        this.A02 = parcel.readInt();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public MediaModel(MimeType mimeType, String str, String str2, String str3, Set set, int i, int i2, int i3, int i4, long j) {
        this.A00 = i;
        C1pq.A08("filePathUri", str);
        this.A05 = str;
        this.A01 = i2;
        AbF.A1T(str2);
        this.A06 = str2;
        this.A08 = str3;
        this.A07 = mimeType;
        this.A02 = i3;
        this.A04 = j;
        this.A03 = i4;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public MimeType A00() {
        if (this.A09.contains("mimeType")) {
            return this.A07;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    MimeType mimeType = MimeType.A02;
                    11T.A0B(mimeType);
                    A0A = mimeType;
                }
            }
        }
        return A0A;
    }

    public String A01() {
        if (this.A09.contains("mediaType")) {
            return this.A08;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                }
            }
        }
        return A0B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaModel)) {
                return false;
            }
            MediaModel mediaModel = (MediaModel) obj;
            if (this.A00 != mediaModel.A00 || !11T.A0O(this.A05, mediaModel.A05) || this.A01 != mediaModel.A01 || !11T.A0O(this.A06, mediaModel.A06) || !11T.A0O(A01(), mediaModel.A01()) || !11T.A0O(A00(), mediaModel.A00()) || this.A02 != mediaModel.A02 || this.A04 != mediaModel.A04 || this.A03 != mediaModel.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A01((C1pq.A04(A00(), C1pq.A04(A01(), C1pq.A04(this.A06, (C1pq.A04(this.A05, this.A00 + 31) * 31) + this.A01))) * 31) + this.A02, this.A04) * 31) + this.A03;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A08);
        MimeType mimeType = this.A07;
        if (mimeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mimeType.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
