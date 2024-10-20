package X;

import com.facebook.messaging.memories.model.MemoriesTrayPogModel;
import com.facebook.messaging.tray.plugins.loader.memories.TrayMemoriesLoaderImpl;
import com.google.common.collect.ImmutableList;

/* renamed from: X.30t, reason: invalid class name */
/* loaded from: 30t.class */
public final class C30t implements InterfaceC02733w1 {
    public final /* synthetic */ 2T5 A00;
    public final /* synthetic */ TrayMemoriesLoaderImpl A01;

    public C30t(2T5 r302, TrayMemoriesLoaderImpl trayMemoriesLoaderImpl) {
        this.A01 = trayMemoriesLoaderImpl;
        this.A00 = r302;
    }

    @Override // X.InterfaceC02733w1
    public final void C3j(ImmutableList immutableList) {
        TrayMemoriesLoaderImpl trayMemoriesLoaderImpl = this.A01;
        boolean z = true;
        if (!trayMemoriesLoaderImpl.A00 && !1BK.A1Y(immutableList)) {
            z = false;
        }
        trayMemoriesLoaderImpl.A00 = z;
        if (z) {
            this.A00.Bgc(TrayMemoriesLoaderImpl.A00(new MemoriesTrayPogModel.Memory(immutableList), trayMemoriesLoaderImpl), "MEMORIES", "Memories loaded");
        }
    }
}
