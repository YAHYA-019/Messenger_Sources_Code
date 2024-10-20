package X;

import android.content.Context;
import android.graphics.RectF;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.photos.base.tagging.Tag;
import com.google.common.base.Preconditions;
import java.util.List;

/* renamed from: X.Dap, reason: case insensitive filesystem */
/* loaded from: Dap.class */
public final class C2064Dap extends I5C {
    public final Context A00;
    public final El5 A01;
    public final List A02;
    public final List A03;

    public C2064Dap(Context context, El5 el5, List list, List list2) {
        this.A00 = context;
        this.A02 = list;
        this.A03 = list2;
        this.A01 = el5;
        Preconditions.checkArgument(AnonymousClass001.A1Q(list.size(), list2.size()));
    }

    public /* bridge */ /* synthetic */ Object A02(Object[] objArr) {
        int i = 0;
        while (true) {
            int i2 = i;
            List list = this.A02;
            if (i2 >= list.size()) {
                return null;
            }
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s = ? AND %s = ? AND %s = ? AND %s = ? AND %s = ?", "image_hash", "box_left", "box_top", "box_right", "box_bottom");
            Tag tag = (Tag) this.A03.get(i2);
            String A14 = 1BK.A14(list, i2);
            RectF Aa1 = tag.A02.Aa1();
            this.A00.getContentResolver().delete(this.A01.A01, formatStrLocaleSafe, new String[]{A14, Double.toString(F9L.A00(Aa1.left)), Double.toString(F9L.A00(Aa1.top)), Double.toString(F9L.A00(Aa1.right)), Double.toString(F9L.A00(Aa1.bottom))});
            i = i2 + 1;
        }
    }
}
