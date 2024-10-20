package com.facebook.inspiration.genai.aiexpander.model;

import X.11T;
import X.7zU;
import X.AbF;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKI;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.proxygen.TraceFieldType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AIExpanderImage.class */
public final class AIExpanderImage implements Parcelable {
    public static volatile MediaData A04;
    public static final Parcelable.Creator CREATOR = FKf.A01(36);
    public final String A00;
    public final String A01;
    public final MediaData A02;
    public final Set A03;

    public AIExpanderImage(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readInt() == 0 ? null : DKG.A0Y(parcel);
        this.A01 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public AIExpanderImage(MediaData mediaData, String str, String str2, Set set) {
        AbF.A1T(str);
        this.A00 = str;
        this.A02 = mediaData;
        C1pq.A08(TraceFieldType.Uri, str2);
        this.A01 = str2;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public MediaData A00() {
        if (this.A03.contains("mediaData")) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = DKI.A0C();
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
            if (!(obj instanceof AIExpanderImage)) {
                return false;
            }
            AIExpanderImage aIExpanderImage = (AIExpanderImage) obj;
            if (!11T.A0O(this.A00, aIExpanderImage.A00) || !11T.A0O(A00(), aIExpanderImage.A00()) || !11T.A0O(this.A01, aIExpanderImage.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(A00(), C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        DKI.A0Q(parcel, this.A02, i);
        parcel.writeString(this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
