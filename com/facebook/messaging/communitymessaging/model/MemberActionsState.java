package com.facebook.messaging.communitymessaging.model;

import X.11T;
import X.7zN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MemberActionsState.class */
public final class MemberActionsState extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(90);
    public final Long A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public MemberActionsState(Long l, String str, boolean z, boolean z2) {
        this.A00 = l;
        this.A01 = str;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MemberActionsState)) {
                return false;
            }
            MemberActionsState memberActionsState = (MemberActionsState) obj;
            if (!11T.A0O(this.A00, memberActionsState.A00) || !11T.A0O(this.A01, memberActionsState.A01) || this.A02 != memberActionsState.A02 || this.A03 != memberActionsState.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A02(this.A00) * 31) + 7zN.A05(this.A01)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Long l = this.A00;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
