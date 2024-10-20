package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;

/* loaded from: L7t.class */
public final class L7t {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public Handler A09;
    public Message A0A;
    public Message A0B;
    public Message A0C;
    public View A0D;
    public View A0E;
    public Button A0F;
    public Button A0G;
    public Button A0H;
    public ImageView A0I;
    public ListAdapter A0J;
    public ListView A0K;
    public TextView A0L;
    public TextView A0M;
    public NestedScrollView A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public CharSequence A0S;
    public boolean A0T;
    public final Context A0V;
    public final Window A0X;
    public final 6BM A0Y;
    public boolean A0U = false;
    public int A01 = -1;
    public final View.OnClickListener A0W = LKO.A00(this, 0);

    public L7t(Context context, Window window, 6BM r304) {
        this.A0V = context;
        this.A0Y = r304;
        this.A0X = window;
        Handler handler = new Handler();
        ((JWS) handler).A00 = 7zL.A14(r304);
        this.A09 = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, 53Y.A04, 2130968674, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.A03 = obtainStyledAttributes.getResourceId(4, 0);
        this.A04 = obtainStyledAttributes.getResourceId(5, 0);
        this.A05 = obtainStyledAttributes.getResourceId(7, 0);
        this.A02 = obtainStyledAttributes.getResourceId(3, 0);
        this.A0T = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        6QN A00 = 6BM.A00(r304);
        if (A00.A0X) {
            A00.A0X = false;
        }
        6QN.A0F(A00);
        A00.A0e = true;
    }

    public static ViewGroup A00(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            AbstractC2326GOr.A10(view2);
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public static boolean A01(View view) {
        if (!view.onCheckIsTextEditor()) {
            if (!(view instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (A01(viewGroup.getChildAt(childCount))) {
                }
            }
            return false;
        }
        return true;
    }
}
