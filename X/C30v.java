package X;

import com.facebook.messaging.memories.model.MemoriesTrayPogModel;
import com.facebook.messaging.tray.plugins.loader.memories.TrayMemoriesLoaderImpl;

/* renamed from: X.30v, reason: invalid class name */
/* loaded from: 30v.class */
public final class C30v implements AXy {
    public final /* synthetic */ 2T5 A00;
    public final /* synthetic */ TrayMemoriesLoaderImpl A01;

    public C30v(2T5 r302, TrayMemoriesLoaderImpl trayMemoriesLoaderImpl) {
        this.A01 = trayMemoriesLoaderImpl;
        this.A00 = r302;
    }

    @Override // X.AXy
    public final void C3l(Integer num) {
        11T.A0F(num, 0);
        if (num.intValue() != 0) {
            2T5 r0 = this.A00;
            TrayMemoriesLoaderImpl trayMemoriesLoaderImpl = this.A01;
            r0.Bgc(TrayMemoriesLoaderImpl.A00(MemoriesTrayPogModel.Memory.A01, trayMemoriesLoaderImpl), "MEMORIES", "Clear memories from tray");
            trayMemoriesLoaderImpl.A03.A00();
            ((2UF) 1Lm.A05(trayMemoriesLoaderImpl.A01, trayMemoriesLoaderImpl.A02, 67249)).A01();
            return;
        }
        TrayMemoriesLoaderImpl trayMemoriesLoaderImpl2 = this.A01;
        38E r02 = trayMemoriesLoaderImpl2.A03.A00;
        if (r02 != null) {
            r02.D5r();
        }
        if (trayMemoriesLoaderImpl2.A00) {
            return;
        }
        this.A00.Bgc(TrayMemoriesLoaderImpl.A00(MemoriesTrayPogModel.Memory.A01, trayMemoriesLoaderImpl2), "MEMORIES", "Clear memories consent from tray");
    }
}
