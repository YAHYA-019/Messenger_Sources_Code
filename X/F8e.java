package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/* loaded from: F8e.class */
public final class F8e {
    public DialogInterface.OnCancelListener A01;
    public DialogInterface.OnClickListener A02;
    public DialogInterface.OnClickListener A03;
    public DialogInterface.OnClickListener A04;
    public DialogInterface.OnClickListener A05;
    public DialogInterface.OnDismissListener A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public ListAdapter A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public boolean A0J;
    public CharSequence[] A0L;
    public final Context A0M;
    public final LayoutInflater A0N;
    public boolean A0K = false;
    public int A00 = -1;
    public boolean A0I = true;
    public boolean A0H = true;

    public F8e(Context context) {
        this.A0M = context;
        this.A0N = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public static F8e A00(Context context, int i) {
        return new F8e(new ContextThemeWrapper(context, DMV.A00(context, i)));
    }

    public void A01(FEx fEx) {
        View view = this.A07;
        if (view != null) {
            fEx.A09 = view;
        } else {
            CharSequence charSequence = this.A0G;
            if (charSequence != null) {
                fEx.A0P = charSequence;
                TextView textView = fEx.A0K;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
        }
        CharSequence charSequence2 = this.A0C;
        if (charSequence2 != null) {
            fEx.A0O = charSequence2;
            TextView textView2 = fEx.A0J;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        View view2 = this.A08;
        if (view2 != null) {
            fEx.A0A = view2;
        }
        View view3 = this.A09;
        if (view3 != null) {
            fEx.A0B = view3;
        }
        CharSequence charSequence3 = this.A0F;
        if (charSequence3 != null) {
            DialogInterface.OnClickListener onClickListener = this.A05;
            Message message = null;
            if (onClickListener != null) {
                message = fEx.A05.obtainMessage(-1, onClickListener);
            }
            fEx.A0N = charSequence3;
            fEx.A08 = message;
        }
        CharSequence charSequence4 = this.A0D;
        if (charSequence4 != null) {
            DialogInterface.OnClickListener onClickListener2 = this.A02;
            Message message2 = null;
            if (onClickListener2 != null) {
                message2 = fEx.A05.obtainMessage(-2, onClickListener2);
            }
            fEx.A0L = charSequence4;
            fEx.A06 = message2;
        }
        CharSequence charSequence5 = this.A0E;
        if (charSequence5 != null) {
            DialogInterface.OnClickListener onClickListener3 = this.A03;
            Message message3 = null;
            if (onClickListener3 != null) {
                message3 = fEx.A05.obtainMessage(-3, onClickListener3);
            }
            fEx.A0M = charSequence5;
            fEx.A07 = message3;
        }
        if (this.A0L != null || this.A0B != null) {
            ListView listView = (ListView) this.A0N.inflate(fEx.A03, (ViewGroup) null);
            int i = this.A0J ? fEx.A04 : fEx.A02;
            ListAdapter listAdapter = this.A0B;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(this.A0M, i, 2131363996, this.A0L);
            }
            fEx.A0G = listAdapter;
            fEx.A01 = this.A00;
            if (this.A04 != null) {
                listView.setOnItemClickListener(new LLB(this, fEx, 2));
            }
            if (this.A0J) {
                listView.setChoiceMode(1);
            }
            fEx.A0H = listView;
        }
        View view4 = this.A0A;
        if (view4 != null) {
            boolean z = this.A0K;
            fEx.A0C = view4;
            fEx.A0R = z;
        }
        fEx.A0Q = this.A0I;
    }
}
