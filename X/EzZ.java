package X;

import android.net.Uri;
import com.facebook.graphql.enums.GraphQLPeerToPeerPaymentRequestStatus;
import com.facebook.graphql.enums.GraphQLPeerToPeerTransferStatus;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.p2p.logging.P2pPaymentsLoggingExtraData;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Set;

/* loaded from: EzZ.class */
public final class EzZ {
    public final Uri A00;
    public final GraphQLPeerToPeerTransferStatus A01;
    public final 2JX A02;
    public final 2JX A03;
    public final Dkz A04;
    public final CurrencyAmount A05;
    public final P2pPaymentsLoggingExtraData A06;
    public final RTM A07;
    public final Dkv A08;
    public final User A09;
    public final User A0A;
    public final User A0B;
    public final ImmutableList A0C;
    public final ImmutableList A0D;
    public final ImmutableList A0E;
    public final Boolean A0F;
    public final Long A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final GraphQLPeerToPeerPaymentRequestStatus A0M;
    public final User A0N;
    public final Set A0O;

    public EzZ(RPP rpp) {
        this.A0C = rpp.A0E;
        this.A05 = rpp.A06;
        this.A02 = rpp.A03;
        this.A07 = rpp.A08;
        this.A0D = rpp.A0F;
        this.A00 = rpp.A00;
        this.A0H = rpp.A0J;
        ImmutableList immutableList = rpp.A0G;
        C1pq.A08("individualRequests", immutableList);
        this.A0E = immutableList;
        this.A0I = rpp.A0K;
        this.A06 = rpp.A07;
        this.A03 = rpp.A04;
        this.A0J = rpp.A0L;
        this.A0K = rpp.A0M;
        this.A09 = rpp.A0A;
        this.A0M = rpp.A01;
        this.A0N = rpp.A0B;
        this.A0A = rpp.A0C;
        this.A04 = rpp.A05;
        this.A0L = rpp.A0N;
        this.A0B = rpp.A0D;
        Boolean bool = rpp.A0H;
        C1pq.A08("shouldHideDetails", bool);
        this.A0F = bool;
        this.A08 = rpp.A09;
        this.A0G = rpp.A0I;
        this.A01 = rpp.A02;
        this.A0O = Collections.unmodifiableSet(rpp.A0O);
    }

    private Long A00() {
        if (this.A0O.contains("sendTime")) {
            return null;
        }
        synchronized (this) {
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EzZ)) {
                return false;
            }
            EzZ ezZ = (EzZ) obj;
            if (!11T.A0O(this.A0C, ezZ.A0C) || !11T.A0O(this.A05, ezZ.A05) || !11T.A0O(this.A02, ezZ.A02) || !11T.A0O(this.A07, ezZ.A07) || !11T.A0O(this.A0D, ezZ.A0D) || !11T.A0O(this.A00, ezZ.A00) || !11T.A0O(this.A0H, ezZ.A0H) || !11T.A0O(this.A0E, ezZ.A0E) || !11T.A0O(this.A0I, ezZ.A0I) || !11T.A0O(this.A06, ezZ.A06) || !11T.A0O(this.A03, ezZ.A03) || !11T.A0O(this.A0J, ezZ.A0J) || !11T.A0O(this.A0K, ezZ.A0K) || !11T.A0O(this.A09, ezZ.A09) || this.A0M != ezZ.A0M || !11T.A0O(this.A0N, ezZ.A0N) || !11T.A0O(this.A0A, ezZ.A0A) || !11T.A0O(this.A04, ezZ.A04) || !11T.A0O(this.A0L, ezZ.A0L) || !11T.A0O(A00(), ezZ.A00()) || !11T.A0O(this.A0B, ezZ.A0B) || !11T.A0O(this.A0F, ezZ.A0F) || !11T.A0O(this.A08, ezZ.A08) || !11T.A0O(this.A0G, ezZ.A0G) || this.A01 != ezZ.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A09, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A04(this.A03, C1pq.A04(this.A06, (C1pq.A04(this.A0I, C1pq.A04(this.A0E, C1pq.A04(this.A0H, C1pq.A04(this.A00, C1pq.A04(this.A0D, C1pq.A04(this.A07, C1pq.A04(this.A02, C1pq.A04(this.A05, C1pq.A03(this.A0C))))))))) * 31) + 1237)))) * 31);
        int A042 = C1pq.A04(this.A0G, C1pq.A04(this.A08, C1pq.A04(this.A0F, C1pq.A04(this.A0B, C1pq.A04(A00(), C1pq.A04(this.A0L, C1pq.A04(this.A04, C1pq.A04(this.A0A, C1pq.A04(this.A0N, (A04 * 31) + C3o5.A03(this.A0M)))))))) * 31));
        return (A042 * 31) + DKF.A04(this.A01);
    }
}
