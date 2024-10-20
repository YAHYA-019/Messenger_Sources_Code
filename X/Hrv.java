package X;

import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Hrv.class */
public final class Hrv {
    public final 1Br A00;
    public final 1Br A01 = 1BK.A0D();
    public final boolean A02;

    public Hrv() {
        1Br A0N = 7zM.A0N();
        this.A00 = A0N;
        this.A02 = 1Br.A07(A0N).AZk(72341031814697337L);
    }

    public final void A00(ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource, ThreadKey threadKey, String str, boolean z) {
        1UG A08 = 1BK.A08(1Br.A02(this.A01), 1BJ.A00(1794));
        if (A08.isSampled()) {
            String A0w = threadKey != null ? 1BK.A0w(threadKey) : null;
            EnumC03583yg A00 = AbstractC03573yf.A00(threadKey);
            GOn.A1Q(A08, str);
            4YU.A1I(A08, "major_entry_point", C7l7.A00(composerInitParamsSpec$ComposerLaunchSource));
            A08.A0B("minor_entry_point");
            AbstractC2326GOr.A17(A00, A08, A0w, z);
        }
    }

    public final void A01(ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource, ThreadKey threadKey, String str, boolean z) {
        1UG A08 = 1BK.A08(1Br.A02(this.A01), "msg_media_picker_did_show");
        if (A08.isSampled()) {
            String A0w = threadKey != null ? 1BK.A0w(threadKey) : null;
            EnumC03583yg A00 = AbstractC03573yf.A00(threadKey);
            GOn.A1Q(A08, str);
            4YU.A1I(A08, "major_entry_point", C7l7.A00(composerInitParamsSpec$ComposerLaunchSource));
            A08.A0B("minor_entry_point");
            AbstractC2326GOr.A17(A00, A08, A0w, z);
        }
    }
}
