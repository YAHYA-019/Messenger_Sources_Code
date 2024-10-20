package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: Jtx.class */
public abstract class Jtx extends LWO {
    public RecyclerView A00;
    public C2mg A01;
    public final 2XA A02;
    public final 2O4 A03;
    public final C3056Jhp A04;

    public Jtx(Context context, 2XA r303, Ju0 ju0) {
        super(context, ju0);
        this.A02 = r303;
        C3056Jhp c3056Jhp = new C3056Jhp(context, this);
        this.A04 = c3056Jhp;
        this.A03 = new C3064Jhz(this);
        ((LWO) this).A02 = c3056Jhp;
    }

    public abstract void A08(RecyclerView recyclerView, int i, int i2);
}
