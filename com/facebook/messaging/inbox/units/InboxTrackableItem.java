package com.facebook.messaging.inbox.units;

import X.11T;
import X.2hJ;
import X.2hL;
import X.AnonymousClass001;
import X.C1ps;
import X.C2xc;
import X.C53v;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: InboxTrackableItem.class */
public final class InboxTrackableItem implements Parcelable, C1ps {
    public static final Parcelable.Creator CREATOR = new C2xc(20);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final long A04;
    public final Bundle A05;
    public final 2hJ A06;
    public final InboxLoggingExtra A07;
    public final ImmutableMap A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public InboxTrackableItem(2hL r302) {
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = -1;
        this.A00 = -1;
        Long l = r302.A05;
        if (l == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = l.longValue();
        String str = r302.A08;
        if (str == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0B = str;
        String str2 = r302.A07;
        if (str2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0A = str2;
        String str3 = r302.A0A;
        if (str3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0D = str3;
        2hJ r0 = r302.A01;
        if (r0 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A06 = r0;
        this.A0C = r302.A09;
        this.A09 = r302.A06;
        ImmutableMap immutableMap = r302.A03;
        if (immutableMap == null) {
            immutableMap = RegularImmutableMap.A03;
            11T.A0A(immutableMap);
        }
        this.A08 = immutableMap;
        this.A05 = r302.A00;
        Boolean bool = r302.A04;
        if (bool == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0E = bool.booleanValue();
        this.A07 = r302.A02;
    }

    public InboxTrackableItem(Parcel parcel) {
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = -1;
        this.A00 = -1;
        this.A04 = parcel.readLong();
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A0B = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A0A = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A0D = readString3;
        2hJ readSerializable = parcel.readSerializable();
        if (readSerializable == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A06 = readSerializable;
        this.A0C = parcel.readString();
        this.A09 = parcel.readString();
        ImmutableMap A05 = C53v.A05(parcel);
        11T.A0A(A05);
        this.A08 = A05;
        this.A05 = parcel.readBundle(InboxTrackableItem.class.getClassLoader());
        this.A0E = C53v.A0S(parcel);
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = (InboxLoggingExtra) parcel.readParcelable(InboxLoggingExtra.class.getClassLoader());
    }

    @Override // X.C1ps
    public long AsR() {
        return this.A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0D);
        parcel.writeSerializable(this.A06);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeMap(this.A08);
        parcel.writeBundle(this.A05);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A07, i);
    }
}
