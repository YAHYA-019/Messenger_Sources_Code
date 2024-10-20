package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;

/* renamed from: X.3us, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3us.class */
public final /* synthetic */ class C02313us extends 01I implements Function1 {
    public C02313us(Object obj) {
        super(1, obj, C02293uq.class, "createTextViewForWidthMeasurement", "createTextViewForWidthMeasurement(Landroid/content/Context;)Landroid/widget/TextView;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        11T.A0F(context, 0);
        TextView textView = new TextView(context, null);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return textView;
    }
}
