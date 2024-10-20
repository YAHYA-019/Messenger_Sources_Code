package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* loaded from: Ca8.class */
public final class Ca8 implements Observer {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ LiveData A01;
    public final /* synthetic */ DDz A02;
    public final /* synthetic */ DFB A03;
    public final /* synthetic */ 6Im A04;
    public final /* synthetic */ ThreadKey A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public Ca8(Fragment fragment, LiveData liveData, DDz dDz, DFB dfb, 6Im r306, ThreadKey threadKey, String str, String str2, String str3) {
        this.A01 = liveData;
        this.A04 = r306;
        this.A05 = threadKey;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A00 = fragment;
        this.A02 = dDz;
        this.A03 = dfb;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        ThreadSummaryDataModel A0N = 7zU.A0N(obj);
        this.A01.removeObserver(this);
        ThreadSummary threadSummary = A0N.A00;
        6Im r0 = this.A04;
        C5yq A00 = ((C5ym) 1De.A00(r0.A01, 68427)).A00(4YU.A0I(r0), threadSummary, 0S2.A00);
        if (threadSummary == null || A00 == null) {
            return;
        }
        ThreadKey threadKey = this.A05;
        String A0w = 1BK.A0w(threadKey);
        ImmutableList immutableList = threadSummary.A1L;
        11T.A0A(immutableList);
        UserKey A05 = 6Im.A05(r0, immutableList);
        if (A05 != null) {
            r0.A05.A01(this.A00.getParentFragmentManager(), this.A02, this.A03, 6Im.A02(A00, r0, threadKey, threadSummary, A05, C5yl.A0L, A0w, this.A08, this.A07, this.A06));
        }
    }
}
