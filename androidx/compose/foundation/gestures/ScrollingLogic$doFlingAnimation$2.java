package androidx.compose.foundation.gestures;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0Pn;
import X.2aK;
import X.7zM;
import X.AnonymousClass001;
import X.DKH;
import X.JQx;
import X.JR2;
import X.KMT;
import X.LMk;
import X.LMo;
import X.ME4;
import kotlin.jvm.functions.Function2;

/* loaded from: ScrollingLogic$doFlingAnimation$2.class */
public final class ScrollingLogic$doFlingAnimation$2 extends 0DO implements Function2 {
    public final /* synthetic */ long $available;
    public final /* synthetic */ 0Pn $result;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, 0DR r303, 0Pn r304, long j) {
        super(2, r303);
        this.this$0 = scrollingLogic;
        this.$result = r304;
        this.$available = j;
    }

    public final 0DR create(Object obj, 0DR r303) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, r303, this.$result, this.$available);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        0Pn r309;
        long j;
        ScrollingLogic scrollingLogic2;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            ME4 me4 = (ME4) this.L$0;
            scrollingLogic = this.this$0;
            LMo lMo = new LMo(me4, scrollingLogic);
            r309 = this.$result;
            long j2 = this.$available;
            LMk lMk = scrollingLogic.A02;
            j = r309.element;
            float intBitsToFloat = Float.intBitsToFloat((int) (scrollingLogic.A03 == KMT.A01 ? j2 >> 32 : j2 & 4294967295L));
            if (scrollingLogic.A07) {
                intBitsToFloat *= -1.0f;
            }
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = r309;
            this.J$0 = j;
            this.label = 1;
            LMk lMk2 = lMk;
            lMk2.A00 = 0;
            obj = 2aK.A00(this, lMk2.A02, new DefaultFlingBehavior$performFling$2(lMk2, lMo, null, intBitsToFloat));
            if (obj == r0) {
                return r0;
            }
            scrollingLogic2 = scrollingLogic;
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            j = this.J$0;
            r309 = (0Pn) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            0Dt.A00(obj);
        }
        float A00 = 7zM.A00(obj);
        if (scrollingLogic2.A07) {
            A00 *= -1.0f;
        }
        r309.element = scrollingLogic.A03 == KMT.A01 ? JR2.A0B(A00, JQx.A04(4294967295L, j)) : JR2.A0B(DKH.A00(j), A00);
        return 04S.A00;
    }
}
