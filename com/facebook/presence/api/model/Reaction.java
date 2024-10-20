package com.facebook.presence.api.model;

import X.0Pz;
import X.11T;
import X.1BJ;
import X.4YV;
import X.C04v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;

/* loaded from: Reaction.class */
public final class Reaction extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(50);
    public final int A00;
    public final String A01;

    public Reaction(String str, int i) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Reaction)) {
                return false;
            }
            Reaction reaction = (Reaction) obj;
            if (!11T.A0O(this.A01, reaction.A01) || this.A00 != reaction.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + this.A00;
    }

    public String toString() {
        return 0Pz.A0n("Reaction(emoji=", this.A01, 1BJ.A00(ActionId.VIDEO_SET_RENDERER_CONTEXT), ')', this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
