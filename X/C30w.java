package X;

import com.facebook.messaging.memories.model.MemoriesTrayPogModel;
import com.facebook.messaging.tray.plugins.loader.memories.TrayMemoriesLoaderImpl;

/* renamed from: X.30w, reason: invalid class name */
/* loaded from: 30w.class */
public final class C30w implements AXx {
    public final /* synthetic */ 2T5 A00;
    public final /* synthetic */ TrayMemoriesLoaderImpl A01;

    public C30w(2T5 r302, TrayMemoriesLoaderImpl trayMemoriesLoaderImpl) {
        this.A00 = r302;
        this.A01 = trayMemoriesLoaderImpl;
    }

    @Override // X.AXx
    public final void C3i(MemoriesTrayPogModel.Consent consent) {
        this.A00.Bgc(TrayMemoriesLoaderImpl.A00(consent, this.A01), "MEMORIES", "Memories consent loaded");
    }
}
