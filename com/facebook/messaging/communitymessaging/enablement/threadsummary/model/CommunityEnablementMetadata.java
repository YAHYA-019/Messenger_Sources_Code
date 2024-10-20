package com.facebook.messaging.communitymessaging.enablement.threadsummary.model;

import X.11T;
import X.1BL;
import X.AnonymousClass203;
import X.AnonymousClass207;
import X.C04v;
import X.C20E;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: CommunityEnablementMetadata.class */
public final class CommunityEnablementMetadata extends C04v implements Parcelable, AnonymousClass203 {
    public static final AnonymousClass207 A03;
    public static final Parcelable.Creator CREATOR = new C2xc(15);
    public final boolean A00;
    public final boolean A01;
    public final C20E A02;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A03 = new AnonymousClass207(CommunityEnablementMetadata.class, null);
    }

    public CommunityEnablementMetadata(C20E c20e, boolean z) {
        11T.A0F(c20e, 1);
        this.A02 = c20e;
        this.A00 = z;
        this.A01 = c20e == C20E.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityEnablementMetadata)) {
                return false;
            }
            CommunityEnablementMetadata communityEnablementMetadata = (CommunityEnablementMetadata) obj;
            if (this.A02 != communityEnablementMetadata.A02 || this.A00 != communityEnablementMetadata.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return hashCode + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A02);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
