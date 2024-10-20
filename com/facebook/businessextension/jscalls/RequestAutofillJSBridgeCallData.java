package com.facebook.businessextension.jscalls;

import X.1BK;
import X.7zL;
import X.AnonymousClass001;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: RequestAutofillJSBridgeCallData.class */
public final class RequestAutofillJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(71);
    public final String A00;
    public final LinkedHashSet A01;
    public final LinkedHashSet A02;

    public RequestAutofillJSBridgeCallData(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        this.A02 = createStringArrayList != null ? new LinkedHashSet(createStringArrayList) : 7zL.A15();
        this.A01 = createStringArrayList2 != null ? new LinkedHashSet(createStringArrayList2) : 7zL.A15();
    }

    public RequestAutofillJSBridgeCallData(String str, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.A00 = str;
        this.A02 = linkedHashSet;
        this.A01 = linkedHashSet2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        LinkedHashSet linkedHashSet = this.A02;
        parcel.writeStringList(linkedHashSet != null ? 1BK.A17(linkedHashSet) : AnonymousClass001.A0s());
        LinkedHashSet linkedHashSet2 = this.A01;
        parcel.writeStringList(linkedHashSet2 != null ? 1BK.A17(linkedHashSet2) : AnonymousClass001.A0s());
    }
}
