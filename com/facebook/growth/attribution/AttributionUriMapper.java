package com.facebook.growth.attribution;

import X.11T;
import X.1Bq;
import X.1Br;
import X.4YV;
import X.AnonymousClass001;
import X.C4S3;
import X.EvR;
import X.RNw;
import X.Rej;
import X.S9v;
import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

/* loaded from: AttributionUriMapper.class */
public final class AttributionUriMapper extends C4S3 {
    public final 1Br A00 = 1Bq.A00(100227);

    @Override // X.C4S3
    public Intent A00(Context context, Intent intent) {
        11T.A0F(context, 0);
        RNw A00 = ((EvR) 1Br.A0B(this.A00)).A00(4YV.A0E(context));
        Rej rej = A00.A04;
        JSONObject A12 = AnonymousClass001.A12();
        A12.put("event_name", "flush");
        Rej.A01(11T.A02(A12), "info", rej);
        A00.A03.execute(new S9v(A00));
        return null;
    }
}
