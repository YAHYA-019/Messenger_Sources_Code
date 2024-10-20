package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.payments.cart.model.CatalogItemsConfig;
import com.facebook.payments.cart.model.CustomItemsConfig;
import com.facebook.payments.cart.model.PaymentsCartParams;
import com.facebook.payments.cart.model.SimpleCartItem;
import com.facebook.payments.cart.model.SimpleCartScreenConfig;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.form.PaymentsFormActivity;
import com.facebook.payments.form.model.FormFieldAttributes;
import com.facebook.payments.form.model.ItemFormData;
import com.facebook.payments.form.model.PaymentsFormParams;
import com.facebook.payments.model.FormFieldProperty;
import com.facebook.payments.ui.MediaGridTextLayoutParams;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: F7m.class */
public final class F7m {
    public PaymentsCartParams A00;
    public ETu A01;
    public final Context A02 = 7zP.A0J();

    private void A00(SimpleCartItem simpleCartItem, SimpleCartScreenConfig simpleCartScreenConfig, String str, int i) {
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        int i2 = simpleCartItem.A00;
        int i3 = simpleCartItem.A01;
        CatalogItemsConfig catalogItemsConfig = simpleCartScreenConfig.A00;
        if (catalogItemsConfig != null && catalogItemsConfig.A00) {
            Quo quo = Quo.A03;
            immutableMap = ImmutableMap.of((Object) quo, (Object) new FormFieldAttributes(quo, Qup.A01, FormFieldProperty.A03, null, this.A02.getString(2131963791), String.valueOf(simpleCartItem.A03.A01), null, null, 0));
        }
        String str2 = simpleCartItem.A08;
        ImmutableList immutableList = null;
        String str3 = simpleCartItem.A07;
        String str4 = simpleCartItem.A06;
        String str5 = simpleCartItem.A05;
        if (str5 != null) {
            immutableList = ImmutableList.of((Object) str5);
        }
        MediaGridTextLayoutParams mediaGridTextLayoutParams = new MediaGridTextLayoutParams(immutableList, str4, str3, str2, null);
        String str6 = null;
        PaymentsDecoratorParams paymentsDecoratorParams = this.A00.A00;
        PaymentsTitleBarStyle paymentsTitleBarStyle = paymentsDecoratorParams.paymentsTitleBarStyle;
        PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle = paymentsDecoratorParams.paymentsTitleBarTitleStyle;
        String str7 = paymentsDecoratorParams.paymentsTitleBarButtonText;
        Optional optional = paymentsDecoratorParams.A00;
        boolean z = paymentsDecoratorParams.isFullScreenModal;
        String str8 = paymentsDecoratorParams.paymentsPayBarButtonText;
        if (str8 != null) {
            str6 = str8;
        }
        PaymentsDecoratorParams paymentsDecoratorParams2 = new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A03, paymentsTitleBarStyle, paymentsTitleBarTitleStyle, optional, str6, str7, z);
        Context context = this.A02;
        PaymentsFormParams paymentsFormParams = new PaymentsFormParams(paymentsDecoratorParams2, QpL.A04, new ItemFormData(simpleCartItem, mediaGridTextLayoutParams, immutableMap, i2, i3), null, null, context.getString(2131963134), str);
        Intent A0D = C3o5.A0D(context, PaymentsFormActivity.class);
        A0D.putExtra("extra_payments_form_params", paymentsFormParams);
        this.A01.A06(A0D, i);
    }

    public void A01(SimpleCartItem simpleCartItem, SimpleCartScreenConfig simpleCartScreenConfig) {
        int i;
        Context context;
        String string;
        String str;
        int ordinal = simpleCartItem.A02.ordinal();
        if (ordinal == 1) {
            i = 2;
            context = this.A02;
            string = context.getString(2131956985);
            str = null;
        } else {
            if (ordinal == 0) {
                A00(simpleCartItem, simpleCartScreenConfig, this.A02.getString(2131956985), 3);
                return;
            }
            if (ordinal != 3) {
                if (ordinal != 2) {
                    throw AnonymousClass001.A0p();
                }
                A00(simpleCartItem, simpleCartScreenConfig, this.A02.getString(2131956987), 5);
                return;
            } else {
                i = 4;
                context = this.A02;
                string = context.getString(2131956987);
                str = DKF.A0t(simpleCartItem.A03);
            }
        }
        CustomItemsConfig customItemsConfig = simpleCartScreenConfig.A01;
        ImmutableMap immutableMap = customItemsConfig.A01;
        immutableMap.getClass();
        int i2 = customItemsConfig.A00;
        int i3 = simpleCartItem.A00;
        ImmutableMap.Builder A0c = 1BK.A0c();
        Quo quo = Quo.A06;
        if (immutableMap.containsKey(quo)) {
            A0c.put(quo, ((FormFieldAttributes) immutableMap.get(quo)).A00(simpleCartItem.A08));
        }
        Quo quo2 = Quo.A05;
        if (immutableMap.containsKey(quo2)) {
            A0c.put(quo2, ((FormFieldAttributes) immutableMap.get(quo2)).A00(simpleCartItem.A07));
        }
        Quo quo3 = Quo.A03;
        if (immutableMap.containsKey(quo3)) {
            A0c.put(quo3, ((FormFieldAttributes) immutableMap.get(quo3)).A00(str));
        }
        ImmutableMap build = A0c.build();
        String str2 = null;
        PaymentsDecoratorParams paymentsDecoratorParams = this.A00.A00;
        PaymentsTitleBarStyle paymentsTitleBarStyle = paymentsDecoratorParams.paymentsTitleBarStyle;
        PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle = paymentsDecoratorParams.paymentsTitleBarTitleStyle;
        String str3 = paymentsDecoratorParams.paymentsTitleBarButtonText;
        Optional optional = paymentsDecoratorParams.A00;
        boolean z = paymentsDecoratorParams.isFullScreenModal;
        String str4 = paymentsDecoratorParams.paymentsPayBarButtonText;
        if (str4 != null) {
            str2 = str4;
        }
        PaymentsFormParams paymentsFormParams = new PaymentsFormParams(new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A03, paymentsTitleBarStyle, paymentsTitleBarTitleStyle, optional, str2, str3, z), QpL.A04, new ItemFormData(simpleCartItem, null, build, i3, i2), null, null, customItemsConfig.A02, string);
        Intent A0D = C3o5.A0D(context, PaymentsFormActivity.class);
        A0D.putExtra("extra_payments_form_params", paymentsFormParams);
        this.A01.A06(A0D, i);
    }
}
