package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;

/* loaded from: M4f.class */
public final class M4f extends C00q implements Function1 {
    public static final M4f A00 = new M4f();

    public M4f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return !((Context) Kv7.A01(AndroidCompositionLocals_androidKt.A01, (C2856JbY) ((MBT) obj))).getPackageManager().hasSystemFeature("android.software.leanback") ? KyT.A01 : KbY.A00;
    }
}
