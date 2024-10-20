package com.facebook.composer.mediaeffect.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerCreativeFactorySettings.class */
public final class ComposerCreativeFactorySettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(2);
    public final ImmutableList A00;
    public final boolean A01;
    public final boolean A02;

    public ComposerCreativeFactorySettings(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        ComposerMediaTemplateGroup[] composerMediaTemplateGroupArr = new ComposerMediaTemplateGroup[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, composerMediaTemplateGroupArr, i);
        }
        this.A00 = ImmutableList.copyOf(composerMediaTemplateGroupArr);
        this.A01 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A02 = AbJ.A1W(parcel);
    }

    public ComposerCreativeFactorySettings(ImmutableList immutableList, boolean z, boolean z2) {
        C1pq.A08("composerMediaTemplateGroups", immutableList);
        this.A00 = immutableList;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerCreativeFactorySettings)) {
                return false;
            }
            ComposerCreativeFactorySettings composerCreativeFactorySettings = (ComposerCreativeFactorySettings) obj;
            if (!11T.A0O(this.A00, composerCreativeFactorySettings.A00) || this.A01 != composerCreativeFactorySettings.A01 || this.A02 != composerCreativeFactorySettings.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A03(this.A00), this.A01), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ComposerMediaTemplateGroup) A0b.next(), i);
        }
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
