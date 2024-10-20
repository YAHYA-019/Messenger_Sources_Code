package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BL;
import X.4YU;
import X.AnonymousClass001;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: InviteLinkShareIntentModel.class */
public final class InviteLinkShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(49);
    public final GroupInviteLinkData A00;
    public final String A01;
    public final Message A02;
    public final NavigationTrigger A03;

    public InviteLinkShareIntentModel(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, Message.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = (Message) A0C;
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = readString;
        Parcelable A0C2 = 1BL.A0C(parcel, NavigationTrigger.class);
        if (A0C2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = (NavigationTrigger) A0C2;
        Parcelable A0C3 = 1BL.A0C(parcel, GroupInviteLinkData.class);
        if (A0C3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = (GroupInviteLinkData) A0C3;
    }

    public InviteLinkShareIntentModel(GroupInviteLinkData groupInviteLinkData, Message message, NavigationTrigger navigationTrigger) {
        this.A02 = message;
        this.A01 = 4YU.A0x(message);
        this.A03 = navigationTrigger;
        this.A00 = groupInviteLinkData;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "INVITE_LINK_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return this.A03;
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
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A00, i);
    }
}
