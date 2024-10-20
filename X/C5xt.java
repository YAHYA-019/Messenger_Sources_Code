package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.5xt, reason: invalid class name */
/* loaded from: 5xt.class */
public final class C5xt extends MutableLiveData implements CallerContextable {
    public static final String __redex_internal_original_name = "ThreadSummaryResource";
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final Context A05;
    public final 1PA A06;
    public final 1De A07;

    public C5xt(1De r302, ThreadKey threadKey) {
        this.A07 = r302;
        this.A04 = threadKey;
        1BY r0 = r302.A00;
        Context context = (Context) 1Bn.A0E((Context) null, r0, 83719);
        this.A05 = context;
        this.A01 = 1HG.A00(context, 65728);
        this.A03 = 1Bu.A03(r0, 82763);
        this.A02 = 1Bq.A00(66360);
        1P9 r02 = new 1P9((1I7) this.A01.A00.get());
        r02.A05(new A37(this, 1), "com.facebook.orca.ACTION_MULTIPLE_THREADS_UPDATED_FOR_UI");
        this.A06 = r02.A02();
    }

    public final void A00() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        0fH.A0j(__redex_internal_original_name, "Start loading");
        5Vm A02 = ((5Vk) this.A03.A00.get()).A02(this.A04);
        A02.A03 = true;
        A02.A01 = CallerContext.A06(C5xt.class);
        A02.A03(new 9uM(this, 1));
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        0fH.A0j(__redex_internal_original_name, "onActive");
        this.A06.A00();
        A00();
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        0fH.A0j(__redex_internal_original_name, "onInactive");
        this.A06.A01();
    }
}
