package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YT;
import X.AnonymousClass001;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: MontageShareIntentModel.class */
public final class MontageShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(52);
    public final Message A00;
    public final NavigationTrigger A01;

    public MontageShareIntentModel(Parcel parcel) {
        this.A00 = (Message) 1BL.A0C(parcel, Message.class);
        Parcelable A0C = 1BL.A0C(parcel, NavigationTrigger.class);
        if (A0C == null) {
            throw 1BK.A0h();
        }
        this.A01 = (NavigationTrigger) A0C;
    }

    public MontageShareIntentModel(Message message, NavigationTrigger navigationTrigger) {
        this.A00 = message;
        this.A01 = navigationTrigger;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        String str = this.A01.A05;
        return (11T.A0O(str, 4YT.A00(227)) || 11T.A0O(str, "MEDIA_VIEWER_SHARE_SHEET_HOLIDAY_CARD")) ? "HOLIDAY_CARD" : "MONTAGE_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return this.A01;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        String str = this.A01.A05;
        return 11T.A0O(str, 4YT.A00(227)) ? BMK.A07 : 11T.A0O(str, "MEDIA_VIEWER_SHARE_SHEET_HOLIDAY_CARD") ? BMK.A0C : BMK.A0A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public boolean isValid() {
        return AnonymousClass001.A1T(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
