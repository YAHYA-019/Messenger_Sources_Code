package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.AbN;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: TextShareIntentModel.class */
public final class TextShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(56);
    public final BMK A00;
    public final String A01;
    public final NavigationTrigger A02;

    public TextShareIntentModel(Parcel parcel) {
        this.A01 = parcel.readString();
        Parcelable A0C = 1BL.A0C(parcel, NavigationTrigger.class);
        if (A0C == null) {
            throw 1BK.A0h();
        }
        this.A02 = (NavigationTrigger) A0C;
        this.A00 = AbN.A0Q(parcel);
    }

    public TextShareIntentModel(NavigationTrigger navigationTrigger, BMK bmk, String str) {
        11T.A0F(bmk, 3);
        this.A01 = str;
        this.A02 = navigationTrigger;
        this.A00 = bmk;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "TEXT_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return this.A02;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isValid() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L16
            r0 = r302
            int r0 = r0.length()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L16:
            r0 = 1
            r304 = r0
        L18:
            r0 = r304
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharing.broadcastflow.intent.model.TextShareIntentModel.isValid():boolean");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A02, i);
        1BL.A12(parcel, this.A00);
    }
}
