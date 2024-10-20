package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.3r2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3r2.class */
public final class C01413r2 implements InterfaceC01343qr {
    public final List A00 = new CopyOnWriteArrayList();

    public final void A00(C4YM c4ym) {
        this.A00.add(new WeakReference(c4ym));
    }

    @Override // X.InterfaceC01343qr
    public String getHandlerName() {
        return "VideoRealtimeMqttHandler";
    }

    @Override // X.InterfaceC01343qr
    public void onMessage(String str, byte[] bArr, int i, long j, Long l) {
        11T.A0F(str, 0);
        11T.A0F(bArr, 1);
        List<Reference> list = this.A00;
        ArrayList arrayList = null;
        for (Reference reference : list) {
            C4YM c4ym = (C4YM) reference.get();
            if (c4ym == null) {
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0s();
                }
                arrayList.add(reference);
            } else {
                Ihg ihg = (Ihg) c4ym;
                if (ihg.A01.contains(str)) {
                    Executor executor = (Executor) ihg.A00.A01.get();
                    if (executor != null) {
                        executor.execute(new 4XQ(c4ym, str, bArr, j));
                    } else {
                        c4ym.BMG(str, bArr, j);
                    }
                }
            }
        }
        if (arrayList != null) {
            list.removeAll(arrayList);
        }
    }
}
