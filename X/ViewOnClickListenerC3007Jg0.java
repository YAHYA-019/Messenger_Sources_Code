package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import java.util.WeakHashMap;

/* renamed from: X.Jg0, reason: case insensitive filesystem */
/* loaded from: Jg0.class */
public final class ViewOnClickListenerC3007Jg0 extends AbstractC3008Jg1 implements View.OnClickListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public final int A08;
    public final SearchableInfo A09;
    public final Context A0A;
    public final SearchView A0B;
    public final WeakHashMap A0C;

    public ViewOnClickListenerC3007Jg0(SearchableInfo searchableInfo, Context context, SearchView searchView, WeakHashMap weakHashMap) {
        int i = searchView.mSuggestionRowLayout;
        ((JYX) this).A05 = true;
        ((JYX) this).A02 = null;
        ((JYX) this).A06 = false;
        ((JYX) this).A01 = context;
        ((JYX) this).A00 = -1;
        ((JYX) this).A04 = new JV1(this);
        ((JYX) this).A03 = new JV4(this);
        super.A00 = i;
        super.A01 = i;
        super.A02 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.A03 = 1;
        this.A04 = -1;
        this.A05 = -1;
        this.A06 = -1;
        this.A01 = -1;
        this.A02 = -1;
        this.A00 = -1;
        this.A0B = searchView;
        this.A09 = searchableInfo;
        this.A08 = searchView.mSuggestionCommitIconResId;
        this.A0A = context;
        this.A0C = weakHashMap;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0346  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.drawable.Drawable A00(X.ViewOnClickListenerC3007Jg0 r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC3007Jg0.A00(X.Jg0, java.lang.String):android.graphics.drawable.Drawable");
    }

    public static String A01(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            android.util.Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public void AEY(Cursor cursor) {
        try {
            super.AEY(cursor);
            if (cursor != null) {
                this.A04 = cursor.getColumnIndex("suggest_text_1");
                this.A05 = cursor.getColumnIndex("suggest_text_2");
                this.A06 = cursor.getColumnIndex("suggest_text_2_url");
                this.A01 = cursor.getColumnIndex("suggest_icon_1");
                this.A02 = cursor.getColumnIndex("suggest_icon_2");
                this.A00 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            android.util.Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A08 = AbG.A08(super.A02, viewGroup, super.A00);
            if (A08 != null) {
                ((Kkg) A08.getTag()).A03.setText(e.toString());
            }
            return A08;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            ViewOnClickListenerC3007Jg0 viewOnClickListenerC3007Jg0 = this;
            View A08 = AbG.A08(((AbstractC3008Jg1) viewOnClickListenerC3007Jg0).A02, viewGroup, ((AbstractC3008Jg1) viewOnClickListenerC3007Jg0).A01);
            A08.setTag(new Kkg(A08));
            GOn.A0I(A08, 2131363782).setImageResource(viewOnClickListenerC3007Jg0.A08);
            ((Kkg) A08.getTag()).A03.setText(e.toString());
            return A08;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void notifyDataSetChanged() {
        Bundle extras;
        super/*android.widget.BaseAdapter*/.notifyDataSetChanged();
        Cursor cursor = ((JYX) this).A02;
        if (cursor == null || (extras = cursor.getExtras()) == null) {
            return;
        }
        extras.getBoolean("in_progress");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void notifyDataSetInvalidated() {
        Bundle extras;
        super/*android.widget.BaseAdapter*/.notifyDataSetInvalidated();
        Cursor cursor = ((JYX) this).A02;
        if (cursor == null || (extras = cursor.getExtras()) == null) {
            return;
        }
        extras.getBoolean("in_progress");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int A05 = 0FI.A05(1438073736);
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A0B.onQueryRefine((CharSequence) tag);
        }
        0FI.A0B(553628035, A05);
    }
}
