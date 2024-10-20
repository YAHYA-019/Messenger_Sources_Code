package com.facebook.xapp.messaging.commmunitymessaging.role.participantmetadata;

import X.11T;
import X.1BL;
import X.5pV;
import X.82N;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityRoleParticipantMetadata.class */
public final class CommunityRoleParticipantMetadata extends C04v implements Parcelable {
    public final 5pV A00;
    public static final Parcelable.Creator CREATOR = new 82N(21);
    public static final AnonymousClass207 A01 = new AnonymousClass207(CommunityRoleParticipantMetadata.class, null);

    public CommunityRoleParticipantMetadata(5pV r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CommunityRoleParticipantMetadata) && this.A00 == ((CommunityRoleParticipantMetadata) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A00);
    }
}
