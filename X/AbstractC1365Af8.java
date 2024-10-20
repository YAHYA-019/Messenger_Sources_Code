package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.user.model.User;
import com.google.common.base.Preconditions;

/* renamed from: X.Af8, reason: case insensitive filesystem */
/* loaded from: Af8.class */
public abstract class AbstractC1365Af8 extends BaseAdapter implements ListAdapter {
    public boolean A00 = false;

    public View A01(int i, ViewGroup viewGroup) {
        return AbG.A08(LayoutInflater.from(((BJD) this).A01), viewGroup, 2132542051);
    }

    public void A02(View view, ViewGroup viewGroup, Object obj, int i, int i2) {
        User user = (User) obj;
        ((FbDraweeView) view.requireViewById(2131364245)).A0G(C0A2.A03(user.A07()), BJD.A04);
        ((TextView) view.requireViewById(2131364242)).setText(7zL.A13(user));
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View view2 = view;
        try {
            this.A00 = true;
            int itemViewType = getItemViewType(i);
            if (view == null) {
                view2 = A01(itemViewType, viewGroup);
                Preconditions.checkNotNull(view2, "createDropDownView() shall not return null value!");
            }
            A02(view2, viewGroup, getItem(i), i, itemViewType);
            this.A00 = false;
            return view2;
        } catch (Throwable th) {
            this.A00 = false;
            throw th;
        }
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = view;
        try {
            this.A00 = true;
            int itemViewType = getItemViewType(i);
            if (view == null) {
                view2 = A01(itemViewType, viewGroup);
                Preconditions.checkNotNull(view2, "createView() shall not return null value!");
            }
            A02(view2, viewGroup, getItem(i), i, itemViewType);
            this.A00 = false;
            return view2;
        } catch (Throwable th) {
            this.A00 = false;
            throw th;
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        Preconditions.checkArgument(!this.A00, "Call to notifyDataSetChanged while the adapter is getting a view!");
        super.notifyDataSetChanged();
    }
}
