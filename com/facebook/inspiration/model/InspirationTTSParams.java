package com.facebook.inspiration.model;

import X.11T;
import X.4YV;
import X.4YW;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import X.NAo;
import X.RaB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationTTSParams.class */
public final class InspirationTTSParams implements Parcelable {
    public static volatile InspirationTTSVoiceType A05;
    public static final Parcelable.Creator CREATOR = new FKf(67);
    public final int A00;
    public final InspirationTTSVoiceType A01;
    public final String A02;
    public final String A03;
    public final Set A04;

    public InspirationTTSParams(RaB raB) {
        String str = raB.A02;
        C1pq.A08("textForTTS", str);
        this.A02 = str;
        this.A00 = raB.A00;
        this.A01 = raB.A01;
        String str2 = raB.A03;
        C1pq.A08("uniqueIdOfTextElementForTTS", str2);
        this.A03 = str2;
        this.A04 = Collections.unmodifiableSet(raB.A04);
    }

    public InspirationTTSParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() == 0 ? null : (InspirationTTSVoiceType) parcel.readParcelable(A0e);
        this.A03 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public InspirationTTSVoiceType A00() {
        if (this.A04.contains("ttsVoiceType")) {
            return this.A01;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = NAo.A01;
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
            if (!(obj instanceof InspirationTTSParams)) {
                return false;
            }
            InspirationTTSParams inspirationTTSParams = (InspirationTTSParams) obj;
            if (!11T.A0O(this.A02, inspirationTTSParams.A02) || this.A00 != inspirationTTSParams.A00 || !11T.A0O(A00(), inspirationTTSParams.A00()) || !11T.A0O(this.A03, inspirationTTSParams.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(A00(), (C1pq.A03(this.A02) * 31) + this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        4YW.A0D(parcel, this.A01, i);
        parcel.writeString(this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
