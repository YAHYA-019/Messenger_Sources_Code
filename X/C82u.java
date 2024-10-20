package X;

import androidx.lifecycle.Lifecycle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.aibot.repository.MetaAiRepository;
import kotlin.jvm.functions.Function2;

/* renamed from: X.82u, reason: invalid class name */
/* loaded from: 82u.class */
public final class C82u extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04 = 0;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82u(4dH r302, Function2 function2, 0DR r304, int i) {
        super(2, r304);
        this.A01 = r302;
        this.A05 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82u(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, 0DR r305, int i) {
        super(2, r305);
        this.A02 = lifecycle;
        this.A01 = state;
        this.A05 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82u(ThreadKey threadKey, 6oJ r303, 0DR r304) {
        super(2, r304);
        this.A03 = r303;
        this.A05 = threadKey;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82u(MetaAiRepository metaAiRepository, C07634kW c07634kW, 0DR r304, 0DR r305) {
        super(2, r305);
        this.A01 = c07634kW;
        this.A03 = metaAiRepository;
        this.A05 = r304;
    }

    public final 0DR create(Object obj, 0DR r303) {
        switch (this.A04) {
            case 0:
                return new C82u((4dH) this.A01, (Function2) this.A05, r303, 0);
            case 1:
                C82u c82u = new C82u((Lifecycle) this.A02, (Lifecycle.State) this.A01, (Function2) this.A05, r303, 1);
                c82u.A03 = obj;
                return c82u;
            case 2:
                C82u c82u2 = new C82u((MetaAiRepository) this.A03, (C07634kW) this.A01, (0DR) this.A05, r303);
                c82u2.A02 = obj;
                return c82u2;
            default:
                return new C82u((ThreadKey) this.A05, (6oJ) this.A03, r303);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
