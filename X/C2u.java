package X;

import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* loaded from: C2u.class */
public final class C2u {
    public final ImmutableSet A00;
    public final String[] A01;

    public C2u(Set set, String[] strArr) {
        this.A00 = ImmutableSet.A07(set);
        this.A01 = strArr;
    }

    public String toString() {
        return StringFormatUtil.formatStrLocaleSafe("Params threadKeys=[%s]", TextUtils.join(", ", this.A00));
    }
}
