package com.facebook.messaging.threadview.initparams.metadataprovider.navigationtrigger.model;

import X.11T;
import X.82M;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;

/* loaded from: NavigationTriggerMetadata.class */
public final class NavigationTriggerMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new 82M(89);
    public final NavigationTrigger A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(NavigationTriggerMetadata.class, null);
    }

    public NavigationTriggerMetadata(NavigationTrigger navigationTrigger) {
        11T.A0F(navigationTrigger, 1);
        this.A00 = navigationTrigger;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NavigationTriggerMetadata) && 11T.A0O(this.A00, ((NavigationTriggerMetadata) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
