package com.facebook.iabeventlogging.model;

import X.DKB;
import X.FKf;
import X.KOk;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;

/* loaded from: IABEvent.class */
public abstract class IABEvent implements Parcelable {
    public static final IABEmptyEvent A04 = new IABEmptyEvent();
    public static final Parcelable.Creator CREATOR = new FKf(14);
    public final long A00;
    public final long A01;
    public final KOk A02;
    public final String A03;

    public IABEvent(KOk kOk, String str, long j, long j2) {
        this.A02 = kOk;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    public static void A01(IABEvent iABEvent, StringBuilder sb, char c) {
        sb.append(", type=");
        sb.append(iABEvent.A02);
        sb.append(DKB.A00(ActionId.APPLY_FINISHED_LIST));
        sb.append(iABEvent.A03);
        sb.append(c);
        sb.append(", eventTs=");
        sb.append(iABEvent.A01);
        sb.append(", createdAtTs=");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02.value);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
