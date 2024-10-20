package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.837, reason: invalid class name */
/* loaded from: 837.class */
public final class AnonymousClass837 extends C00q implements Function1 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass837(int i, Object obj) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass706 anonymousClass706;
        C6ze c6ze;
        switch (this.A00) {
            case 0:
                anonymousClass706 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass706, 0);
                c6ze = C6ze.A08;
                break;
            case 1:
                anonymousClass706 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass706, 0);
                c6ze = C6ze.A0B;
                break;
            case 2:
                anonymousClass706 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass706, 0);
                c6ze = C6ze.A0X;
                break;
            default:
                List list = (List) obj;
                11T.A0F(list, 0);
                C6qt c6qt = (C6qt) this.A01;
                return c6qt.A05.A00("RenderingConfigBuilder.noBubbleDecoratorOrder()", list, c6qt.A0A, false);
        }
        anonymousClass706.A01(c6ze, (List) ((7Mh) ((C6qt) this.A01).A02()).A03.getValue());
        return 04S.A00;
    }
}
