package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerPublishJobPostData.class */
public final class ComposerPublishJobPostData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(62);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public ComposerPublishJobPostData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A07 = 4YV.A1U(parcel.readInt());
        int readInt = parcel.readInt();
        ComposerPublishJobPostCrosspostLocationData[] composerPublishJobPostCrosspostLocationDataArr = new ComposerPublishJobPostCrosspostLocationData[readInt];
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, composerPublishJobPostCrosspostLocationDataArr, i);
        }
        this.A00 = ImmutableList.copyOf(composerPublishJobPostCrosspostLocationDataArr);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A05 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A06 = C3o5.A0O(parcel);
    }

    public ComposerPublishJobPostData(ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A07 = z;
        C1pq.A08("crosspostLocations", immutableList);
        this.A00 = immutableList;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerPublishJobPostData)) {
                return false;
            }
            ComposerPublishJobPostData composerPublishJobPostData = (ComposerPublishJobPostData) obj;
            if (this.A07 != composerPublishJobPostData.A07 || !11T.A0O(this.A00, composerPublishJobPostData.A00) || !11T.A0O(this.A01, composerPublishJobPostData.A01) || !11T.A0O(this.A02, composerPublishJobPostData.A02) || !11T.A0O(this.A03, composerPublishJobPostData.A03) || !11T.A0O(this.A04, composerPublishJobPostData.A04) || !11T.A0O(this.A05, composerPublishJobPostData.A05) || !11T.A0O(this.A06, composerPublishJobPostData.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A05(this.A07))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A07 ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ComposerPublishJobPostCrosspostLocationData) A0b.next(), i);
        }
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
    }
}
