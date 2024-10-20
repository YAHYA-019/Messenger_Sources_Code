package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.threadsettings.footertext.ThreadSettingsMessageRequestInfoSectionFooter;

/* loaded from: BvS.class */
public final class BvS {
    public ThreadSettingsMessageRequestInfoSectionFooter A00;
    public Object A01;
    public final Context A02;
    public final ThreadSummary A03;
    public final 1YC A04 = 1YC.A03;
    public final ThreadKey A05;

    public BvS(Context context, ThreadKey threadKey, ThreadSummary threadSummary) {
        this.A02 = context;
        this.A05 = threadKey;
        this.A03 = threadSummary;
    }
}
