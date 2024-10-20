package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.core.adapter.MsysThreadViewAdapter;

/* renamed from: X.89D, reason: invalid class name */
/* loaded from: 89D.class */
public final class C89D extends MutableLiveData implements CallerContextable {
    public static final String __redex_internal_original_name = "MsysThreadSummaryResource";
    public 1BY A00;
    public final C00i A01 = 1BQ.A02(66360);
    public final ThreadKey A02;

    public C89D(1BO r302, ThreadKey threadKey) {
        this.A00 = 7zL.A0Q(r302);
        this.A02 = threadKey;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        0fH.A0j(__redex_internal_original_name, "onActive");
        1BY r0 = this.A00;
        ((MsysThreadViewAdapter) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 49762)).A00(this.A02, new 89E(this));
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        0fH.A0j(__redex_internal_original_name, "onInactive");
        1BY r0 = this.A00;
        ((MsysThreadViewAdapter) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 49762)).A01(this.A02);
    }
}
