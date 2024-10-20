package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.MontageComposerFragment;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* renamed from: X.7t0, reason: invalid class name */
/* loaded from: 7t0.class */
public abstract class C7t0 {
    public static final void A00(Context context, 06Z r302, ThreadKey threadKey, C6r6 c6r6, MontageComposerFragmentParams.Builder builder, NavigationTrigger navigationTrigger, 64W r307) {
        1BK.A1K(c6r6, 1, context);
        1BL.A1G(r302, r307);
        boolean A04 = C6x9.A04(c6r6);
        C6r6 c6r62 = C6r6.A0X;
        boolean A1W = AnonymousClass001.A1W(c6r6, c6r62);
        boolean A1T = AnonymousClass001.A1T(AnonymousClass016.A00(context, Activity.class));
        boolean z = !ThreadKey.A0q(threadKey);
        ((5WA) 1Bn.A0A(115056)).A01(A1T, A04);
        6zX r0 = new 6zX();
        r0.A00 = threadKey;
        r0.A0M = z;
        r0.A0K = true;
        r0.A0B = !A1W;
        MediaPickerEnvironment mediaPickerEnvironment = new MediaPickerEnvironment(r0);
        if (c6r6 != c6r62 || builder.A09 != C6x1.A04) {
            builder.A09 = C6x1.A02;
        }
        builder.A01 = mediaPickerEnvironment;
        builder.A0D = c6r6;
        if (AnonymousClass016.A00(context, Activity.class) != null) {
            builder.A0C = C6x5.A02;
            builder.A04 = threadKey;
            r307.D1w(builder.A00(), navigationTrigger);
        } else {
            builder.A0C = C6x5.A03;
            builder.A04 = threadKey;
            A01(r302, builder.A00(), navigationTrigger, 0);
        }
    }

    public static final void A01(06Z r301, MontageComposerFragmentParams montageComposerFragmentParams, NavigationTrigger navigationTrigger, int i) {
        11T.A0G(montageComposerFragmentParams, 1, r301);
        2Ow A0b = r301.A0b("montage_composer");
        if (A0b == null) {
            A0b = MontageComposerFragment.A05(montageComposerFragmentParams, navigationTrigger);
        }
        if (A0b.isAdded()) {
            return;
        }
        C06c c06c = new C06c(r301);
        if (i == 0) {
            A0b.A0q(c06c, "montage_composer", true);
        } else {
            c06c.A0P(A0b, "montage_composer", i);
            c06c.A05();
        }
    }
}
