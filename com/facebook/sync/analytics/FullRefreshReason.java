package com.facebook.sync.analytics;

import X.0Pz;
import X.1JF;
import X.BLg;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FullRefreshReason.class */
public final class FullRefreshReason implements Parcelable {
    public final BLg A00;
    public final String A01;
    public static final FullRefreshReason A06 = new FullRefreshReason(BLg.A08, null);
    public static final FullRefreshReason A05 = new FullRefreshReason(BLg.A07, null);
    public static final FullRefreshReason A03 = new FullRefreshReason(BLg.A03, null);
    public static final FullRefreshReason A08 = new FullRefreshReason(BLg.A0C, null);
    public static final FullRefreshReason A07 = new FullRefreshReason(BLg.A0A, null);
    public static final FullRefreshReason A04 = new FullRefreshReason(BLg.A06, null);
    public static final FullRefreshReason A02 = new FullRefreshReason(BLg.A01, "force full refresh after app exits High Messages Per Second mode");
    public static final Parcelable.Creator CREATOR = new FKe(75);

    public FullRefreshReason(BLg bLg, String str) {
        this.A00 = bLg;
        this.A01 = str;
    }

    public FullRefreshReason(Parcel parcel) {
        this.A00 = parcel.readSerializable();
        this.A01 = parcel.readString();
    }

    public static FullRefreshReason A00(String str) {
        if (!1JF.A0B(str)) {
            String[] split = str.split(":", 2);
            if (split.length == 2) {
                try {
                    return new FullRefreshReason(BLg.valueOf(split[0]), split[1]);
                } catch (Exception unused) {
                    return A04;
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String A0W = 0Pz.A0W(this.A00.toString(), ":");
        String str = this.A01;
        if (str != null) {
            A0W = 0Pz.A0W(A0W, str);
        }
        return A0W;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A01);
    }
}
