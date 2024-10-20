package com.facebook.messaging.media.resharehub.model;

import X.11T;
import X.1BJ;
import X.7zN;
import X.7zU;
import X.96S;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ReshareHubPreviewModel.class */
public final class ReshareHubPreviewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(26);
    public final int A00;
    public final int A01;
    public final 96S A02;
    public final ThreadKey A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final int A0C;

    public ReshareHubPreviewModel(96S r302, ThreadKey threadKey, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3) {
        C1pq.A08("mediaDescription", str);
        this.A04 = str;
        this.A00 = i;
        C1pq.A08("mediaId", str2);
        this.A05 = str2;
        C1pq.A08("mediaOwnerName", str3);
        this.A06 = str3;
        C1pq.A08("mediaOwnerProfileUrl", str4);
        this.A07 = str4;
        this.A0C = i2;
        C1pq.A08("mediaType", str5);
        this.A08 = str5;
        C1pq.A08("mediaUrl", str6);
        this.A09 = str6;
        this.A01 = i3;
        C1pq.A08("resultId", str7);
        this.A0A = str7;
        C1pq.A08("sessionId", str8);
        this.A0B = str8;
        C1pq.A08(1BJ.A00(563), r302);
        this.A02 = r302;
        this.A03 = threadKey;
    }

    public ReshareHubPreviewModel(Parcel parcel) {
        this.A04 = 7zU.A0l(parcel, this);
        this.A00 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0C = parcel.readInt();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A02 = 96S.values()[parcel.readInt()];
        this.A03 = parcel.readInt() == 0 ? null : (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReshareHubPreviewModel)) {
                return false;
            }
            ReshareHubPreviewModel reshareHubPreviewModel = (ReshareHubPreviewModel) obj;
            if (!11T.A0O(this.A04, reshareHubPreviewModel.A04) || this.A00 != reshareHubPreviewModel.A00 || !11T.A0O(this.A05, reshareHubPreviewModel.A05) || !11T.A0O(this.A06, reshareHubPreviewModel.A06) || !11T.A0O(this.A07, reshareHubPreviewModel.A07) || this.A0C != reshareHubPreviewModel.A0C || !11T.A0O(this.A08, reshareHubPreviewModel.A08) || !11T.A0O(this.A09, reshareHubPreviewModel.A09) || this.A01 != reshareHubPreviewModel.A01 || !11T.A0O(this.A0A, reshareHubPreviewModel.A0A) || !11T.A0O(this.A0B, reshareHubPreviewModel.A0B) || this.A02 != reshareHubPreviewModel.A02 || !11T.A0O(this.A03, reshareHubPreviewModel.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0B, C1pq.A04(this.A0A, (C1pq.A04(this.A09, C1pq.A04(this.A08, (C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, (C1pq.A03(this.A04) * 31) + this.A00))) * 31) + this.A0C)) * 31) + this.A01));
        return C1pq.A04(this.A03, (A04 * 31) + C3o5.A03(this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0C);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        7zN.A0z(parcel, this.A02);
        ThreadKey threadKey = this.A03;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
    }
}
