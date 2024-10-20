package X;

import com.facebook.fury.context.ReqContext;
import java.util.concurrent.Callable;

/* renamed from: X.3it, reason: invalid class name */
/* loaded from: 3it.class */
public final class C3it implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C3it(InterfaceC04494b5 interfaceC04494b5, 4cI r303, Object obj, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = r303;
        this.A01 = interfaceC04494b5;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        ReqContext A00;
        if (this.A00 == 0) {
            Object obj = this.A02;
            A00 = 1OS.A00(obj);
            try {
                return Boolean.valueOf(4cI.A02((InterfaceC04494b5) this.A01, (4cI) this.A03));
            } finally {
                try {
                    1OS.A04(obj, th);
                    throw th;
                } finally {
                }
            }
        }
        A00 = 1OS.A00(this.A02);
        try {
            4cI r0 = (4cI) this.A03;
            4cK r02 = r0.A03;
            InterfaceC04494b5 interfaceC04494b5 = (InterfaceC04494b5) this.A01;
            r02.A02(interfaceC04494b5);
            r0.A00.Cdl(interfaceC04494b5);
            1OS.A03(A00);
            return null;
        } finally {
        }
    }
}
