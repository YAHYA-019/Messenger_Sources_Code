package com.facebook.analytics;

import X.1BQ;
import X.1BV;
import X.1Bn;
import X.C00i;
import X.C15h;
import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.flexiblesampling.BaseSamplingPolicyConfig;
import java.util.Set;

/* loaded from: NewAnalyticsSamplingPolicyConfig.class */
public class NewAnalyticsSamplingPolicyConfig extends BaseSamplingPolicyConfig {
    public C15h A04;
    public final C00i A05 = new 1BQ(68059);
    public final C00i A06 = new 1BQ(16386);
    public C00i A00 = new 1BQ(16580);
    public Set A03 = 1Bn.A0I(ActionId.MESSENGER_DELTA_REQUEST);
    public C00i A02 = new 1BQ(68335);
    public C00i A01 = new 1BV(16607);

    public NewAnalyticsSamplingPolicyConfig(final Context context) {
        final int i = 0;
        this.A04 = new C15h(context, this, i) { // from class: X.30i
            public final int A00;
            public final Object A01;
            public final Object A02;

            {
                this.A00 = i;
                this.A01 = this;
                this.A02 = context;
            }

            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                if (this.A00 != 0) {
                    return new 2R2(1UD.A00((04J) this.A01, 1BK.A0N((C00i) this.A02).AZk(36321980076606449L) ? 1ZG.A01 : 1ZG.A02, "qpl_aggregations"), 282);
                }
                return 1Fw.A06(1Bn.A0E((Context) this.A02, (1BY) null, 16428)).A04;
            }
        };
    }
}
