package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: IkI.class */
public final class IkI implements JJK {
    public AtomicReference A00;
    public final ICS A01;
    public final Rb8 A02;
    public final Integer A03;

    public IkI(ICS ics, Rb8 rb8, IF5 if5, Integer num) {
        this.A03 = num;
        this.A02 = rb8;
        this.A01 = ics;
        this.A00 = GOn.A1L(if5);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.QxZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.QxZ, java.lang.Object] */
    @Override // X.JJK
    public void Bq8(String str, int i, java.util.Map map) {
        AtomicReference atomicReference = this.A00;
        IF5 if5 = (IF5) atomicReference.get();
        if (if5 != null) {
            int intValue = this.A03.intValue();
            if (intValue == 0) {
                ?? obj = new Object();
                ((QxZ) obj).A00 = str;
                IF5.A04((QxZ) obj, if5);
            } else if (intValue == 2) {
                ?? obj2 = new Object();
                ((QxZ) obj2).A00 = str;
                IF5.A03((QxZ) obj2, if5);
            } else if (intValue == 1) {
                ROD rod = if5.A0F.A03;
                long j = rod.A01;
                JIC jic = rod.A03;
                HLd.A00(jic, null, 1BJ.A00(1557), rod.A04, jic.now() - j);
                Rb8 rb8 = this.A02;
                if (rb8 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                ICS ics = this.A01;
                if (ics == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                IF5.A02(ics, rb8, if5);
            }
            atomicReference.set(null);
        }
    }

    @Override // X.JJK
    public void Bxr(Exception exc, java.util.Map map, int i, boolean z) {
        11T.A0F(map, 3);
        AtomicReference atomicReference = this.A00;
        Object obj = atomicReference.get();
        IF5 if5 = (IF5) obj;
        if (if5 != null) {
            int intValue = this.A03.intValue();
            if (intValue != 0) {
                if (intValue == 2) {
                    synchronized (obj) {
                        ROD rod = if5.A0F.A03;
                        long j = rod.A00;
                        JIC jic = rod.A03;
                        HLd.A00(jic, exc, "media_post_failure", rod.A04, jic.now() - j);
                    }
                    atomicReference.set(null);
                }
                if (intValue == 1) {
                    ROD rod2 = if5.A0F.A03;
                    long j2 = rod2.A01;
                    JIC jic2 = rod2.A03;
                    HLd.A00(jic2, exc, "media_upload_chunk_receive_request_failure", rod2.A04, jic2.now() - j2);
                    Rb8 rb8 = this.A02;
                    if (rb8 == null) {
                        throw 1BK.A0h();
                    }
                    IF5.A05(rb8, if5, exc, map, i);
                }
                atomicReference.set(null);
            }
            synchronized (obj) {
                ROD rod3 = if5.A0F.A03;
                long j3 = rod3.A02;
                JIC jic3 = rod3.A03;
                HLd.A00(jic3, exc, AbstractC00603o4.A00(212), rod3.A04, jic3.now() - j3);
            }
            IF5.A06(if5, exc, map, i);
            atomicReference.set(null);
        }
    }
}
