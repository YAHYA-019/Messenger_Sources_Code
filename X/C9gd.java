package X;

import android.content.Context;
import com.facebook.messaging.bugreporter.plugins.threadsettings.actionhandler.ActionHandler;
import com.facebook.messaging.customthreads.plugins.core.hotlike.hotlikethreadsettingsaction.HotLikeThreadSettingsAction;
import com.facebook.messaging.customthreads.plugins.core.theme.threadsettingsaction.ThemeThreadSettingsAction;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.payments.plugins.core.threadsettingsaction.ThreadSettingsAction;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9gd, reason: invalid class name */
/* loaded from: 9gd.class */
public final class C9gd {
    public ActionHandler A00;
    public HotLikeThreadSettingsAction A01;
    public ThemeThreadSettingsAction A02;
    public ThreadSettingsAction A03;
    public C1v5 A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public boolean A0A;
    public final Context A0B;
    public final 06Z A0C;
    public final ThreadKey A0D;
    public final 1YC A0E = 1YC.A03;
    public final 5Sh A0F;
    public final 63D A0G;
    public final MigColorScheme A0H;

    public C9gd(Context context, 06Z r303, ThreadKey threadKey, 5Sh r305, 63D r306, MigColorScheme migColorScheme) {
        this.A0B = context;
        this.A0G = r306;
        this.A0D = threadKey;
        this.A0F = r305;
        this.A0H = migColorScheme;
        this.A0C = r303;
    }

    public static void A00(C9gd c9gd) {
        synchronized (c9gd) {
            if (!c9gd.A0A) {
                if (c9gd.A0B == null) {
                    throw AnonymousClass001.A0Q("The context passed in the ThreadSettingsResultInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                c9gd.A04 = C1v5.A01;
                c9gd.A0A = true;
            }
        }
    }
}
