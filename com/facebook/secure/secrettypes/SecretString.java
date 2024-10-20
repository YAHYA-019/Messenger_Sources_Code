package com.facebook.secure.secrettypes;

import X.0qE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: SecretString.class */
public final class SecretString implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qE(6);
    public final String A00;
    public final String A01;

    public SecretString(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public SecretString(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            char[] cArr = new char[str.length()];
            Arrays.fill(cArr, '*');
            str2 = new String(cArr);
        }
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean A00(String str) {
        String str2 = this.A00;
        if (str2 == null) {
            if (str == null) {
                return true;
            }
        } else if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        SecretString secretString;
        boolean z = false;
        if (obj != null) {
            if (obj == this) {
                z = true;
            } else {
                if (obj instanceof String) {
                    return A00((String) obj);
                }
                if ((obj instanceof SecretString) && (secretString = (SecretString) obj) != null) {
                    return A00(secretString.A00);
                }
            }
        }
        return z;
    }

    public int hashCode() {
        String str = this.A00;
        if (str == null) {
            return -1;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.A01;
        if (str == null) {
            str = "null";
        }
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
