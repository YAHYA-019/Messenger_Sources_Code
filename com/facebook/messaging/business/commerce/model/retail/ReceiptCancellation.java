package com.facebook.messaging.business.commerce.model.retail;

import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.C0ty;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.attachments.generic.model.PlatformGenericAttachmentItem;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: ReceiptCancellation.class */
public final class ReceiptCancellation implements CommerceBubbleModel {
    public static final Parcelable.Creator CREATOR = CSW.A00(18);
    public final int A00;
    public final Receipt A01;
    public final ImmutableList A02;
    public final String A03;
    public final Integer A04 = 0S2.A0C;

    public ReceiptCancellation(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw 1BK.A0h();
        }
        this.A03 = readString;
        this.A01 = (Receipt) 1BL.A0C(parcel, Receipt.class);
        this.A00 = parcel.readInt();
        RandomAccess A0y = 4YV.A0y(parcel, PlatformGenericAttachmentItem.class);
        this.A02 = 1BL.A0a((Collection) ((!(A0y instanceof List) || A0y == null) ? C0ty.A00 : A0y));
    }

    public ReceiptCancellation(Receipt receipt, String str, List list, int i) {
        this.A03 = str == null ? "" : str;
        this.A01 = receipt;
        this.A00 = i;
        this.A02 = 1BL.A0a(list == null ? C0ty.A00 : list);
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public ImmutableList AsZ() {
        return this.A02;
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public Integer BHe() {
        return this.A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public String getId() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A02);
    }
}
