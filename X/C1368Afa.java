package X;

import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Afa, reason: case insensitive filesystem */
/* loaded from: Afa.class */
public final class C1368Afa extends 2Xd {
    public Be2 A00;
    public DGw A01;
    public ImmutableList A02;

    public /* bridge */ /* synthetic */ void BlZ(C2lb c2lb, int i) {
        Bpe bpe = (Bpe) this.A02.get(i);
        this.A01.ACN(new CZE(this, bpe, 31), bpe, (GXa) c2lb);
    }

    public /* bridge */ /* synthetic */ C2lb Bs3(ViewGroup viewGroup, int i) {
        return this.A01.ALK(viewGroup);
    }

    public int getItemCount() {
        return this.A02.size();
    }

    public long getItemId(int i) {
        return ((Bpe) this.A02.get(i)).A00.hashCode();
    }
}
