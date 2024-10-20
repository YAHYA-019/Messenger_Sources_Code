package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.AnonymousClass001;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.share.model.MessengerPlatformExtensibleShareContentFields;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: PlatformExtensionShareIntentModel.class */
public final class PlatformExtensionShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(54);
    public MessengerPlatformExtensibleShareContentFields A00;
    public final NavigationTrigger A01;
    public final BMK A02;

    public PlatformExtensionShareIntentModel(Parcel parcel) {
        this.A00 = (MessengerPlatformExtensibleShareContentFields) 1BL.A0C(parcel, MessengerPlatformExtensibleShareContentFields.class);
        this.A01 = (NavigationTrigger) 1BL.A0C(parcel, NavigationTrigger.class);
        this.A02 = AbN.A0Q(parcel);
    }

    public PlatformExtensionShareIntentModel(MessengerPlatformExtensibleShareContentFields messengerPlatformExtensibleShareContentFields, NavigationTrigger navigationTrigger, BMK bmk) {
        11T.A0F(bmk, 3);
        this.A00 = messengerPlatformExtensibleShareContentFields;
        this.A01 = navigationTrigger;
        this.A02 = bmk;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "PLATFORM_EXTENSION_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        NavigationTrigger navigationTrigger = this.A01;
        if (navigationTrigger == null) {
            navigationTrigger = NavigationTrigger.A03("platform_extension_share_trigger");
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
        return AnonymousClass001.A1T(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        1BL.A12(parcel, this.A02);
    }
}
