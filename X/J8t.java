package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* loaded from: J8t.class */
public final class J8t extends C00q implements C00m {
    public final /* synthetic */ Integer $disabledContentDescription;
    public final /* synthetic */ int $enabledContentDescription;
    public final /* synthetic */ C1u3 $iconName;
    public final /* synthetic */ int $idRes;
    public final /* synthetic */ int $label;
    public final /* synthetic */ ImageView.ScaleType $scaleType = null;
    public final /* synthetic */ Ify this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8t(C1u3 c1u3, Ify ify, Integer num, int i, int i2, int i3) {
        super(0);
        this.this$0 = ify;
        this.$iconName = c1u3;
        this.$idRes = i;
        this.$label = i2;
        this.$enabledContentDescription = i3;
        this.$disabledContentDescription = num;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Drawable A0C = GOo.A0C(this.$iconName, 7zP.A0S(this.this$0.A06), 7zQ.A0m(this.this$0.A05));
        Drawable A08 = 7zP.A0S(this.this$0.A06).A08(this.$iconName, 7zQ.A0m(this.this$0.A05).Aht());
        Function1 function1 = this.this$0.A0I;
        int i = this.$idRes;
        11T.A0D(A0C);
        11T.A0D(A08);
        int i2 = this.$label;
        return new Gz4(A0C, A08, this.$scaleType, Integer.valueOf(this.$enabledContentDescription), this.$disabledContentDescription, function1, i, i2);
    }
}
