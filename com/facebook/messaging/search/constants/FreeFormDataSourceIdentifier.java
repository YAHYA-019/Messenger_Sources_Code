package com.facebook.messaging.search.constants;

import X.C4zn;
import X.C6pc;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FreeFormDataSourceIdentifier.class */
public final class FreeFormDataSourceIdentifier implements DataSourceIdentifier {
    public static final Parcelable.Creator CREATOR = CSS.A00(65);
    public final String A00;

    public FreeFormDataSourceIdentifier(String str) {
        this.A00 = str;
    }

    @Override // X.C4zn
    public String Aus() {
        return this.A00;
    }

    @Override // X.C4zo
    public String BFN() {
        return C6pc.OPEN.loggingName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DataSourceIdentifier) {
            return this.A00.equals(((C4zn) obj).Aus());
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
