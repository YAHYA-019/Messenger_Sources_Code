package com.facebook.messaging.threadview.notificationbanner.model.animated;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zO;
import X.AbF;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AnimatedThreadActivityBannerSingleViewModel.class */
public final class AnimatedThreadActivityBannerSingleViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(80);
    public final AnimatedThreadActivityBannerButtonModel A00;
    public final Long A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public AnimatedThreadActivityBannerSingleViewModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (AnimatedThreadActivityBannerButtonModel) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = 7zO.A0j(parcel);
        }
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A0A = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = AbN.A0h(parcel);
    }

    public AnimatedThreadActivityBannerSingleViewModel(AnimatedThreadActivityBannerButtonModel animatedThreadActivityBannerButtonModel, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A04 = str;
        this.A00 = animatedThreadActivityBannerButtonModel;
        this.A01 = l;
        this.A05 = str2;
        this.A02 = l2;
        C1pq.A08("iconUri", str3);
        this.A06 = str3;
        AbF.A1T(str4);
        this.A07 = str4;
        AbF.A1U(str5);
        this.A08 = str5;
        this.A09 = str6;
        this.A0A = str7;
        this.A03 = l3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnimatedThreadActivityBannerSingleViewModel)) {
                return false;
            }
            AnimatedThreadActivityBannerSingleViewModel animatedThreadActivityBannerSingleViewModel = (AnimatedThreadActivityBannerSingleViewModel) obj;
            if (!11T.A0O(this.A04, animatedThreadActivityBannerSingleViewModel.A04) || !11T.A0O(this.A00, animatedThreadActivityBannerSingleViewModel.A00) || !11T.A0O(this.A01, animatedThreadActivityBannerSingleViewModel.A01) || !11T.A0O(this.A05, animatedThreadActivityBannerSingleViewModel.A05) || !11T.A0O(this.A02, animatedThreadActivityBannerSingleViewModel.A02) || !11T.A0O(this.A06, animatedThreadActivityBannerSingleViewModel.A06) || !11T.A0O(this.A07, animatedThreadActivityBannerSingleViewModel.A07) || !11T.A0O(this.A08, animatedThreadActivityBannerSingleViewModel.A08) || !11T.A0O(this.A09, animatedThreadActivityBannerSingleViewModel.A09) || !11T.A0O(this.A0A, animatedThreadActivityBannerSingleViewModel.A0A) || !11T.A0O(this.A03, animatedThreadActivityBannerSingleViewModel.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A02, C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(this.A04)))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0g(parcel, this.A01);
        1BL.A13(parcel, this.A05);
        C3o5.A0g(parcel, this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        C3o5.A0g(parcel, this.A03);
    }
}
