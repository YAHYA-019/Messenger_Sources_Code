package X;

import com.facebook.messaging.friendsinboxunit.plugins.memoriesloader.implementation.MemoriesInboxUnitLoaderImplementation;
import com.facebook.messaging.memories.model.MemoriesTrayPogModel;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yb.class */
public final class C03553yb implements InterfaceC02733w1 {
    public final /* synthetic */ 2T5 A00;
    public final /* synthetic */ MemoriesInboxUnitLoaderImplementation A01;

    public C03553yb(2T5 r302, MemoriesInboxUnitLoaderImplementation memoriesInboxUnitLoaderImplementation) {
        this.A01 = memoriesInboxUnitLoaderImplementation;
        this.A00 = r302;
    }

    @Override // X.InterfaceC02733w1
    public final void C3j(ImmutableList immutableList) {
        0fH.A0g(immutableList, "MemoriesInboxUnitLoaderImplementation", "memories onNewResult, result=%s");
        MemoriesInboxUnitLoaderImplementation memoriesInboxUnitLoaderImplementation = this.A01;
        boolean z = true;
        if (!memoriesInboxUnitLoaderImplementation.A00 && !(!immutableList.isEmpty())) {
            z = false;
        }
        memoriesInboxUnitLoaderImplementation.A00 = z;
        if (z) {
            this.A00.Bgc(new MemoriesTrayPogModel.Memory(immutableList), "MEMORIES", 1BJ.A00(800));
        }
    }
}
