package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.xapp.messaging.commmunitymessaging.category.model.CommunityCategory;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* loaded from: AI0.class */
public final class AI0 implements 0zU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ QuickPerformanceLogger A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 2aI A03;

    public AI0(QuickPerformanceLogger quickPerformanceLogger, String str, 2aI r304, int i) {
        this.A01 = quickPerformanceLogger;
        this.A00 = i;
        this.A03 = r304;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object emit(Object obj, 0DR r303) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        String str = this.A02;
        if (!(abstractCollection instanceof Collection) || !abstractCollection.isEmpty()) {
            Iterator it = abstractCollection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (11T.A0O(((CommunityCategory) it.next()).A01, str)) {
                    this.A01.markerEnd(this.A00, (short) 2);
                    2aG.A04((CancellationException) null, this.A03);
                    break;
                }
            }
        }
        return 04S.A00;
    }
}
