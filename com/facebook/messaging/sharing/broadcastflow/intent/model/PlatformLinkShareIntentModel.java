package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.share.model.MessengerPlatformExtensibleShareContentFields;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: PlatformLinkShareIntentModel.class */
public final class PlatformLinkShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(55);
    public MessengerPlatformExtensibleShareContentFields A00;
    public final String A01;
    public final NavigationTrigger A02;
    public final BMK A03;

    public PlatformLinkShareIntentModel(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = (MessengerPlatformExtensibleShareContentFields) 1BL.A0C(parcel, MessengerPlatformExtensibleShareContentFields.class);
        this.A02 = (NavigationTrigger) 1BL.A0C(parcel, NavigationTrigger.class);
        this.A03 = AbN.A0Q(parcel);
    }

    public PlatformLinkShareIntentModel(MessengerPlatformExtensibleShareContentFields messengerPlatformExtensibleShareContentFields, NavigationTrigger navigationTrigger, BMK bmk, String str) {
        11T.A0F(bmk, 4);
        this.A01 = str;
        this.A00 = messengerPlatformExtensibleShareContentFields;
        this.A02 = navigationTrigger;
        this.A03 = bmk;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "PLATFORM_LINK_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        NavigationTrigger navigationTrigger = this.A02;
        if (navigationTrigger == null) {
            navigationTrigger = NavigationTrigger.A03("platform_link_share_trigger");
        }
        return navigationTrigger;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public boolean isValid() {
        String str = this.A01;
        boolean z = false;
        if (str != null && str.length() != 0 && this.A00 != null) {
            z = true;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        1BL.A12(parcel, this.A03);
    }
}
