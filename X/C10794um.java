package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: X.4um, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4um.class */
public final class C10794um extends 2vS {
    public final 1De A00;

    public C10794um(1De r302) {
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
        return "Messenger Recent Thread List Banner";
    }

    public /* bridge */ /* synthetic */ Set A05() {
        ImmutableSet A02 = ImmutableSet.A02(QuickPromotionDefinition.TemplateType.A08, QuickPromotionDefinition.TemplateType.A09);
        11T.A0A(A02);
        return A02;
    }

    public String Arn() {
        return "4408";
    }
}