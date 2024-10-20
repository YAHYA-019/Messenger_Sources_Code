package com.facebook.inspiration.model.pagescta;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKc;
import X.QpX;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationPagesCtaParams.class */
public final class InspirationPagesCtaParams implements Parcelable {
    public static volatile QpX A08;
    public static final Parcelable.Creator CREATOR = FKc.A00(67);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final QpX A06;
    public final Set A07;

    public InspirationPagesCtaParams(QpX qpX, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, Set set) {
        this.A01 = str;
        C1pq.A08("linkTitle", str2);
        this.A02 = str2;
        this.A06 = qpX;
        this.A00 = immutableList;
        this.A03 = str3;
        C1pq.A08("tooltipDescription", str4);
        this.A04 = str4;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str5);
        this.A05 = str5;
        this.A07 = Collections.unmodifiableSet(set);
    }

    public InspirationPagesCtaParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = QpX.values()[parcel.readInt()];
        }
        int i = 0;
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            InspirationPagesStructuredCtaModel[] inspirationPagesStructuredCtaModelArr = new InspirationPagesStructuredCtaModel[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, inspirationPagesStructuredCtaModelArr, i2);
            }
            immutableList = ImmutableList.copyOf(inspirationPagesStructuredCtaModelArr);
        }
        this.A00 = immutableList;
        this.A03 = C3o5.A0O(parcel);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A07 = Collections.unmodifiableSet(A0v);
    }

    public QpX A00() {
        if (this.A07.contains("pagesCtaType")) {
            return this.A06;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = QpX.A0C;
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationPagesCtaParams)) {
                return false;
            }
            InspirationPagesCtaParams inspirationPagesCtaParams = (InspirationPagesCtaParams) obj;
            if (!11T.A0O(this.A01, inspirationPagesCtaParams.A01) || !11T.A0O(this.A02, inspirationPagesCtaParams.A02) || A00() != inspirationPagesCtaParams.A00() || !11T.A0O(this.A00, inspirationPagesCtaParams.A00) || !11T.A0O(this.A03, inspirationPagesCtaParams.A03) || !11T.A0O(this.A04, inspirationPagesCtaParams.A04) || !11T.A0O(this.A05, inspirationPagesCtaParams.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A03(this.A01));
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A00, (A04 * 31) + C3o5.A03(A00())))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        parcel.writeString(this.A02);
        C3o5.A0e(parcel, this.A06);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((InspirationPagesStructuredCtaModel) A0Y.next(), i);
            }
        }
        1BL.A13(parcel, this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A07);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
