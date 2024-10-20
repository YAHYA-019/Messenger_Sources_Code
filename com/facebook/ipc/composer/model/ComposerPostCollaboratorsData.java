package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbH;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerPostCollaboratorsData.class */
public final class ComposerPostCollaboratorsData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(56);
    public final ImmutableList A00;

    public ComposerPostCollaboratorsData(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        String[] strArr = new String[A01];
        int i = 0;
        while (i < A01) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A00 = ImmutableList.copyOf(strArr);
    }

    public ComposerPostCollaboratorsData(ImmutableList immutableList) {
        C1pq.A08("postCollaborators", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerPostCollaboratorsData) && 11T.A0O(this.A00, ((ComposerPostCollaboratorsData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
    }
}
