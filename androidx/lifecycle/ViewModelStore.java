package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: ViewModelStore.class */
public class ViewModelStore {
    public final Map map = new LinkedHashMap();

    public final void clear() {
        Iterator it = this.map.values().iterator();
        while (it.hasNext()) {
            ((ViewModel) it.next()).clear$lifecycle_viewmodel_release();
        }
        this.map.clear();
    }
}
