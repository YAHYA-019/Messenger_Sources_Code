package com.facebook.messaging.model.threads;

import X.0J6;
import X.11T;
import X.1BL;
import X.CSV;
import X.HAa;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ThreadMediaPreview.class */
public final class ThreadMediaPreview implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(78);
    public final Uri A00;
    public final HAa A01;

    public ThreadMediaPreview(Uri uri, HAa hAa) {
        this.A01 = hAa;
        this.A00 = uri;
    }

    public ThreadMediaPreview(Parcel parcel) {
        this.A01 = parcel.readSerializable();
        this.A00 = (Uri) 1BL.A0C(parcel, Uri.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            ThreadMediaPreview threadMediaPreview = (ThreadMediaPreview) obj;
            if (this.A01 != threadMediaPreview.A01 || !11T.A0O(this.A00, threadMediaPreview.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 0J6.A00(this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
