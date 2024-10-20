package X;

import android.text.TextUtils;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Optional;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.47r, reason: invalid class name */
/* loaded from: 47r.class */
public final class C47r extends C47s implements C7z0 {
    public final C47p A00;
    public final C0dp A01;
    public final C2mT A02;
    public final C47x A03;
    public final C00i A04;
    public final C00i A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47r(C2mT c2mT, C47o c47o, C47p c47p, C47l c47l, C47n c47n, 45R r307, C0dp c0dp, QuickPerformanceLogger quickPerformanceLogger, String str, int i, int i2, long j, long j2, long j3, boolean z, boolean z2) {
        super(c47l, c47n, r307, quickPerformanceLogger, str, i, i2, j, C47u.A01(j, j2, j3), z, z2);
        11T.A0F(quickPerformanceLogger, 1);
        11T.A0F(r307, 2);
        11T.A0F(c47l, 3);
        11T.A0F(c47n, 4);
        this.A03 = new C47x();
        1BQ r0 = new 1BQ(66351);
        this.A04 = r0;
        this.A05 = new 1BQ(66341);
        this.A01 = c0dp;
        this.A00 = c47p;
        this.A02 = c2mT;
        int i3 = super.A06;
        int i4 = super.A05;
        c47p.onMarkerStart(i3, i4, j);
        if (quickPerformanceLogger.isMarkerOn(i3, i4, true) && ((3zV) c47o.A05.get()).A04 != -1) {
            ((1GU) c47o.A03.get()).Ciz(new 6EN(c47o, i3, i4));
        }
        this.A06 = ((1Fv) r0.get()).A04().A05;
    }

    private void A00() {
        C2mT c2mT = this.A02;
        Bch(AnonymousClass000.A00(34), c2mT.A02());
        Optional A00 = c2mT.A00();
        Bch(1BJ.A00(49), A00.isPresent() ? A00.get().toString() : "unknown");
    }

    private void A01(Summary summary, String str, long j, long j2, long j3, boolean z, boolean z2) {
        if (A0I(0S2.A0C)) {
            if (summary != null) {
                F1i.A01(summary, this.A08, 0Pz.A0W(str, "_cached_content"), super.A06, super.A05);
            }
            A0F(str, j, j2, j3, z2, z);
        }
    }

    private void A02(Summary summary, String str, long j, boolean z) {
        if (A0I(0S2.A0C)) {
            if (summary != null) {
                F1i.A00(summary, this.A08, 0Pz.A0W(str, "_network_content"), super.A06, super.A05);
            }
            A0D(j, str, z);
        }
    }

    @Override // X.C47s
    public void A0C() {
        Bcf("number_of_spinners_visible", ((C2we) this.A05.get()).A00);
        List list = this.A03.A00;
        if (!list.isEmpty()) {
            Collections.sort(list);
            Bcj("ttrc_graphql_query_name", C3o5.A0n(list));
            list.clear();
        }
        A00();
        if (this.A06 != ConstantsKt.CAMERA_ID_FRONT) {
            Bci("processed_user_profile_switch", !r0.equals(((1Fv) this.A04.get()).A04().A05));
        }
        super.A0C();
        this.A00.onMarkerEnd(super.A06, super.A05, super.A01, super.A00, (short) 2);
    }

    @Override // X.C47s
    public void A0E(String str, long j) {
        synchronized (this) {
            if (A0H() && !0Dq.A03) {
                super.A0E(str, j);
            }
        }
    }

    @Override // X.C47s
    public void A0G(String str, short s) {
        Bcf("number_of_spinners_visible", ((C2we) this.A05.get()).A00);
        List list = this.A03.A00;
        if (!list.isEmpty()) {
            Collections.sort(list);
            Bcj("ttrc_graphql_query_name", C3o5.A0n(list));
            list.clear();
        }
        A00();
        if (this.A06 != ConstantsKt.CAMERA_ID_FRONT) {
            Bci("processed_user_profile_switch", !r0.equals(((1Fv) this.A04.get()).A04().A05));
        }
        super.A0G(str, s);
        this.A00.onMarkerEnd(super.A06, super.A05, super.A01, super.A00, s);
    }

    @Override // X.C7z0
    public void A7B(String str, String str2, TimeUnit timeUnit, long j) {
        synchronized (this) {
            A7A(str, timeUnit, j);
            C47x c47x = this.A03;
            if (!TextUtils.isEmpty(str2)) {
                c47x.A00.add(str2);
            }
        }
    }

    @Override // X.C7z0
    public void ADA(GraphQLResult graphQLResult, String str) {
        A01(((AbstractC08294mh) graphQLResult).A02, str, this.A01.now() - ((AbstractC08294mh) graphQLResult).A00, this.A07.now(), -1, false, false);
    }

    @Override // X.C7z0
    public void ADB(Summary summary, String str, long j, boolean z) {
        A01(summary, str, summary.cachedResponseAge, j, -1, false, z);
    }

    @Override // X.C47s, X.C47t
    public void Bce(String str, double d) {
        super.Bce(str, d);
        this.A00.onMarkerAnnotate(super.A06, super.A05, str, d);
    }

    @Override // X.C47s, X.C47t
    public void Bcf(String str, int i) {
        super.Bcf(str, i);
        if (str != null) {
            this.A00.onMarkerAnnotate(super.A06, super.A05, str, i);
        }
    }

    @Override // X.C47s, X.C47t
    public void Bcg(String str, long j) {
        super.Bcg(str, j);
        if (str != null) {
            this.A00.onMarkerAnnotate(super.A06, super.A05, str, j);
        }
    }

    @Override // X.C47s, X.C47t
    public void Bch(String str, String str2) {
        super.Bch(str, str2);
        if (str == null || str2 == null) {
            return;
        }
        this.A00.onMarkerAnnotate(super.A06, super.A05, str, str2);
    }

    @Override // X.C47s, X.C47t
    public void Bci(String str, boolean z) {
        super.Bci(str, z);
        if (str != null) {
            this.A00.onMarkerAnnotate(super.A06, super.A05, str, z);
        }
    }

    @Override // X.C47s, X.C47t
    public void Bcj(String str, String[] strArr) {
        super.Bcj(str, strArr);
        this.A00.onMarkerAnnotate(super.A06, super.A05, str, strArr);
    }

    @Override // X.C47s, X.C47t
    public void Bcr(String str) {
        super.Bcr(str);
        if (str != null) {
            this.A00.onMarkerPoint(super.A06, super.A05, str, null, this.A07.now());
        }
    }

    @Override // X.C47s, X.C47t
    public void Bcs(String str, long j) {
        super.Bcs(str, j);
        if (str != null) {
            this.A00.onMarkerPoint(super.A06, super.A05, str, null, j);
        }
    }

    @Override // X.C47s, X.C47t
    public void Bct(String str, String str2) {
        super.Bct(str, str2);
        this.A00.onMarkerPoint(super.A06, super.A05, str, str2, this.A07.now());
    }

    @Override // X.C7z0
    public void BfB(GraphQLResult graphQLResult, String str, boolean z) {
        A02(((AbstractC08294mh) graphQLResult).A02, str, this.A07.now(), true);
    }

    @Override // X.C7z0
    public void BfC(Summary summary, String str, boolean z) {
        A02(summary, str, this.A07.now(), z);
    }

    @Override // X.C7z0
    public void CYV(Summary summary, String str, long j, long j2, boolean z, boolean z2) {
        if (z2 && summary != null) {
            F1i.A00(summary, this.A08, 0Pz.A0W(str, "_prefetched_content"), super.A06, super.A05);
        }
        A01(summary, str, j, this.A07.now(), j2, true, z);
    }
}
