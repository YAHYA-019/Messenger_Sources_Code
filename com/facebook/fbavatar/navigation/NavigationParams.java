package com.facebook.fbavatar.navigation;

import X.11T;
import X.1BM;
import X.4YW;
import X.7zU;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.DKH;
import X.FKX;
import X.RZK;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NavigationParams.class */
public final class NavigationParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(73);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public NavigationParams(RZK rzk) {
        String str = rzk.A00;
        C1pq.A08("initialCategoryId", str);
        this.A00 = str;
        this.A05 = rzk.A05;
        String str2 = rzk.A01;
        C1pq.A08("onLaunchNavigateTo", str2);
        this.A01 = str2;
        String str3 = rzk.A02;
        C1pq.A08("onLaunchNavigationData", str3);
        this.A02 = str3;
        String str4 = rzk.A03;
        C1pq.A08("postSaveShareOption", str4);
        this.A03 = str4;
        this.A04 = rzk.A04;
        this.A06 = rzk.A06;
        this.A07 = rzk.A07;
    }

    public NavigationParams(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = DKH.A0l(parcel);
        this.A06 = 1BM.A07(parcel);
        this.A07 = AbJ.A1W(parcel);
    }

    public NavigationParams(String str, String str2, String str3) {
        this.A00 = str;
        this.A05 = false;
        this.A01 = "";
        this.A02 = "";
        this.A03 = str2;
        this.A04 = str3;
        this.A06 = false;
        this.A07 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof NavigationParams)) {
                return false;
            }
            NavigationParams navigationParams = (NavigationParams) obj;
            if (!11T.A0O(this.A00, navigationParams.A00) || this.A05 != navigationParams.A05 || !11T.A0O(this.A01, navigationParams.A01) || !11T.A0O(this.A02, navigationParams.A02) || !11T.A0O(this.A03, navigationParams.A03) || !11T.A0O(this.A04, navigationParams.A04) || this.A06 != navigationParams.A06 || this.A07 != navigationParams.A07) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C1pq.A03(this.A00), this.A05))))), this.A06), this.A07);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        4YW.A0E(parcel, this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
    }
}
