package com.facebook.xapp.messaging.threadview.model.doc;

import X.11T;
import X.1BL;
import X.4YT;
import X.AnonymousClass001;
import X.C1pq;
import X.FKb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: Doc.class */
public final class Doc implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(66);
    public final int A00;
    public final long A01;
    public final Uri A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public Doc(Uri uri, String str, String str2, String str3, int i, long j) {
        C1pq.A08("contentUri", uri);
        this.A02 = uri;
        C1pq.A08("docName", str);
        this.A03 = str;
        this.A01 = j;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        this.A04 = str2;
        this.A00 = i;
        C1pq.A08("mimeType", str3);
        this.A05 = str3;
    }

    public Doc(Parcel parcel) {
        this.A02 = (Uri) 1BL.A0C(parcel, getClass());
        this.A03 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A05 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Doc)) {
                return false;
            }
            Doc doc = (Doc) obj;
            if (!11T.A0O(this.A02, doc.A02) || !11T.A0O(this.A03, doc.A03) || this.A01 != doc.A01 || !11T.A0O(this.A04, doc.A04) || this.A00 != doc.A00 || !11T.A0O(this.A05, doc.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, (C1pq.A04(this.A04, C1pq.A01(C1pq.A04(this.A03, C1pq.A03(this.A02)), this.A01)) * 31) + this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Doc{contentUri=");
        A0k.append(this.A02);
        A0k.append(", docName=");
        A0k.append(this.A03);
        A0k.append(", docSize=");
        A0k.append(this.A01);
        A0k.append(", id=");
        A0k.append(this.A04);
        A0k.append(", interventionType=");
        A0k.append(this.A00);
        A0k.append(4YT.A00(84));
        A0k.append(this.A05);
        return AnonymousClass001.A0d("}", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
    }
}
