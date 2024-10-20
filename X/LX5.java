package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.plugins.composerblock.hintcard.ComposerBlockHintCardImplementation;
import com.facebook.user.model.User;

/* loaded from: LX5.class */
public final class LX5 implements DFY {
    public final int A00;
    public final Object A01;

    public LX5(ComposerBlockHintCardImplementation composerBlockHintCardImplementation, int i) {
        this.A00 = i;
        this.A01 = composerBlockHintCardImplementation;
    }

    public void Bzw(1Kn r302) {
        ComposerBlockHintCardImplementation composerBlockHintCardImplementation;
        int i;
        switch (this.A00) {
            case 0:
                composerBlockHintCardImplementation = (ComposerBlockHintCardImplementation) this.A01;
                i = 25;
                break;
            case 1:
                11T.A0F(r302, 0);
                if (r302 == 1Kn.A01) {
                    composerBlockHintCardImplementation = (ComposerBlockHintCardImplementation) this.A01;
                    i = 19;
                    break;
                } else if (r302 == 1Kn.A03) {
                    composerBlockHintCardImplementation = (ComposerBlockHintCardImplementation) this.A01;
                    i = 20;
                    break;
                } else {
                    return;
                }
            default:
                composerBlockHintCardImplementation = (ComposerBlockHintCardImplementation) this.A01;
                i = 24;
                break;
        }
        F4K f4k = (F4K) 1Br.A0B(composerBlockHintCardImplementation.A03);
        User user = composerBlockHintCardImplementation.A05;
        String str = null;
        KPP A00 = KxR.A00(user.A0a);
        String str2 = user.A13;
        Long A0n = str2 != null ? 1BK.A0n(str2) : null;
        ThreadKey threadKey = composerBlockHintCardImplementation.A04.A0n;
        if (threadKey != null) {
            str = threadKey.toString();
        }
        F4K.A00(A00, f4k, A0n, str, 4YT.A00(389), i);
    }
}
