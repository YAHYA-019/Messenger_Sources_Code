package com.facebook.litho.sections.fb.fragment;

import X.6tY;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* loaded from: LoggingConfiguration.class */
public final class LoggingConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(6);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public LoggingConfiguration(String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = i;
        this.A05 = str2;
        this.A06 = z;
        this.A04 = str3;
        this.A00 = i2;
        this.A02 = i3;
        this.A07 = z2;
    }

    public static 6tY A00(String str) {
        Preconditions.checkArgument(!Platform.stringIsNullOrEmpty(str), "You must provide a non-empty default log tag");
        6tY r0 = new 6tY();
        r0.A01 = str;
        r0.A00 = 9043993;
        r0.A03 = str;
        r0.A02 = str;
        return r0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof LoggingConfiguration)) {
                return false;
            }
            LoggingConfiguration loggingConfiguration = (LoggingConfiguration) obj;
            if (this.A01 == loggingConfiguration.A01 && this.A05.equals(loggingConfiguration.A05) && this.A06 == loggingConfiguration.A06 && this.A00 == loggingConfiguration.A00 && this.A02 == loggingConfiguration.A02 && this.A04.equals(loggingConfiguration.A04) && this.A03.equals(loggingConfiguration.A03) && this.A07 == loggingConfiguration.A07) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A05, Boolean.valueOf(this.A06), this.A04, Integer.valueOf(this.A02), Boolean.valueOf(this.A07)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
    }
}
