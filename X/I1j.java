package X;

import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: I1j.class */
public final class I1j {
    public final 1Br A00 = 1BK.A0D();
    public final 1Br A01 = 1Bu.A00(68026);

    public static final long A00(I1j i1j, ThreadKey threadKey) {
        if (!GOq.A0h(i1j.A01).AZk(36310808868488391L) || threadKey == null || threadKey.A0z()) {
            return 0L;
        }
        return threadKey.A0r();
    }

    public final void A01(ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource, ThreadKey threadKey, String str, String str2, boolean z) {
        11T.A0F(str, 1);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(493));
        if (A08.isSampled()) {
            GOn.A1Q(A08, str);
            4YU.A1I(A08, "major_entry_point", HvN.A00(composerInitParamsSpec$ComposerLaunchSource));
            int i = 2;
            if (str2 == null) {
                i = 0;
            }
            4YU.A1I(A08, "minor_entry_point", i);
            A08.A5H("is_chathead", Boolean.valueOf(z));
            A08.A6H("thread_id", Long.valueOf(A00(this, threadKey)));
            A08.BZL();
        }
    }
}
