package com.facebook.messaging.communitymessaging.plugins.takedowns.bottomsheet;

import X.11T;
import X.1BL;
import X.7zL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ChatTakedownBottomSheetModel.class */
public final class ChatTakedownBottomSheetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(9);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public ChatTakedownBottomSheetModel(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = AbN.A1U(parcel);
        this.A03 = parcel.readString();
        this.A04 = C3o5.A0O(parcel);
    }

    public ChatTakedownBottomSheetModel(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A05 = z;
        C1pq.A08("threadId", str4);
        this.A03 = str4;
        this.A04 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChatTakedownBottomSheetModel)) {
                return false;
            }
            ChatTakedownBottomSheetModel chatTakedownBottomSheetModel = (ChatTakedownBottomSheetModel) obj;
            if (!11T.A0O(this.A00, chatTakedownBottomSheetModel.A00) || !11T.A0O(this.A01, chatTakedownBottomSheetModel.A01) || !11T.A0O(this.A02, chatTakedownBottomSheetModel.A02) || this.A05 != chatTakedownBottomSheetModel.A05 || !11T.A0O(this.A03, chatTakedownBottomSheetModel.A03) || !11T.A0O(this.A04, chatTakedownBottomSheetModel.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))), this.A05)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
        1BL.A13(parcel, this.A04);
    }
}
