package com.facebook.messaging.nativepagereply.faq.data.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AutomatedResponseAttachmentModel.class */
public final class AutomatedResponseAttachmentModel implements Parcelable {
    public static volatile String A05;
    public static final Parcelable.Creator CREATOR = new CST(41);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Set A04;

    public AutomatedResponseAttachmentModel(Parcel parcel) {
        this.A03 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A00 = C3o5.A0O(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public AutomatedResponseAttachmentModel(String str, String str2, String str3, String str4, Set set) {
        this.A03 = str;
        this.A00 = str2;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
        this.A01 = str3;
        C1pq.A08("url", str4);
        this.A02 = str4;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A04.contains("className")) {
            return this.A03;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = "EntBusinessMessageWithItems";
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
            if (!(obj instanceof AutomatedResponseAttachmentModel)) {
                return false;
            }
            AutomatedResponseAttachmentModel automatedResponseAttachmentModel = (AutomatedResponseAttachmentModel) obj;
            if (!11T.A0O(A00(), automatedResponseAttachmentModel.A00()) || !11T.A0O(this.A00, automatedResponseAttachmentModel.A00) || !11T.A0O(this.A01, automatedResponseAttachmentModel.A01) || !11T.A0O(this.A02, automatedResponseAttachmentModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(A00()))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
