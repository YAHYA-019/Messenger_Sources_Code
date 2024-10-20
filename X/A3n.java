package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.facebook.messaging.memories.plugins.inboxuibadge.badgeconfig.MemoriesBadgeImplementation;
import com.facebook.messaging.memories.plugins.inboxuibadge.seen.MemoriesBadgeSeenImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: A3n.class */
public final class A3n implements C2r7 {
    public final int A00;
    public final Object A01;

    public A3n(MigColorScheme migColorScheme, int i) {
        this.A00 = i;
        this.A01 = migColorScheme;
    }

    @Override // X.C2r7
    public Drawable AJ5(Context context, C2fd c2fd, C2qg c2qg) {
        Drawable drawable;
        int B5V;
        if (this.A00 != 0) {
            11T.A0F(context, 0);
            drawable = context.getDrawable(7zP.A0S(MemoriesBadgeSeenImplementation.A00).A03(C1u3.A1i));
            11T.A0D(drawable);
            B5V = ((MigColorScheme) this.A01).B86();
        } else {
            11T.A0F(context, 0);
            drawable = context.getDrawable(7zP.A0S(MemoriesBadgeImplementation.A00).A03(C1u3.A1i));
            11T.A0D(drawable);
            B5V = ((MigColorScheme) this.A01).B5V();
        }
        7zO.A17(PorterDuff.Mode.SRC_IN, drawable, B5V);
        return drawable;
    }

    @Override // X.C2r7
    public int AYi() {
        return 0;
    }

    @Override // X.C2r7
    public float AYj() {
        return 0.0f;
    }
}
