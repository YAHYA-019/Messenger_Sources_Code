package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* loaded from: J8v.class */
public final class J8v extends C00q implements C00m {
    public final /* synthetic */ boolean $enableLongPress;
    public final /* synthetic */ Integer $enabledAndCheckedContentDescription;
    public final /* synthetic */ Integer $enabledContentDescription;
    public final /* synthetic */ C1u3 $iconName;
    public final /* synthetic */ C1u3 $iconNameForChecked;
    public final /* synthetic */ int $idRes;
    public final /* synthetic */ boolean $isPrivacyAware;
    public final /* synthetic */ int $label;
    public final /* synthetic */ Ify this$0;
    public final /* synthetic */ Integer $disabledContentDescription = null;
    public final /* synthetic */ ImageView.ScaleType $scaleType = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8v(C1u3 c1u3, C1u3 c1u32, Ify ify, Integer num, Integer num2, int i, int i2, boolean z, boolean z2) {
        super(0);
        this.this$0 = ify;
        this.$iconName = c1u3;
        this.$iconNameForChecked = c1u32;
        this.$idRes = i;
        this.$label = i2;
        this.$enabledContentDescription = num;
        this.$enabledAndCheckedContentDescription = num2;
        this.$enableLongPress = z;
        this.$isPrivacyAware = z2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Drawable A0C = GOo.A0C(this.$iconName, 7zP.A0S(this.this$0.A06), 7zQ.A0m(this.this$0.A05));
        Drawable A0C2 = GOo.A0C(this.$iconNameForChecked, 7zP.A0S(this.this$0.A06), 7zQ.A0m(this.this$0.A05));
        Drawable A08 = 7zP.A0S(this.this$0.A06).A08(this.$iconName, 7zQ.A0m(this.this$0.A05).Aht());
        Function1 function1 = this.this$0.A0I;
        int i = this.$idRes;
        11T.A0D(A0C);
        11T.A0D(A08);
        int i2 = this.$label;
        Integer num = this.$enabledContentDescription;
        Integer num2 = this.$enabledAndCheckedContentDescription;
        11T.A0D(A0C2);
        return new Gz5(A0C, A08, A0C2, this.$scaleType, num, num2, this.$disabledContentDescription, function1, i, i2, this.$enableLongPress, this.$isPrivacyAware);
    }
}
