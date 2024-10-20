package com.facebook.xapp.messaging.threadview.model.aigenerated;

import X.11T;
import X.4YW;
import X.5PP;
import X.82N;
import X.AnonymousClass001;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: AIGeneratedMetadata.class */
public final class AIGeneratedMetadata extends C04v implements Parcelable, 5PP {
    public static final Parcelable.Creator CREATOR = new 82N(29);
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public AIGeneratedMetadata(List list, List list2, List list3, List list4) {
        11T.A0F(list, 1);
        11T.A0F(list2, 2);
        11T.A0F(list3, 3);
        11T.A0F(list4, 4);
        this.A02 = list;
        this.A01 = list2;
        this.A00 = list3;
        this.A03 = list4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AIGeneratedMetadata)) {
                return false;
            }
            AIGeneratedMetadata aIGeneratedMetadata = (AIGeneratedMetadata) obj;
            if (!11T.A0O(this.A02, aIGeneratedMetadata.A02) || !11T.A0O(this.A01, aIGeneratedMetadata.A01) || !11T.A0O(this.A00, aIGeneratedMetadata.A00) || !11T.A0O(this.A03, aIGeneratedMetadata.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A03.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Iterator A09 = 4YW.A09(parcel, this.A02);
        while (A09.hasNext()) {
            parcel.writeInt(AnonymousClass001.A1V(A09.next()) ? 1 : 0);
        }
        parcel.writeStringList(this.A01);
        parcel.writeStringList(this.A00);
        parcel.writeStringList(this.A03);
    }
}
