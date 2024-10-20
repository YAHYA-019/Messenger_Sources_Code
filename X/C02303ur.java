package X;

import android.widget.TextView;
import kotlin.jvm.functions.Function2;

/* renamed from: X.3ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ur.class */
public final /* synthetic */ class C02303ur extends 01I implements Function2 {
    public C02303ur(Object obj) {
        super(2, obj, C02293uq.class, "measureTextWidth", "measureTextWidth(Landroid/widget/TextView;Ljava/lang/String;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextView textView = (TextView) obj;
        11T.A0F(textView, 0);
        textView.setText((String) obj2);
        textView.measure(-2, -2);
        return Integer.valueOf(textView.getMeasuredWidth());
    }
}
