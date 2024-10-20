package com.facebook.messaging.communitymessaging.adminactions.logging;

import X.11T;
import X.1BL;
import X.4YU;
import X.AbG;
import X.AbL;
import X.AnonymousClass001;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: AdminActionsLoggingExtras.class */
public final class AdminActionsLoggingExtras extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(51);
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public AdminActionsLoggingExtras() {
        this(null, null, null, null);
    }

    public AdminActionsLoggingExtras(String str, String str2, String str3, Map map) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdminActionsLoggingExtras)) {
                return false;
            }
            AdminActionsLoggingExtras adminActionsLoggingExtras = (AdminActionsLoggingExtras) obj;
            if (!11T.A0O(this.A01, adminActionsLoggingExtras.A01) || !11T.A0O(this.A02, adminActionsLoggingExtras.A02) || !11T.A0O(this.A00, adminActionsLoggingExtras.A00) || !11T.A0O(this.A03, adminActionsLoggingExtras.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((1BL.A05(this.A01) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A00)) * 31) + 4YU.A03(this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        Map map = this.A03;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        AbG.A1G(parcel, map);
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            AbL.A0n(parcel, A0y);
        }
    }
}
