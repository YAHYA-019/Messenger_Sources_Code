package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: AC0.class */
public final class AC0 implements 1K9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ 5Uu A02;
    public final /* synthetic */ ImmutableList A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public AC0(Context context, ThreadKey threadKey, 5Uu r304, ImmutableList immutableList, String str, String str2, boolean z) {
        this.A05 = str;
        this.A02 = r304;
        this.A01 = threadKey;
        this.A03 = immutableList;
        this.A06 = z;
        this.A04 = str2;
        this.A00 = context;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        4zI.A03.A02("RtcCallHelperImpl", "Fetch thread id failed", th, new Object[0]);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        4zJ r0 = 4zI.A03;
        String str = this.A05;
        r0.A05("RtcCallHelperImpl", 0Pz.A0W("Starting/joining group call with fetched server info data: ", str), new Object[0]);
        5Uu r02 = this.A02;
        ThreadKey threadKey = this.A01;
        ImmutableList immutableList = this.A03;
        boolean z = this.A06;
        String str2 = this.A04;
        r02.A03(this.A00, threadKey, immutableList, (Long) obj, str, str2, true, z);
    }
}
