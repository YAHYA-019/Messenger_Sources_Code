package com.facebook.messaging.notify.survey.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass002;
import X.C04v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessagingNotificationSurveyData.class */
public final class MessagingNotificationSurveyData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CST(91);
    public boolean A00;
    public boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public MessagingNotificationSurveyData(String str, String str2, String str3, boolean z, boolean z2) {
        1BL.A1F(str, str2);
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = z;
        this.A01 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessagingNotificationSurveyData)) {
                return false;
            }
            MessagingNotificationSurveyData messagingNotificationSurveyData = (MessagingNotificationSurveyData) obj;
            if (!11T.A0O(this.A04, messagingNotificationSurveyData.A04) || !11T.A0O(this.A02, messagingNotificationSurveyData.A02) || !11T.A0O(this.A03, messagingNotificationSurveyData.A03) || this.A00 != messagingNotificationSurveyData.A00 || this.A01 != messagingNotificationSurveyData.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A07(this.A02, 4YV.A02(this.A04)) + 1BL.A05(this.A03)) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
