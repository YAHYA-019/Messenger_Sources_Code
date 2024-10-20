package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9tj, reason: invalid class name */
/* loaded from: 9tj.class */
public final class C9tj implements C7ye {
    public final 1Br A00;
    public final ThreadKey A01;
    public final String A02;
    public final C00m A03;
    public final C00m A04;
    public final C00m A05;
    public final Function1 A06;

    public C9tj(Context context, ThreadKey threadKey, C00m c00m, C00m c00m2, C00m c00m3, Function1 function1) {
        11T.A0F(context, 1);
        this.A05 = c00m;
        this.A04 = c00m2;
        this.A03 = c00m3;
        this.A06 = function1;
        this.A01 = threadKey;
        this.A00 = 1Bu.A00(68180);
        this.A02 = 1BK.A0u(context, 2131968176);
    }

    @Override // X.C7ye
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return false;
        }
        String A1C = 7zM.A1C(7zU.A03(this.A04), 7zU.A03(this.A03), (String) this.A05.invoke());
        ((C9ks) 1Br.A0B(this.A00)).A02(this.A01, true, true);
        this.A06.invoke(A1C);
        return true;
    }

    @Override // X.C7ye
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, 1, 1, this.A02);
        ((C9ks) 1Br.A0B(this.A00)).A02(this.A01, false, true);
        return true;
    }

    @Override // X.C7ye
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
