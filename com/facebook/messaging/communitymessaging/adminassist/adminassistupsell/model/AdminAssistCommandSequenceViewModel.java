package com.facebook.messaging.communitymessaging.adminassist.adminassistupsell.model;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AdminAssistCommandSequenceViewModel.class */
public final class AdminAssistCommandSequenceViewModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(54);
    public boolean A00;
    public final AdminAssistCommandSequence A01;

    public AdminAssistCommandSequenceViewModel() {
        this(null, true);
    }

    public AdminAssistCommandSequenceViewModel(AdminAssistCommandSequence adminAssistCommandSequence, boolean z) {
        this.A01 = adminAssistCommandSequence;
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdminAssistCommandSequenceViewModel)) {
                return false;
            }
            AdminAssistCommandSequenceViewModel adminAssistCommandSequenceViewModel = (AdminAssistCommandSequenceViewModel) obj;
            if (!11T.A0O(this.A01, adminAssistCommandSequenceViewModel.A01) || this.A00 != adminAssistCommandSequenceViewModel.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A02(this.A01) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
