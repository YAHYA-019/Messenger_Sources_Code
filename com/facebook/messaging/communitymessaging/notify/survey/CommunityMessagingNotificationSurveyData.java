package com.facebook.messaging.communitymessaging.notify.survey;

import X.11T;
import X.4YV;
import X.7zL;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityMessagingNotificationSurveyData.class */
public final class CommunityMessagingNotificationSurveyData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(3);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final String A06;

    public CommunityMessagingNotificationSurveyData(String str, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        11T.A0F(str, 1);
        this.A06 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityMessagingNotificationSurveyData)) {
                return false;
            }
            CommunityMessagingNotificationSurveyData communityMessagingNotificationSurveyData = (CommunityMessagingNotificationSurveyData) obj;
            if (!11T.A0O(this.A06, communityMessagingNotificationSurveyData.A06) || this.A04 != communityMessagingNotificationSurveyData.A04 || this.A05 != communityMessagingNotificationSurveyData.A05 || this.A03 != communityMessagingNotificationSurveyData.A03 || this.A01 != communityMessagingNotificationSurveyData.A01 || this.A00 != communityMessagingNotificationSurveyData.A00 || this.A02 != communityMessagingNotificationSurveyData.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((4YV.A02(this.A06) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }
}
