package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EQ5;
import X.FKf;
import X.RRg;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AddYoursParticipationInfo.class */
public final class AddYoursParticipationInfo implements Parcelable {
    public static volatile EQ5 A0B;
    public static volatile InspirationOverlayPosition A0C;
    public static final Parcelable.Creator CREATOR = FKf.A01(99);
    public final int A00;
    public final EQ5 A01;
    public final InspirationOverlayPosition A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;
    public final boolean A0A;

    public AddYoursParticipationInfo(RRg rRg) {
        this.A03 = rRg.A03;
        this.A00 = rRg.A00;
        this.A04 = rRg.A04;
        this.A0A = rRg.A0A;
        this.A02 = rRg.A02;
        String str = rRg.A05;
        C1pq.A08("parentStoryPostId", str);
        this.A05 = str;
        String str2 = rRg.A06;
        C1pq.A08("promptId", str2);
        this.A06 = str2;
        this.A01 = rRg.A01;
        String str3 = rRg.A07;
        C1pq.A08("promptText", str3);
        this.A07 = str3;
        this.A08 = rRg.A08;
        this.A09 = Collections.unmodifiableSet(rRg.A09);
    }

    public AddYoursParticipationInfo(Parcel parcel) {
        EQ5 eq5 = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        int i = 0;
        this.A0A = 4YV.A1U(parcel.readInt());
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = DKG.A0W(parcel);
        }
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = parcel.readInt() != 0 ? EQ5.values()[parcel.readInt()] : eq5;
        this.A07 = parcel.readString();
        this.A08 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public EQ5 A00() {
        if (this.A09.contains("promptOrigination")) {
            return this.A01;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = EQ5.A01;
                }
            }
        }
        return A0B;
    }

    public InspirationOverlayPosition A01() {
        if (DKF.A1b(this.A09)) {
            return this.A02;
        }
        if (A0C == null) {
            synchronized (this) {
                if (A0C == null) {
                    A0C = DKG.A0V();
                }
            }
        }
        return A0C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AddYoursParticipationInfo)) {
                return false;
            }
            AddYoursParticipationInfo addYoursParticipationInfo = (AddYoursParticipationInfo) obj;
            if (!11T.A0O(this.A03, addYoursParticipationInfo.A03) || this.A00 != addYoursParticipationInfo.A00 || !11T.A0O(this.A04, addYoursParticipationInfo.A04) || this.A0A != addYoursParticipationInfo.A0A || !11T.A0O(A01(), addYoursParticipationInfo.A01()) || !11T.A0O(this.A05, addYoursParticipationInfo.A05) || !11T.A0O(this.A06, addYoursParticipationInfo.A06) || A00() != addYoursParticipationInfo.A00() || !11T.A0O(this.A07, addYoursParticipationInfo.A07) || !11T.A0O(this.A08, addYoursParticipationInfo.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(A01(), C1pq.A02(C1pq.A04(this.A04, (C1pq.A03(this.A03) * 31) + this.A00), this.A0A))));
        return C1pq.A04(this.A08, C1pq.A04(this.A07, (A04 * 31) + C3o5.A03(A00())));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A0A ? 1 : 0);
        DKH.A0z(parcel, this.A02, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        C3o5.A0e(parcel, this.A01);
        parcel.writeString(this.A07);
        1BL.A13(parcel, this.A08);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
