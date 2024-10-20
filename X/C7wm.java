package X;

import android.net.Uri;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.7wm, reason: invalid class name */
/* loaded from: 7wm.class */
public final class C7wm implements C00l, Function1 {
    public final int A00;
    public final Object A01;

    public C7wm(OneLineComposerView oneLineComposerView, int i) {
        this.A00 = i;
        this.A01 = oneLineComposerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (this.A00 != 0) {
            OneLineComposerView oneLineComposerView = (OneLineComposerView) this.A01;
            Iterator it = oneLineComposerView.A0v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MediaResource A0Z = 4YU.A0Z(it);
                if (A0Z.A0E == obj) {
                    NavigationTrigger A03 = NavigationTrigger.A03("messenger_montage_swipeable_media_picker");
                    MontageComposerFragmentParams.Builder builder = new MontageComposerFragmentParams.Builder();
                    4YV.A1I(C6r6.A0y, builder);
                    builder.A0a = true;
                    String A0t = 1BK.A0t();
                    11T.A0A(A0t);
                    builder.A0O = A0t;
                    builder.A0F = A0Z;
                    builder.A0C = C6x5.A08;
                    builder.A04 = oneLineComposerView.A0m;
                    6fA r0 = oneLineComposerView.A0g;
                    builder.A05 = r0 != null ? r0.A03 : null;
                    MontageComposerFragmentParams A00 = builder.A00();
                    06Z r02 = oneLineComposerView.A0A;
                    11T.A0F(r02, 2);
                    C7t0.A01(r02, A00, A03, 0);
                }
            }
        } else {
            OneLineComposerView oneLineComposerView2 = (OneLineComposerView) this.A01;
            Uri uri = (Uri) obj;
            2Ri.A0G(new D3M(uri, oneLineComposerView2), oneLineComposerView2.A0v);
            oneLineComposerView2.CrB(oneLineComposerView2.A0v);
            Hjm hjm = oneLineComposerView2.A0d.A00.A00.A09.A03;
            if (hjm != null) {
                hjm.A04.Ced(uri);
            }
        }
        return 04S.A00;
    }
}
