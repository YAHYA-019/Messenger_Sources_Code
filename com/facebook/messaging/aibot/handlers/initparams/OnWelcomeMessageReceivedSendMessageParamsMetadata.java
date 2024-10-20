package com.facebook.messaging.aibot.handlers.initparams;

import X.11T;
import X.1BL;
import X.82M;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;

/* loaded from: OnWelcomeMessageReceivedSendMessageParamsMetadata.class */
public final class OnWelcomeMessageReceivedSendMessageParamsMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new 82M(10);
    public final String A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(OnWelcomeMessageReceivedSendMessageParamsMetadata.class, null);
    }

    public OnWelcomeMessageReceivedSendMessageParamsMetadata(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnWelcomeMessageReceivedSendMessageParamsMetadata) && 11T.A0O(this.A00, ((OnWelcomeMessageReceivedSendMessageParamsMetadata) obj).A00));
    }

    public int hashCode() {
        return 1BL.A05(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
