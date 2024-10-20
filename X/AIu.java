package X;

import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: AIu.class */
public final class AIu extends 0DO implements Function2 {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIu(Object obj, String str, 0DR r304, int i, boolean z) {
        super(2, r304);
        this.A01 = i;
        this.A02 = obj;
        this.A04 = z;
        this.A03 = str;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        boolean z;
        String str;
        int i;
        if (this.A01 != 0) {
            z = this.A04;
            obj2 = this.A02;
            str = this.A03;
            i = 1;
        } else {
            obj2 = this.A02;
            z = this.A04;
            str = this.A03;
            i = 0;
        }
        return new AIu(obj2, str, r303, i, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.A01;
        0Ds r0 = 0Ds.A02;
        if (i == 0) {
            if (this.A00 != 0) {
                0Dt.A00(obj);
            } else {
                0Dt.A00(obj);
                Object obj3 = this.A02;
                this.A00 = 1;
                obj = 2aG.A00(this, new AJT(obj3, (0DR) null, 37));
                if (obj == r0) {
                    return r0;
                }
            }
            String str = this.A03;
            Iterator it = ((List) obj).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (11T.A0O(((8Jw) obj2).A06, str)) {
                    break;
                }
            }
            8Jw r02 = (8Jw) obj2;
            if (r02 != null) {
                C9gH c9gH = (C9gH) this.A02;
                ConcurrentHashMap concurrentHashMap = c9gH.A05;
                obj = concurrentHashMap.get(7zL.A0z(r02.hashCode()));
                if (obj == null) {
                    if (!this.A04) {
                        return r02;
                    }
                    C9ac A00 = ((9cH) 1Br.A0B(c9gH.A03)).A00(0S2.A0u);
                    8Jw A002 = C9gH.A00(r02, c9gH);
                    A00.A00();
                    concurrentHashMap.put(7zL.A0z(r02.hashCode()), A002);
                    return A002;
                }
            }
        } else if (this.A00 != 0) {
            0Dt.A00(obj);
        } else {
            0Dt.A00(obj);
            if (!this.A04) {
                return null;
            }
            ImagineNetworkService imagineNetworkService = ((ImagineGenerationImageRepository) this.A02).A06;
            String str2 = this.A03;
            this.A00 = 1;
            obj = imagineNetworkService.A09(str2, this);
            if (obj == r0) {
                return r0;
            }
        }
        return obj;
    }
}
