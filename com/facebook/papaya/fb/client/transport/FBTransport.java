package com.facebook.papaya.fb.client.transport;

import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.5hB;
import X.C00i;
import X.C06w;
import X.C06z;
import X.C0il;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: FBTransport.class */
public final class FBTransport extends ITransport {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(FBTransport.class, "tigonServiceHolder", "getTigonServiceHolder()Lcom/facebook/tigon/nativeservice/NativeTigonServiceHolder;", 0)};
    public static final 5hB Companion = new Object();
    public final C00i executor;
    public final 1Br tigonServiceHolder$delegate;

    public FBTransport(Context context, Bundle bundle) {
        11T.A0F(context, 1);
        11T.A0F(bundle, 2);
        this.tigonServiceHolder$delegate = 1Bq.A00(16896);
        C0il.A0B("papaya-fb-transport");
        if (!bundle.containsKey("access_token")) {
            throw 1BK.A0g();
        }
        1Br A00 = 1Bu.A00(16452);
        this.executor = A00;
        TigonServiceHolder tigonServiceHolder = (TigonServiceHolder) this.tigonServiceHolder$delegate.A00.get();
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory((ScheduledExecutorService) A00.get());
        String absolutePath = context.getFilesDir().getAbsolutePath();
        11T.A0A(absolutePath);
        String string = bundle.getString("access_token");
        String string2 = PreferenceManager.getDefaultSharedPreferences(context).getString("fbtransport_tier", "PROD");
        String string3 = bundle.getString("base_url_override", "");
        11T.A0A(string3);
        int i = bundle.getInt("acs_config", 0);
        String string4 = bundle.getString("acs_access_token", "");
        11T.A0A(string4);
        initHybrid(tigonServiceHolder, androidAsyncExecutorFactory2, absolutePath, string, string2, string3, i, string4);
    }

    private final native void initHybrid(TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, String str2, String str3, String str4, int i, String str5);
}
