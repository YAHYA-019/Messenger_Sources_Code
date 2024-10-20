package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: A9b.class */
public final class A9b implements C5kd {
    public final 1Br A00;
    public final ThreadKey A01;
    public final C5g3 A02 = A9p.A00;

    public A9b(Context context, ThreadKey threadKey) {
        this.A01 = threadKey;
        this.A00 = 1Bu.A01(context, 67462);
    }

    @Override // X.C5kd
    public C5g3 Asj() {
        return this.A02;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        11T.A0F(interfaceC07894l7, 2);
        if (c5pu == null || 1qX.A00((1qX) c5pu) == 0) {
            return null;
        }
        if (c5pu.AXc(0) != 7) {
            return null;
        }
        int A00 = C5tp.A00(this.A01);
        ImmutableList.Builder builder = ImmutableList.builder();
        int A002 = 1qX.A00((1qX) interfaceC07894l7);
        for (int i2 = 0; i2 < A002; i2++) {
            builder.m11011add((Object) C5tq.A03(interfaceC07894l7, null, (C5tq) 1Br.A0B(this.A00), i2, A00));
        }
        return new 8Nx(1Fj.A01(builder), 2);
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
