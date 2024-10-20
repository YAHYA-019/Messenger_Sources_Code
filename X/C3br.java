package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3br, reason: invalid class name */
/* loaded from: 3br.class */
public final class C3br implements C2li {
    public final /* synthetic */ 2lW A00;

    public C3br(2lW r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView, X.2m7] */
    @Override // X.C2li
    public /* bridge */ /* synthetic */ Object A7y(Context context) {
        11T.A0F(context, 0);
        ?? recyclerView = new RecyclerView(context, null, 0);
        recyclerView.A02 = true;
        recyclerView.A03 = true;
        recyclerView.A04 = true;
        recyclerView.A01 = true;
        2Z6 r0 = new 2Z6(context, (RecyclerView) recyclerView);
        r0.setId(2131366870);
        return r0;
    }
}
