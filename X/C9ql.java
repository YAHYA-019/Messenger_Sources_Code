package X;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9ql, reason: invalid class name */
/* loaded from: 9ql.class */
public final class C9ql implements Observer {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C9ql(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (this.A00 == 0) {
            89C r0 = (89C) this.A01;
            MediatorLiveData mediatorLiveData = (MediatorLiveData) this.A02;
            LiveData liveData = (LiveData) this.A03;
            ThreadKey threadKey = (ThreadKey) this.A04;
            ThreadSummaryDataModel threadSummaryDataModel = (ThreadSummaryDataModel) obj;
            String str = threadSummaryDataModel.A02;
            if (!str.equals(4YT.A00(570)) && !str.equals("ERROR")) {
                mediatorLiveData.setValue(threadSummaryDataModel);
                return;
            } else {
                mediatorLiveData.removeSource(liveData);
                mediatorLiveData.addSource(((C5xs) r0.A00.get()).ASY(threadKey), new LQx(r0, mediatorLiveData, 5));
                return;
            }
        }
        try {
            if (obj == C95r.A03) {
                8Ck r02 = (8Ck) this.A04;
                if (1BK.A1X(7zU.A0Z(r02.A01).A01, false)) {
                    ((TextView) this.A02).setText(2131967773);
                    ((TextView) this.A03).setText(2131960382);
                    ((View) this.A01).setVisibility(0);
                    8Ck.A01(r02, 0S2.A04, 0S2.A0C, new 03Y[0]);
                    return;
                }
            }
            if (obj != C95r.A02) {
                ((View) this.A01).setVisibility(8);
                return;
            }
            ((TextView) this.A02).setText(2131962058);
            ((TextView) this.A03).setText(2131962060);
            ((View) this.A01).setVisibility(0);
            8Ck.A01((8Ck) this.A04, 0S2.A05, 0S2.A0C, new 03Y[0]);
        } catch (Throwable th) {
            8Ck r03 = (8Ck) this.A04;
            8Cz.A00(r03, th, r03.A01);
        }
    }
}
