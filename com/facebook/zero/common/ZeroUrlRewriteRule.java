package com.facebook.zero.common;

import X.C41w;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: ZeroUrlRewriteRule.class */
public final class ZeroUrlRewriteRule implements Parcelable, C41w {
    public static final Parcelable.Creator CREATOR = new C4Ny(49);
    public String A00;
    public Pattern A01;
    public final String A02;
    public final String A03;

    public ZeroUrlRewriteRule() {
        this.A02 = null;
        this.A03 = null;
        this.A00 = "";
    }

    public ZeroUrlRewriteRule(Parcel parcel) {
        String readString = parcel.readString();
        this.A02 = readString;
        this.A03 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = Pattern.compile(readString);
    }

    public ZeroUrlRewriteRule(String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = "";
        if (str != null) {
            this.A01 = Pattern.compile(str);
        }
    }

    @Override // X.C41w
    public /* bridge */ /* synthetic */ Object CY7() {
        String str = this.A02;
        if (str != null) {
            this.A01 = Pattern.compile(str);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof ZeroUrlRewriteRule)) {
            ZeroUrlRewriteRule zeroUrlRewriteRule = (ZeroUrlRewriteRule) obj;
            if (Objects.equal(this.A02, zeroUrlRewriteRule.A02) && Objects.equal(this.A03, zeroUrlRewriteRule.A03)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("matcher", this.A02);
        stringHelper.add("replacer", this.A03);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }
}
