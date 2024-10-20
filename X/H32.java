package X;

import android.view.View;
import java.util.Iterator;

/* loaded from: H32.class */
public abstract class H32 extends C6d5 {
    public int A00;

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.view.View*/.setVisibility(i);
        if (this.A00 != i) {
            this.A00 = i;
            Iterator it = C0ty.A00.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(i);
            }
        }
    }
}
