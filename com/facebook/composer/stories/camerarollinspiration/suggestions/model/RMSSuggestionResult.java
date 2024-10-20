package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKX;
import X.Qpe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: RMSSuggestionResult.class */
public final class RMSSuggestionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(15);
    public final Qpe A00;
    public final ImmutableList A01;
    public final String A02;

    public RMSSuggestionResult(Qpe qpe, ImmutableList immutableList, String str) {
        this.A00 = qpe;
        this.A02 = str;
        this.A01 = immutableList;
        if (immutableList == null || immutableList.isEmpty()) {
            if (this.A00 == null || this.A02 == null) {
                throw AnonymousClass001.A0L("RMSSuggestionResult should be in success or failure state!");
            }
        }
    }

    public RMSSuggestionResult(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Qpe.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            SuggestionModel[] suggestionModelArr = new SuggestionModel[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, suggestionModelArr, i);
            }
            immutableList = ImmutableList.copyOf(suggestionModelArr);
        }
        this.A01 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RMSSuggestionResult)) {
                return false;
            }
            RMSSuggestionResult rMSSuggestionResult = (RMSSuggestionResult) obj;
            if (this.A00 != rMSSuggestionResult.A00 || !11T.A0O(this.A02, rMSSuggestionResult.A02) || !11T.A0O(this.A01, rMSSuggestionResult.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A02, C3o5.A03(this.A00) + 31));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A02);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y = AbL.A0Y(parcel, immutableList);
        while (A0Y.hasNext()) {
            parcel.writeParcelable((SuggestionModel) A0Y.next(), i);
        }
    }
}
