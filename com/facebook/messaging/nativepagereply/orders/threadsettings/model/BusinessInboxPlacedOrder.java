package com.facebook.messaging.nativepagereply.orders.threadsettings.model;

import X.11T;
import X.1BJ;
import X.1BL;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;

/* loaded from: BusinessInboxPlacedOrder.class */
public final class BusinessInboxPlacedOrder implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(45);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public BusinessInboxPlacedOrder(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C1pq.A08("description", str);
        this.A01 = str;
        this.A02 = str2;
        C1pq.A08("invoiceId", str3);
        this.A03 = str3;
        C1pq.A08("orderBehavior", str4);
        this.A04 = str4;
        this.A05 = str5;
        C1pq.A08("status", str6);
        this.A06 = str6;
        this.A00 = j;
        this.A07 = str7;
    }

    public BusinessInboxPlacedOrder(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A06 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A07 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BusinessInboxPlacedOrder)) {
                return false;
            }
            BusinessInboxPlacedOrder businessInboxPlacedOrder = (BusinessInboxPlacedOrder) obj;
            if (!11T.A0O(this.A01, businessInboxPlacedOrder.A01) || !11T.A0O(this.A02, businessInboxPlacedOrder.A02) || !11T.A0O(this.A03, businessInboxPlacedOrder.A03) || !11T.A0O(this.A04, businessInboxPlacedOrder.A04) || !11T.A0O(this.A05, businessInboxPlacedOrder.A05) || !11T.A0O(this.A06, businessInboxPlacedOrder.A06) || this.A00 != businessInboxPlacedOrder.A00 || !11T.A0O(this.A07, businessInboxPlacedOrder.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A01(C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01)))))), this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BusinessInboxPlacedOrder{description=");
        A0k.append(this.A01);
        A0k.append(", formattedAmount=");
        A0k.append(this.A02);
        A0k.append(", invoiceId=");
        A0k.append(this.A03);
        A0k.append(", orderBehavior=");
        A0k.append(this.A04);
        A0k.append(", orderUrl=");
        A0k.append(this.A05);
        A0k.append(", status=");
        A0k.append(this.A06);
        A0k.append(1BJ.A00(ActionId.VIDEO_SET_RENDERER_CONTEXT));
        A0k.append(this.A00);
        A0k.append(", uri=");
        A0k.append(this.A07);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A00);
        1BL.A13(parcel, this.A07);
    }
}
