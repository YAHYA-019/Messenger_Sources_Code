package X;

import android.content.Context;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* loaded from: Cqh.class */
public final class Cqh implements DIB {
    public final Context A00;
    public final C00i A01 = 1BQ.A00();
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final D36 A05;
    public final ImmutableSet A06;
    public final boolean A07;
    public final String A08;

    public Cqh(Context context, ImmutableSet immutableSet, boolean z) {
        this.A00 = context;
        this.A06 = immutableSet;
        this.A08 = 0Pz.A0X("CacheSearchItemDataSource(", 1JF.A07(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, new Object[]{immutableSet}), ')');
        this.A05 = AbF.A0O(context, 429).A0n(ClientDataSourceIdentifier.A0q);
        this.A07 = z;
        this.A04 = 7zL.A0R(context, 84426);
        this.A03 = 7zL.A0R(context, 82526);
        this.A02 = 7zL.A0R(context, 83508);
    }

    public DataSourceIdentifier AgX() {
        return ClientDataSourceIdentifier.A0q;
    }

    public /* bridge */ /* synthetic */ ImmutableList B7q(ByH byH, Object obj) {
        ImmutableList build;
        ImmutableList A00;
        String str = (String) obj;
        if (1JF.A0A(str)) {
            A00 = ImmutableList.of();
        } else {
            String trim = str.trim();
            ImmutableSet immutableSet = this.A06;
            if (immutableSet.isEmpty()) {
                build = ImmutableList.of();
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                1Du it = ((CQk) this.A04.get()).A0B(immutableSet, trim, -1).iterator();
                while (it.hasNext()) {
                    AcX apply = this.A05.apply((Bz7) it.next());
                    if (apply != null) {
                        builder.m11011add((Object) apply);
                    }
                }
                build = builder.build();
            }
            Context context = this.A00;
            Crj crj = (Crj) 1Bn.A0E(context, (1BY) null, 83516);
            Object A0E = 1Bn.A0E(context, (1BY) null, 83517);
            C00i c00i = this.A01;
            if (1BK.A0N(c00i).AZk(36320674406547063L)) {
                build = (build == null || build.isEmpty()) ? ImmutableList.of() : D3Y.A00(A0E, build, 16);
            }
            A00 = CAz.A00(crj, build, this.A07);
            if (1BK.A0N(c00i).AZk(36321322947264710L)) {
                A00 = D3Y.A00(this, A00, 18);
            }
            if (((5PC) this.A03.get()).A01()) {
                BtV btV = (BtV) this.A02.get();
                11T.A0F(A00, 1);
                if (!0CU.A0O(str)) {
                    C00i c00i2 = btV.A00.A00;
                    D3R d3r = (D3R) c00i2.get();
                    String A13 = 4YU.A13(str);
                    11T.A0F(A13, 0);
                    d3r.A00 = A13;
                    return 1BL.A0a(C52z.A00((D3R) c00i2.get(), A00));
                }
            }
        }
        return A00;
    }

    public String getFriendlyName() {
        return this.A08;
    }
}
