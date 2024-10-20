package com.facebook.ipc.composer.model;

import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DefaultPrivacySurveyData.class */
public final class DefaultPrivacySurveyData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(81);
    public final boolean A00;
    public final boolean A01;

    public DefaultPrivacySurveyData(Parcel parcel) {
        this.A00 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A01 = AbJ.A1W(parcel);
    }

    public DefaultPrivacySurveyData(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DefaultPrivacySurveyData)) {
                return false;
            }
            DefaultPrivacySurveyData defaultPrivacySurveyData = (DefaultPrivacySurveyData) obj;
            if (this.A00 != defaultPrivacySurveyData.A00 || this.A01 != defaultPrivacySurveyData.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A05(this.A00), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
