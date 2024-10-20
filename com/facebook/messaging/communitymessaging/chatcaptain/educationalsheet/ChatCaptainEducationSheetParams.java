package com.facebook.messaging.communitymessaging.chatcaptain.educationalsheet;

import X.11T;
import X.1BK;
import X.4YV;
import X.AnonymousClass002;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ChatCaptainEducationSheetParams.class */
public final class ChatCaptainEducationSheetParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(61);
    public final long A00;
    public final long A01;
    public final ThreadKey A02;
    public final String A03;

    public ChatCaptainEducationSheetParams(ThreadKey threadKey, String str, long j, long j2) {
        1BK.A1K(str, 1, threadKey);
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChatCaptainEducationSheetParams)) {
                return false;
            }
            ChatCaptainEducationSheetParams chatCaptainEducationSheetParams = (ChatCaptainEducationSheetParams) obj;
            if (!11T.A0O(this.A03, chatCaptainEducationSheetParams.A03) || this.A01 != chatCaptainEducationSheetParams.A01 || this.A00 != chatCaptainEducationSheetParams.A00 || !11T.A0O(this.A02, chatCaptainEducationSheetParams.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, AnonymousClass002.A02(this.A00, AnonymousClass002.A02(this.A01, 4YV.A02(this.A03))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeParcelable(this.A02, i);
    }
}
