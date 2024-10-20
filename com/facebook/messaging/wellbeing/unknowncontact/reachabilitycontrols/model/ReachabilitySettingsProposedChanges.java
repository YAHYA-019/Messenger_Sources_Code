package com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ReachabilitySettingsProposedChanges.class */
public final class ReachabilitySettingsProposedChanges implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKY(2);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ReachabilitySettingsProposedChanges(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A01 = C3o5.A0O(parcel);
    }

    public ReachabilitySettingsProposedChanges(String str, String str2) {
        this.A00 = str;
        this.A02 = null;
        this.A03 = null;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReachabilitySettingsProposedChanges)) {
                return false;
            }
            ReachabilitySettingsProposedChanges reachabilitySettingsProposedChanges = (ReachabilitySettingsProposedChanges) obj;
            if (!11T.A0O(this.A00, reachabilitySettingsProposedChanges.A00) || !11T.A0O(this.A02, reachabilitySettingsProposedChanges.A02) || !11T.A0O(this.A03, reachabilitySettingsProposedChanges.A03) || !11T.A0O(this.A01, reachabilitySettingsProposedChanges.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A01);
    }
}
