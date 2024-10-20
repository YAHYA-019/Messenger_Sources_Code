package com.facebook.messaging.polling.datamodels;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import X.DKH;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: PollingPublishedOption.class */
public final class PollingPublishedOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(18);
    public final int A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public PollingPublishedOption(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A03 = DKH.A0l(parcel);
        int i = 0;
        this.A06 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A07 = AbJ.A1V(parcel);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A01 = ImmutableList.copyOf(strArr);
        this.A00 = parcel.readInt();
        int readInt2 = parcel.readInt();
        Uri[] uriArr = new Uri[readInt2];
        while (i < readInt2) {
            i = AbI.A01(parcel, A0e, uriArr, i);
        }
        this.A02 = ImmutableList.copyOf(uriArr);
    }

    public PollingPublishedOption(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.A03 = str;
        this.A06 = z;
        this.A07 = z2;
        C1pq.A08("optionId", str2);
        this.A04 = str2;
        C1pq.A08("optionText", str3);
        this.A05 = str3;
        C1pq.A08("voterIds", immutableList);
        this.A01 = immutableList;
        this.A00 = i;
        C1pq.A08("voterUri", immutableList2);
        this.A02 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollingPublishedOption)) {
                return false;
            }
            PollingPublishedOption pollingPublishedOption = (PollingPublishedOption) obj;
            if (!11T.A0O(this.A03, pollingPublishedOption.A03) || this.A06 != pollingPublishedOption.A06 || this.A07 != pollingPublishedOption.A07 || !11T.A0O(this.A04, pollingPublishedOption.A04) || !11T.A0O(this.A05, pollingPublishedOption.A05) || !11T.A0O(this.A01, pollingPublishedOption.A01) || this.A00 != pollingPublishedOption.A00 || !11T.A0O(this.A02, pollingPublishedOption.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, (C1pq.A04(this.A01, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02(C1pq.A02(C1pq.A03(this.A03), this.A06), this.A07)))) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A03);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeInt(this.A00);
        1Du A0b2 = 1BL.A0b(parcel, this.A02);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((Uri) A0b2.next(), i);
        }
    }
}
