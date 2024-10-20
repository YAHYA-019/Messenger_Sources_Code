package X;

import com.facebook.stickers.keyboardls.stickerpacktab.plugins.core.tabs.StickerPackTabsImplementation;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Hmt.class */
public final class Hmt {
    public final HPh A00;

    public Hmt(HPh hPh) {
        this.A00 = hPh;
    }

    public void A00() {
        IFB ifb = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = ifb.A0F;
        r0.A08("com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "refreshStickerTabSectionInfo", andIncrement);
        try {
            IFB.A01(ifb);
            if (IFB.A07(ifb)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.stickers.keyboardls.stickerpacktab.plugins.core.tabs.StickerPackTabsImplementation", "stickers.keyboardls.stickerpacktab.core.tabs.StickerPackTabsImplementation", "com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", andIncrement2, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "com.facebook.stickers.keyboardls.stickerpacktab.plugins.core.KeyboardlsStickerpacktabCoreKillSwitch", "refreshStickerTabSectionInfo");
                    try {
                        StickerPackTabsImplementation.A01(ifb.A0G, ifb.A04);
                        r0.A09("stickers.keyboardls.stickerpacktab.core.tabs.StickerPackTabsImplementation", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "refreshStickerTabSectionInfo", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "stickers.keyboardls.stickerpacktab.core.tabs.StickerPackTabsImplementation", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "refreshStickerTabSectionInfo", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "refreshStickerTabSectionInfo", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "refreshStickerTabSectionInfo", andIncrement);
            throw th2;
        }
    }
}
