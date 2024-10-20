package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharing.broadcastflow.model.ContactShareModel;

/* loaded from: ContactShareIntentModel.class */
public final class ContactShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(44);
    public final ContactShareModel A00;
    public final String A01;
    public final NavigationTrigger A02;

    public ContactShareIntentModel(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, ContactShareModel.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = (ContactShareModel) A0C;
        Parcelable A0C2 = 1BL.A0C(parcel, NavigationTrigger.class);
        if (A0C2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = (NavigationTrigger) A0C2;
        this.A01 = parcel.readString();
    }

    public ContactShareIntentModel(NavigationTrigger navigationTrigger, ContactShareModel contactShareModel, String str) {
        this.A00 = contactShareModel;
        this.A02 = navigationTrigger;
        this.A01 = str;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "CONTACT_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return this.A02;
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
        String str;
        ContactShareModel contactShareModel = this.A00;
        String str2 = contactShareModel.A01;
        boolean z = false;
        if (str2 != null && str2.length() != 0 && (str = contactShareModel.A02) != null && str.length() != 0) {
            z = true;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A01);
    }
}
