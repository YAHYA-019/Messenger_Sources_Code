package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BM;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.User;

/* loaded from: ProactiveWarningAdditionalActionsPageConfig.class */
public final class ProactiveWarningAdditionalActionsPageConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(2);
    public final User A00;
    public final User A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public ProactiveWarningAdditionalActionsPageConfig(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        User user = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (User) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readInt() != 0 ? (User) parcel.readParcelable(A0e) : user;
        this.A02 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A03 = 1BM.A07(parcel);
        this.A04 = 1BM.A07(parcel);
        this.A05 = AbJ.A1W(parcel);
    }

    public ProactiveWarningAdditionalActionsPageConfig(User user, User user2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = user;
        this.A01 = user2;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A05 = z4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProactiveWarningAdditionalActionsPageConfig)) {
                return false;
            }
            ProactiveWarningAdditionalActionsPageConfig proactiveWarningAdditionalActionsPageConfig = (ProactiveWarningAdditionalActionsPageConfig) obj;
            if (!11T.A0O(this.A00, proactiveWarningAdditionalActionsPageConfig.A00) || !11T.A0O(this.A01, proactiveWarningAdditionalActionsPageConfig.A01) || this.A02 != proactiveWarningAdditionalActionsPageConfig.A02 || this.A03 != proactiveWarningAdditionalActionsPageConfig.A03 || this.A04 != proactiveWarningAdditionalActionsPageConfig.A04 || this.A05 != proactiveWarningAdditionalActionsPageConfig.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A02), this.A03), this.A04), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
