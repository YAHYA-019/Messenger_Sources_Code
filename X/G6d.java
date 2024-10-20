package X;

import com.facebook.bugreporter.activity.categorylist.CategoryInfo;
import com.facebook.common.util.TriState;
import java.text.Collator;
import java.util.Comparator;

/* loaded from: G6d.class */
public final class G6d implements Comparator {
    public final Collator A01 = (Collator) 1Bn.A0A(83138);
    public final TriState A00 = (TriState) 1Bn.A0A(83429);

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str;
        String str2;
        CategoryInfo categoryInfo = (CategoryInfo) obj;
        CategoryInfo categoryInfo2 = (CategoryInfo) obj2;
        Collator collator = this.A01;
        if (TriState.YES.equals(this.A00)) {
            str = categoryInfo.A01;
            str2 = categoryInfo2.A01;
        } else {
            str = categoryInfo.A03;
            str2 = categoryInfo2.A03;
        }
        return collator.compare(str, str2);
    }
}
