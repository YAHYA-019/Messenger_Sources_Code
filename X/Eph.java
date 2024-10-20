package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Eph.class */
public final class Eph {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ ThreadSummary A03;
    public final /* synthetic */ C6gj A04;
    public final /* synthetic */ String A05 = "BUYER_REQUEST";

    public Eph(Context context, FragmentActivity fragmentActivity, ThreadKey threadKey, ThreadSummary threadSummary, C6gj c6gj) {
        this.A00 = context;
        this.A04 = c6gj;
        this.A01 = fragmentActivity;
        this.A02 = threadKey;
        this.A03 = threadSummary;
    }
}
