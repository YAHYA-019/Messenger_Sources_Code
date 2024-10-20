package com.facebook.crossposting.ipc;

import X.11T;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXCXPCXPAccountPrivacyType;
import com.facebook.graphql.enums.GraphQLXCXPCXPIdentityRemixSettingStatus;

/* loaded from: ShareToInstagramDestinationModel.class */
public final class ShareToInstagramDestinationModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(58);
    public final String A00;
    public final GraphQLXCXPCXPAccountPrivacyType A01;
    public final GraphQLXCXPCXPIdentityRemixSettingStatus A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public ShareToInstagramDestinationModel(Parcel parcel) {
        GraphQLXCXPCXPIdentityRemixSettingStatus graphQLXCXPCXPIdentityRemixSettingStatus = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = GraphQLXCXPCXPAccountPrivacyType.values()[parcel.readInt()];
        }
        this.A05 = AbN.A1U(parcel);
        this.A03 = parcel.readString();
        this.A02 = parcel.readInt() != 0 ? GraphQLXCXPCXPIdentityRemixSettingStatus.values()[parcel.readInt()] : graphQLXCXPCXPIdentityRemixSettingStatus;
        this.A00 = parcel.readString();
        this.A04 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ShareToInstagramDestinationModel)) {
                return false;
            }
            ShareToInstagramDestinationModel shareToInstagramDestinationModel = (ShareToInstagramDestinationModel) obj;
            if (this.A01 != shareToInstagramDestinationModel.A01 || this.A05 != shareToInstagramDestinationModel.A05 || !11T.A0O(this.A03, shareToInstagramDestinationModel.A03) || this.A02 != shareToInstagramDestinationModel.A02 || !11T.A0O(this.A00, shareToInstagramDestinationModel.A00) || !11T.A0O(this.A04, shareToInstagramDestinationModel.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A02(C3o5.A03(this.A01) + 31, this.A05));
        return C1pq.A04(this.A04, C1pq.A04(this.A00, (A04 * 31) + DKF.A04(this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
        C3o5.A0e(parcel, this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
    }
}
