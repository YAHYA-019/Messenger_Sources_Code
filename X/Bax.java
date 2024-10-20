package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.polling.datamodels.PollingPublishedOption;
import com.facebook.messaging.polling.plugins.interfaces.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec$DataSourceOverride;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Bax.class */
public final class Bax {
    public final CMd A00;

    public Bax(Context context, Context context2, 06Z r304, 1F9 r305, ThreadKey threadKey, PollingPublishedOption pollingPublishedOption, PollVotersListDataProviderInterfaceSpec$DataSourceOverride pollVotersListDataProviderInterfaceSpec$DataSourceOverride, C1G c1g, MigColorScheme migColorScheme, String str, String str2) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CMd(context, context2, r304, r305, threadKey, pollingPublishedOption, pollVotersListDataProviderInterfaceSpec$DataSourceOverride, c1g, migColorScheme, str2);
    }
}
