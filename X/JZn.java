package X;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: JZn.class */
public final class JZn extends JXV {
    public final Context A00;

    public JZn(Context context) {
        super(context);
        this.A00 = context;
    }

    public void inflate(int i, Menu menu) {
        super.inflate(i, menu);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= menu.size()) {
                return;
            }
            MenuItem item = menu.getItem(i3);
            item.setTitle(AbstractC00793on.A00(this.A00, item.getTitle()));
            i2 = i3 + 1;
        }
    }
}
