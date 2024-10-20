package com.facebook.messaging.sharing.contentdiscovery.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zO;
import X.AbF;
import X.AbI;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* loaded from: LifeEvent.class */
public final class LifeEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(67);
    public final int A00;
    public final int A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final ImmutableList A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public LifeEvent(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A00 = parcel.readInt();
        this.A06 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            int readInt = parcel.readInt();
            Integer[] numArr = new Integer[readInt];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= readInt) {
                    break;
                }
                numArr[i2] = AbI.A0z(parcel);
                i = i2 + 1;
            }
            this.A0C = ImmutableList.copyOf(numArr);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = 7zO.A0j(parcel);
        }
        this.A01 = parcel.readInt();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0F = C3o5.A0O(parcel);
        this.A0B = parcel.readString();
    }

    public LifeEvent(ImmutableList immutableList, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2) {
        this.A04 = str;
        this.A05 = str2;
        this.A0D = str3;
        this.A00 = i;
        C1pq.A08("contextLine", str4);
        this.A06 = str4;
        this.A0C = immutableList;
        this.A0E = str5;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str6);
        this.A07 = str6;
        this.A02 = l;
        this.A03 = l2;
        this.A01 = i2;
        AbF.A1T(str7);
        this.A08 = str7;
        C1pq.A08("profilePicUrl", str8);
        this.A09 = str8;
        this.A0A = str9;
        this.A0F = str10;
        C1pq.A08("userId", str11);
        this.A0B = str11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LifeEvent)) {
                return false;
            }
            LifeEvent lifeEvent = (LifeEvent) obj;
            if (!11T.A0O(this.A04, lifeEvent.A04) || !11T.A0O(this.A05, lifeEvent.A05) || !11T.A0O(this.A0D, lifeEvent.A0D) || this.A00 != lifeEvent.A00 || !11T.A0O(this.A06, lifeEvent.A06) || !11T.A0O(this.A0C, lifeEvent.A0C) || !11T.A0O(this.A0E, lifeEvent.A0E) || !11T.A0O(this.A07, lifeEvent.A07) || !11T.A0O(this.A02, lifeEvent.A02) || !11T.A0O(this.A03, lifeEvent.A03) || this.A01 != lifeEvent.A01 || !11T.A0O(this.A08, lifeEvent.A08) || !11T.A0O(this.A09, lifeEvent.A09) || !11T.A0O(this.A0A, lifeEvent.A0A) || !11T.A0O(this.A0F, lifeEvent.A0F) || !11T.A0O(this.A0B, lifeEvent.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0B, C1pq.A04(this.A0F, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, (C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A07, C1pq.A04(this.A0E, C1pq.A04(this.A0C, C1pq.A04(this.A06, (C1pq.A04(this.A0D, C1pq.A04(this.A05, C1pq.A03(this.A04))) * 31) + this.A00)))))) * 31) + this.A01)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A0D);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        ImmutableList immutableList = this.A0C;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeInt(AnonymousClass001.A03(A0Y.next()));
            }
        }
        1BL.A13(parcel, this.A0E);
        parcel.writeString(this.A07);
        C3o5.A0g(parcel, this.A02);
        C3o5.A0g(parcel, this.A03);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0F);
        parcel.writeString(this.A0B);
    }
}
