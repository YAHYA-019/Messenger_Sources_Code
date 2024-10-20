package com.facebook.interstitial.api;

import X.04R;
import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C0ty;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.model.NuxStep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: InterstitialNUXFetchResult.class */
public final class InterstitialNUXFetchResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(74);
    public final Map extraData;
    public final List steps;

    public InterstitialNUXFetchResult() {
        this.steps = C0ty.A00;
        this.extraData = 04R.A0G();
    }

    public InterstitialNUXFetchResult(Parcel parcel) {
        ArrayList A0y = 4YV.A0y(parcel, NuxStep.class);
        11T.A0I(A0y, "null cannot be cast to non-null type java.util.ArrayList<com.facebook.ipc.model.NuxStep>{ kotlin.collections.TypeAliasesKt.ArrayList<com.facebook.ipc.model.NuxStep> }");
        this.steps = 1BL.A0a(A0y);
        HashMap A0u = AnonymousClass001.A0u();
        parcel.readMap(A0u, Map.class.getClassLoader());
        this.extraData = A0u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeList(this.steps);
        parcel.writeMap(this.extraData);
    }
}
