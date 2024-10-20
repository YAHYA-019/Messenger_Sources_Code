package com.facebook.messaging.omnipicker.plugins.interfaces.secondaryomnipickercomponent;

import X.11T;
import X.AbG;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: SecondaryOmnipickerComponentExtras.class */
public final class SecondaryOmnipickerComponentExtras extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(95);
    public final Map A00;

    public SecondaryOmnipickerComponentExtras(Map map) {
        11T.A0F(map, 1);
        this.A00 = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SecondaryOmnipickerComponentExtras) && 11T.A0O(this.A00, ((SecondaryOmnipickerComponentExtras) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SecondaryOmnipickerComponentExtras(extras=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Map map = this.A00;
        AbG.A1G(parcel, map);
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            parcel.writeString(AnonymousClass001.A0j(A0z));
            parcel.writeInt(AnonymousClass001.A1V(A0z.getValue()) ? 1 : 0);
        }
    }
}
