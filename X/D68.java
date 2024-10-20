package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.publicchats.plugins.threadview.threadpreviewhintcard.PublicChannelsThreadPreviewHintCardImplementation;

/* loaded from: D68.class */
public final class D68 implements Runnable {
    public static final String __redex_internal_original_name = "PublicChannelsThreadPreviewHintCardImplementation$sendJoinRequest$1$1";
    public final /* synthetic */ PublicChannelsThreadPreviewHintCardImplementation A00;

    public D68(PublicChannelsThreadPreviewHintCardImplementation publicChannelsThreadPreviewHintCardImplementation) {
        this.A00 = publicChannelsThreadPreviewHintCardImplementation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2dS r304;
        ThreadKey A05;
        PublicChannelsThreadPreviewHintCardImplementation publicChannelsThreadPreviewHintCardImplementation = this.A00;
        ThreadSummary threadSummary = publicChannelsThreadPreviewHintCardImplementation.A09;
        long j = threadSummary.A0n.A04;
        boolean A07 = 2oI.A07(threadSummary);
        Boolean A0d = 1BK.A0d();
        Boolean A0K = AnonymousClass001.A0K();
        if (A07) {
            r304 = (2dS) 1Br.A0B(publicChannelsThreadPreviewHintCardImplementation.A05);
            A05 = ThreadKey.A06(j);
        } else {
            if (!2oI.A06(threadSummary)) {
                return;
            }
            r304 = (2dS) 1Br.A0B(publicChannelsThreadPreviewHintCardImplementation.A05);
            A05 = ThreadKey.A05(j);
        }
        r304.A00(A05, A0K, A0d);
    }
}
