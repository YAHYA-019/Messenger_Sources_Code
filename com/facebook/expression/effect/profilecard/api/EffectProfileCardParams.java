package com.facebook.expression.effect.profilecard.api;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: EffectProfileCardParams.class */
public final class EffectProfileCardParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(68);
    public final EffectItem A00;
    public final String A01;

    public EffectProfileCardParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        EffectItem effectItem = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? (EffectItem) parcel.readParcelable(A0e) : effectItem;
    }

    public EffectProfileCardParams(EffectItem effectItem, String str) {
        this.A01 = str;
        this.A00 = effectItem;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EffectProfileCardParams)) {
                return false;
            }
            EffectProfileCardParams effectProfileCardParams = (EffectProfileCardParams) obj;
            if (!11T.A0O(this.A01, effectProfileCardParams.A01) || !11T.A0O(this.A00, effectProfileCardParams.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        C3o5.A0d(parcel, this.A00, i);
    }
}
