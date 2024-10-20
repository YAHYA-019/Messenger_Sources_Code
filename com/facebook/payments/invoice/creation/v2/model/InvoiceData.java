package com.facebook.payments.invoice.creation.v2.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: InvoiceData.class */
public final class InvoiceData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(57);
    public final ViewerContext A00;
    public final ThreadKey A01;
    public final SourcedImagesData A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public InvoiceData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        ImageData[] imageDataArr = new ImageData[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, imageDataArr, i);
        }
        this.A03 = ImmutableList.copyOf(imageDataArr);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        ViewerContext viewerContext = null;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A08 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (SourcedImagesData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? (ViewerContext) ViewerContext.CREATOR.createFromParcel(parcel) : viewerContext;
    }

    public InvoiceData(ViewerContext viewerContext, ThreadKey threadKey, SourcedImagesData sourcedImagesData, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6) {
        C1pq.A08("attachments", immutableList);
        this.A03 = immutableList;
        C1pq.A08("buyerId", str);
        this.A04 = str;
        this.A05 = "THB";
        this.A06 = str2;
        this.A07 = null;
        C1pq.A08("invoiceType", str3);
        this.A08 = str3;
        this.A09 = str4;
        C1pq.A08("sellerId", str5);
        this.A0A = str5;
        C1pq.A08("sessionID", str6);
        this.A0B = str6;
        this.A02 = sourcedImagesData;
        this.A01 = threadKey;
        this.A0C = null;
        this.A00 = viewerContext;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InvoiceData)) {
                return false;
            }
            InvoiceData invoiceData = (InvoiceData) obj;
            if (!11T.A0O(this.A03, invoiceData.A03) || !11T.A0O(this.A04, invoiceData.A04) || !11T.A0O(this.A05, invoiceData.A05) || !11T.A0O(this.A06, invoiceData.A06) || !11T.A0O(this.A07, invoiceData.A07) || !11T.A0O(this.A08, invoiceData.A08) || !11T.A0O(this.A09, invoiceData.A09) || !11T.A0O(this.A0A, invoiceData.A0A) || !11T.A0O(this.A0B, invoiceData.A0B) || !11T.A0O(this.A02, invoiceData.A02) || !11T.A0O(this.A01, invoiceData.A01) || !11T.A0O(this.A0C, invoiceData.A0C) || !11T.A0O(this.A00, invoiceData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A0C, C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A03(this.A03)))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A03);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ImageData) A0b.next(), i);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeString(this.A08);
        1BL.A13(parcel, this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        C3o5.A0d(parcel, this.A02, i);
        ThreadKey threadKey = this.A01;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0C);
        ViewerContext viewerContext = this.A00;
        if (viewerContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            viewerContext.writeToParcel(parcel, i);
        }
    }
}
