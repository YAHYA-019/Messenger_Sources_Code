package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.polls.polldetailsdata.CmPollDetailsDataImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.polling.plugins.core.openpolldetailsdata.OpenPollDetailsDataImplementation;
import com.facebook.messaging.polling.plugins.interfaces.polldetailsdata.PollDetailsDataInterfaceSpec$DataSourceOverride;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* loaded from: Hk6.class */
public final class Hk6 {
    public CmPollDetailsDataImplementation A00;
    public OpenPollDetailsDataImplementation A01;
    public Object A02;
    public Object A03;
    public final Context A04;
    public final FbUserSession A05;
    public final ThreadKey A06;
    public final 1YC A07 = 1YC.A03;
    public final PollDetailsDataInterfaceSpec$DataSourceOverride A08;
    public final Capabilities A09;
    public final ImmutableList A0A;
    public final Context A0B;

    public Hk6(Context context, Context context2, FbUserSession fbUserSession, ThreadKey threadKey, PollDetailsDataInterfaceSpec$DataSourceOverride pollDetailsDataInterfaceSpec$DataSourceOverride, Capabilities capabilities, ImmutableList immutableList) {
        this.A0B = context;
        this.A04 = context2;
        this.A05 = fbUserSession;
        this.A08 = pollDetailsDataInterfaceSpec$DataSourceOverride;
        this.A09 = capabilities;
        this.A0A = immutableList;
        this.A06 = threadKey;
    }
}
