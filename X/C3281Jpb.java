package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Jpb, reason: case insensitive filesystem */
/* loaded from: Jpb.class */
public final class C3281Jpb extends 5Ma {
    public final /* synthetic */ HeroPlayerSetting A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AtomicReference A02;

    public C3281Jpb(HeroPlayerSetting heroPlayerSetting, String str, AtomicReference atomicReference) {
        this.A01 = str;
        this.A00 = heroPlayerSetting;
        this.A02 = atomicReference;
    }

    public 6D6 A01(6D1 r302, C6D4 c6d4, 5M9 r304, String str, int i, int i2) {
        return new Lbb(r302, this.A00, r304, this.A01, this.A02, i2);
    }

    public String A02() {
        return "LocalSocketProxyDataSource";
    }
}
