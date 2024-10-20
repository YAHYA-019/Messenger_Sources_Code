package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: ABz.class */
public final class ABz implements 1K9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ 5Uu A02;
    public final /* synthetic */ ImmutableList A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public ABz(Context context, ThreadKey threadKey, 5Uu r304, ImmutableList immutableList, String str, boolean z) {
        this.A02 = r304;
        this.A01 = threadKey;
        this.A03 = immutableList;
        this.A05 = z;
        this.A04 = str;
        this.A00 = context;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        4zI.A03.A02("RtcCallHelperImpl", "Fetch thread id failed", th, new Object[0]);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        4zI.A03.A05("RtcCallHelperImpl", 0Pz.A0W("Starting/joining group call with provided server info data: ", (String) null), new Object[0]);
        5Uu r0 = this.A02;
        ThreadKey threadKey = this.A01;
        ImmutableList immutableList = this.A03;
        boolean z = this.A05;
        String str = this.A04;
        r0.A03(this.A00, threadKey, immutableList, (Long) obj, (String) null, str, false, z);
    }
}
