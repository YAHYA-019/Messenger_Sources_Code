package com.facebook.messaging.inbox2.activenow.model;

import X.1BL;
import X.5UV;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.User;

/* loaded from: Entity.class */
public final class Entity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(36);
    public final 5UV A00;
    public final GroupPresenceInfo A01;
    public final User A02;

    public Entity(5UV r302, GroupPresenceInfo groupPresenceInfo, User user) {
        this.A00 = r302;
        this.A02 = user;
        this.A01 = groupPresenceInfo;
    }

    public Entity(Parcel parcel) {
        this.A00 = C53v.A07(parcel, 5UV.class);
        this.A02 = (User) 1BL.A0C(parcel, User.class);
        this.A01 = (GroupPresenceInfo) 1BL.A0C(parcel, GroupPresenceInfo.class);
    }

    public static Entity A00(User user) {
        user.getClass();
        return new Entity(5UV.A02, null, user);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
    }
}
