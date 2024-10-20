package com.google.android.exoplayer2.metadata.icy;

import X.1BL;
import X.6Y2;
import X.6Yl;
import X.7zS;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.GOn;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;

/* loaded from: IcyHeaders.class */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = LGn.A00(33);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public IcyHeaders(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = 7zS.A1Z(parcel);
        this.A01 = parcel.readInt();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] BL1() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ 6Yl BL2() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void CXq(6Y2 r302) {
        String str = this.A03;
        if (str != null) {
            r302.A0D = str;
        }
        String str2 = this.A02;
        if (str2 != null) {
            r302.A0C = str2;
        }
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
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.A00 != icyHeaders.A00 || !Util.A0P(this.A02, icyHeaders.A02) || !Util.A0P(this.A03, icyHeaders.A03) || !Util.A0P(this.A04, icyHeaders.A04) || this.A05 != icyHeaders.A05 || this.A01 != icyHeaders.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A03 = (((AbstractC2326GOr.A03(this.A00) + 1BL.A06(this.A02)) * 31) + 1BL.A06(this.A03)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((A03 + i) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("IcyHeaders: name=\"");
        A0k.append(this.A03);
        A0k.append("\", genre=\"");
        A0k.append(this.A02);
        A0k.append("\", bitrate=");
        A0k.append(this.A00);
        A0k.append(", metadataInterval=");
        return GOn.A1B(A0k, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A01);
    }
}
