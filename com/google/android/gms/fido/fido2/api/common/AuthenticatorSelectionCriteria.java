package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.DKF;
import X.JQx;
import X.JR0;
import X.KQ9;
import X.KQE;
import X.KQG;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: AuthenticatorSelectionCriteria.class */
public final class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(20);
    public final Attachment A00;
    public final Boolean A01;
    public final ResidentKeyRequirement A02;
    public final UserVerificationRequirement A03;

    public AuthenticatorSelectionCriteria(Boolean bool, String str, String str2, String str3) {
        Attachment A00;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            A00 = null;
        } else {
            try {
                A00 = Attachment.A00(str);
            } catch (KQ9 | KQG | KQE e) {
                throw new IllegalArgumentException((Throwable) e);
            }
        }
        this.A00 = A00;
        this.A01 = bool;
        this.A03 = str2 == null ? null : UserVerificationRequirement.A00(str2);
        this.A02 = str3 != null ? ResidentKeyRequirement.A00(str3) : residentKeyRequirement;
    }

    private ResidentKeyRequirement A00() {
        ResidentKeyRequirement residentKeyRequirement = this.A02;
        if (residentKeyRequirement == null) {
            Boolean bool = this.A01;
            if (bool == null || !bool.booleanValue()) {
                return null;
            }
            residentKeyRequirement = ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
        }
        return residentKeyRequirement;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof AuthenticatorSelectionCriteria) {
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
            if (AbstractC09524qc.A00(this.A00, authenticatorSelectionCriteria.A00) && AbstractC09524qc.A00(this.A01, authenticatorSelectionCriteria.A01) && AbstractC09524qc.A00(this.A03, authenticatorSelectionCriteria.A03)) {
                z = JR0.A1X(A00(), authenticatorSelectionCriteria.A00());
            }
        }
        return z;
    }

    public int hashCode() {
        return JR0.A0N(this.A00, this.A01, this.A03, A00());
    }

    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.A02;
        UserVerificationRequirement userVerificationRequirement = this.A03;
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(userVerificationRequirement);
        String valueOf3 = String.valueOf(residentKeyRequirement);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AuthenticatorSelectionCriteria{\n attachment=");
        A0k.append(valueOf);
        A0k.append(", \n requireResidentKey=");
        A0k.append(this.A01);
        A0k.append(", \n requireUserVerification=");
        A0k.append(valueOf2);
        A0k.append(", \n residentKeyRequirement=");
        A0k.append(valueOf3);
        return AnonymousClass001.A0d("\n }", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        Attachment attachment = this.A00;
        AbstractC01153q8.A08(parcel, attachment == null ? null : attachment.toString(), 2);
        Boolean bool = this.A01;
        if (bool != null) {
            parcel.writeInt(262147);
            DKF.A1C(parcel, bool);
        }
        UserVerificationRequirement userVerificationRequirement = this.A03;
        AbstractC01153q8.A08(parcel, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), 4);
        ResidentKeyRequirement A00 = A00();
        AbstractC01153q8.A08(parcel, A00 == null ? null : A00.toString(), 5);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
