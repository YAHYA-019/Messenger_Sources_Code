package X;

import com.meta.metaai.shared.nux.data.MetaAINuxRepository;
import com.meta.metaai.shared.nux.service.MetaAINuxNetworkService;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;
import com.meta.metaai.writewithai.service.WriteWithAINetworkService;

/* loaded from: G8p.class */
public final class G8p extends 0DP {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G8p(Object obj, 0DR r303, int i) {
        super(r303);
        this.A02 = i;
        this.A03 = obj;
    }

    public static Object A01(Object obj, G8p g8p) {
        g8p.A01 = obj;
        g8p.A00 |= (-1) << (-1);
        return g8p.A03;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A02;
        Object A01 = A01(obj, this);
        switch (i) {
            case 0:
                return ((MetaAINuxRepository) A01).A01(null, this);
            case 1:
                return ((MetaAINuxNetworkService) A01).A01(null, this);
            case 2:
                return ((WriteSuggestionsRepository) A01).A04(null, this);
            case 3:
                return ((WriteWithAINetworkService) A01).A02(null, this);
            default:
                return ((WriteWithAINetworkService) A01).A01(null, null, null, this);
        }
    }
}
