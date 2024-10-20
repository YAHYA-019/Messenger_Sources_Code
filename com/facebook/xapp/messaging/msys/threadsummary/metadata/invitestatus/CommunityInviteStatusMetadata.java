package com.facebook.xapp.messaging.msys.threadsummary.metadata.invitestatus;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass203;
import X.AnonymousClass207;
import X.C04v;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: CommunityInviteStatusMetadata.class */
public final class CommunityInviteStatusMetadata extends C04v implements Parcelable, AnonymousClass203 {
    public static final AnonymousClass207 A02;
    public static final Parcelable.Creator CREATOR = new C2xc(66);
    public final int A00;
    public final Long A01;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A02 = new AnonymousClass207(CommunityInviteStatusMetadata.class, null);
    }

    public CommunityInviteStatusMetadata(Long l, int i) {
        this.A00 = i;
        this.A01 = l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityInviteStatusMetadata)) {
                return false;
            }
            CommunityInviteStatusMetadata communityInviteStatusMetadata = (CommunityInviteStatusMetadata) obj;
            if (this.A00 != communityInviteStatusMetadata.A00 || !11T.A0O(this.A01, communityInviteStatusMetadata.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass001.A02(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
        Long l = this.A01;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }
}
