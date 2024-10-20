package X;

import com.meta.metaai.imagine.service.ImagineNetworkService;

/* loaded from: G8k.class */
public final class G8k extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G8k(ImagineNetworkService imagineNetworkService, 0DR r303, int i) {
        super(r303);
        this.A04 = i;
        this.A05 = imagineNetworkService;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A03 = obj;
        this.A00 |= (-1) << (-1);
        ImagineNetworkService imagineNetworkService = (ImagineNetworkService) this.A05;
        return i != 0 ? imagineNetworkService.A05(null, null, this, 0) : imagineNetworkService.A04(null, null, this);
    }
}
