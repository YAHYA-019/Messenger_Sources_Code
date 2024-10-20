package com.facebook.payments.form.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NoteFormData.class */
public final class NoteFormData implements Parcelable, PaymentsFormData {
    public static final Parcelable.Creator CREATOR = FKZ.A00(52);
    public final FormFieldAttributes A00;

    public NoteFormData(Parcel parcel) {
        this.A00 = (FormFieldAttributes) 1BL.A0C(parcel, getClass());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NoteFormData) && 11T.A0O(this.A00, ((NoteFormData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
