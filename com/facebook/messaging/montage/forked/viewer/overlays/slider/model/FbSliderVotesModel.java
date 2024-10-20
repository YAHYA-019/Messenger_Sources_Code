package com.facebook.messaging.montage.forked.viewer.overlays.slider.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbI;
import X.C1pq;
import X.CSV;
import X.DKH;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: FbSliderVotesModel.class */
public final class FbSliderVotesModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(96);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public FbSliderVotesModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A03 = 4YV.A1U(parcel.readInt());
        this.A01 = parcel.readString();
        this.A02 = DKH.A0l(parcel);
        int readInt = parcel.readInt();
        FbSliderVoteModel[] fbSliderVoteModelArr = new FbSliderVoteModel[readInt];
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, fbSliderVoteModelArr, i);
        }
        this.A00 = ImmutableList.copyOf(fbSliderVoteModelArr);
    }

    public FbSliderVotesModel(ImmutableList immutableList, String str) {
        this.A03 = false;
        this.A01 = "";
        this.A02 = str;
        C1pq.A08("votes", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbSliderVotesModel)) {
                return false;
            }
            FbSliderVotesModel fbSliderVotesModel = (FbSliderVotesModel) obj;
            if (this.A03 != fbSliderVotesModel.A03 || !11T.A0O(this.A01, fbSliderVotesModel.A01) || !11T.A0O(this.A02, fbSliderVotesModel.A02) || !11T.A0O(this.A00, fbSliderVotesModel.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A05(this.A03))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
        4YW.A0E(parcel, this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((FbSliderVoteModel) A0b.next(), i);
        }
    }
}
