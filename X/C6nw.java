package X;

import android.content.Context;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadPreviewParams;
import com.facebook.orca.threadview.events.OnNewLoaderResult;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;

/* renamed from: X.6nw, reason: invalid class name */
/* loaded from: 6nw.class */
public final class C6nw implements 1Vf {
    public ThreadKey A00;
    public ThreadKey A01;
    public ThreadSummary A02;
    public ThreadPreviewParams A03;
    public final Context A06;
    public final 1Br A05 = 1Bu.A00(83118);
    public final 1Br A04 = 1Bq.A00(66481);

    public C6nw(Context context) {
        this.A06 = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001e. Please report as an issue. */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        ThreadSummary threadSummary;
        ThreadPreviewParams threadPreviewParams;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        switch (str.hashCode()) {
            case -1976370007:
                if (str.equals("com.facebook.orca.threadview.events.OnNewLoaderResult")) {
                    OnNewLoaderResult onNewLoaderResult = (OnNewLoaderResult) r302;
                    11T.A0F(onNewLoaderResult, 0);
                    this.A02 = onNewLoaderResult.A00.A03;
                    return;
                }
                throw 4YV.A0f(str);
            case -1787492718:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
                    this.A00 = null;
                    this.A03 = null;
                    this.A02 = null;
                    this.A01 = null;
                    return;
                }
                throw 4YV.A0f(str);
            case -1440551537:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
                    OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
                    11T.A0F(onThreadOpened, 0);
                    ThreadPreviewParams threadPreviewParams2 = (ThreadPreviewParams) onThreadOpened.A01.A01((String) null, ThreadPreviewParams.class);
                    if (threadPreviewParams2 == null || threadPreviewParams2.A03) {
                        return;
                    }
                    ThreadKey threadKey = onThreadOpened.A00;
                    if (ThreadKey.A0a(threadKey)) {
                        this.A01 = threadKey;
                        this.A03 = threadPreviewParams2;
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case 1941448808:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnMessageListDataRendered")) {
                    ThreadKey threadKey2 = this.A01;
                    if (threadKey2 == null || (threadSummary = this.A02) == null || (threadPreviewParams = this.A03) == null || 11T.A0O(this.A00, threadKey2) || !((1WY) this.A04.A00.get()).A0E()) {
                        return;
                    }
                    C1296Ad8 c1296Ad8 = (C1296Ad8) this.A05.A00.get();
                    ThreadKey threadKey3 = threadSummary.A0l;
                    c1296Ad8.A03(new CommunityMessagingLoggerModel(null, threadPreviewParams.A01, threadKey3 != null ? String.valueOf(threadKey3.A0r()) : null, null, String.valueOf(threadKey2.A0r()), null, threadPreviewParams.A02, "chat_preview", "chat_preview_open", null, null, null));
                    this.A00 = threadKey2;
                    return;
                }
                throw 4YV.A0f(str);
            default:
                throw 4YV.A0f(str);
        }
    }
}
