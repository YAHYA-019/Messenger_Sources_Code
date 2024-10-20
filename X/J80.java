package X;

import com.facebook.wearable.common.comms.rtc.hera.video.mixer.RawVideoMixer;
import kotlin.jvm.functions.Function1;

/* loaded from: J80.class */
public final class J80 extends 0DO implements Function1 {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J80(RawVideoMixer rawVideoMixer, 0DR r303, int i) {
        super(1, r303);
        this.A03 = i;
        this.A04 = rawVideoMixer;
    }

    public final 0DR create(0DR r302) {
        int i;
        int i2 = this.A03;
        RawVideoMixer rawVideoMixer = (RawVideoMixer) this.A04;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new J80(rawVideoMixer, r302, i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return create((0DR) obj).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d3, code lost:
    
        if (r302 == r304) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a0, code lost:
    
        if (r310.BZF((java.lang.Object) null, r301) == r304) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0290, code lost:
    
        if (r0.stop(r301) == r304) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022d, code lost:
    
        if (r307.BZF((java.lang.Object) null, r301) == r304) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fb, code lost:
    
        if (r302 == r304) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c8, code lost:
    
        if (r310.BZF((java.lang.Object) null, r301) == r304) goto L75;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
