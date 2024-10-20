package X;

import com.facebook.video.plugins.LoadingSpinnerPlugin;

/* renamed from: X.6cp, reason: invalid class name */
/* loaded from: 6cp.class */
public class C6cp extends 6TJ {
    public final /* synthetic */ LoadingSpinnerPlugin A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6cp(LoadingSpinnerPlugin loadingSpinnerPlugin) {
        super(false);
        this.A00 = loadingSpinnerPlugin;
    }

    public void A06(6UE r302) {
        11T.A0F(r302, 0);
        C00j.A05("LoadingSpinnerPlugin.handlePlayerStateChangedEvent", 6104763);
        try {
            LoadingSpinnerPlugin loadingSpinnerPlugin = this.A00;
            boolean z = false;
            if (r302.A01 == 6UR.A02) {
                z = true;
            }
            LoadingSpinnerPlugin.A01(loadingSpinnerPlugin, z);
            C00j.A01(1191926524);
        } catch (Throwable th) {
            C00j.A01(883452640);
            throw th;
        }
    }
}
