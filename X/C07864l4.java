package X;

import com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadata;
import com.facebook.msys.cql.dataclasses.ThreadMetadataAdapter;

/* renamed from: X.4l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4l4.class */
public final class C07864l4 extends 1qX implements InterfaceC07874l5 {
    public ThreadMetadataAdapter A00;

    /* JADX WARN: Type inference failed for: r302v2, types: [X.49J, com.facebook.msys.cql.dataclasses.ThreadMetadataAdapter] */
    @Override // X.InterfaceC07874l5
    public ThreadMetadata AxP() {
        ThreadMetadataAdapter threadMetadataAdapter = this.A00;
        ThreadMetadataAdapter threadMetadataAdapter2 = threadMetadataAdapter;
        if (threadMetadataAdapter == null) {
            ?? r302 = new 49J();
            this.A00 = r302;
            threadMetadataAdapter2 = r302;
        }
        return (ThreadMetadata) threadMetadataAdapter2.getNullableAdaptedObject(0, new AHk(this, 5));
    }
}
