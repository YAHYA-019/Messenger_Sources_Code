package com.facebook.config.background.impl;

import X.0fH;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Ho;
import X.1IB;
import X.1JU;
import X.1Kd;
import X.1Od;
import X.1Yz;
import X.4Yg;
import X.4rX;
import X.C00i;
import X.C4Av;
import android.os.Bundle;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.fbservice.service.ServiceException;
import java.util.concurrent.ExecutionException;

/* loaded from: ConfigurationConditionalWorker.class */
public final class ConfigurationConditionalWorker implements C4Av {
    public 1BY A00;
    public final C00i A07 = new 1BQ(16772);
    public final C00i A08 = new 1BV((1BY) null, 33031);
    public final C00i A03 = new 1BQ(99390);
    public final ConfigurationConditionalWorkerInfo A02 = (ConfigurationConditionalWorkerInfo) 1Bi.A03(32970);
    public final C00i A05 = new 1BQ(33013);
    public final C00i A06 = new 1BQ(16385);
    public final 1Od A01 = (1Od) 1Bi.A03(16616);
    public final C00i A04 = new 1BV((1BY) null, 33255);

    public ConfigurationConditionalWorker(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static 1IB A00(final ConfigurationConditionalWorker configurationConditionalWorker, final String str) {
        0fH.A0l("ConfigurationConditionalWorker", "Starting fetch");
        Bundle bundle = new Bundle();
        bundle.putBoolean("forceFetch", false);
        1IB A00 = 1Ho.A00(((BlueServiceOperationFactory) configurationConditionalWorker.A08.get()).newInstance_DEPRECATED("configuration", bundle), true);
        final int i = 0;
        1Kd.A0F(new 4rX(str, configurationConditionalWorker, i) { // from class: X.35d
            public final int A00;
            public final Object A01;
            public final String A02;

            {
                this.A00 = i;
                this.A01 = configurationConditionalWorker;
                this.A02 = str;
            }

            /* JADX WARN: Code restructure failed: missing block: B:135:0x02a5, code lost:
            
                if (((X.2Ph) X.1Br.A0B(r0.A0E)).A02(r0.A0n).A02() == false) goto L127;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
            
                if (r0.A03() == false) goto L40;
             */
            /* JADX WARN: Type inference failed for: r0v58, types: [X.2J3, X.4vy] */
            /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, com.facebook.messaging.badging.logging.ThreadReadStats] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
                /*
                    Method dump skipped, instructions count: 1871
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C35d.A02(java.lang.Object):void");
            }

            public void A05(ServiceException serviceException) {
                if (this.A00 != 0) {
                    11T.A0F(serviceException, 0);
                    0fH.A0v("UnreadInboxItemsCalculator", "Fetch unread thread list [inbox] failed", serviceException);
                }
            }
        }, A00, 1JU.A01);
        return A00;
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        boolean z = false;
        if (r302.A01()) {
            try {
                1Yz.A00(A00(this, "cw"));
                z = true;
            } catch (ExecutionException unused) {
                return false;
            }
        }
        return z;
    }
}
