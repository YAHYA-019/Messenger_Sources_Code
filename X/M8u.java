package X;

import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function1;

/* loaded from: M8u.class */
public final class M8u extends C00q implements C0Bd {
    public final /* synthetic */ long $containerConstraints;
    public final /* synthetic */ MNH $this_null;
    public final /* synthetic */ int $totalHorizontalPadding;
    public final /* synthetic */ int $totalVerticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8u(MNH mnh, int i, int i2, long j) {
        super(3);
        this.$this_null = mnh;
        this.$containerConstraints = j;
        this.$totalHorizontalPadding = i;
        this.$totalVerticalPadding = i2;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A03 = AnonymousClass001.A03(obj);
        int A032 = AnonymousClass001.A03(obj2);
        MNH mnh = this.$this_null;
        long j = this.$containerConstraints;
        return MNJ.A00(mnh, (Function1) obj3, Constraints.A05(j, A03 + this.$totalHorizontalPadding), Constraints.A04(j, A032 + this.$totalVerticalPadding));
    }
}
