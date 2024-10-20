package X;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2xy, reason: invalid class name */
/* loaded from: 2xy.class */
public final class C2xy extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xy(2bT r302, 2bT r303, Function1 function1, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = function1;
        this.A03 = r302;
        this.A04 = z;
        this.A02 = r303;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        try {
            if (this.A00 != 0) {
                ((2bT) this.A02).A00.setFuture((ListenableFuture) ((Function1) this.A01).invoke(obj));
            } else {
                ((2bT) this.A02).A00.set(((Function1) this.A01).invoke(obj));
            }
        } finally {
            if (z) {
            }
            return 04S.A00;
        }
        return 04S.A00;
    }
}
