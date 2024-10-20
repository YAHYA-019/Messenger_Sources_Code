package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: M7a.class */
public final class M7a extends C00q implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ MBi $fontFamilyResolver;
    public final /* synthetic */ boolean $hasInlineContent;
    public final /* synthetic */ java.util.Map $inlineContent;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ MLj $modifier;
    public final /* synthetic */ Function1 $onShowTranslation;
    public final /* synthetic */ Function1 $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ L4F $style;
    public final /* synthetic */ Lie $text;
    public final /* synthetic */ LNi $selectionController = null;
    public final /* synthetic */ MBX $color = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7a(MLj mLj, Lie lie, L4F l4f, MBi mBi, java.util.Map map, Function1 function1, Function1 function12, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        super(2);
        this.$modifier = mLj;
        this.$text = lie;
        this.$onTextLayout = function1;
        this.$hasInlineContent = z;
        this.$inlineContent = map;
        this.$style = l4f;
        this.$overflow = i;
        this.$softWrap = z2;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$fontFamilyResolver = mBi;
        this.$onShowTranslation = function12;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MLv A0N = JQz.A0N(obj, obj2);
        MLj mLj = this.$modifier;
        Lie lie = this.$text;
        Function1 function1 = this.$onTextLayout;
        boolean z = this.$hasInlineContent;
        java.util.Map map = this.$inlineContent;
        L4F l4f = this.$style;
        int i = this.$overflow;
        boolean z2 = this.$softWrap;
        LBb.A02(A0N, mLj, lie, l4f, this.$fontFamilyResolver, map, function1, this.$onShowTranslation, i, this.$maxLines, this.$minLines, Kv9.A00(this.$$changed), Kv9.A01(this.$$changed1), this.$$default, z, z2);
        return 04S.A00;
    }
}
