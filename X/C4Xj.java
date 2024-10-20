package X;

import com.facebook.memory.fbmemorymanager.FBMemoryManager;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.4Xj, reason: invalid class name */
/* loaded from: 4Xj.class */
public final class C4Xj implements C15h {
    public final int A00;
    public final Object A01;

    public C4Xj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.4DC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.5E5, java.lang.Object] */
    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        int i;
        1BY r305;
        Object obj;
        switch (this.A00) {
            case 0:
                i = 99964;
                r305 = ((4BE) this.A01).A00;
                obj = 1Bn.A0G(r305, i);
                return obj;
            case 1:
                i = 99870;
                r305 = ((4BE) this.A01).A00;
                obj = 1Bn.A0G(r305, i);
                return obj;
            case 2:
                Object obj2 = ((FBMemoryManager) this.A01).A04.get();
                obj = 5E4.A08;
                if (obj == null) {
                    J5u j5u = new J5u(obj2, 11);
                    J5u j5u2 = new J5u(obj2, 12);
                    J5u j5u3 = new J5u(obj2, 13);
                    ?? obj3 = new Object();
                    ((5E5) obj3).A04 = j5u;
                    ((5E5) obj3).A03 = j5u2;
                    ((5E5) obj3).A05 = j5u3;
                    5E4.A08 = obj3;
                    return obj3;
                }
                return obj;
            case 3:
                boolean A00 = ((C4DB) ((FBMemoryManager) this.A01).A08.get()).A00();
                ?? obj4 = new Object();
                ((4DC) obj4).A00 = A00;
                return obj4;
            case 4:
                return new 3Ib((ScheduledExecutorService) ((FBMemoryManager) this.A01).A0F.get());
            case 5:
                return 1Bn.A0A(83430);
            case 6:
                i = 115494;
                r305 = ((4BA) this.A01).A00.A00;
                obj = 1Bn.A0G(r305, i);
                return obj;
            case 7:
                i = 82029;
                C4Dk c4Dk = (C4Dk) this.A01;
                1G2 r0 = C4Dk.A0c;
                r305 = c4Dk.A00;
                obj = 1Bn.A0G(r305, i);
                return obj;
            default:
                i = 33059;
                C4Dk c4Dk2 = (C4Dk) this.A01;
                1G2 r02 = C4Dk.A0c;
                r305 = c4Dk2.A00;
                obj = 1Bn.A0G(r305, i);
                return obj;
        }
    }
}
