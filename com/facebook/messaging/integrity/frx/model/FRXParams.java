package com.facebook.messaging.integrity.frx.model;

import X.0S2;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.7zL;
import X.7zN;
import X.7zU;
import X.AbG;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C5yl;
import X.C5yq;
import X.C8i;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FRXParams.class */
public final class FRXParams implements Parcelable {
    public static volatile Integer A0L;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(94);
    public final C5yq A00;
    public final FRXEvidencePrompt A01;
    public final ProactiveWarningParams A02;
    public final Message A03;
    public final ThreadKey A04;
    public final ThreadSummary A05;
    public final MigColorScheme A06;
    public final User A07;
    public final UserKey A08;
    public final C5yl A09;
    public final ImmutableList A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final Set A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public FRXParams(C5yq c5yq, FRXEvidencePrompt fRXEvidencePrompt, ProactiveWarningParams proactiveWarningParams, Message message, ThreadKey threadKey, ThreadSummary threadSummary, MigColorScheme migColorScheme, User user, UserKey userKey, C5yl c5yl, ImmutableList immutableList, Integer num, String str, String str2, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0C = str;
        this.A0F = z;
        C1pq.A08("colorScheme", migColorScheme);
        this.A06 = migColorScheme;
        C1pq.A08("fRXEntryPoint", c5yl);
        this.A09 = c5yl;
        this.A01 = fRXEvidencePrompt;
        this.A0B = num;
        this.A0A = immutableList;
        this.A0G = z2;
        C1pq.A08("location", c5yq);
        this.A00 = c5yq;
        this.A03 = message;
        C1pq.A08("objectId", str2);
        this.A0D = str2;
        this.A07 = user;
        this.A08 = userKey;
        this.A02 = proactiveWarningParams;
        this.A0H = z3;
        this.A0I = z4;
        this.A0J = z5;
        this.A04 = threadKey;
        this.A05 = threadSummary;
        this.A0K = z6;
        this.A0E = Collections.unmodifiableSet(set);
    }

    public FRXParams(C8i c8i) {
        this.A0C = c8i.A0A;
        this.A0F = c8i.A0D;
        MigColorScheme migColorScheme = c8i.A06;
        C1pq.A08("colorScheme", migColorScheme);
        this.A06 = migColorScheme;
        C5yl c5yl = c8i.A08;
        C1pq.A08("fRXEntryPoint", c5yl);
        this.A09 = c5yl;
        this.A01 = c8i.A01;
        this.A0B = c8i.A09;
        this.A0A = null;
        this.A0G = c8i.A0E;
        C5yq c5yq = c8i.A00;
        C1pq.A08("location", c5yq);
        this.A00 = c5yq;
        this.A03 = c8i.A03;
        String str = c8i.A0B;
        C1pq.A08("objectId", str);
        this.A0D = str;
        this.A07 = null;
        this.A08 = c8i.A07;
        this.A02 = c8i.A02;
        this.A0H = c8i.A0F;
        this.A0I = c8i.A0G;
        this.A0J = c8i.A0H;
        this.A04 = c8i.A04;
        this.A05 = c8i.A05;
        this.A0K = c8i.A0I;
        this.A0E = Collections.unmodifiableSet(c8i.A0C);
    }

    public FRXParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ThreadSummary threadSummary = null;
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        int i = 0;
        this.A0F = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A06 = (MigColorScheme) parcel.readParcelable(A0e);
        this.A09 = C5yl.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (FRXEvidencePrompt) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = 7zU.A0e(parcel, 6);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            int readInt = parcel.readInt();
            User[] userArr = new User[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, userArr, i2);
            }
            this.A0A = ImmutableList.copyOf(userArr);
        }
        this.A0G = 1BM.A07(parcel);
        this.A00 = C5yq.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (Message) Message.CREATOR.createFromParcel(parcel);
        }
        this.A0D = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (User) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (UserKey) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ProactiveWarningParams) parcel.readParcelable(A0e);
        }
        this.A0H = 1BM.A07(parcel);
        this.A0I = 1BM.A07(parcel);
        this.A0J = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        this.A05 = parcel.readInt() != 0 ? (ThreadSummary) ThreadSummary.CREATOR.createFromParcel(parcel) : threadSummary;
        this.A0K = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0E = Collections.unmodifiableSet(A0v);
    }

    public Integer A00() {
        if (this.A0E.contains("fRXType")) {
            return this.A0B;
        }
        if (A0L == null) {
            synchronized (this) {
                if (A0L == null) {
                    A0L = 0S2.A00;
                }
            }
        }
        return A0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FRXParams)) {
                return false;
            }
            FRXParams fRXParams = (FRXParams) obj;
            if (!11T.A0O(this.A0C, fRXParams.A0C) || this.A0F != fRXParams.A0F || !11T.A0O(this.A06, fRXParams.A06) || this.A09 != fRXParams.A09 || !11T.A0O(this.A01, fRXParams.A01) || A00() != fRXParams.A00() || !11T.A0O(this.A0A, fRXParams.A0A) || this.A0G != fRXParams.A0G || this.A00 != fRXParams.A00 || !11T.A0O(this.A03, fRXParams.A03) || !11T.A0O(this.A0D, fRXParams.A0D) || !11T.A0O(this.A07, fRXParams.A07) || !11T.A0O(this.A08, fRXParams.A08) || !11T.A0O(this.A02, fRXParams.A02) || this.A0H != fRXParams.A0H || this.A0I != fRXParams.A0I || this.A0J != fRXParams.A0J || !11T.A0O(this.A04, fRXParams.A04) || !11T.A0O(this.A05, fRXParams.A05) || this.A0K != fRXParams.A0K) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A02 = C1pq.A02(C1pq.A04(this.A0A, (C1pq.A04(this.A01, (C1pq.A04(this.A06, C1pq.A02(C1pq.A03(this.A0C), this.A0F)) * 31) + C3o5.A03(this.A09)) * 31) + C3o5.A04(A00())), this.A0G);
        C5yq c5yq = this.A00;
        if (c5yq != null) {
            i = c5yq.ordinal();
        }
        return C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A0D, C1pq.A04(this.A03, (A02 * 31) + i))))), this.A0H), this.A0I), this.A0J))), this.A0K);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0C);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeParcelable(this.A06, i);
        7zN.A0z(parcel, this.A09);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0f(parcel, this.A0B);
        ImmutableList immutableList = this.A0A;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable(AbG.A0t(A0Y), i);
            }
        }
        parcel.writeInt(this.A0G ? 1 : 0);
        7zN.A0z(parcel, this.A00);
        Message message = this.A03;
        if (message == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            message.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0D);
        C3o5.A0d(parcel, this.A07, i);
        C3o5.A0d(parcel, this.A08, i);
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        ThreadKey threadKey = this.A04;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        ThreadSummary threadSummary = this.A05;
        if (threadSummary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadSummary.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0K ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A0E);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
