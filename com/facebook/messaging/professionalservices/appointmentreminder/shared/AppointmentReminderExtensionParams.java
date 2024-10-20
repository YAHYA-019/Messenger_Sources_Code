package com.facebook.messaging.professionalservices.appointmentreminder.shared;

import X.1BL;
import X.AnonymousClass001;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AppointmentReminderExtensionParams.class */
public final class AppointmentReminderExtensionParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(22);
    public final int A00;
    public final long A01;
    public final ThreadKey A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public AppointmentReminderExtensionParams(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A02 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        boolean z = false;
        this.A07 = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.A08 = parcel.readByte() == 1 ? true : z;
        this.A06 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
    }

    public AppointmentReminderExtensionParams(ThreadKey threadKey, String str, String str2, int i, long j) {
        this.A01 = j;
        this.A02 = threadKey;
        this.A07 = true;
        this.A08 = false;
        this.A06 = str2;
        this.A03 = str;
        this.A00 = i;
        this.A04 = null;
        this.A05 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeParcelable(this.A02, i);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }
}
