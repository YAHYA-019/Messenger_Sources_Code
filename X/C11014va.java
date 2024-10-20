package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Set;

/* renamed from: X.4va, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4va.class */
public final class C11014va extends 2vS {
    public final 1De A00;

    public C11014va(1De r302) {
        super((C2xd) 1Bn.A0E((Context) null, r302.A00, 17149));
        this.A00 = r302;
    }

    public long A01() {
        return 0L;
    }

    public Intent A02(Context context) {
        return new Intent();
    }

    public String A04() {
        return "Messenger RTC Peek Promotion";
    }

    public /* bridge */ /* synthetic */ Set A05() {
        return new SingletonImmutableSet(QuickPromotionDefinition.TemplateType.A07);
    }

    public String Arn() {
        return "8470";
    }
}
