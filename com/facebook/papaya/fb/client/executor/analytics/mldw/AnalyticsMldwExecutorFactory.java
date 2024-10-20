package com.facebook.papaya.fb.client.executor.analytics.mldw;

import X.0Pz;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.5hE;
import X.5hH;
import X.5hO;
import X.C0s8;
import X.JQw;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.papaya.client.executor.IExecutorFactory;
import com.facebook.papaya.log.LogSink;
import com.facebook.papaya.mldw.Manager;
import com.facebook.papaya.mldw.network_transport.Transport;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: AnalyticsMldwExecutorFactory.class */
public final class AnalyticsMldwExecutorFactory extends IExecutorFactory {
    public static final 5hE Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsMldwExecutorFactory(Context context, Bundle bundle) {
        super("papaya-fb-fa-mldw-executor");
        String str;
        11T.A0F(context, 1);
        11T.A0F(bundle, 2);
        int i = bundle.getInt("mldw_product", -1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bundle.containsKey("enforce_secure_aggregation")) {
            linkedHashMap.put("enforce_secure_aggregation", String.valueOf(bundle.getBoolean("enforce_secure_aggregation")));
        }
        if (bundle.containsKey("validate_enclave_binary_identifiers")) {
            linkedHashMap.put("validate_enclave_binary_identifiers", String.valueOf(bundle.getBoolean("validate_enclave_binary_identifiers")));
        }
        if (bundle.containsKey("min_kanon_threshold")) {
            linkedHashMap.put("min_kanon_threshold", String.valueOf(bundle.getInt("min_kanon_threshold")));
        }
        for (String str2 : C0s8.A14("max_epsilon", "max_delta", "min_sensitivity")) {
            if (bundle.containsKey(str2)) {
                linkedHashMap.put(str2, String.valueOf(bundle.getFloat(str2)));
            }
        }
        int i2 = bundle.getInt("mldw_product", -1);
        String string = bundle.getString("mldw_store_path");
        if (string == null || string.length() == 0) {
            str = "Empty mldw store file path.";
        } else {
            String string2 = bundle.getString("mldw_feature_group_id");
            if (string2 == null || string2.length() == 0) {
                str = "Empty mldw feature group id.";
            } else {
                int i3 = bundle.getInt("mldw_feature_version");
                if (i3 > 0) {
                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16465);
                    TigonServiceHolder tigonServiceHolder = (TigonServiceHolder) 1Bi.A03(16896);
                    ViewerContext viewerContext = (ViewerContext) 1Bn.A0E(context, (1BY) null, 83431);
                    Manager.nativeAddLogSink(JQw.A00(312), 5hH.A04.value, (LogSink) 1Bn.A0A(131180));
                    5hO r0 = Transport.Companion;
                    String str3 = viewerContext.mAuthToken;
                    11T.A0A(str3);
                    Manager.registerHost(i2, scheduledExecutorService, string, new Transport(tigonServiceHolder, str3, null), null).registerFeatures(string2, i3);
                    initHybrid(i, linkedHashMap);
                }
                str = 0Pz.A0T("Invalid feature version ", i3);
            }
        }
        0fH.A0k("AnalyticsMldwExecutorFactory", str);
        initHybrid(i, linkedHashMap);
    }

    private final native void initHybrid(int i, Map map);
}
