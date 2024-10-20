package X;

import android.content.Intent;
import com.facebook.messaging.attribution.InlineReplyFragment;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: GzN.class */
public final class GzN extends GzQ {
    public final /* synthetic */ InlineReplyFragment A00;

    public GzN(InlineReplyFragment inlineReplyFragment) {
        this.A00 = inlineReplyFragment;
    }

    @Override // X.Frf
    public void onPermissionsGranted() {
        ListenableFuture A01;
        InlineReplyFragment inlineReplyFragment = this.A00;
        Intent intent = inlineReplyFragment.A00;
        if (intent == null || !intent.getBooleanExtra(DKB.A00(239), false)) {
            Hsr hsr = inlineReplyFragment.A08;
            hsr.getClass();
            A01 = hsr.A01(inlineReplyFragment.A01, ImmutableList.of((Object) inlineReplyFragment.A09));
        } else {
            A01 = 1Kd.A0A(ImmutableList.of((Object) inlineReplyFragment.A09));
        }
        1Kd.A0F(Ini.A01(inlineReplyFragment, 6), A01, inlineReplyFragment.A0B);
    }
}
