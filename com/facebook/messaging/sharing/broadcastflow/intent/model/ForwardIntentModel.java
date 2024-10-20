package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BL;
import X.4YT;
import X.4YU;
import X.7zK;
import X.AnonymousClass001;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: ForwardIntentModel.class */
public final class ForwardIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(47);
    public final Message A00;
    public final NavigationTrigger A01;
    public final String A02;

    public ForwardIntentModel(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, Message.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = (Message) A0C;
        this.A02 = parcel.readString();
        Parcelable A0C2 = 1BL.A0C(parcel, NavigationTrigger.class);
        if (A0C2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = (NavigationTrigger) A0C2;
    }

    public ForwardIntentModel(Message message, NavigationTrigger navigationTrigger) {
        this.A00 = message;
        this.A02 = 4YU.A0x(message);
        this.A01 = navigationTrigger;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return 4YT.A00(607);
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return this.A01;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return 11T.A0O(this.A01.A05, 7zK.A00(17)) ? BMK.A0B : BMK.A0A;
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
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }
}
