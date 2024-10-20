package com.facebook.papaya.fb.client.transport.batch;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1G3;
import X.4YT;
import X.AnonymousClass000;
import X.C00i;
import X.C06w;
import X.C06z;
import X.C0il;
import X.HJq;
import android.content.Context;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.papaya.client.transport.batch.ITransport;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: FBTransport.class */
public final class FBTransport extends ITransport {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(FBTransport.class, "tigonServiceHolder", "getTigonServiceHolder()Lcom/facebook/tigon/nativeservice/NativeTigonServiceHolder;", 0), new C06w(FBTransport.class, "fbSharedPreferences", "getFbSharedPreferences()Lcom/facebook/prefs/shared/FbSharedPreferences;", 0)};
    public static final HJq Companion = new Object();
    public final C00i executor;
    public final 1Br fbSharedPreferences$delegate;
    public final 1Br tigonServiceHolder$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBTransport(Context context, Bundle bundle) {
        super(context);
        1BL.A1F(context, bundle);
        this.tigonServiceHolder$delegate = 1Bq.A00(16896);
        this.fbSharedPreferences$delegate = 1BK.A0E();
        C0il.A0B("papaya-fb-transport-batch");
        String A00 = AnonymousClass000.A00(22);
        if (!bundle.containsKey(A00)) {
            throw 1BK.A0g();
        }
        1Br A002 = 1Bu.A00(16452);
        this.executor = A002;
        TigonServiceHolder tigonServiceHolder = (TigonServiceHolder) 1Br.A0B(this.tigonServiceHolder$delegate);
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory((ScheduledExecutorService) A002.get());
        String canonicalPath = context.getFilesDir().getCanonicalPath();
        11T.A0A(canonicalPath);
        String string = bundle.getString(A00);
        String BD0 = 1Br.A09(this.fbSharedPreferences$delegate).BD0(new 1G3(4YT.A00(1108)));
        BD0 = BD0 == null ? "PROD" : BD0;
        String string2 = bundle.getString(4YT.A00(ActionId.RTMP_CONNECTION_RELEASE), "");
        11T.A0A(string2);
        int i = bundle.getInt("acs_config", 0);
        String string3 = bundle.getString(4YT.A00(820), "");
        11T.A0A(string3);
        initHybrid(tigonServiceHolder, androidAsyncExecutorFactory2, canonicalPath, string, BD0, string2, i, string3);
    }

    private final native void initHybrid(TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, String str2, String str3, String str4, int i, String str5);
}
