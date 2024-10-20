package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.70q, reason: invalid class name */
/* loaded from: 70q.class */
public final class C70q extends C00q implements Function1 {
    public final /* synthetic */ boolean $includeCornersOutlineDecorator = true;
    public final /* synthetic */ boolean $isAvatarPowerUpEnabled;
    public final /* synthetic */ C6qu $this_textMessageFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70q(C6qu c6qu, boolean z) {
        super(1);
        this.$this_textMessageFeature = c6qu;
        this.$isAvatarPowerUpEnabled = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass706 anonymousClass706 = (AnonymousClass706) obj;
        11T.A0F(anonymousClass706, 0);
        C6ze c6ze = C6ze.A0W;
        C6zG BJC = ((6zQ) this.$this_textMessageFeature.A02()).BJC();
        C6z2 c6z2 = C6z2.A0k;
        boolean z = this.$isAvatarPowerUpEnabled;
        C6zG A00 = C6qt.A00(c6z2, new AnonymousClass789(z), new AnonymousClass838(4, this.$this_textMessageFeature, z));
        C6qv c6qv = this.$this_textMessageFeature.A00;
        C6zG[] c6zGArr = {BJC, A00, new 78C(c6qv.Ao5(), c6qv.Ad4(), C6vQ.A01, 255), this.$includeCornersOutlineDecorator ? ((6zQ) this.$this_textMessageFeature.A02()).Aeh() : null, ((6zQ) this.$this_textMessageFeature.A02()).BK9()};
        11T.A0F(c6zGArr, 0);
        anonymousClass706.A01(c6ze, 0QD.A0O(((6zQ) this.$this_textMessageFeature.A02()).Ags(), 02L.A08(c6zGArr)));
        C6ze c6ze2 = C6ze.A07;
        List singletonList = Collections.singletonList(((6zQ) this.$this_textMessageFeature.A02()).BK9());
        11T.A0A(singletonList);
        anonymousClass706.A01(c6ze2, 0QD.A0O(((6zQ) this.$this_textMessageFeature.A02()).Ah1(), singletonList));
        return 04S.A00;
    }
}
