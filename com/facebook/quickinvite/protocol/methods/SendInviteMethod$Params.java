package com.facebook.quickinvite.protocol.methods;

import X.0S2;
import X.AnonymousClass001;
import X.FKW;
import X.Fh5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* loaded from: SendInviteMethod$Params.class */
public final class SendInviteMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(72);
    public final ImmutableMap A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public SendInviteMethod$Params(Parcel parcel) {
        String readString = parcel.readString();
        if (!readString.equals("MESSENGER")) {
            throw AnonymousClass001.A0L(readString);
        }
        this.A01 = 0S2.A00;
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = ImmutableMap.copyOf((Map) parcel.readHashMap(Fh5.class.getClassLoader()));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("MESSENGER");
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeMap(this.A00);
    }
}
