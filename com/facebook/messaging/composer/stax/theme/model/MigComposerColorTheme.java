package com.facebook.messaging.composer.stax.theme.model;

import X.11T;
import X.4YV;
import X.82M;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MigComposerColorTheme.class */
public final class MigComposerColorTheme implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(26);
    public final int A00;
    public final int A01;
    public final int A02;
    public final MigColorScheme A03;
    public final Integer A04;

    public MigComposerColorTheme(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A04 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.A03 = (MigColorScheme) parcel.readParcelable(A0e);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public MigComposerColorTheme(MigColorScheme migColorScheme, Integer num, int i, int i2, int i3) {
        this.A04 = num;
        C1pq.A08("colorScheme", migColorScheme);
        this.A03 = migColorScheme;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MigComposerColorTheme)) {
                return false;
            }
            MigComposerColorTheme migComposerColorTheme = (MigComposerColorTheme) obj;
            if (!11T.A0O(this.A04, migComposerColorTheme.A04) || !11T.A0O(this.A03, migComposerColorTheme.A03) || this.A00 != migComposerColorTheme.A00 || this.A01 != migComposerColorTheme.A01 || this.A02 != migComposerColorTheme.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((C1pq.A04(this.A03, C1pq.A03(this.A04)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        Integer num = this.A04;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
