package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* loaded from: J09.class */
public final /* synthetic */ class J09 implements Runnable {
    public static final String __redex_internal_original_name = "ComposeFragment$20$$ExternalSyntheticLambda0";
    public final /* synthetic */ 6So A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ MediaResource A02;

    public /* synthetic */ J09(6So r302, ThreadKey threadKey, MediaResource mediaResource) {
        this.A00 = r302;
        this.A01 = threadKey;
        this.A02 = mediaResource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6So r0 = this.A00;
        ThreadKey threadKey = this.A01;
        MediaResource mediaResource = this.A02;
        6QS r02 = r0.A01;
        6fA r03 = r02.A0H;
        if (r03 == null || !r03.A02.equals(threadKey)) {
            return;
        }
        ((2Pl) r02.A10.get()).A00(0Pz.A0W("Send media", mediaResource.A02()), 0S2.A06);
        6QS.A0E(5Pz.A16, r02, "audio", ImmutableList.of((Object) mediaResource));
    }
}
