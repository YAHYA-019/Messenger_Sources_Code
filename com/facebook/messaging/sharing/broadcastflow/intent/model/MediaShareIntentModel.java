package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BL;
import X.7zM;
import X.7zR;
import X.AbN;
import X.AnonymousClass001;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* loaded from: MediaShareIntentModel.class */
public final class MediaShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(51);
    public final ContentAppAttribution A00;
    public final BMK A01;
    public final ImmutableList A02;
    public final String A03;
    public final NavigationTrigger A04;
    public final String A05;

    public MediaShareIntentModel(Parcel parcel) {
        Object[] createTypedArray = parcel.createTypedArray(MediaResource.CREATOR);
        if (createTypedArray == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ImmutableList copyOf = ImmutableList.copyOf(createTypedArray);
        11T.A0A(copyOf);
        this.A02 = copyOf;
        Parcelable A0C = 1BL.A0C(parcel, NavigationTrigger.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = (NavigationTrigger) A0C;
        this.A01 = AbN.A0Q(parcel);
        this.A00 = (ContentAppAttribution) 1BL.A0C(parcel, ContentAppAttribution.class);
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public MediaShareIntentModel(ContentAppAttribution contentAppAttribution, NavigationTrigger navigationTrigger, BMK bmk, ImmutableList immutableList, String str, String str2) {
        7zR.A1N(immutableList, bmk);
        this.A02 = immutableList;
        this.A04 = navigationTrigger;
        this.A01 = bmk;
        this.A00 = contentAppAttribution;
        this.A05 = str;
        this.A03 = str2;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "MEDIA_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return this.A04;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public boolean isValid() {
        return 7zM.A1b(this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        ImmutableList immutableList = this.A02;
        parcel.writeTypedArray((Parcelable[]) immutableList.toArray(new MediaResource[immutableList.size()]), i);
        parcel.writeParcelable(this.A04, i);
        1BL.A12(parcel, this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }
}
