package com.facebook.messaging.business.search.model;

import X.AbJ;
import X.AnonymousClass001;
import X.B47;
import X.CBP;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;

/* loaded from: PlatformSearchUserData.class */
public final class PlatformSearchUserData extends PlatformSearchData {
    public static final Parcelable.Creator CREATOR = CSW.A00(45);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public PlatformSearchUserData(B47 b47) {
        super(b47);
        Preconditions.checkNotNull(b47.A04, "User id can't be null");
        this.A04 = b47.A04;
        this.A05 = b47.A05;
        this.A00 = b47.A00;
        this.A02 = b47.A02;
        this.A01 = b47.A01;
        this.A07 = b47.A07;
        this.A06 = b47.A06;
        this.A03 = b47.A03;
    }

    public PlatformSearchUserData(Parcel parcel) {
        super(parcel);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        String readString = parcel.readString();
        Integer num = null;
        if (readString != null) {
            try {
                num = CBP.A00(readString);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.A00 = num;
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A07 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A06 = AbJ.A1W(parcel);
        this.A03 = parcel.readString();
    }

    @Override // com.facebook.messaging.business.search.model.PlatformSearchData, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        Integer num = this.A00;
        parcel.writeString(num == null ? null : CBP.A01(num));
        parcel.writeString(this.A02);
        parcel.writeString(super.A03);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A03);
    }
}
