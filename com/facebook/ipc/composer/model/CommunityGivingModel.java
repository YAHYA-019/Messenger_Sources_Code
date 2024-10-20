package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zU;
import X.AbH;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* loaded from: CommunityGivingModel.class */
public final class CommunityGivingModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(91);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public CommunityGivingModel(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public CommunityGivingModel(ImmutableList immutableList, String str, String str2, String str3, String str4) {
        C1pq.A08("draftID", str);
        this.A01 = str;
        C1pq.A08("imageIDs", immutableList);
        this.A00 = immutableList;
        C1pq.A08("publishTargetID", str2);
        this.A02 = str2;
        C1pq.A08("title", str3);
        this.A03 = str3;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
        this.A04 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityGivingModel)) {
                return false;
            }
            CommunityGivingModel communityGivingModel = (CommunityGivingModel) obj;
            if (!11T.A0O(this.A01, communityGivingModel.A01) || !11T.A0O(this.A00, communityGivingModel.A00) || !11T.A0O(this.A02, communityGivingModel.A02) || !11T.A0O(this.A03, communityGivingModel.A03) || !11T.A0O(this.A04, communityGivingModel.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }
}
