package com.facebook.messaging.extensions.common;

import X.82M;
import X.95I;
import X.BP7;
import X.C2qv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import java.util.Arrays;

/* loaded from: ExtensionParams.class */
public final class ExtensionParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(32);
    public int A00;
    public int A01;
    public int A02;
    public Parcelable A03;
    public ExtensionIconModel A04;
    public 95I A05;
    public BP7 A06;
    public ThreadKey A07;
    public ThreadViewColorScheme A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof ExtensionParams)) {
                return false;
            }
            ExtensionParams extensionParams = (ExtensionParams) obj;
            if (this.A01 == extensionParams.A01 && this.A02 == extensionParams.A02 && this.A00 == extensionParams.A00 && this.A0A == extensionParams.A0A && this.A0C == extensionParams.A0C && this.A0B == extensionParams.A0B && this.A06 == extensionParams.A06 && C2qv.A01(this.A03, extensionParams.A03) && this.A05 == extensionParams.A05 && C2qv.A01(this.A07, extensionParams.A07) && C2qv.A01(this.A09, extensionParams.A09) && C2qv.A01(this.A08, extensionParams.A08) && C2qv.A01(this.A04, extensionParams.A04)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A00), this.A03, this.A05, this.A07, Boolean.valueOf(this.A0A), Boolean.valueOf(this.A0C), this.A09, Boolean.valueOf(this.A0B), this.A08, this.A04});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A06.id);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A05.ordinal());
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A04, i);
    }
}
