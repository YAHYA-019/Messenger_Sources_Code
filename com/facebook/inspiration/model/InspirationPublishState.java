package com.facebook.inspiration.model;

import X.11T;
import X.1BM;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import X.QqK;
import X.Qus;
import X.Raj;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationPublishState.class */
public final class InspirationPublishState implements Parcelable {
    public static volatile InspirationPostAction A09;
    public static final Parcelable.Creator CREATOR = new FKf(62);
    public final InspirationPostAction A00;
    public final PendingStoryShortcutAudience A01;
    public final String A02;
    public final Set A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public InspirationPublishState(Raj raj) {
        this.A04 = raj.A04;
        this.A05 = raj.A05;
        this.A06 = raj.A06;
        this.A07 = raj.A07;
        this.A01 = raj.A01;
        this.A00 = raj.A00;
        String str = raj.A02;
        C1pq.A08("publishPreProcessingStatus", str);
        this.A02 = str;
        this.A08 = raj.A08;
        this.A03 = Collections.unmodifiableSet(raj.A03);
    }

    public InspirationPublishState(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A04 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A05 = 1BM.A07(parcel);
        this.A06 = 1BM.A07(parcel);
        this.A07 = 1BM.A07(parcel);
        InspirationPostAction inspirationPostAction = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (PendingStoryShortcutAudience) parcel.readParcelable(A0e);
        }
        this.A00 = parcel.readInt() != 0 ? (InspirationPostAction) parcel.readParcelable(A0e) : inspirationPostAction;
        this.A02 = parcel.readString();
        this.A08 = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public InspirationPostAction A00() {
        if (this.A03.contains("postAction")) {
            return this.A00;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    HashSet A0v = AnonymousClass001.A0v();
                    A09 = new InspirationPostAction(Qus.A02, QqK.A09, 4YV.A10("reason", 4YV.A0z("action", A0v, A0v)), false, false, false, true, false, false);
                }
            }
        }
        return A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationPublishState)) {
                return false;
            }
            InspirationPublishState inspirationPublishState = (InspirationPublishState) obj;
            if (this.A04 != inspirationPublishState.A04 || this.A05 != inspirationPublishState.A05 || this.A06 != inspirationPublishState.A06 || this.A07 != inspirationPublishState.A07 || !11T.A0O(this.A01, inspirationPublishState.A01) || !11T.A0O(A00(), inspirationPublishState.A00()) || !11T.A0O(this.A02, inspirationPublishState.A02) || this.A08 != inspirationPublishState.A08) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A02, C1pq.A04(A00(), C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A05(this.A04), this.A05), this.A06), this.A07)))), this.A08);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A08 ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
