package com.facebook.payments.p2p.datamodel;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.7zN;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DM3;
import X.ELw;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;
import com.facebook.graphql.enums.GraphQLLightweightEventRepeatMode;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.p2p.interfaces.P2pPaymentCustomConfig;
import com.facebook.payments.p2p.model.MarketplaceTransactionDisclaimerScreenDataParcelable;
import com.facebook.payments.p2p.model.P2pPromotionScreenInfoParcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: P2pPaymentConfig.class */
public final class P2pPaymentConfig implements Parcelable {
    public static volatile TriState A0R;
    public static volatile P2pPaymentMemoViewConfig A0S;
    public static volatile ImmutableList A0T;
    public static final Parcelable.Creator CREATOR = FKZ.A00(75);
    public final TriState A00;
    public final GraphQLLightweightEventRepeatMode A01;
    public final ThreadKey A02;
    public final CurrencyAmount A03;
    public final CurrencyAmount A04;
    public final PaymentsDecoratorAnimation A05;
    public final ELw A06;
    public final DM3 A07;
    public final P2pPaymentMemoViewConfig A08;
    public final P2pPaymentCustomConfig A09;
    public final MarketplaceTransactionDisclaimerScreenDataParcelable A0A;
    public final P2pPromotionScreenInfoParcelable A0B;
    public final ImmutableList A0C;
    public final ImmutableList A0D;
    public final Boolean A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final Set A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public P2pPaymentConfig(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A0P = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0F = parcel.readString();
        ThreadKey threadKey = null;
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (P2pPaymentCustomConfig) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = PaymentsDecoratorAnimation.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A0C = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbH.A00(parcel, strArr2, i3);
            }
            this.A0D = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        this.A0Q = 1BM.A07(parcel);
        this.A07 = DM3.values()[parcel.readInt()];
        this.A0I = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (CurrencyAmount) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (P2pPaymentMemoViewConfig) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (CurrencyAmount) parcel.readParcelable(A0e);
        }
        this.A06 = ELw.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (MarketplaceTransactionDisclaimerScreenDataParcelable) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (P2pPromotionScreenInfoParcelable) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = GraphQLLightweightEventRepeatMode.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        this.A0N = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = TriState.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = Boolean.valueOf(AbJ.A1V(parcel));
        }
        this.A02 = parcel.readInt() != 0 ? (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel) : threadKey;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0O = Collections.unmodifiableSet(A0v);
    }

    public P2pPaymentConfig(TriState triState, GraphQLLightweightEventRepeatMode graphQLLightweightEventRepeatMode, ThreadKey threadKey, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, PaymentsDecoratorAnimation paymentsDecoratorAnimation, ELw eLw, DM3 dm3, P2pPaymentMemoViewConfig p2pPaymentMemoViewConfig, P2pPaymentCustomConfig p2pPaymentCustomConfig, MarketplaceTransactionDisclaimerScreenDataParcelable marketplaceTransactionDisclaimerScreenDataParcelable, P2pPromotionScreenInfoParcelable p2pPromotionScreenInfoParcelable, ImmutableList immutableList, ImmutableList immutableList2, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, Set set, boolean z) {
        this.A0P = z;
        C1pq.A08("currencyCode", str);
        this.A0F = str;
        this.A09 = p2pPaymentCustomConfig;
        this.A05 = paymentsDecoratorAnimation;
        this.A0G = str2;
        this.A0C = immutableList;
        this.A0D = immutableList2;
        this.A0H = str3;
        this.A0Q = false;
        C1pq.A08("loggingModule", dm3);
        this.A07 = dm3;
        C1pq.A08("loggingObjectId", str4);
        this.A0I = str4;
        this.A03 = currencyAmount;
        this.A08 = p2pPaymentMemoViewConfig;
        this.A04 = currencyAmount2;
        C1pq.A08("p2pFlowStyle", eLw);
        this.A06 = eLw;
        this.A0A = marketplaceTransactionDisclaimerScreenDataParcelable;
        this.A0B = p2pPromotionScreenInfoParcelable;
        this.A0J = null;
        this.A01 = graphQLLightweightEventRepeatMode;
        this.A0K = null;
        this.A0L = str5;
        this.A0M = str6;
        C1pq.A08("sessionId", str7);
        this.A0N = str7;
        this.A00 = triState;
        this.A0E = bool;
        this.A02 = threadKey;
        this.A0O = Collections.unmodifiableSet(set);
    }

    private TriState A00() {
        if (this.A0O.contains("shouldOpenThemePicker")) {
            return this.A00;
        }
        if (A0R == null) {
            synchronized (this) {
                if (A0R == null) {
                    A0R = TriState.UNSET;
                }
            }
        }
        return A0R;
    }

    public P2pPaymentMemoViewConfig A01() {
        if (this.A0O.contains("memoViewData")) {
            return this.A08;
        }
        if (A0S == null) {
            synchronized (this) {
                if (A0S == null) {
                    A0S = new P2pPaymentMemoViewConfig(null, null, AnonymousClass001.A0v(), 36, 1);
                }
            }
        }
        return A0S;
    }

    public ImmutableList A02() {
        if (this.A0O.contains("enabledActions")) {
            return this.A0C;
        }
        if (A0T == null) {
            synchronized (this) {
                if (A0T == null) {
                    A0T = ImmutableList.of((Object) "REQUEST", (Object) "SEND");
                }
            }
        }
        return A0T;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof P2pPaymentConfig)) {
                return false;
            }
            P2pPaymentConfig p2pPaymentConfig = (P2pPaymentConfig) obj;
            if (this.A0P != p2pPaymentConfig.A0P || !11T.A0O(this.A0F, p2pPaymentConfig.A0F) || !11T.A0O(this.A09, p2pPaymentConfig.A09) || this.A05 != p2pPaymentConfig.A05 || !11T.A0O(this.A0G, p2pPaymentConfig.A0G) || !11T.A0O(A02(), p2pPaymentConfig.A02()) || !11T.A0O(this.A0D, p2pPaymentConfig.A0D) || !11T.A0O(this.A0H, p2pPaymentConfig.A0H) || this.A0Q != p2pPaymentConfig.A0Q || this.A07 != p2pPaymentConfig.A07 || !11T.A0O(this.A0I, p2pPaymentConfig.A0I) || !11T.A0O(this.A03, p2pPaymentConfig.A03) || !11T.A0O(A01(), p2pPaymentConfig.A01()) || !11T.A0O(this.A04, p2pPaymentConfig.A04) || this.A06 != p2pPaymentConfig.A06 || !11T.A0O(this.A0A, p2pPaymentConfig.A0A) || !11T.A0O(this.A0B, p2pPaymentConfig.A0B) || !11T.A0O(this.A0J, p2pPaymentConfig.A0J) || this.A01 != p2pPaymentConfig.A01 || !11T.A0O(this.A0K, p2pPaymentConfig.A0K) || !11T.A0O(this.A0L, p2pPaymentConfig.A0L) || !11T.A0O(this.A0M, p2pPaymentConfig.A0M) || !11T.A0O(this.A0N, p2pPaymentConfig.A0N) || A00() != p2pPaymentConfig.A00() || !11T.A0O(this.A0E, p2pPaymentConfig.A0E) || !11T.A0O(this.A02, p2pPaymentConfig.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A09, C1pq.A04(this.A0F, C1pq.A05(this.A0P)));
        int A02 = C1pq.A02(C1pq.A04(this.A0H, C1pq.A04(this.A0D, C1pq.A04(A02(), C1pq.A04(this.A0G, (A04 * 31) + C3o5.A03(this.A05))))), this.A0Q);
        int A042 = C1pq.A04(this.A04, C1pq.A04(A01(), C1pq.A04(this.A03, C1pq.A04(this.A0I, (A02 * 31) + C3o5.A03(this.A07)))));
        int A043 = C1pq.A04(this.A0J, C1pq.A04(this.A0B, C1pq.A04(this.A0A, (A042 * 31) + C3o5.A03(this.A06))));
        int A044 = C1pq.A04(this.A0N, C1pq.A04(this.A0M, C1pq.A04(this.A0L, C1pq.A04(this.A0K, (A043 * 31) + C3o5.A03(this.A01)))));
        return C1pq.A04(this.A02, C1pq.A04(this.A0E, (A044 * 31) + DKF.A04(A00())));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeString(this.A0F);
        C3o5.A0d(parcel, this.A09, i);
        C3o5.A0e(parcel, this.A05);
        1BL.A13(parcel, this.A0G);
        ImmutableList immutableList = this.A0C;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        ImmutableList immutableList2 = this.A0D;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        1BL.A13(parcel, this.A0H);
        parcel.writeInt(this.A0Q ? 1 : 0);
        7zN.A0z(parcel, this.A07);
        parcel.writeString(this.A0I);
        C3o5.A0d(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A08, i);
        C3o5.A0d(parcel, this.A04, i);
        7zN.A0z(parcel, this.A06);
        C3o5.A0d(parcel, this.A0A, i);
        C3o5.A0d(parcel, this.A0B, i);
        1BL.A13(parcel, this.A0J);
        C3o5.A0e(parcel, this.A01);
        1BL.A13(parcel, this.A0K);
        1BL.A13(parcel, this.A0L);
        1BL.A13(parcel, this.A0M);
        parcel.writeString(this.A0N);
        C3o5.A0e(parcel, this.A00);
        AbN.A0s(parcel, this.A0E);
        ThreadKey threadKey = this.A02;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        Iterator A0S2 = C3o5.A0S(parcel, this.A0O);
        while (A0S2.hasNext()) {
            C3o5.A0h(parcel, A0S2);
        }
    }
}
