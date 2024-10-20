package X;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.Dei, reason: case insensitive filesystem */
/* loaded from: Dei.class */
public final class SubMenuC2129Dei extends DSk implements SubMenu {
    public MenuItem A00;
    public MenuItem A01;
    public DSk A02;

    public int A0H() {
        int A0H = super.A0H();
        if (this.A00 != null) {
            A0H++;
        }
        return A0H;
    }

    @Override // android.view.Menu
    public void clear() {
        clearHeader();
        super.clear();
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.A00 = null;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.A01;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        MenuItem menuItem = this.A00;
        if (menuItem != null) {
            if (i != 0) {
                i--;
            }
            return menuItem;
        }
        menuItem = super.getItem(i);
        return menuItem;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        Drawable drawable = ((DSk) this).A03.getDrawable(i);
        if (drawable != null) {
            setHeaderIcon(drawable);
        }
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        11T.A0F(drawable, 0);
        FXN fxn = this.A00;
        if (fxn == null) {
            fxn = new FXN(this, (CharSequence) null, 0, 0);
            this.A00 = fxn;
        }
        fxn.setIcon(drawable);
        A07();
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        setHeaderTitle(1BK.A0u(((DSk) this).A03, i));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        11T.A0F(charSequence, 0);
        FXN fxn = this.A00;
        if (fxn == null) {
            fxn = new FXN(this, charSequence, 0, 0);
            this.A00 = fxn;
        }
        fxn.setTitle(charSequence);
        A07();
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        return this;
    }

    @Override // android.view.Menu
    public int size() {
        int size = super.size();
        if (this.A00 != null) {
            size++;
        }
        return size;
    }
}
