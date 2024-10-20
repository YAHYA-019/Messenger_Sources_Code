package com.facebook.xapp.messaging.threadview.theme.custom.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ThreadThemePayload.class */
public final class ThreadThemePayload implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(73);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public ThreadThemePayload(long j, String str, long j2, String str2) {
        this.A00 = j;
        C1pq.A08("key", str);
        this.A02 = str;
        this.A01 = j2;
        C1pq.A08("value", str2);
        this.A03 = str2;
    }

    public ThreadThemePayload(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadThemePayload)) {
                return false;
            }
            ThreadThemePayload threadThemePayload = (ThreadThemePayload) obj;
            if (this.A00 != threadThemePayload.A00 || !11T.A0O(this.A02, threadThemePayload.A02) || this.A01 != threadThemePayload.A01 || !11T.A0O(this.A03, threadThemePayload.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A01(C1pq.A04(this.A02, 1BL.A01(this.A00) + 31), this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A03);
    }
}
