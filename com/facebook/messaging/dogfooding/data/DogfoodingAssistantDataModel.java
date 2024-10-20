package com.facebook.messaging.dogfooding.data;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YU;
import X.7zL;
import X.AbG;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: DogfoodingAssistantDataModel.class */
public final class DogfoodingAssistantDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(40);
    public final ImmutableMap A00;
    public final String A01;
    public final String A02;

    public DogfoodingAssistantDataModel(Parcel parcel) {
        ImmutableMap immutableMap = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i = 0;
            while (i < readInt) {
                i = AbL.A01(parcel, A0u, i);
            }
            immutableMap = ImmutableMap.copyOf((Map) A0u);
        }
        this.A00 = immutableMap;
        this.A02 = C3o5.A0O(parcel);
    }

    public DogfoodingAssistantDataModel(ImmutableMap immutableMap, String str, String str2) {
        this.A01 = str;
        this.A00 = immutableMap;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DogfoodingAssistantDataModel)) {
                return false;
            }
            DogfoodingAssistantDataModel dogfoodingAssistantDataModel = (DogfoodingAssistantDataModel) obj;
            if (!11T.A0O(this.A01, dogfoodingAssistantDataModel.A01) || !11T.A0O(this.A00, dogfoodingAssistantDataModel.A00) || !11T.A0O(this.A02, dogfoodingAssistantDataModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        ImmutableMap immutableMap = this.A00;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbG.A1G(parcel, immutableMap);
            1Du A0i = 4YU.A0i(immutableMap);
            while (A0i.hasNext()) {
                AbL.A0n(parcel, A0i);
            }
        }
        1BL.A13(parcel, this.A02);
    }
}
