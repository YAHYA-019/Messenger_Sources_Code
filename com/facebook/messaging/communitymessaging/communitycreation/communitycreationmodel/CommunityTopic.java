package com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel;

import X.11T;
import X.1BL;
import X.7zM;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityTopic.class */
public final class CommunityTopic extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(65);
    public final String A00;
    public final Integer A01;

    public CommunityTopic(Integer num, String str) {
        1BL.A1F(num, str);
        this.A01 = num;
        this.A00 = str;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CAMPUS";
            case 2:
                return "CAREER_LEARNING";
            case 3:
                return "FITNESS_SPORTS";
            case 4:
                return "FOOD_DRINK";
            case 5:
                return "GAMING";
            case 6:
                return "MUSIC_MOVIES";
            case 7:
                return "NEIGHBORHOOD";
            case 8:
                return "ORGANIZATION_GROUPS";
            case 9:
                return "OTHER";
            case 10:
                return "PETS";
            case 11:
                return "SOCIAL";
            case 12:
                return "TRAVEL";
            case 13:
                return "WELLNESS";
            default:
                return "ANIME";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityTopic)) {
                return false;
            }
            CommunityTopic communityTopic = (CommunityTopic) obj;
            if (this.A01 != communityTopic.A01 || !11T.A0O(this.A00, communityTopic.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return 7zM.A05(this.A00, (A00(num).hashCode() + num.intValue()) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(A00(this.A01));
        parcel.writeString(this.A00);
    }
}
