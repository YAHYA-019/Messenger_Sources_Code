package com.facebook.messaging.rollcall.extension;

import X.11T;
import X.1BL;
import X.4YU;
import X.AnonymousClass001;
import X.BMJ;
import X.C04v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.UserKey;

/* loaded from: CreatePromptExtensionParams.class */
public final class CreatePromptExtensionParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(43);
    public final Message A00;
    public final ThreadKey A01;
    public final BMJ A02;
    public final MediaResource A03;
    public final UserKey A04;
    public final Integer A05;
    public final String A06;

    public CreatePromptExtensionParams(Message message, ThreadKey threadKey, BMJ bmj, MediaResource mediaResource, UserKey userKey, Integer num, String str) {
        11T.A0F(threadKey, 1);
        this.A01 = threadKey;
        this.A05 = num;
        this.A06 = str;
        this.A03 = mediaResource;
        this.A04 = userKey;
        this.A00 = message;
        this.A02 = bmj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreatePromptExtensionParams)) {
                return false;
            }
            CreatePromptExtensionParams createPromptExtensionParams = (CreatePromptExtensionParams) obj;
            if (!11T.A0O(this.A01, createPromptExtensionParams.A01) || this.A05 != createPromptExtensionParams.A05 || !11T.A0O(this.A06, createPromptExtensionParams.A06) || !11T.A0O(this.A03, createPromptExtensionParams.A03) || !11T.A0O(this.A04, createPromptExtensionParams.A04) || !11T.A0O(this.A00, createPromptExtensionParams.A00) || this.A02 != createPromptExtensionParams.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A03 = 1BL.A03(this.A01);
        Integer num = this.A05;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            hashCode = (1 != intValue ? "TEXT" : "MEDIA").hashCode() + intValue;
        }
        return ((((((((((A03 + hashCode) * 31) + 1BL.A05(this.A06)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 4YU.A03(this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        Integer num = this.A05;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(1 - num.intValue() != 0 ? "TEXT" : "MEDIA");
        }
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A00, i);
        BMJ bmj = this.A02;
        if (bmj == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, bmj);
        }
    }
}
