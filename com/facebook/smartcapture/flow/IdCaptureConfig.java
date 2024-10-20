package com.facebook.smartcapture.flow;

import X.0S2;
import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.7zU;
import X.AbJ;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKe;
import X.QoQ;
import X.Qpv;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.download.FbVoltronAndNmlModulesDownloader;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.DefaultResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.passthrough.StringNoOverrideFactory;
import com.facebook.smartcapture.ui.DefaultIdCaptureUi;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: IdCaptureConfig.class */
public final class IdCaptureConfig implements Parcelable {
    public static volatile QoQ A0R;
    public static volatile Qpv A0S;
    public static volatile StringNoOverrideFactory A0T;
    public static volatile Integer A0U;
    public static final Parcelable.Creator CREATOR = new FKe(26);
    public final int A00;
    public final long A01;
    public final long A02;
    public final Bundle A03;
    public final FixedSizes A04;
    public final FbVoltronAndNmlModulesDownloader A05;
    public final FbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider A06;
    public final SmartCaptureLoggerProvider A07;
    public final DefaultResourcesProvider A08;
    public final DefaultIdCaptureUi A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final QoQ A0L;
    public final Qpv A0M;
    public final StringNoOverrideFactory A0N;
    public final Integer A0O;
    public final Set A0P;
    public final boolean A0Q;

    public IdCaptureConfig(Bundle bundle, FixedSizes fixedSizes, QoQ qoQ, Qpv qpv, FbVoltronAndNmlModulesDownloader fbVoltronAndNmlModulesDownloader, FbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider fbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider, SmartCaptureLoggerProvider smartCaptureLoggerProvider, DefaultResourcesProvider defaultResourcesProvider, DefaultIdCaptureUi defaultIdCaptureUi, Integer num, String str, String str2, String str3, Set set, int i) {
        this.A0A = null;
        this.A0L = qoQ;
        this.A09 = defaultIdCaptureUi;
        this.A0O = num;
        this.A06 = fbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider;
        this.A0M = qpv;
        this.A04 = fixedSizes;
        this.A0B = null;
        this.A0G = false;
        this.A0H = true;
        this.A0Q = false;
        this.A0I = false;
        this.A0J = false;
        this.A0K = false;
        this.A07 = smartCaptureLoggerProvider;
        this.A0C = str;
        this.A01 = 0L;
        this.A05 = fbVoltronAndNmlModulesDownloader;
        C1pq.A08("product", str2);
        this.A0D = str2;
        this.A0E = str3;
        this.A08 = defaultResourcesProvider;
        this.A0F = null;
        this.A0N = null;
        this.A02 = 0L;
        this.A03 = bundle;
        this.A00 = i;
        this.A0P = Collections.unmodifiableSet(set);
    }

    public IdCaptureConfig(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Bundle bundle = null;
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = QoQ.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (DefaultIdCaptureUi) parcel.readParcelable(A0e);
        }
        AbstractC2326GOr.A0v(parcel, A0e);
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = 7zU.A0e(parcel, 2);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (FbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = Qpv.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (FixedSizes) FixedSizes.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        int i = 0;
        this.A0G = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0H = 1BM.A07(parcel);
        this.A0Q = 1BM.A07(parcel);
        this.A0I = 1BM.A07(parcel);
        this.A0J = 1BM.A07(parcel);
        this.A0K = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (SmartCaptureLoggerProvider) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        this.A01 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (FbVoltronAndNmlModulesDownloader) parcel.readParcelable(A0e);
        }
        this.A0D = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (DefaultResourcesProvider) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = (StringNoOverrideFactory) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readLong();
        this.A03 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : bundle;
        this.A00 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0P = Collections.unmodifiableSet(A0v);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, com.facebook.smartcapture.resources.stringoverride.passthrough.StringNoOverrideFactory] */
    private StringNoOverrideFactory A02() {
        if (this.A0P.contains("stringOverrideFactory")) {
            return this.A0N;
        }
        if (A0T == null) {
            synchronized (this) {
                if (A0T == null) {
                    A0T = new Object();
                }
            }
        }
        return A0T;
    }

    public QoQ A00() {
        if (this.A0P.contains("captureMode")) {
            return this.A0L;
        }
        if (A0R == null) {
            synchronized (this) {
                if (A0R == null) {
                    A0R = QoQ.A02;
                }
            }
        }
        return A0R;
    }

    public Qpv A01() {
        if (this.A0P.contains("featureLevel")) {
            return this.A0M;
        }
        if (A0S == null) {
            synchronized (this) {
                if (A0S == null) {
                    A0S = Qpv.A02;
                }
            }
        }
        return A0S;
    }

    public Integer A03() {
        if (this.A0P.contains("designSystem")) {
            return this.A0O;
        }
        if (A0U == null) {
            synchronized (this) {
                if (A0U == null) {
                    A0U = 0S2.A00;
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
            if (!(obj instanceof IdCaptureConfig)) {
                return false;
            }
            IdCaptureConfig idCaptureConfig = (IdCaptureConfig) obj;
            if (!11T.A0O(this.A0A, idCaptureConfig.A0A) || A00() != idCaptureConfig.A00() || !11T.A0O(this.A09, idCaptureConfig.A09) || A03() != idCaptureConfig.A03() || !11T.A0O(this.A06, idCaptureConfig.A06) || A01() != idCaptureConfig.A01() || !11T.A0O(this.A04, idCaptureConfig.A04) || !11T.A0O(this.A0B, idCaptureConfig.A0B) || this.A0G != idCaptureConfig.A0G || this.A0H != idCaptureConfig.A0H || this.A0Q != idCaptureConfig.A0Q || this.A0I != idCaptureConfig.A0I || this.A0J != idCaptureConfig.A0J || this.A0K != idCaptureConfig.A0K || !11T.A0O(this.A07, idCaptureConfig.A07) || !11T.A0O(this.A0C, idCaptureConfig.A0C) || this.A01 != idCaptureConfig.A01 || !11T.A0O(this.A05, idCaptureConfig.A05) || !11T.A0O(this.A0D, idCaptureConfig.A0D) || !11T.A0O(this.A0E, idCaptureConfig.A0E) || !11T.A0O(this.A08, idCaptureConfig.A08) || !11T.A0O(this.A0F, idCaptureConfig.A0F) || !11T.A0O(A02(), idCaptureConfig.A02()) || this.A02 != idCaptureConfig.A02 || !11T.A0O(this.A03, idCaptureConfig.A03) || this.A00 != idCaptureConfig.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A06, (C1pq.A04(this.A09, (C1pq.A03(this.A0A) * 31) + C3o5.A03(A00())) * 31 * 31) + C3o5.A04(A03()));
        Qpv A01 = A01();
        if (A01 != null) {
            i = A01.ordinal();
        }
        return (C1pq.A04(this.A03, C1pq.A01(C1pq.A04(A02(), C1pq.A04(this.A0F, C1pq.A04(this.A08, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A05, C1pq.A01(C1pq.A04(this.A0C, C1pq.A04(this.A07, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0B, C1pq.A04(this.A04, (A04 * 31) + i)), this.A0G), this.A0H), this.A0Q), this.A0I), this.A0J), this.A0K))), this.A01))))))), this.A02)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0A);
        C3o5.A0e(parcel, this.A0L);
        C3o5.A0d(parcel, this.A09, i);
        parcel.writeInt(0);
        C3o5.A0f(parcel, this.A0O);
        C3o5.A0d(parcel, this.A06, i);
        C3o5.A0e(parcel, this.A0M);
        FixedSizes fixedSizes = this.A04;
        if (fixedSizes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fixedSizes.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0B);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        C3o5.A0d(parcel, this.A07, i);
        1BL.A13(parcel, this.A0C);
        parcel.writeLong(this.A01);
        C3o5.A0d(parcel, this.A05, i);
        parcel.writeString(this.A0D);
        1BL.A13(parcel, this.A0E);
        C3o5.A0d(parcel, this.A08, i);
        1BL.A13(parcel, this.A0F);
        C3o5.A0d(parcel, this.A0N, i);
        parcel.writeLong(this.A02);
        Bundle bundle = this.A03;
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        Iterator A0S2 = C3o5.A0S(parcel, this.A0P);
        while (A0S2.hasNext()) {
            C3o5.A0h(parcel, A0S2);
        }
    }
}
