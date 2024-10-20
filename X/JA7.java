package X;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;

/* loaded from: JA7.class */
public final class JA7 extends C00q implements Function1 {
    public static final JA7 A00 = new JA7();

    public JA7() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        11T.A0F(sidecarDisplayFeature, 0);
        boolean z = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
