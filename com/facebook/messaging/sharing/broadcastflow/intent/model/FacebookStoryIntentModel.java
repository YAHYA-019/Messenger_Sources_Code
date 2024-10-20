package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.share.Share;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: FacebookStoryIntentModel.class */
public final class FacebookStoryIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(46);
    public final Share A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final NavigationTrigger A07;

    public FacebookStoryIntentModel(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, Share.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = (Share) A0C;
        Parcelable A0C2 = 1BL.A0C(parcel, NavigationTrigger.class);
        if (A0C2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A07 = (NavigationTrigger) A0C2;
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
    }

    public FacebookStoryIntentModel(Share share, NavigationTrigger navigationTrigger) {
        this.A00 = share;
        this.A07 = navigationTrigger;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A06 = null;
        this.A05 = null;
    }

    public FacebookStoryIntentModel(Share share, NavigationTrigger navigationTrigger, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = share;
        this.A07 = navigationTrigger;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A05 = str6;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "FACEBOOK_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return this.A07;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return BMK.A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public boolean isValid() {
        Share share = this.A00;
        String str = share.A0B;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = share.A0H;
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
    }
}
