package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.io.Serializable;

/* loaded from: Cun.class */
public final class Cun implements 6HY {
    public final Context A00;
    public final C00i A01 = 1BQ.A02(67900);
    public final C00i A02 = 1BV.A00(147763);
    public final DGA A03;

    public Cun(Context context, DGA dga) {
        this.A00 = context;
        this.A03 = dga;
    }

    public void D0Q(ThreadKey threadKey, int i, boolean z) {
        Context context = this.A00;
        if (!1XU.A00(context)) {
            this.A02.get();
            11T.A0H(context, threadKey);
            ParcelableSecondaryData parcelableSecondaryData = ParcelableSecondaryData.A01;
            11T.A0B(parcelableSecondaryData);
            Intent A00 = BBb.A00(context, threadKey, parcelableSecondaryData, (String) null, i, false, z);
            A00.setExtrasClassLoader(Cun.class.getClassLoader());
            this.A03.D1P(A00);
            return;
        }
        C04464b1 c04464b1 = (C04464b1) this.A01.get();
        Serializable serializable = 5SW.A0L;
        11T.A0F(threadKey, 0);
        Intent A002 = C04464b1.A00(c04464b1, C1xj.A08);
        A002.putExtra(5QN.A01, threadKey);
        A002.putExtra(C1xj.A0T, "open_thread_settings");
        A002.putExtra("extra_thread_view_source", serializable);
        A002.putExtra("start_thread_settings_fragment", i);
        A002.putExtra(AnonymousClass000.A00(3), (Parcelable) null);
        C04464b1.A01(A002, c04464b1);
    }
}
