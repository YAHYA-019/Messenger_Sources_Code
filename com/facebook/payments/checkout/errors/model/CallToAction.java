package com.facebook.payments.checkout.errors.model;

import X.11T;
import X.1BL;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import X.Quh;
import X.RRA;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CallToAction.class */
public final class CallToAction implements Parcelable {
    public static volatile Quh A04;
    public static final Parcelable.Creator CREATOR = FKY.A00(97);
    public final String A00;
    public final String A01;
    public final Quh A02;
    public final Set A03;

    public CallToAction(RRA rra) {
        String str = rra.A01;
        C1pq.A08("label", str);
        this.A00 = str;
        this.A01 = rra.A02;
        this.A02 = rra.A00;
        this.A03 = Collections.unmodifiableSet(rra.A03);
    }

    public CallToAction(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        Quh quh = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? Quh.values()[parcel.readInt()] : quh;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public Quh A00() {
        if (this.A03.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = Quh.A01;
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallToAction)) {
                return false;
            }
            CallToAction callToAction = (CallToAction) obj;
            if (!11T.A0O(this.A00, callToAction.A00) || !11T.A0O(this.A01, callToAction.A01) || A00() != callToAction.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A042 = C1pq.A04(this.A01, C1pq.A03(this.A00));
        return (A042 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        1BL.A13(parcel, this.A01);
        C3o5.A0e(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
