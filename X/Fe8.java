package X;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

/* loaded from: Fe8.class */
public final class Fe8 implements C4YP {
    @Override // X.C4YP
    public /* bridge */ /* synthetic */ void AMv(Bundle bundle, Object obj) {
        ListView listView = (ListView) obj;
        11T.A0H(listView, bundle);
        ListAdapter adapter = listView.getAdapter();
        bundle.putString("list_adapter_class", adapter == null ? "null" : AnonymousClass001.A0Y(adapter));
    }

    @Override // X.C4YP
    public Class AW7() {
        return ListView.class;
    }
}
