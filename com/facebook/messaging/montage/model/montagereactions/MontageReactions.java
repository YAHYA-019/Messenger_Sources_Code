package com.facebook.messaging.montage.model.montagereactions;

import X.0Px;
import X.1Mu;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import java.util.Arrays;

/* loaded from: MontageReactions.class */
public final class MontageReactions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(66);
    public final ImmutableMultimap A00;

    public MontageReactions(1Mu r302) {
        this.A00 = ImmutableListMultimap.A02(r302);
    }

    public MontageReactions(Parcel parcel) {
        HashMultimap hashMultimap = new HashMultimap();
        C53v.A0F(parcel, hashMultimap);
        this.A00 = ImmutableListMultimap.A02(hashMultimap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MontageReactions) {
            return 0Px.A00(((MontageReactions) obj).A00, this.A00);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0H(parcel, this.A00);
    }
}
