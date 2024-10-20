package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Bwe.class */
public final class Bwe {
    public final Context A00;
    public final MediatorLiveData A01;
    public final ThreadKey A04;
    public final C15h A05;
    public final C00i A06;
    public final C00i A03 = 1BV.A00(82677);
    public final C00i A02 = 1BQ.A02(66360);

    public Bwe(Context context, ThreadKey threadKey) {
        1BQ A02 = 1BQ.A02(67528);
        this.A06 = A02;
        this.A00 = context;
        this.A04 = threadKey;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.A01 = mediatorLiveData;
        this.A05 = new DBO(15);
        mediatorLiveData.setValue(CES.A05);
        LiveData ASY = ((C5xl) A02.get()).ASY(threadKey);
        MediatorLiveData mediatorLiveData2 = this.A01;
        mediatorLiveData2.removeSource(ASY);
        mediatorLiveData2.addSource(ASY, CaE.A00(this, 82));
    }
}
