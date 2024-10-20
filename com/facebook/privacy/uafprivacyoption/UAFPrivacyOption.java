package com.facebook.privacy.uafprivacyoption;

import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.7zR;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKW;
import X.QpI;
import X.QpQ;
import X.R3E;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.StringLocaleUtil;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: UAFPrivacyOption.class */
public final class UAFPrivacyOption extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(65);
    public final QpI currentTagExpansion;
    public final ImmutableList excludedMembers;
    public final String explanation;
    public final UAFPrivacyImage iconImage;
    public final String id;
    public final ImmutableList includedMembers;
    public final QpQ infoType;
    public final boolean isMostRecent;
    public final boolean isPrimary;
    public final boolean isSelected;
    public final String legacyGraphApiPrivacyJson;
    public final String name;
    public final UAFPrivacyRowInput privacyRowInput;
    public final ImmutableList tagExpansionOptions;
    public final String type;

    public UAFPrivacyOption() {
        this(null, QpQ.A08, QpI.A06, null, 1BK.A0b(), 1BK.A0b(), 1BK.A0b(), null, null, null, null, null, false, false, false);
    }

    public UAFPrivacyOption(UAFPrivacyImage uAFPrivacyImage, QpQ qpQ, QpI qpI, UAFPrivacyRowInput uAFPrivacyRowInput, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        7zR.A1Q(qpI, qpQ);
        11T.A0F(immutableList, 11);
        11T.A0F(immutableList2, 12);
        this.name = str;
        this.legacyGraphApiPrivacyJson = str2;
        this.explanation = str3;
        this.id = str4;
        this.type = str5;
        this.isPrimary = z;
        this.isSelected = z2;
        this.isMostRecent = z3;
        this.currentTagExpansion = qpI;
        this.infoType = qpQ;
        this.excludedMembers = immutableList;
        this.includedMembers = immutableList2;
        this.iconImage = uAFPrivacyImage;
        this.tagExpansionOptions = immutableList3;
        this.privacyRowInput = uAFPrivacyRowInput;
    }

    public static void A00(Parcel parcel, ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        parcel.writeInt(immutableList.size());
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            UAFPrivacyAudienceMember uAFPrivacyAudienceMember = (UAFPrivacyAudienceMember) it.next();
            parcel.writeString(uAFPrivacyAudienceMember.typeName);
            parcel.writeString(uAFPrivacyAudienceMember.id);
            parcel.writeString(uAFPrivacyAudienceMember.name);
        }
    }

    public final Integer A01() {
        String str;
        UAFPrivacyImage uAFPrivacyImage = this.iconImage;
        if (uAFPrivacyImage == null || (str = uAFPrivacyImage.name) == null) {
            return 0S2.A02;
        }
        try {
            String upperCaseLocaleSafe = StringLocaleUtil.toUpperCaseLocaleSafe(str);
            11T.A0A(upperCaseLocaleSafe);
            return R3E.A00(upperCaseLocaleSafe);
        } catch (IllegalArgumentException unused) {
            return 0S2.A02;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UAFPrivacyOption)) {
                return false;
            }
            UAFPrivacyOption uAFPrivacyOption = (UAFPrivacyOption) obj;
            if (!11T.A0O(this.name, uAFPrivacyOption.name) || !11T.A0O(this.legacyGraphApiPrivacyJson, uAFPrivacyOption.legacyGraphApiPrivacyJson) || !11T.A0O(this.explanation, uAFPrivacyOption.explanation) || !11T.A0O(this.id, uAFPrivacyOption.id) || !11T.A0O(this.type, uAFPrivacyOption.type) || this.isPrimary != uAFPrivacyOption.isPrimary || this.isSelected != uAFPrivacyOption.isSelected || this.isMostRecent != uAFPrivacyOption.isMostRecent || this.currentTagExpansion != uAFPrivacyOption.currentTagExpansion || this.infoType != uAFPrivacyOption.infoType || !11T.A0O(this.excludedMembers, uAFPrivacyOption.excludedMembers) || !11T.A0O(this.includedMembers, uAFPrivacyOption.includedMembers) || !11T.A0O(this.iconImage, uAFPrivacyOption.iconImage) || !11T.A0O(this.tagExpansionOptions, uAFPrivacyOption.tagExpansionOptions) || !11T.A0O(this.privacyRowInput, uAFPrivacyOption.privacyRowInput)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.tagExpansionOptions, (AnonymousClass002.A05(this.includedMembers, AnonymousClass002.A05(this.excludedMembers, AnonymousClass002.A05(this.infoType, AnonymousClass002.A05(this.currentTagExpansion, ((((((((((((((1BL.A05(this.name) * 31) + 1BL.A05(this.legacyGraphApiPrivacyJson)) * 31) + 1BL.A05(this.explanation)) * 31) + 1BL.A05(this.id)) * 31) + 1BL.A05(this.type)) * 31) + AnonymousClass002.A00(this.isPrimary ? 1 : 0)) * 31) + AnonymousClass002.A00(this.isSelected ? 1 : 0)) * 31) + AnonymousClass002.A00(this.isMostRecent ? 1 : 0)) * 31)))) + AnonymousClass001.A02(this.iconImage)) * 31) + 4YU.A03(this.privacyRowInput);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UAFPrivacyOption(name=");
        A0k.append(this.name);
        A0k.append(", legacyGraphApiPrivacyJson=");
        A0k.append(this.legacyGraphApiPrivacyJson);
        A0k.append(", explanation=");
        A0k.append(this.explanation);
        A0k.append(", id=");
        A0k.append(this.id);
        A0k.append(", type=");
        A0k.append(this.type);
        A0k.append(", isPrimary=");
        A0k.append(this.isPrimary);
        A0k.append(", isSelected=");
        A0k.append(this.isSelected);
        A0k.append(", isMostRecent=");
        A0k.append(this.isMostRecent);
        A0k.append(", currentTagExpansion=");
        A0k.append(this.currentTagExpansion);
        A0k.append(", infoType=");
        A0k.append(this.infoType);
        A0k.append(", excludedMembers=");
        A0k.append(this.excludedMembers);
        A0k.append(", includedMembers=");
        A0k.append(this.includedMembers);
        A0k.append(", iconImage=");
        A0k.append(this.iconImage);
        A0k.append(", tagExpansionOptions=");
        A0k.append(this.tagExpansionOptions);
        A0k.append(", privacyRowInput=");
        return AnonymousClass002.A0K(this.privacyRowInput, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.name);
        parcel.writeString(this.legacyGraphApiPrivacyJson);
        parcel.writeString(this.explanation);
        parcel.writeString(this.id);
        parcel.writeString(this.type);
        parcel.writeInt(this.isPrimary ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.isMostRecent ? 1 : 0);
        1BL.A12(parcel, this.currentTagExpansion);
        1BL.A12(parcel, this.infoType);
        A00(parcel, this.excludedMembers);
        A00(parcel, this.includedMembers);
        UAFPrivacyImage uAFPrivacyImage = this.iconImage;
        if (uAFPrivacyImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uAFPrivacyImage.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.tagExpansionOptions;
        11T.A0F(immutableList, 0);
        ArrayList A0z = 1BL.A0z(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            A0z.add(((QpI) it.next()).name());
        }
        parcel.writeStringList(A0z);
        UAFPrivacyRowInput uAFPrivacyRowInput = this.privacyRowInput;
        if (uAFPrivacyRowInput == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uAFPrivacyRowInput.writeToParcel(parcel, i);
        }
    }
}
