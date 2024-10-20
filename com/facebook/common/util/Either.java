package com.facebook.common.util;

import X.C0px;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.base.Objects;
import com.google.common.base.Supplier;
import java.util.Arrays;

/* loaded from: Either.class */
public final class Either implements Supplier, Parcelable {
    public static final Parcelable.Creator CREATOR = new C0px(0);
    public final Object A00;
    public final Object A01;
    public final boolean A02;

    public Either(Parcel parcel) {
        this(C53v.A09(parcel), C53v.A09(parcel), C53v.A0S(parcel));
    }

    public /* synthetic */ Either(Parcel parcel, C0px c0px) {
        this(parcel);
    }

    public Either(Object obj, Object obj2, boolean z) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Either) {
            return Objects.equal(get(), ((Either) obj).get());
        }
        return false;
    }

    @Override // com.google.common.base.Supplier
    public Object get() {
        return this.A02 ? this.A00 : this.A01;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{get()});
    }

    public String toString() {
        return StringFormatUtil.formatStrLocaleSafe("Either.%s(%s)", this.A02 ? "left" : "right", String.valueOf(get()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
