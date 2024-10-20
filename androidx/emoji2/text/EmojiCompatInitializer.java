package androidx.emoji2.text;

import X.0Uv;
import X.0Ux;
import X.AnonymousClass001;
import X.L8x;
import X.LQf;
import X.LQg;
import X.LQo;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;

/* loaded from: EmojiCompatInitializer.class */
public class EmojiCompatInitializer implements 0Ux {
    public /* bridge */ /* synthetic */ Object create(Context context) {
        Object obj;
        LQg lQg = new LQg(context);
        LQf lQf = new LQf();
        if (L8x.A09 == null) {
            synchronized (L8x.A08) {
                if (L8x.A09 == null) {
                    L8x.A09 = new L8x(lQf, lQg);
                }
            }
        }
        0Uv A00 = 0Uv.A00(context);
        synchronized (0Uv.A03) {
            obj = A00.A01.get(ProcessLifecycleInitializer.class);
            if (obj == null) {
                obj = 0Uv.A01(A00, ProcessLifecycleInitializer.class, AnonymousClass001.A0v());
            }
        }
        Lifecycle lifecycle = ((LifecycleOwner) obj).getLifecycle();
        lifecycle.addObserver(new LQo(this, lifecycle));
        return AnonymousClass001.A0K();
    }

    public List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
