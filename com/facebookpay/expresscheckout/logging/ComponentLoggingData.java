package com.facebookpay.expresscheckout.logging;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* loaded from: ComponentLoggingData.class */
public final class ComponentLoggingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(34);
    public final String A00;
    public final String A01;
    public final ImmutableMap A02;

    public ComponentLoggingData(ImmutableMap immutableMap, String str, String str2) {
        1BL.A1F(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = immutableMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComponentLoggingData)) {
                return false;
            }
            ComponentLoggingData componentLoggingData = (ComponentLoggingData) obj;
            if (!11T.A0O(this.A00, componentLoggingData.A00) || !11T.A0O(this.A01, componentLoggingData.A01) || !11T.A0O(this.A02, componentLoggingData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A01, 4YV.A02(this.A00)) + AnonymousClass001.A02(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComponentLoggingData(contextComponentName=");
        A0k.append(this.A00);
        A0k.append(", targetName=");
        A0k.append(this.A01);
        A0k.append(", extraPayload=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A02);
    }
}
