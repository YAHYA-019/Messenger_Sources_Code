package com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model;

import X.11T;
import X.1BK;
import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ReachabilitySettingsData.class */
public final class ReachabilitySettingsData implements Parcelable {
    public static ReachabilitySettingsData A03 = new ReachabilitySettingsData(1BK.A0b(), 1BK.A0b(), "");
    public static final Parcelable.Creator CREATOR = new FKY(1);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;

    public ReachabilitySettingsData(Parcel parcel) {
        ImmutableList A04 = C53v.A04(parcel, ReachabilitySection.class);
        this.A00 = A04 == null ? 1BK.A0b() : A04;
        ImmutableList A042 = C53v.A04(parcel, ReachabilitySetting.class);
        this.A01 = A042 == null ? 1BK.A0b() : A042;
        String readString = parcel.readString();
        this.A02 = readString == null ? "" : readString;
    }

    public ReachabilitySettingsData(ImmutableList immutableList, ImmutableList immutableList2, String str) {
        this.A00 = immutableList;
        this.A01 = immutableList2;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeList(this.A00);
        parcel.writeList(this.A01);
        parcel.writeString(this.A02);
    }
}
