package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;
import com.facebook.xapp.messaging.generatedsticker.fragment.GeneratedStickersSearchFragment;

/* renamed from: X.9do, reason: invalid class name */
/* loaded from: 9do.class */
public final class C9do {
    public static final void A00(Context context, 06Z r302, LifecycleOwner lifecycleOwner, ThreadKey threadKey, final 2Of r305, boolean z) {
        11T.A0F(r305, 6);
        final 7NE r0 = new 7NE((BlueServiceOperationFactory) 1Bn.A0E(context, (1BY) null, 33031), C6xd.A07);
        2Ov generatedStickersSearchFragment = new GeneratedStickersSearchFragment();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("thread_key", 0Gm.A00(threadKey));
        A05.putBoolean("show_animated_hints", z);
        generatedStickersSearchFragment.setArguments(A05);
        generatedStickersSearchFragment.A15(r302, "generated_sticker_fragment_tag");
        if (lifecycleOwner == null || r302 == null) {
            return;
        }
        r302.A1O(new 0Tx() { // from class: X.9qc
            public final void Bza(String str, Bundle bundle) {
                11T.A0F(bundle, 1);
                Sticker sticker = (Sticker) 0Gm.A01(Sticker.CREATOR, bundle.getParcelable("result_arg_sent_sticker"), Sticker.class);
                if (sticker != null) {
                    7NE r02 = r0;
                    Bundle A052 = 1BK.A05();
                    A052.putParcelable("sticker", sticker);
                    1Ho.A00(r02.A00.newInstance_DEPRECATED(1BJ.A00(59), A052), true);
                    r305.AQN(new 7Ce(sticker));
                }
            }
        }, lifecycleOwner, "result_arg_request_key");
    }
}
