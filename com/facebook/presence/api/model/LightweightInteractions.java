package com.facebook.presence.api.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YW;
import X.C04v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: LightweightInteractions.class */
public final class LightweightInteractions extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(49);
    public final User A00;
    public final List A01;

    public LightweightInteractions(User user, List list) {
        11T.A0F(user, 1);
        this.A00 = user;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LightweightInteractions)) {
                return false;
            }
            LightweightInteractions lightweightInteractions = (LightweightInteractions) obj;
            if (!11T.A0O(this.A00, lightweightInteractions.A00) || !11T.A0O(this.A01, lightweightInteractions.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Iterator A09 = 4YW.A09(parcel, this.A01);
        while (A09.hasNext()) {
            ((Reaction) A09.next()).writeToParcel(parcel, i);
        }
    }
}
