package com.facebook.messaging.model.threads;

import X.0S2;
import X.11T;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: NotificationSetting.class */
public final class NotificationSetting implements Parcelable {
    public final long A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public static final NotificationSetting A06 = new NotificationSetting(0, true, false, false);
    public static final NotificationSetting A05 = new NotificationSetting(0, false, false, false);
    public static final NotificationSetting A04 = new NotificationSetting(0, true, false, true);
    public static final Parcelable.Creator CREATOR = new C2xc(32);

    public NotificationSetting(long j, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A00 = j;
        this.A01 = z2;
        this.A02 = z3;
    }

    public NotificationSetting(Parcel parcel) {
        boolean z = true;
        this.A03 = parcel.readInt() != 0;
        this.A00 = parcel.readLong();
        this.A01 = parcel.readInt() != 0;
        this.A02 = parcel.readInt() == 0 ? false : z;
    }

    public final long A00() {
        return this.A03 ? this.A02 ? -2 : this.A00 : -1;
    }

    public final Integer A01() {
        return !this.A03 ? 0S2.A01 : this.A00 > System.currentTimeMillis() / 1000 ? 0S2.A0C : 0S2.A00;
    }

    public final boolean A02() {
        boolean z = false;
        if (A01() == 0S2.A00) {
            z = true;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
                return false;
            }
            NotificationSetting notificationSetting = (NotificationSetting) obj;
            if (this.A01 != notificationSetting.A01 || this.A03 != notificationSetting.A03 || this.A00 != notificationSetting.A00) {
                return false;
            }
            if (this.A02 != notificationSetting.A02) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = (this.A03 ? 1 : 0) * 31;
        long j = this.A00;
        return ((((i + ((int) (j ^ (j >>> 32)))) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("enabled", this.A03);
        stringHelper.add("mutedUntilSeconds", this.A00);
        stringHelper.add("automaticallyMuted", this.A01);
        stringHelper.add("chatheadDisabled", this.A02);
        return 11T.A02(stringHelper);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
