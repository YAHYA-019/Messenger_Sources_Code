package com.facebook.user.model;

import X.0Pz;
import X.1Js;
import X.1Kh;
import X.1rP;
import X.3dP;
import X.AnonymousClass001;
import X.C2xc;
import X.IJ6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.base.Platform;
import java.util.Collection;

/* loaded from: UserKey.class */
public class UserKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(57);
    public String A00;
    public final String id;
    public final 1Js type;

    public UserKey(1Js r302, String str) {
        this.type = r302;
        this.id = str;
    }

    public static UserKey A00(Long l) {
        return new UserKey(1Js.A03, l == null ? null : Long.toString(l.longValue()));
    }

    public static UserKey A01(String str) {
        return new UserKey(1Js.A03, str);
    }

    public static UserKey A02(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        if (split.length == 2) {
            return new UserKey(1Js.valueOf(split[0]), split[1]);
        }
        throw 0Pz.A05("Cannot parse user key: ", str);
    }

    public static 1rP A03(Collection collection) {
        return new 1rP(new 3dP(9), collection);
    }

    public String A04() {
        String str;
        int indexOf;
        1Js r0 = this.type;
        if (r0 == 1Js.A01) {
            str = this.id;
        } else {
            if (r0 != 1Js.A07 && r0 != 1Js.A02 && r0 != 1Js.A06) {
                return null;
            }
            String str2 = this.id;
            str = null;
            if (!Platform.stringIsNullOrEmpty(str2) && (indexOf = str2.indexOf(58)) >= 0) {
                String A0c = AnonymousClass001.A0c(str2, indexOf);
                if (!Platform.stringIsNullOrEmpty(A0c)) {
                    return A0c;
                }
            }
        }
        return str;
    }

    public String A05() {
        String str;
        String str2 = this.A00;
        if (str2 == null && (str = this.id) != null) {
            str2 = 0Pz.A0j(this.type.name(), ":", str);
            this.A00 = str2;
        }
        return str2;
    }

    public String A06() {
        String A00;
        1Js r0 = this.type;
        if (r0 == 1Js.A07 || r0 == 1Js.A08) {
            return 1Kh.A00(this.id);
        }
        if (r0 != 1Js.A06 || (A00 = 1Kh.A00(this.id)) == null || IJ6.A00(A00)) {
            return null;
        }
        return A00;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UserKey userKey = (UserKey) obj;
            if (!Objects.equal(this.id, userKey.id)) {
                return false;
            }
            if (this.type != userKey.type) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        String str = this.id;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return String.valueOf(A05());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.id);
    }
}
