package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.0S2;
import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.quicksilver.common.sharing.GameShareExtras;

/* loaded from: GameShareIntentModel.class */
public final class GameShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(48);
    public final GameShareExtras A00;
    public final NavigationTrigger A01;

    public GameShareIntentModel(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, GameShareExtras.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = (GameShareExtras) A0C;
        Parcelable A0C2 = 1BL.A0C(parcel, NavigationTrigger.class);
        if (A0C2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = (NavigationTrigger) A0C2;
    }

    public GameShareIntentModel(NavigationTrigger navigationTrigger, GameShareExtras gameShareExtras) {
        this.A00 = gameShareExtras;
        this.A01 = navigationTrigger;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return this.A00.A00() == 0S2.A0C ? "GAME_ENTITY_SHARE" : "GAME_CUSTOM_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return this.A01;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return BMK.A0A;
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
