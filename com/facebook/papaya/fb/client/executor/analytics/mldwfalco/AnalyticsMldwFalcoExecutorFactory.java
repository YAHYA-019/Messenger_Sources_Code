package com.facebook.papaya.fb.client.executor.analytics.mldwfalco;

import X.0fH;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.4YT;
import X.5hH;
import X.AnonymousClass001;
import X.C0s8;
import X.JQy;
import X.KX4;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.papaya.client.executor.IExecutorFactory;
import com.facebook.papaya.log.LogSink;
import com.facebook.papaya.mldw.Manager;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: AnalyticsMldwFalcoExecutorFactory.class */
public final class AnalyticsMldwFalcoExecutorFactory extends IExecutorFactory {
    public static final KX4 Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsMldwFalcoExecutorFactory(Context context, Bundle bundle) {
        super("papaya-fb-fa-mldw-falco-executor");
        1BL.A1F(context, bundle);
        LinkedHashMap A1C = 1BK.A1C();
        if (bundle.containsKey("enforce_secure_aggregation")) {
            A1C.put("enforce_secure_aggregation", String.valueOf(bundle.getBoolean("enforce_secure_aggregation")));
        }
        String A00 = 4YT.A00(1567);
        if (bundle.containsKey(A00)) {
            A1C.put(A00, String.valueOf(bundle.getBoolean(A00)));
        }
        String A002 = 4YT.A00(1297);
        if (bundle.containsKey(A002)) {
            A1C.put(A002, String.valueOf(bundle.getInt(A002)));
        }
        Iterator it = C0s8.A14("max_epsilon", "max_delta", 4YT.A00(1298)).iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (bundle.containsKey(A0i)) {
                A1C.put(A0i, String.valueOf(bundle.getFloat(A0i)));
            }
        }
        String string = bundle.getString("mldw_store_path");
        if (string == null || string.length() == 0) {
            0fH.A0k("AnalyticsMldwFalcoExecutorFactory", 4YT.A00(588));
        } else {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16465);
            TigonServiceHolder tigonServiceHolder = (TigonServiceHolder) 1Bi.A03(16896);
            ViewerContext viewerContext = (ViewerContext) 1Bn.A0E(context, (1BY) null, 83431);
            Manager.nativeAddLogSink("mldw_falco_log_sink", 5hH.A04.value, (LogSink) 1Bn.A0A(131180));
            Manager.registerHost(10, scheduledExecutorService, string, JQy.A0Y(viewerContext, tigonServiceHolder), null);
        }
        initHybrid(A1C);
    }

    private final native void initHybrid(Map map);
}
