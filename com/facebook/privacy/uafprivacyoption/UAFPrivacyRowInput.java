package com.facebook.privacy.uafprivacyoption;

import X.11T;
import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import X.FKW;
import X.Qos;
import X.QpH;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: UAFPrivacyRowInput.class */
public final class UAFPrivacyRowInput extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(66);
    public final ImmutableList allow;
    public final QpH baseState;
    public final ImmutableList deny;
    public final UAFPrivacyRowInputTargetingFields privacyTargeting;
    public final Qos tagExpansionState;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UAFPrivacyRowInput() {
        /*
            r301 = this;
            com.google.common.collect.ImmutableList r0 = X.1BK.A0b()
            r302 = r0
            com.google.common.collect.ImmutableList r0 = X.1BK.A0b()
            r303 = r0
            X.Qos r0 = X.Qos.A03
            r304 = r0
            X.QpH r0 = X.QpH.A06
            r305 = r0
            r0 = r301
            r1 = r305
            r2 = 0
            r3 = r304
            r4 = r302
            r5 = r303
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.privacy.uafprivacyoption.UAFPrivacyRowInput.<init>():void");
    }

    public UAFPrivacyRowInput(QpH qpH, UAFPrivacyRowInputTargetingFields uAFPrivacyRowInputTargetingFields, Qos qos, ImmutableList immutableList, ImmutableList immutableList2) {
        C3o5.A0k(qos, 4, qpH);
        this.privacyTargeting = uAFPrivacyRowInputTargetingFields;
        this.allow = immutableList;
        this.deny = immutableList2;
        this.tagExpansionState = qos;
        this.baseState = qpH;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UAFPrivacyRowInput)) {
                return false;
            }
            UAFPrivacyRowInput uAFPrivacyRowInput = (UAFPrivacyRowInput) obj;
            if (!11T.A0O(this.privacyTargeting, uAFPrivacyRowInput.privacyTargeting) || !11T.A0O(this.allow, uAFPrivacyRowInput.allow) || !11T.A0O(this.deny, uAFPrivacyRowInput.deny) || this.tagExpansionState != uAFPrivacyRowInput.tagExpansionState || this.baseState != uAFPrivacyRowInput.baseState) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.baseState, AnonymousClass002.A05(this.tagExpansionState, AnonymousClass002.A05(this.deny, AnonymousClass002.A05(this.allow, AnonymousClass001.A02(this.privacyTargeting) * 31))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UAFPrivacyRowInput(privacyTargeting=");
        A0k.append(this.privacyTargeting);
        A0k.append(", allow=");
        A0k.append(this.allow);
        A0k.append(", deny=");
        A0k.append(this.deny);
        A0k.append(", tagExpansionState=");
        A0k.append(this.tagExpansionState);
        A0k.append(", baseState=");
        return AnonymousClass002.A0K(this.baseState, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        UAFPrivacyRowInputTargetingFields uAFPrivacyRowInputTargetingFields = this.privacyTargeting;
        if (uAFPrivacyRowInputTargetingFields == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uAFPrivacyRowInputTargetingFields.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.allow;
        11T.A0F(immutableList, 0);
        parcel.writeStringList(immutableList);
        ImmutableList immutableList2 = this.deny;
        11T.A0F(immutableList2, 0);
        parcel.writeStringList(immutableList2);
        1BL.A12(parcel, this.tagExpansionState);
        1BL.A12(parcel, this.baseState);
    }
}
