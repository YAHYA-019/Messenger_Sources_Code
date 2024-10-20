package com.facebook.xapp.messaging.browser.model;

import X.4YU;
import X.82N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: MessengerWebViewParams.class */
public final class MessengerWebViewParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(20);
    public final double A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public MessengerWebViewParams(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        boolean z = true;
        this.A04 = parcel.readInt() != 0;
        this.A03 = parcel.readInt() != 0;
        this.A09 = parcel.readInt() != 0;
        this.A06 = parcel.readInt() != 0;
        this.A08 = parcel.readInt() != 0;
        this.A07 = parcel.readInt() != 0;
        this.A0A = parcel.readInt() != 0;
        this.A05 = parcel.readInt() == 0 ? false : z;
    }

    public MessengerWebViewParams(String str, String str2, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = (d < 0.25d || d > 1.0d) ? 1.0d : d;
        this.A02 = str2;
        this.A01 = str;
        this.A04 = z2;
        this.A03 = z;
        this.A09 = z7;
        this.A06 = z4;
        this.A08 = z6;
        this.A07 = z5;
        this.A0A = false;
        this.A05 = z3;
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
            MessengerWebViewParams messengerWebViewParams = (MessengerWebViewParams) obj;
            if (!Objects.equal(Double.valueOf(this.A00), Double.valueOf(messengerWebViewParams.A00)) || !Objects.equal(this.A02, messengerWebViewParams.A02) || !Objects.equal(this.A01, messengerWebViewParams.A01)) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(this.A04);
            Boolean valueOf2 = Boolean.valueOf(messengerWebViewParams.A04);
            if (!Objects.equal(valueOf, valueOf2) || !Objects.equal(Boolean.valueOf(this.A03), valueOf2) || !4YU.A1a(Boolean.valueOf(this.A06), messengerWebViewParams.A06) || !4YU.A1a(Boolean.valueOf(this.A08), messengerWebViewParams.A08) || !4YU.A1a(Boolean.valueOf(this.A07), messengerWebViewParams.A07) || !4YU.A1a(Boolean.valueOf(this.A09), messengerWebViewParams.A09) || !4YU.A1a(Boolean.valueOf(this.A0A), messengerWebViewParams.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Double.valueOf(this.A00), this.A02, this.A01, Boolean.valueOf(this.A04), Boolean.valueOf(this.A03), Boolean.valueOf(this.A06), Boolean.valueOf(this.A08), Boolean.valueOf(this.A07), Boolean.valueOf(this.A09), Boolean.valueOf(this.A0A)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
