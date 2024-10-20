package X;

import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.Collections;

/* renamed from: X.Abd, reason: case insensitive filesystem */
/* loaded from: Abd.class */
public final /* synthetic */ class C1235Abd {
    public final /* synthetic */ OneLineComposerView A00;

    public final void A00() {
        OneLineComposerView oneLineComposerView = this.A00;
        String A02 = 60U.A02(oneLineComposerView.getContext());
        String str = oneLineComposerView.A0Z.A0R.A01().A00;
        if (str == null || A02 == null || str.indexOf(A02) == -1 || !1qI.A02((1qI) oneLineComposerView.A1I.get()).AZk(36326983713445790L)) {
            return;
        }
        oneLineComposerView.A0Z.A0R.A02();
        String[] split = str.split(A02, -1);
        for (int i = 0; i < split.length; i++) {
            if (i > 0) {
                OneLineComposerView.A09(BOj.A02, oneLineComposerView, Collections.singletonList(new C1790AsO(0S2.A0j, A02, ConstantsKt.CAMERA_ID_FRONT, 1)), true);
            }
            oneLineComposerView.A0Z.A0R.A04(split[i]);
        }
    }
}
