package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass001;
import X.C4Bn;
import X.DKD;
import X.DKH;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* loaded from: SparkVisionCapability.class */
public final class SparkVisionCapability implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = DKf.A00(77);
    public static final long serialVersionUID = 0;
    public List mIdentifiers;

    public SparkVisionCapability() {
        this.mIdentifiers = null;
        this.mIdentifiers = AnonymousClass001.A0s();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return Objects.equal(DKH.A0d(this), DKH.A0d((SparkVisionCapability) obj));
    }

    public int hashCode() {
        return DKD.A04(DKH.A0d(this));
    }

    public String toString() {
        String str;
        str = "";
        return DKH.A0d(this) != null ? C4Bn.A00(str, DKH.A0d(this)) : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List list = this.mIdentifiers;
        parcel.writeStringList((list == null || ImmutableList.copyOf((Collection) list) == null) ? null : DKH.A0d(this));
    }
}
