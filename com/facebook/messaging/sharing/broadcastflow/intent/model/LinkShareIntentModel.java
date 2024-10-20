package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.AbN;
import X.AnonymousClass001;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: LinkShareIntentModel.class */
public final class LinkShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(50);
    public final BMK A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final NavigationTrigger A04;

    public LinkShareIntentModel(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = readString;
        this.A01 = parcel.readString();
        Parcelable A0C = 1BL.A0C(parcel, NavigationTrigger.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = (NavigationTrigger) A0C;
        this.A00 = AbN.A0Q(parcel);
        this.A02 = parcel.readString();
    }

    public LinkShareIntentModel(NavigationTrigger navigationTrigger, BMK bmk, String str) {
        1BL.A1H(str, navigationTrigger, bmk);
        this.A03 = str;
        this.A01 = null;
        this.A04 = navigationTrigger;
        this.A00 = bmk;
        this.A02 = null;
    }

    public LinkShareIntentModel(NavigationTrigger navigationTrigger, BMK bmk, String str, String str2, String str3) {
        1BK.A1K(str, 1, bmk);
        this.A03 = str;
        this.A01 = str2;
        this.A04 = navigationTrigger;
        this.A00 = bmk;
        this.A02 = str3;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "LINK_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return this.A04;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public boolean isValid() {
        return Patterns.WEB_URL.matcher(this.A03).matches();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A04, i);
        1BL.A12(parcel, this.A00);
        parcel.writeString(this.A02);
    }
}
