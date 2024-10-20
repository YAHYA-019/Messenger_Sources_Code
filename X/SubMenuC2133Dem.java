package X;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.fbui.popover.PopoverViewFlipper;

/* renamed from: X.Dem, reason: case insensitive filesystem */
/* loaded from: Dem.class */
public final class SubMenuC2133Dem extends DPb implements SubMenu {
    public MenuItem A00;
    public MenuItem A01;
    public DPb A02;

    @Override // android.view.Menu
    public void clear() {
        clearHeader();
        super.clear();
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.A00 = null;
    }

    public int getCount() {
        int count = super.getCount();
        if (this.A00 != null) {
            count++;
        }
        return count;
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

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        11T.A0H(adapterView, view);
        if (((DPb) this).A00 != null) {
            Q69 q69 = ((DPb) this).A01;
            if (this.A00 == null || i != 0 || q69 == null) {
                super.onItemClick(adapterView, view, i, j);
                return;
            }
            DPb dPb = this.A02;
            if (dPb != null) {
                q69.A01 = dPb;
                dPb.A02(q69);
                q69.A01.A03(q69);
                Integer num = 0S2.A0j;
                PopoverViewFlipper popoverViewFlipper = ((FIU) q69).A0I;
                if (popoverViewFlipper.A07 != num) {
                    popoverViewFlipper.A07 = num;
                }
                int i2 = popoverViewFlipper.A00;
                if (i2 > 0) {
                    PopoverViewFlipper.A01(popoverViewFlipper.getChildAt(i2), popoverViewFlipper.getChildAt(popoverViewFlipper.A00 - 1), popoverViewFlipper);
                    popoverViewFlipper.A00--;
                }
            }
        }
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        Drawable drawable = ((DPb) this).A02.getDrawable(i);
        if (drawable != null) {
            setHeaderIcon(drawable);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        11T.A0F(drawable, 0);
        FXN fxn = this.A00;
        if (fxn == null) {
            fxn = new FXN(this, (CharSequence) null, 0, 0);
            this.A00 = fxn;
        }
        fxn.setIcon(drawable);
        0V5.A00(this, -1393496040);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        setHeaderTitle(1BK.A0u(((DPb) this).A02, i));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        11T.A0F(charSequence, 0);
        FXN fxn = this.A00;
        if (fxn == null) {
            fxn = new FXN(this, charSequence, 0, 0);
            this.A00 = fxn;
        }
        fxn.setTitle(charSequence);
        0V5.A00(this, -1393496040);
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
