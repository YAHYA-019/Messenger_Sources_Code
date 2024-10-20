package X;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.stickers.service.models.StickerSearchResult;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: Imi.class */
public final class Imi implements Function {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Imi(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        HY1 hy1;
        ImmutableList immutableList;
        switch (this.A00) {
            case 0:
                C66Y c66y = (C66Y) this.A03;
                return ((2Ff) c66y.A00.A01.get()).A0B((2Dp) obj, this.A02);
            case 1:
                IXv iXv = (JNm) obj;
                hy1 = null;
                Collection collection = (Collection) this.A02;
                collection.isEmpty();
                if (iXv != null) {
                    iXv.A00.A71(1BK.A17(collection));
                    11T.A0A(1hM.A01);
                    return null;
                }
                return hy1;
            default:
                GfO gfO = (GfO) this.A01;
                69H r0 = (69H) this.A02;
                HcG hcG = (HcG) this.A03;
                OperationResult operationResult = (OperationResult) obj;
                if (operationResult == null) {
                    immutableList = ImmutableList.of();
                } else {
                    StickerSearchResult stickerSearchResult = (StickerSearchResult) operationResult.A07();
                    if (GOp.A0l(gfO.A03).AZk(36319527650211983L)) {
                        String str = hcG.A01;
                        ImmutableList immutableList2 = stickerSearchResult.A00;
                        synchronized (r0) {
                            r0.A00.A06(0Pz.A0j("MESSENGER", "_", str), ImmutableList.copyOf((Collection) immutableList2));
                        }
                    }
                    immutableList = stickerSearchResult.A00;
                }
                hy1 = new HY1(immutableList);
                return hy1;
        }
    }
}
