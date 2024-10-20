package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.5xs, reason: invalid class name */
/* loaded from: 5xs.class */
public final class C5xs implements C5xl, CallerContextable {
    public static final String __redex_internal_original_name = "ThreadSummaryRepositoryImpl";
    public final 1Br A00 = 1Bu.A00(65582);
    public final 1Br A01 = 1Bu.A00(539);

    @Override // X.C5xl
    public LiveData ASY(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        0fH.A0j(__redex_internal_original_name, "findById");
        C1F6 c1f6 = (C1F6) this.A00.A00.get();
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            C5xt c5xt = new C5xt(new 1De(c1f6, new int[0]), threadKey);
            1Bn.A0K();
            FbInjector.A04(A01);
            return c5xt;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
