package X;

import java.util.function.BiConsumer;

/* renamed from: X.887, reason: invalid class name */
/* loaded from: 887.class */
public final class AnonymousClass887 implements BiConsumer {
    public final /* synthetic */ 0Je A00;
    public final /* synthetic */ 0Pn A01;
    public final /* synthetic */ 0Pn A02;

    public AnonymousClass887(0Je r302, 0Pn r303, 0Pn r304) {
        this.A01 = r303;
        this.A02 = r304;
        this.A00 = r302;
    }

    @Override // java.util.function.BiConsumer
    public /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        8Ni r0 = (GGd) obj2;
        11T.A0F(r0, 1);
        if (r0 instanceof 8Ni) {
            0Pn r02 = this.A01;
            long j = r02.element;
            8Ni r03 = r0;
            r02.element = j + r03.A00;
            this.A02.element += r03.A02;
            this.A00.element = true;
            return;
        }
        if (r0 instanceof 8Nh) {
            0Pn r04 = this.A01;
            long j2 = r04.element;
            long j3 = ((8Nh) r0).A00;
            r04.element = j2 + j3;
            this.A02.element += j3;
        }
    }
}
