package com.facebook.xapp.messaging.aibot.feedback.model;

import X.11T;
import X.4YV;
import X.7zU;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: AiBotFeedbackParams.class */
public final class AiBotFeedbackParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(43);
    public final Integer A00;
    public final String A01;

    public AiBotFeedbackParams(String str, Integer num) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = num;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MESSAGE_MENU";
            case 2:
                return "IMAGINED_FOR_YOU";
            case 3:
                return "WRITE_WITH_AI";
            case 4:
                return "MSGR_UNIVERSAL_SEARCH";
            case 5:
                return "MEMORY";
            case 6:
                return OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
            default:
                return "INLINE_FEEDBACK";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AiBotFeedbackParams)) {
                return false;
            }
            AiBotFeedbackParams aiBotFeedbackParams = (AiBotFeedbackParams) obj;
            if (!11T.A0O(this.A01, aiBotFeedbackParams.A01) || this.A00 != aiBotFeedbackParams.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = 4YV.A02(this.A01);
        Integer num = this.A00;
        return A02 + (num == null ? 0 : 7zU.A02(num, A00(num)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(A00(num));
        }
    }
}
