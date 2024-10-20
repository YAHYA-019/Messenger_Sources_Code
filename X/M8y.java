package X;

import androidx.compose.foundation.CombinedClickableElement;

/* loaded from: M8y.class */
public final class M8y extends C00q implements C0Bd {
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ ME2 $indication;
    public final /* synthetic */ C00m $onClick$inlined;
    public final /* synthetic */ C00m $onLongClick$inlined;
    public final /* synthetic */ ExZ $role$inlined;
    public final /* synthetic */ String $onClickLabel$inlined = null;
    public final /* synthetic */ String $onLongClickLabel$inlined = null;
    public final /* synthetic */ C00m $onDoubleClick$inlined = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8y(ME2 me2, ExZ exZ, C00m c00m, C00m c00m2, boolean z) {
        super(3);
        this.$indication = me2;
        this.$enabled$inlined = z;
        this.$role$inlined = exZ;
        this.$onClick$inlined = c00m;
        this.$onLongClick$inlined = c00m2;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MLv A0N = JQz.A0N(obj2, obj3);
        MMs mMs = (MMs) JR2.A0Q(A0N, -1525724089);
        MLj A00 = Kwq.A00(this.$indication, mMs, MLj.A00);
        boolean z = this.$enabled$inlined;
        String str = this.$onClickLabel$inlined;
        MLj D4B = A00.D4B(new CombinedClickableElement(null, mMs, this.$role$inlined, str, this.$onLongClickLabel$inlined, this.$onClick$inlined, this.$onLongClick$inlined, this.$onDoubleClick$inlined, z));
        LNS.A0R(A0N);
        return D4B;
    }
}
