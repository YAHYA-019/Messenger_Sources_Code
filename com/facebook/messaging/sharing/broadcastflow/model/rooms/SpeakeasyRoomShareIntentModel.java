package com.facebook.messaging.sharing.broadcastflow.model.rooms;

import X.1BL;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.rtc.meetups.speakeasy.model.SpeakeasyShareSheetModel;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;

/* loaded from: SpeakeasyRoomShareIntentModel.class */
public final class SpeakeasyRoomShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(66);
    public final SpeakeasyShareSheetModel A00;
    public final NavigationTrigger A01;

    public SpeakeasyRoomShareIntentModel(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, NavigationTrigger.class);
        A0C.getClass();
        this.A01 = (NavigationTrigger) A0C;
        Parcelable A0C2 = 1BL.A0C(parcel, SpeakeasyShareSheetModel.class);
        A0C2.getClass();
        this.A00 = (SpeakeasyShareSheetModel) A0C2;
    }

    public SpeakeasyRoomShareIntentModel(SpeakeasyShareSheetModel speakeasyShareSheetModel, NavigationTrigger navigationTrigger) {
        this.A01 = navigationTrigger;
        this.A00 = speakeasyShareSheetModel;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "SPEAKEASY_ROOM_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        NavigationTrigger navigationTrigger = this.A01;
        if (navigationTrigger == null) {
            navigationTrigger = NavigationTrigger.A03("speakeasy_room_share");
        }
        return navigationTrigger;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return BMK.A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public boolean isValid() {
        boolean z = true;
        if (this.A00 == null) {
            z = false;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }
}
