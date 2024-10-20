package com.facebook.messaging.navigation.home.drawer.model;

import X.11T;
import X.1F9;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FolderNameDrawerFolderKey.class */
public final class FolderNameDrawerFolderKey extends DrawerFolderKey {
    public static final Parcelable.Creator CREATOR = new C4Ny(32);
    public final 1F9 A00;

    public FolderNameDrawerFolderKey(1F9 r302) {
        11T.A0F(r302, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("FolderName:");
        sb.append(r302);
        sb.append(".name");
        sb.toString();
        this.A00 = r302;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FolderNameDrawerFolderKey) && this.A00 == ((FolderNameDrawerFolderKey) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FolderNameDrawerFolderKey(folderName=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00.name());
    }
}
