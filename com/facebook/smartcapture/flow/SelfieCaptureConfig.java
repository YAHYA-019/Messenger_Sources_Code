package com.facebook.smartcapture.flow;

import X.0S2;
import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.7zU;
import X.AbJ;
import X.AbN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKe;
import X.Qpv;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.avatar.autogen.download.MsgrModelDownloader;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.DefaultResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.passthrough.StringNoOverrideFactory;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: SelfieCaptureConfig.class */
public final class SelfieCaptureConfig implements Parcelable {
    public static volatile Qpv A0T;
    public static volatile StringNoOverrideFactory A0U;
    public static volatile Integer A0V;
    public static final Parcelable.Creator CREATOR = new FKe(27);
    public final int A00;
    public final int A01;
    public final ChallengeProvider A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final long A09;
    public final Bundle A0A;
    public final MsgrModelDownloader A0B;
    public final MsgrModelDownloader A0C;
    public final Qpv A0D;
    public final SmartCaptureLoggerProvider A0E;
    public final DefaultResourcesProvider A0F;
    public final StringNoOverrideFactory A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final Set A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public SelfieCaptureConfig(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ChallengeProvider) ChallengeProvider.CREATOR.createFromParcel(parcel);
        }
        AbstractC2326GOr.A0v(parcel, A0e);
        AbstractC2326GOr.A0v(parcel, A0e);
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = 7zU.A0e(parcel, 2);
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        parcel.readParcelable(A0e);
        AbstractC2326GOr.A0v(parcel, A0e);
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (MsgrModelDownloader) parcel.readParcelable(A0e);
        }
        AbstractC2326GOr.A0v(parcel, A0e);
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = Qpv.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = Boolean.valueOf(1BM.A07(parcel));
        }
        this.A0R = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (MsgrModelDownloader) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = 7zU.A0e(parcel, 3);
        }
        this.A08 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (DefaultResourcesProvider) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = 7zU.A0e(parcel, 5);
        }
        AbstractC2326GOr.A0v(parcel, A0e);
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = Boolean.valueOf(1BM.A07(parcel));
        }
        this.A0S = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = Boolean.valueOf(AbJ.A1V(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (SmartCaptureLoggerProvider) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (StringNoOverrideFactory) parcel.readParcelable(A0e);
        }
        this.A09 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A07 = parcel.readInt() != 0 ? 7zU.A0e(parcel, 3) : num;
        this.A0P = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0Q = Collections.unmodifiableSet(A0v);
    }

    private Integer A00() {
        if (this.A0Q.contains("designSystem")) {
            return this.A0J;
        }
        if (A0V == null) {
            synchronized (this) {
                if (A0V == null) {
                    A0V = 0S2.A00;
                }
            }
        }
        return A0V;
    }

    private Qpv A01() {
        if (this.A0Q.contains("featureLevel")) {
            return this.A0D;
        }
        if (A0T == null) {
            synchronized (this) {
                if (A0T == null) {
                    A0T = Qpv.A02;
                }
            }
        }
        return A0T;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, com.facebook.smartcapture.resources.stringoverride.passthrough.StringNoOverrideFactory] */
    public StringNoOverrideFactory A02() {
        if (this.A0Q.contains("stringOverrideFactory")) {
            return this.A0G;
        }
        if (A0U == null) {
            synchronized (this) {
                if (A0U == null) {
                    A0U = new Object();
                }
            }
        }
        return A0U;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SelfieCaptureConfig)) {
                return false;
            }
            SelfieCaptureConfig selfieCaptureConfig = (SelfieCaptureConfig) obj;
            if (!11T.A0O(this.A0L, selfieCaptureConfig.A0L) || !11T.A0O(this.A02, selfieCaptureConfig.A02) || A00() != selfieCaptureConfig.A00() || !11T.A0O(this.A03, selfieCaptureConfig.A03) || !11T.A0O(this.A0M, selfieCaptureConfig.A0M) || !11T.A0O(this.A0H, selfieCaptureConfig.A0H) || !11T.A0O(this.A0B, selfieCaptureConfig.A0B) || A01() != selfieCaptureConfig.A01() || !11T.A0O(this.A0I, selfieCaptureConfig.A0I) || this.A0R != selfieCaptureConfig.A0R || !11T.A0O(this.A0N, selfieCaptureConfig.A0N) || !11T.A0O(this.A0C, selfieCaptureConfig.A0C) || this.A06 != selfieCaptureConfig.A06 || !11T.A0O(this.A08, selfieCaptureConfig.A08) || !11T.A0O(this.A0F, selfieCaptureConfig.A0F) || this.A0K != selfieCaptureConfig.A0K || !11T.A0O(this.A0O, selfieCaptureConfig.A0O) || !11T.A0O(this.A04, selfieCaptureConfig.A04) || this.A0S != selfieCaptureConfig.A0S || !11T.A0O(this.A05, selfieCaptureConfig.A05) || !11T.A0O(this.A0E, selfieCaptureConfig.A0E) || !11T.A0O(A02(), selfieCaptureConfig.A02()) || this.A09 != selfieCaptureConfig.A09 || !11T.A0O(this.A0A, selfieCaptureConfig.A0A) || this.A00 != selfieCaptureConfig.A00 || this.A01 != selfieCaptureConfig.A01 || this.A07 != selfieCaptureConfig.A07 || !11T.A0O(this.A0P, selfieCaptureConfig.A0P)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = (((C1pq.A04(this.A0A, C1pq.A01(C1pq.A04(A02(), C1pq.A04(this.A0E, C1pq.A04(this.A05, C1pq.A02(C1pq.A04(this.A04, C1pq.A04(this.A0O, ((C1pq.A04(this.A0F, C1pq.A04(this.A08, (C1pq.A04(this.A0C, C1pq.A04(this.A0N, C1pq.A02(C1pq.A04(this.A0I, (C1pq.A04(this.A0B, C1pq.A04(this.A0H, C1pq.A04(this.A0M, C1pq.A04(this.A03, (C1pq.A04(this.A02, C1pq.A03(this.A0L)) * 31 * 31 * 31) + C3o5.A04(A00()))) * 31 * 31)) * 31 * 31) + C3o5.A03(A01())), this.A0R))) * 31) + C3o5.A04(this.A06))) * 31) + C3o5.A04(this.A0K)) * 31)), this.A0S)))), this.A09)) * 31) + this.A00) * 31) + this.A01;
        Integer num = this.A07;
        if (num != null) {
            i = num.intValue();
        }
        return C1pq.A04(this.A0P, (A04 * 31) + i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0L);
        ChallengeProvider challengeProvider = this.A02;
        if (challengeProvider == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            challengeProvider.writeToParcel(parcel, i);
        }
        parcel.writeInt(0);
        parcel.writeInt(0);
        C3o5.A0f(parcel, this.A0J);
        AbN.A0s(parcel, this.A03);
        1BL.A13(parcel, this.A0M);
        parcel.writeParcelable(null, i);
        parcel.writeInt(0);
        AbN.A0s(parcel, this.A0H);
        C3o5.A0d(parcel, this.A0B, i);
        parcel.writeInt(0);
        C3o5.A0e(parcel, this.A0D);
        AbN.A0s(parcel, this.A0I);
        parcel.writeInt(this.A0R ? 1 : 0);
        1BL.A13(parcel, this.A0N);
        C3o5.A0d(parcel, this.A0C, i);
        C3o5.A0f(parcel, this.A06);
        parcel.writeString(this.A08);
        C3o5.A0d(parcel, this.A0F, i);
        C3o5.A0f(parcel, this.A0K);
        parcel.writeInt(0);
        1BL.A13(parcel, this.A0O);
        AbN.A0s(parcel, this.A04);
        parcel.writeInt(this.A0S ? 1 : 0);
        AbN.A0s(parcel, this.A05);
        C3o5.A0d(parcel, this.A0E, i);
        C3o5.A0d(parcel, this.A0G, i);
        parcel.writeLong(this.A09);
        Bundle bundle = this.A0A;
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        C3o5.A0f(parcel, this.A07);
        1BL.A13(parcel, this.A0P);
        Iterator A0S = C3o5.A0S(parcel, this.A0Q);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
