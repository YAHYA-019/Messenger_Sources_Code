package com.facebook.xapp.messaging.threadview.model.note;

import X.11T;
import X.5PP;
import X.7dW;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NoteMetadata.class */
public final class NoteMetadata extends C04v implements Parcelable, 5PP {
    public static final Parcelable.Creator CREATOR = new FKb(68);
    public final 7dW A00;

    public NoteMetadata(7dW r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NoteMetadata) && 11T.A0O(this.A00, ((NoteMetadata) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeValue(this.A00);
    }
}
