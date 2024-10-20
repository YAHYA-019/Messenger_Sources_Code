package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.690, reason: invalid class name */
/* loaded from: 690.class */
public final class AnonymousClass690 implements AnonymousClass691 {
    public static volatile HeterogeneousMap A0Y;
    public static volatile CharSequence A0Z;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final 7SN A07;
    public final 7SO A08;
    public final C5vw A09;
    public final HeterogeneousMap A0A;
    public final CharSequence A0B;
    public final Long A0C;
    public final Long A0D;
    public final Long A0E;
    public final Long A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final Set A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    public AnonymousClass690(7EG r302) {
        CharSequence A01;
        C5vv AVC;
        String str;
        this.A00 = r302.A00;
        this.A01 = r302.A01;
        this.A07 = r302.A07;
        this.A0C = r302.A0C;
        this.A02 = r302.A02;
        String str2 = r302.A0G;
        C1pq.A08("cta1Title", str2);
        this.A0G = str2;
        String str3 = r302.A0H;
        C1pq.A08("cta1Type", str3);
        this.A0H = str3;
        this.A0D = r302.A0D;
        this.A03 = r302.A03;
        String str4 = r302.A0I;
        C1pq.A08("cta2Title", str4);
        this.A0I = str4;
        String str5 = r302.A0J;
        C1pq.A08("cta2Type", str5);
        this.A0J = str5;
        this.A0E = r302.A0E;
        this.A04 = r302.A04;
        String str6 = r302.A0K;
        C1pq.A08("cta3Title", str6);
        this.A0K = str6;
        String str7 = r302.A0L;
        C1pq.A08("cta3Type", str7);
        this.A0L = str7;
        this.A0M = r302.A0M;
        this.A09 = r302.A09;
        this.A0N = r302.A0N;
        this.A0O = r302.A0O;
        this.A0P = r302.A0P;
        this.A0Q = r302.A0Q;
        this.A05 = r302.A05;
        this.A0R = r302.A0R;
        this.A0S = r302.A0S;
        this.A0V = r302.A0V;
        this.A0W = r302.A0W;
        this.A0A = r302.A0A;
        this.A0F = r302.A0F;
        this.A06 = r302.A06;
        this.A0X = r302.A0X;
        this.A0T = r302.A0T;
        this.A08 = r302.A08;
        this.A0B = r302.A0B;
        this.A0U = Collections.unmodifiableSet(r302.A0U);
        String str8 = this.A0M;
        if (!(((str8 == null || str8.length() == 0) && ((A01 = A01()) == null || A01.length() == 0)) ? false : true)) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
        C5vw c5vw = this.A09;
        if (c5vw != null && ((AVC = c5vw.AVC()) == null || (str = AVC.actionName) == null || str.length() <= 0)) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
        if (this.A0C != null && (this.A0G.length() <= 0 || this.A0H.length() <= 0)) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
        if (this.A0D != null && (this.A0I.length() <= 0 || this.A0J.length() <= 0)) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
        if (this.A0E != null) {
            if (this.A0K.length() <= 0 || this.A0L.length() <= 0) {
                throw AnonymousClass001.A0L("Failed requirement.");
            }
        }
    }

    public HeterogeneousMap A00() {
        if (this.A0U.contains("metadata")) {
            return this.A0A;
        }
        if (A0Y == null) {
            synchronized (this) {
                if (A0Y == null) {
                    Parcelable.Creator creator = HeterogeneousMap.CREATOR;
                    A0Y = C1zz.A02();
                }
            }
        }
        return A0Y;
    }

    public CharSequence A01() {
        if (this.A0U.contains("title")) {
            return this.A0B;
        }
        if (A0Z == null) {
            synchronized (this) {
                if (A0Z == null) {
                    A0Z = "";
                }
            }
        }
        return A0Z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass690)) {
                return false;
            }
            AnonymousClass690 anonymousClass690 = (AnonymousClass690) obj;
            if (this.A00 != anonymousClass690.A00 || this.A01 != anonymousClass690.A01 || !11T.A0O(this.A07, anonymousClass690.A07) || !11T.A0O(this.A0C, anonymousClass690.A0C) || this.A02 != anonymousClass690.A02 || !11T.A0O(this.A0G, anonymousClass690.A0G) || !11T.A0O(this.A0H, anonymousClass690.A0H) || !11T.A0O(this.A0D, anonymousClass690.A0D) || this.A03 != anonymousClass690.A03 || !11T.A0O(this.A0I, anonymousClass690.A0I) || !11T.A0O(this.A0J, anonymousClass690.A0J) || !11T.A0O(this.A0E, anonymousClass690.A0E) || this.A04 != anonymousClass690.A04 || !11T.A0O(this.A0K, anonymousClass690.A0K) || !11T.A0O(this.A0L, anonymousClass690.A0L) || !11T.A0O(this.A0M, anonymousClass690.A0M) || !11T.A0O(this.A09, anonymousClass690.A09) || !11T.A0O(this.A0N, anonymousClass690.A0N) || !11T.A0O(this.A0O, anonymousClass690.A0O) || !11T.A0O(this.A0P, anonymousClass690.A0P) || !11T.A0O(this.A0Q, anonymousClass690.A0Q) || this.A05 != anonymousClass690.A05 || !11T.A0O(this.A0R, anonymousClass690.A0R) || !11T.A0O(this.A0S, anonymousClass690.A0S) || this.A0V != anonymousClass690.A0V || this.A0W != anonymousClass690.A0W || !11T.A0O(A00(), anonymousClass690.A00()) || !11T.A0O(this.A0F, anonymousClass690.A0F) || this.A06 != anonymousClass690.A06 || this.A0X != anonymousClass690.A0X || !11T.A0O(this.A0T, anonymousClass690.A0T) || !11T.A0O(this.A08, anonymousClass690.A08) || !11T.A0O(A01(), anonymousClass690.A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A01(), C1pq.A04(this.A08, C1pq.A04(this.A0T, C1pq.A02((C1pq.A04(this.A0F, C1pq.A04(A00(), C1pq.A02(C1pq.A02(C1pq.A04(this.A0S, C1pq.A04(this.A0R, (C1pq.A04(this.A0Q, C1pq.A04(this.A0P, C1pq.A04(this.A0O, C1pq.A04(this.A0N, C1pq.A04(this.A09, C1pq.A04(this.A0M, C1pq.A04(this.A0L, C1pq.A04(this.A0K, (C1pq.A04(this.A0E, C1pq.A04(this.A0J, C1pq.A04(this.A0I, (C1pq.A04(this.A0D, C1pq.A04(this.A0H, C1pq.A04(this.A0G, (C1pq.A04(this.A0C, C1pq.A04(this.A07, ((this.A00 + 31) * 31) + this.A01)) * 31) + this.A02))) * 31) + this.A03))) * 31) + this.A04)))))))) * 31) + this.A05)), this.A0V), this.A0W))) * 31) + this.A06, this.A0X))));
    }
}
