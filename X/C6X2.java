package X;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* renamed from: X.6X2, reason: invalid class name */
/* loaded from: 6X2.class */
public final class C6X2 implements C6X6 {
    public final /* synthetic */ 6VL A00;
    public final /* synthetic */ 6Vx A01;

    public C6X2(6VL r302, 6Vx r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // X.C6X6
    public void C7C(Metadata metadata, long j) {
        Metadata.Entry[] entryArr = metadata.A01;
        if (entryArr.length > 0) {
            Metadata.Entry entry = entryArr[0];
            if (!(entry instanceof EventMessage)) {
                this.A00.A0z.C7D(metadata);
                return;
            }
            EventMessage eventMessage = (EventMessage) entry;
            this.A00.A0z.C3b(eventMessage.A03, eventMessage.A05, eventMessage.A02, j);
        }
    }
}
