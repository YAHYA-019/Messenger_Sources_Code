package com.facebook.messaging.media.resharehub.model;

import X.11T;
import X.1BL;
import X.7zN;
import X.7zU;
import X.96S;
import X.C1pq;
import X.C1u3;
import X.C3o5;
import X.CSV;
import X.ROu;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ReshareHubTabModel.class */
public final class ReshareHubTabModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(27);
    public final int A00;
    public final C1u3 A01;
    public final 96S A02;
    public final ThreadKey A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final int A08;

    public ReshareHubTabModel(ROu rOu) {
        String str = rOu.A05;
        C1pq.A08("contentDescription", str);
        this.A04 = str;
        C1u3 c1u3 = rOu.A02;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, c1u3);
        this.A01 = c1u3;
        this.A05 = rOu.A06;
        this.A06 = rOu.A07;
        this.A08 = rOu.A00;
        String str2 = rOu.A08;
        C1pq.A08("sessionId", str2);
        this.A07 = str2;
        this.A03 = rOu.A04;
        this.A00 = rOu.A01;
        96S r0 = rOu.A03;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r0);
        this.A02 = r0;
    }

    public ReshareHubTabModel(Parcel parcel) {
        this.A04 = 7zU.A0l(parcel, this);
        this.A01 = C1u3.values()[parcel.readInt()];
        ThreadKey threadKey = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A08 = parcel.readInt();
        this.A07 = parcel.readString();
        this.A03 = parcel.readInt() != 0 ? (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel) : threadKey;
        this.A00 = parcel.readInt();
        this.A02 = 96S.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReshareHubTabModel)) {
                return false;
            }
            ReshareHubTabModel reshareHubTabModel = (ReshareHubTabModel) obj;
            if (!11T.A0O(this.A04, reshareHubTabModel.A04) || this.A01 != reshareHubTabModel.A01 || !11T.A0O(this.A05, reshareHubTabModel.A05) || !11T.A0O(this.A06, reshareHubTabModel.A06) || this.A08 != reshareHubTabModel.A08 || !11T.A0O(this.A07, reshareHubTabModel.A07) || !11T.A0O(this.A03, reshareHubTabModel.A03) || this.A00 != reshareHubTabModel.A00 || this.A02 != reshareHubTabModel.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = (C1pq.A04(this.A03, C1pq.A04(this.A07, (C1pq.A04(this.A06, C1pq.A04(this.A05, (C1pq.A03(this.A04) * 31) + C3o5.A03(this.A01))) * 31) + this.A08)) * 31) + this.A00;
        96S r0 = this.A02;
        if (r0 != null) {
            i = r0.ordinal();
        }
        return (A04 * 31) + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        7zN.A0z(parcel, this.A01);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        parcel.writeInt(this.A08);
        parcel.writeString(this.A07);
        ThreadKey threadKey = this.A03;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        7zN.A0z(parcel, this.A02);
    }
}
