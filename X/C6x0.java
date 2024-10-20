package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.6x0, reason: invalid class name */
/* loaded from: 6x0.class */
public final class C6x0 {
    public final 1Br A01 = 1Bu.A00(115935);
    public final 1Br A00 = 1Bq.A00(66556);

    public static final MontageComposerFragmentParams.Builder A00(ThreadKey threadKey, C6x1 c6x1, C6x0 c6x0, ImmutableSet immutableSet) {
        ImmutableList A04;
        MontageComposerFragmentParams.Builder builder = new MontageComposerFragmentParams.Builder();
        builder.A0D = C6r6.A0l;
        builder.A0C = C6x5.A02;
        builder.A04 = threadKey;
        builder.A02(immutableSet);
        int ordinal = c6x1.ordinal();
        if (ordinal != 1) {
            A04 = ordinal != 0 ? ImmutableList.of() : ImmutableList.of((Object) C6x1.A04);
            11T.A0A(A04);
        } else {
            A04 = 6zV.A04((5Q1) c6x0.A01.A00.get());
        }
        builder.A04(A04);
        builder.A09 = c6x1;
        builder.A0X = false;
        boolean z = false;
        if (threadKey.A0y()) {
            z = true;
        }
        builder.A0Z = !z;
        return builder;
    }

    public final Bundle A01(Context context, ThreadKey threadKey, ImmutableSet immutableSet) {
        boolean A1W = 1BL.A1W(context, threadKey);
        MontageComposerFragmentParams.Builder A00 = A00(threadKey, C6x1.A04, this, immutableSet);
        6zX r0 = new 6zX();
        r0.A00 = threadKey;
        boolean z = true;
        boolean A0y = threadKey.A0y();
        if (A0y == A1W || ThreadKey.A0q(threadKey)) {
            z = false;
        }
        r0.A0N = z;
        boolean z2 = true;
        if (A0y == A1W || ThreadKey.A0q(threadKey)) {
            z2 = false;
        }
        r0.A0M = z2;
        A00.A01 = new MediaPickerEnvironment(r0);
        Bundle extras = MontageComposerActivity.A12(context, A00.A00(), NavigationTrigger.A03("messenger_montage_media_picker")).getExtras();
        if (extras != null) {
            return extras;
        }
        throw 1BK.A0h();
    }

    public final MontageComposerFragmentParams A02(ThreadKey threadKey, ImmutableSet immutableSet) {
        11T.A0F(threadKey, 0);
        MontageComposerFragmentParams.Builder A00 = A00(threadKey, C6x1.A05, this, immutableSet);
        A00.A0D = C6r6.A0y;
        A00.A0a = true;
        return A00.A00();
    }
}
