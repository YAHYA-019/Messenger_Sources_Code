package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.11T;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKX;
import X.Qpc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SuggestionsTitleModel.class */
public final class SuggestionsTitleModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(20);
    public final Qpc A00;
    public final String A01;

    public SuggestionsTitleModel(Qpc qpc, String str) {
        AbF.A1V(str);
        this.A01 = str;
        this.A00 = qpc;
    }

    public SuggestionsTitleModel(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A00 = parcel.readInt() == 0 ? null : Qpc.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SuggestionsTitleModel)) {
                return false;
            }
            SuggestionsTitleModel suggestionsTitleModel = (SuggestionsTitleModel) obj;
            if (!11T.A0O(this.A01, suggestionsTitleModel.A01) || this.A00 != suggestionsTitleModel.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        return (A03 * 31) + C3o5.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(DKH.A05(parcel, this.A00));
    }
}
