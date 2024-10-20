package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: AVd.class */
public final class AVd extends C00q implements Function2 {
    public final /* synthetic */ long $fadingEdgeLength;
    public final /* synthetic */ C2lh $isDataBound;
    public final /* synthetic */ 9cG $lazyCollectionController;
    public final /* synthetic */ C2lh $longPressedItem;
    public final /* synthetic */ 8Du $onScrollListener;
    public final /* synthetic */ C2lh $twoPerRowItemHeight;
    public final /* synthetic */ C8i5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVd(8Du r302, C2lh c2lh, C2lh c2lh2, C2lh c2lh3, 9cG r306, C8i5 c8i5, long j) {
        super(2);
        this.this$0 = c8i5;
        this.$twoPerRowItemHeight = c2lh;
        this.$onScrollListener = r302;
        this.$lazyCollectionController = r306;
        this.$fadingEdgeLength = j;
        this.$isDataBound = c2lh2;
        this.$longPressedItem = c2lh3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        2lO r318;
        C2k5 c2k5 = (C2k5) obj;
        long j = ((C26P) obj2).A00;
        11T.A0F(c2k5, 0);
        EMg eMg = this.this$0.A04;
        EMg eMg2 = EMg.A02;
        2lO r0 = 2lO.A02;
        2lO A04 = eMg == eMg2 ? C82m.A04(null, 0S2.A01, 100.0f, 0) : 7zQ.A0X((2lO) null, 0S2.A0Y, eMg.value);
        Integer num = 0S2.A00;
        2lO A042 = C82m.A04(A04, num, 100.0f, 0);
        if (eMg == eMg2) {
            this.$twoPerRowItemHeight.A04(new DD2(j, 4));
            r318 = 4YV.A0K((2lO) null, 0S2.A0j, 7zO.A0B(7zP.A01(this.$twoPerRowItemHeight)));
        } else {
            r318 = r0;
        }
        C82m A08 = C82m.A08(num, 100.0f, 0);
        if (r318 == r0) {
            r318 = null;
        }
        2lO A0K = 4YV.A0K(7zL.A0g(r318, A08), 0S2.A06, 7zP.A0F());
        List list = this.this$0.A06;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj3 : list) {
            if ((obj3 instanceof C94p) || (obj3 instanceof C94q)) {
                A0s.add(obj3);
            }
        }
        C8i5 c8i5 = this.this$0;
        int i = c8i5.A00;
        2kG r02 = c8i5.A01;
        2lO r03 = c8i5.A02;
        AKK akk = new AKK(this.$isDataBound, 39);
        8Du r04 = this.$onScrollListener;
        9cG r05 = this.$lazyCollectionController;
        C2lu A0w = 7zL.A0w(this.$fadingEdgeLength);
        C2lh c2lh = this.$longPressedItem;
        long A082 = 7zP.A08();
        2NI r06 = C8nc.A0O;
        1Iw r07 = c2k5.A05;
        C02A c02a = r07.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sm c9sm = new C9sm(r07);
        C9sm.A01(c9sm, A0s, AUi.A00, null, new AVZ(9, A0K, c2lh, A042, c8i5));
        return new C8ej(r06, r02, r04, r03, null, new C8qt(r07, c1j8, i, 7zN.A03(c2k5, A082), 2, z), c9sm.A01, r05, null, null, null, null, null, A0w, null, null, null, 2, null, akk, null, null, null, false);
    }
}
