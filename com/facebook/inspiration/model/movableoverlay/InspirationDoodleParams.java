package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationDoodleParams.class */
public final class InspirationDoodleParams implements Parcelable {
    public static volatile PersistableRect A05;
    public static final Parcelable.Creator CREATOR = new FKc(8);
    public final PersistableRect A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Set A04;

    public InspirationDoodleParams(Parcel parcel) {
        PersistableRect persistableRect = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt() != 0 ? DKG.A0o(parcel) : persistableRect;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public InspirationDoodleParams(PersistableRect persistableRect, String str, String str2, String str3, Set set) {
        this.A01 = str;
        this.A02 = str2;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
        this.A03 = str3;
        this.A00 = persistableRect;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public PersistableRect A00() {
        if (this.A04.contains("mediaRect")) {
            return this.A00;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = new PersistableRect(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationDoodleParams)) {
                return false;
            }
            InspirationDoodleParams inspirationDoodleParams = (InspirationDoodleParams) obj;
            if (!11T.A0O(this.A01, inspirationDoodleParams.A01) || !11T.A0O(this.A02, inspirationDoodleParams.A02) || !11T.A0O(this.A03, inspirationDoodleParams.A03) || !11T.A0O(A00(), inspirationDoodleParams.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationDoodleParams{canvasDoodleOverlayUri=");
        A0k.append(this.A01);
        A0k.append(", canvasDoodleStrokesUri=");
        A0k.append(this.A02);
        A0k.append(", id=");
        A0k.append(this.A03);
        A0k.append(", mediaRect=");
        return AbstractC2327GOs.A0U(A00(), A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        DKH.A11(parcel, this.A00, i);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
