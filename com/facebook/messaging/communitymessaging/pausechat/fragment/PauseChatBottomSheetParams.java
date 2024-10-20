package com.facebook.messaging.communitymessaging.pausechat.fragment;

import X.11T;
import X.1BL;
import X.7zL;
import X.7zM;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PauseChatBottomSheetParams.class */
public final class PauseChatBottomSheetParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(4);
    public final long A00;
    public final ThreadKey A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public PauseChatBottomSheetParams(ThreadKey threadKey, String str, String str2, String str3, long j) {
        1BL.A1H(threadKey, str, str2);
        11T.A0F(str3, 5);
        this.A01 = threadKey;
        this.A04 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PauseChatBottomSheetParams)) {
                return false;
            }
            PauseChatBottomSheetParams pauseChatBottomSheetParams = (PauseChatBottomSheetParams) obj;
            if (!11T.A0O(this.A01, pauseChatBottomSheetParams.A01) || !11T.A0O(this.A04, pauseChatBottomSheetParams.A04) || !11T.A0O(this.A02, pauseChatBottomSheetParams.A02) || this.A00 != pauseChatBottomSheetParams.A00 || !11T.A0O(this.A03, pauseChatBottomSheetParams.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A03, AnonymousClass002.A02(this.A00, AnonymousClass002.A07(this.A02, AnonymousClass002.A07(this.A04, 1BL.A03(this.A01)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A03);
    }
}
