package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Set;

/* loaded from: E7j.class */
public final class E7j extends 2vS {
    public final 1De A00;

    public E7j(1De r302) {
        super((C2xd) 1De.A00(r302, 17149));
        this.A00 = r302;
    }

    public long A01() {
        return 0L;
    }

    public Intent A02(Context context) {
        return AbF.A05();
    }

    public String A04() {
        return "Android Messenger Deprecation Pre-Lock Surface";
    }

    public /* bridge */ /* synthetic */ Set A05() {
        return new SingletonImmutableSet(QuickPromotionDefinition.TemplateType.A0i);
    }

    public String Arn() {
        return "4744";
    }
}
