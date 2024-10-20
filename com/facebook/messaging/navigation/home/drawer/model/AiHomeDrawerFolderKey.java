package com.facebook.messaging.navigation.home.drawer.model;

import X.11T;
import X.1BL;
import X.1F9;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AiHomeDrawerFolderKey.class */
public final class AiHomeDrawerFolderKey extends DrawerFolderKey {
    public static final Parcelable.Creator CREATOR = CST.A00(48);
    public final 1F9 A00;

    public AiHomeDrawerFolderKey(1F9 r302) {
        11T.A0F(r302, 1);
        11T.A09(r302.dbName);
        this.A00 = r302;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AiHomeDrawerFolderKey) && this.A00 == ((AiHomeDrawerFolderKey) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AiHomeDrawerFolderKey(folderName=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A00);
    }
}
