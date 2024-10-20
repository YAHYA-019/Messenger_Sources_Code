package com.facebook.webrtc.models;

import X.1BK;
import X.C53v;
import X.FKb;
import X.H9Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: FbWebrtcDataMessageHeader.class */
public class FbWebrtcDataMessageHeader implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(34);
    public final String A00;
    public final Collection A01;
    public final Collection A02;

    public FbWebrtcDataMessageHeader(Parcel parcel) {
        if (C53v.A0S(parcel)) {
            this.A00 = parcel.readString();
        } else {
            this.A00 = null;
        }
        this.A02 = parcel.createStringArrayList();
        if (C53v.A0S(parcel)) {
            this.A01 = C53v.A03(parcel, H9Q.class);
        } else {
            this.A01 = null;
        }
    }

    public FbWebrtcDataMessageHeader(String str, Collection collection, Collection collection2) {
        this.A00 = str;
        this.A02 = collection;
        this.A01 = collection2;
    }

    public FbWebrtcDataMessageHeader(Collection collection, Collection collection2) {
        this(null, collection, collection2);
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
            FbWebrtcDataMessageHeader fbWebrtcDataMessageHeader = (FbWebrtcDataMessageHeader) obj;
            if (!Objects.equal(this.A00, fbWebrtcDataMessageHeader.A00) || !Objects.equal(this.A02, fbWebrtcDataMessageHeader.A02) || !Objects.equal(this.A01, fbWebrtcDataMessageHeader.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        if (str != null) {
            parcel.writeInt(1);
            parcel.writeString(str);
        } else {
            parcel.writeInt(0);
        }
        Collection collection = this.A02;
        parcel.writeStringList(collection != null ? 1BK.A17(collection) : null);
        Collection collection2 = this.A01;
        if (collection2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C53v.A0C(parcel, ImmutableList.copyOf(collection2));
        }
    }
}
