package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.AbN;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.cowatch.intent.model.CowatchShareModel;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: CowatchShareIntentModel.class */
public final class CowatchShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(45);
    public final CowatchShareModel A00;
    public final NavigationTrigger A01;
    public final BMK A02;

    public CowatchShareIntentModel(Parcel parcel) {
        this.A01 = (NavigationTrigger) 1BL.A0C(parcel, NavigationTrigger.class);
        Parcelable A0C = 1BL.A0C(parcel, CowatchShareModel.class);
        if (A0C == null) {
            throw 1BK.A0h();
        }
        this.A00 = (CowatchShareModel) A0C;
        this.A02 = AbN.A0Q(parcel);
    }

    public CowatchShareIntentModel(CowatchShareModel cowatchShareModel, NavigationTrigger navigationTrigger, BMK bmk) {
        11T.A0F(bmk, 3);
        this.A00 = cowatchShareModel;
        this.A01 = navigationTrigger;
        this.A02 = bmk;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "CowatchShareIntentModel";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        NavigationTrigger navigationTrigger = this.A01;
        if (navigationTrigger == null) {
            navigationTrigger = NavigationTrigger.A03("cowatch_share");
        }
        return navigationTrigger;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return this.A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public boolean isValid() {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        1BL.A12(parcel, this.A02);
    }
}
