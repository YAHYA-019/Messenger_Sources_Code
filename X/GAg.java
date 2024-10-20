package X;

import java.text.NumberFormat;
import java.util.Currency;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: GAg.class */
public final class GAg extends C00q implements Function1 {
    public final /* synthetic */ Fx4 $controller;
    public final /* synthetic */ Currency $currency;
    public final /* synthetic */ NumberFormat $currencyFormatter;
    public final /* synthetic */ Function2 $internallyUpdateText;
    public final /* synthetic */ double $maxValueAdjusted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAg(Fx4 fx4, NumberFormat numberFormat, Currency currency, Function2 function2, double d) {
        super(1);
        this.$internallyUpdateText = function2;
        this.$currency = currency;
        this.$maxValueAdjusted = d;
        this.$controller = fx4;
        this.$currencyFormatter = numberFormat;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Function2 function2;
        Fx4 fx4;
        C9Mz c9Mz = (C9Mz) obj;
        11T.A0F(c9Mz, 0);
        String str = c9Mz.A01;
        11T.A0D(str);
        int length = str.length();
        Boolean A0K = AnonymousClass001.A0K();
        if (length != 0) {
            String str2 = "";
            String A00 = new C04t("\\D").A00(str, str2);
            if (A00.length() != 0) {
                double parseDouble = Double.parseDouble(A00) / Math.pow(10.0d, this.$currency.getDefaultFractionDigits());
                if (parseDouble >= this.$maxValueAdjusted) {
                    function2 = this.$internallyUpdateText;
                    str2 = this.$controller.A01;
                    function2.invoke(str2, A0K);
                } else {
                    if (parseDouble > 0.0d) {
                        str2 = this.$currencyFormatter.format(parseDouble);
                        if (str.equals(str2)) {
                            this.$internallyUpdateText.invoke(str, false);
                        } else {
                            fx4 = this.$controller;
                            11T.A0D(str2);
                        }
                    } else {
                        fx4 = this.$controller;
                    }
                    11T.A0F(str2, 0);
                    fx4.A01 = str2;
                }
            }
            function2 = this.$internallyUpdateText;
            function2.invoke(str2, A0K);
        }
        return 04S.A00;
    }
}
