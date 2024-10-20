package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.payments.auth.dynamicdescriptor.DynamicDescriptorMainActivity;

/* loaded from: F54.class */
public final class F54 {
    public 1BY A00;
    public final C15h A01 = G7K.A01(this, 79);

    public F54(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static Intent A00(Context context, F54 f54, String str, String str2) {
        if (str == null) {
            return null;
        }
        Intent A0D = C3o5.A0D(context, DynamicDescriptorMainActivity.class);
        A0D.putExtra("dynamic_descriptor_params", ((F6A) f54.A01.get()).A00);
        if (TextUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        A0D.putExtra("dynamic_descriptor_entry_point", str2);
        A0D.putExtra("dynamic_descriptor_step", str);
        return A0D;
    }
}
