package com.facebook.googleplay;

import X.0fH;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1JF;
import X.AbstractC02263un;
import X.AnonymousClass001;
import X.DEc;
import android.content.Intent;
import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: GooglePlayInstallRefererService.class */
public class GooglePlayInstallRefererService extends AbstractC02263un {
    public Set A00;

    public GooglePlayInstallRefererService() {
        super("GooglePlayInstallRefererService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02263un
    public void A03() {
        this.A00 = (Set) 1Bn.A0E(this, (1BY) null, 215);
    }

    @Override // X.AbstractC02263un
    public void A04(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            0fH.A0g(stringExtra, "GooglePlayInstallRefererService", "onHandleIntent: %s");
            if (1JF.A0B(stringExtra)) {
                return;
            }
            Uri build = new Uri.Builder().encodedQuery(Uri.decode(stringExtra)).build();
            ImmutableMap.Builder A0c = 1BK.A0c();
            Iterator<String> it = build.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                String queryParameter = build.getQueryParameter(A0i);
                if (queryParameter != null) {
                    A0c.put(A0i, queryParameter);
                }
            }
            ImmutableMap build2 = A0c.build();
            Set set = this.A00;
            set.getClass();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((DEc) it2.next()).CZP(build2);
            }
        }
    }
}
