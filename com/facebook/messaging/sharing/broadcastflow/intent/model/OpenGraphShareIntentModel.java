package com.facebook.messaging.sharing.broadcastflow.intent.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.BMK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.share.model.LinksPreview;
import com.facebook.share.model.ShareItem;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* loaded from: OpenGraphShareIntentModel.class */
public final class OpenGraphShareIntentModel implements BroadcastFlowIntentModel {
    public static final Parcelable.Creator CREATOR = CSU.A00(53);
    public final LinksPreview A00;
    public final ShareItem A01;
    public final ImmutableList A02;
    public final BMK A03;

    public OpenGraphShareIntentModel(BMK bmk, LinksPreview linksPreview) {
        this.A00 = linksPreview;
        this.A02 = null;
        this.A01 = null;
        this.A03 = bmk;
    }

    public OpenGraphShareIntentModel(BMK bmk, ShareItem shareItem) {
        this.A00 = null;
        this.A02 = null;
        this.A01 = shareItem;
        this.A03 = bmk;
    }

    public OpenGraphShareIntentModel(BMK bmk, ImmutableList immutableList) {
        this.A00 = null;
        this.A02 = immutableList;
        this.A01 = null;
        this.A03 = bmk;
    }

    public OpenGraphShareIntentModel(Parcel parcel) {
        this.A00 = (LinksPreview) 1BL.A0C(parcel, LinksPreview.class);
        Object[] createTypedArray = parcel.createTypedArray(MediaResource.CREATOR);
        this.A02 = createTypedArray == null ? null : ImmutableList.copyOf(createTypedArray);
        this.A01 = (ShareItem) 1BL.A0C(parcel, ShareItem.class);
        this.A03 = AbN.A0Q(parcel);
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public String AWi() {
        return "PLATFORM_SHARE";
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public NavigationTrigger Ayo() {
        return NavigationTrigger.A03("opengraph");
    }

    @Override // com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel
    public BMK BAL() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r301.A01 != null) goto L8;
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
            com.facebook.share.model.LinksPreview r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1f
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1f
            r0 = r301
            com.facebook.share.model.ShareItem r0 = r0.A01
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L21
        L1f:
            r0 = 1
            r304 = r0
        L21:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharing.broadcastflow.intent.model.OpenGraphShareIntentModel.isValid():boolean");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        ImmutableList immutableList = this.A02;
        parcel.writeParcelableArray(immutableList != null ? (MediaResource[]) immutableList.toArray(new MediaResource[0]) : null, i);
        parcel.writeParcelable(this.A01, i);
        1BL.A12(parcel, this.A03);
    }
}
