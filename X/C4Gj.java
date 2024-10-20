package X;

import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.4Gj, reason: invalid class name */
/* loaded from: 4Gj.class */
public final class C4Gj implements C4Gf {
    @Override // X.C4Gf
    public C4Gy A8f(C4Gc c4Gc, 44I r303) {
        11T.A0F(r303, 0);
        11T.A0F(c4Gc, 1);
        4GM r0 = c4Gc.A0G;
        QuickPromotionDefinition quickPromotionDefinition = r303.A00;
        if (r0.A00(quickPromotionDefinition.promotionId) == 0S2.A0N) {
            return C4Gx.A00();
        }
        final long j = quickPromotionDefinition.startTime * 1000;
        final long j2 = quickPromotionDefinition.endTime * 1000;
        final long j3 = c4Gc.A00;
        boolean z = (j == 0 || j3 > j) && (j2 == 0 || j3 < j2);
        C4H5 c4h5 = new C4H5(j, j2, j3) { // from class: X.4H4
            public final long A00;
            public final long A01;
            public final long A02;

            {
                this.A02 = j;
                this.A01 = j2;
                this.A00 = j3;
            }

            @Override // X.C4H5
            public ImmutableMap ACn() {
                ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
                builder.put("startTimeEpochMillis", String.valueOf(this.A02));
                builder.put("endTimeEpochMillis", String.valueOf(this.A01));
                builder.put("clientTimeInEpochMillis", String.valueOf(this.A00));
                ImmutableMap build = builder.build();
                11T.A0A(build);
                return build;
            }
        };
        return z ? C4Gx.A01(c4h5) : C4Gx.A02(c4h5, "outside_of_enabled_time");
    }

    @Override // X.C4Gf
    public String DAM() {
        return "client_enabled_time";
    }
}
