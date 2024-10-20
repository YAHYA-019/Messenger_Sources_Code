package com.facebook.user.model;

import X.1BL;
import X.1JF;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.base.Platform;

/* loaded from: Name.class */
public class Name implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(53);
    public String A00;
    public final String displayName;
    public final String firstName;
    public final String lastName;

    public Name() {
        this.firstName = null;
        this.lastName = null;
        this.displayName = null;
    }

    public Name(Parcel parcel) {
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.displayName = parcel.readString();
    }

    public Name(String str) {
        this(null, null, str);
    }

    public Name(String str, String str2, String str3) {
        this.firstName = Platform.stringIsNullOrEmpty(str) ? null : str;
        this.lastName = Platform.stringIsNullOrEmpty(str2) ? null : str2;
        this.displayName = Platform.stringIsNullOrEmpty(str3) ? null : str3;
    }

    public String A00() {
        String str = this.displayName;
        if (str == null) {
            str = A01();
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0 > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A01() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L40
            r0 = r301
            java.lang.String r0 = r0.firstName
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.lastName
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L49
            r0 = r302
            int r0 = r0.length()
            r304 = r0
            r0 = r304
            if (r0 <= 0) goto L42
            r0 = r303
            if (r0 == 0) goto L42
            r0 = r303
            int r0 = r0.length()
            r305 = r0
            r0 = r305
            if (r0 <= 0) goto L42
            java.lang.String r0 = " "
            r306 = r0
            r0 = r302
            r1 = r306
            r2 = r303
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            r302 = r0
        L3b:
            r0 = r301
            r1 = r302
            r0.A00 = r1
        L40:
            r0 = r302
            return r0
        L42:
            r0 = r304
            if (r0 <= 0) goto L49
            goto L3b
        L49:
            r0 = r303
            if (r0 == 0) goto L5d
            r0 = r303
            int r0 = r0.length()
            r305 = r0
            r0 = r305
            if (r0 <= 0) goto L5d
            r0 = r303
            r302 = r0
            goto L3b
        L5d:
            java.lang.String r0 = ""
            r302 = r0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.Name.A01():java.lang.String");
    }

    public String A02() {
        String str = this.firstName;
        if (1JF.A0B(str)) {
            str = A00();
        }
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Name name = (Name) obj;
            if (!Objects.equal(this.displayName, name.displayName) || !Objects.equal(this.firstName, name.firstName) || !Objects.equal(this.lastName, name.lastName)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A06 = ((1BL.A06(this.firstName) * 31) + 1BL.A06(this.lastName)) * 31;
        String str = this.displayName;
        if (str != null) {
            i = str.hashCode();
        }
        return A06 + i;
    }

    public String toString() {
        return A01();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.displayName);
    }
}
