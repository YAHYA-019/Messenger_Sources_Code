package com.facebook.ipc.composer.model;

import X.11T;
import X.7zU;
import X.AbstractC00603o4;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerGetGiftCardPurchasesModel.class */
public final class ComposerGetGiftCardPurchasesModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(21);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ComposerGetGiftCardPurchasesModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public ComposerGetGiftCardPurchasesModel(String str, String str2, String str3, String str4) {
        C1pq.A08("photoFbid", str);
        this.A00 = str;
        C1pq.A08(AbstractC00603o4.A00(276), str2);
        this.A01 = str2;
        C1pq.A08("ref", str3);
        this.A02 = str3;
        C1pq.A08("website", str4);
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerGetGiftCardPurchasesModel)) {
                return false;
            }
            ComposerGetGiftCardPurchasesModel composerGetGiftCardPurchasesModel = (ComposerGetGiftCardPurchasesModel) obj;
            if (!11T.A0O(this.A00, composerGetGiftCardPurchasesModel.A00) || !11T.A0O(this.A01, composerGetGiftCardPurchasesModel.A01) || !11T.A0O(this.A02, composerGetGiftCardPurchasesModel.A02) || !11T.A0O(this.A03, composerGetGiftCardPurchasesModel.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
