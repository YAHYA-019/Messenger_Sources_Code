package com.facebook.iabbwpextension;

import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.7zS;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.EUq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: IABBwPContext.class */
public final class IABBwPContext extends C04v implements Parcelable, IabCommonTrait {
    public static final Parcelable.Creator CREATOR = FKf.A01(12);
    public final IABBwPExtension A00;
    public final ImmutableList A01;
    public final Integer A02;
    public final List A03;

    public IABBwPContext(IABBwPExtension iABBwPExtension, ImmutableList immutableList, List list) {
        1BL.A1F(list, immutableList);
        this.A03 = list;
        this.A01 = immutableList;
        this.A00 = iABBwPExtension;
        this.A02 = 0S2.A0N;
    }

    @Override // com.facebook.browser.iabcontext.IabCommonTrait
    public List Ach() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IABBwPContext)) {
                return false;
            }
            IABBwPContext iABBwPContext = (IABBwPContext) obj;
            if (!11T.A0O(this.A03, iABBwPContext.A03) || !11T.A0O(this.A01, iABBwPContext.A01) || !11T.A0O(this.A00, iABBwPContext.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, 1BL.A03(this.A03)) + AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        return 7zS.A14("eligible_experience_type", this.A01, 1BK.A1G(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EUq.A00(this.A02)), 1BK.A1G("click_ids", this.A03)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeStringList(this.A03);
        parcel.writeSerializable(this.A01);
        IABBwPExtension iABBwPExtension = this.A00;
        if (iABBwPExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABBwPExtension.writeToParcel(parcel, i);
        }
    }
}
