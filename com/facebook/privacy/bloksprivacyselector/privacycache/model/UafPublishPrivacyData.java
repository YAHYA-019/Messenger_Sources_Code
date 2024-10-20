package com.facebook.privacy.bloksprivacyselector.privacycache.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKW;
import X.QpI;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.uafprivacyoption.UAFPrivacyImage;
import com.facebook.privacy.uafprivacyoption.UAFPrivacyRowInput;
import com.google.common.collect.ImmutableList;

/* loaded from: UafPublishPrivacyData.class */
public final class UafPublishPrivacyData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(59);
    public final QpI currentTagExpansion;
    public final UAFPrivacyImage iconImage;
    public final String legacyGraphApiPrivacyJson;
    public final String name;
    public final UAFPrivacyRowInput privacyRowInput;
    public final ImmutableList tagExpansionOptions;

    public UafPublishPrivacyData() {
        this(null, QpI.A06, null, 1BK.A0b(), null, null);
    }

    public UafPublishPrivacyData(UAFPrivacyImage uAFPrivacyImage, QpI qpI, UAFPrivacyRowInput uAFPrivacyRowInput, ImmutableList immutableList, String str, String str2) {
        1BK.A1K(qpI, 3, immutableList);
        this.name = str;
        this.iconImage = uAFPrivacyImage;
        this.currentTagExpansion = qpI;
        this.tagExpansionOptions = immutableList;
        this.legacyGraphApiPrivacyJson = str2;
        this.privacyRowInput = uAFPrivacyRowInput;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UafPublishPrivacyData)) {
                return false;
            }
            UafPublishPrivacyData uafPublishPrivacyData = (UafPublishPrivacyData) obj;
            if (!11T.A0O(this.name, uafPublishPrivacyData.name) || !11T.A0O(this.iconImage, uafPublishPrivacyData.iconImage) || this.currentTagExpansion != uafPublishPrivacyData.currentTagExpansion || !11T.A0O(this.tagExpansionOptions, uafPublishPrivacyData.tagExpansionOptions) || !11T.A0O(this.legacyGraphApiPrivacyJson, uafPublishPrivacyData.legacyGraphApiPrivacyJson) || !11T.A0O(this.privacyRowInput, uafPublishPrivacyData.privacyRowInput)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.tagExpansionOptions, AnonymousClass002.A05(this.currentTagExpansion, ((1BL.A05(this.name) * 31) + AnonymousClass001.A02(this.iconImage)) * 31)) + 1BL.A05(this.legacyGraphApiPrivacyJson)) * 31) + 4YU.A03(this.privacyRowInput);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UafPublishPrivacyData(name=");
        A0k.append(this.name);
        A0k.append(", iconImage=");
        A0k.append(this.iconImage);
        A0k.append(", currentTagExpansion=");
        A0k.append(this.currentTagExpansion);
        A0k.append(", tagExpansionOptions=");
        A0k.append(this.tagExpansionOptions);
        A0k.append(", legacyGraphApiPrivacyJson=");
        A0k.append(this.legacyGraphApiPrivacyJson);
        A0k.append(", privacyRowInput=");
        return AnonymousClass002.A0K(this.privacyRowInput, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.iconImage, i);
        1BL.A12(parcel, this.currentTagExpansion);
        parcel.writeSerializable(this.tagExpansionOptions);
        parcel.writeString(this.legacyGraphApiPrivacyJson);
        parcel.writeParcelable(this.privacyRowInput, i);
    }
}
