package X;

import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.user.model.User;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: AHl.class */
public final class AHl implements C00l, Function1 {
    public final int A00;
    public final Object A01;

    public AHl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (this.A00 != 0) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = (PluginGeneratedSerialDescriptor) this.A01;
            int A03 = AnonymousClass001.A03(obj);
            return 0Pz.A0j(pluginGeneratedSerialDescriptor.A08[A03], ": ", pluginGeneratedSerialDescriptor.Aj5(A03).BA2());
        }
        String str = (String) obj;
        OneLineComposerView oneLineComposerView = ((6PP) this.A01).A0Q.A00;
        Set set = OneLineComposerView.A1Z;
        6QS r0 = oneLineComposerView.A0S.A00;
        06Z childFragmentManager = r0.getChildFragmentManager();
        C95n c95n = C95n.A04;
        6fA r02 = r0.A0H;
        9Cr.A00(childFragmentManager, r02 != null ? r02.A02 : null, c95n, (User) null, str);
        return 04S.A00;
    }
}
