package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B0h.class */
public final class B0h extends C1rj {
    public int A00;
    public View.OnFocusChangeListener A01;
    public TextView.OnEditorActionListener A02;
    public MHn A03;
    public MigColorScheme A04;
    public Integer A05;
    public String A06;
    public String A07;
    public static final 2KE A09 = 2KE.A09;
    public static final LinearLayout.LayoutParams A08 = new LinearLayout.LayoutParams(0, 0);

    public B0h() {
        super("MessengerSearchEditText");
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new SearchView(context);
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (com.google.common.base.Objects.equal(r309, r310) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0r(X.1LI r302, X.1LI r303, X.2Yv r304, X.2Yv r305) {
        /*
            r301 = this;
            r0 = r302
            X.B0h r0 = (X.B0h) r0
            r302 = r0
            r0 = r303
            X.B0h r0 = (X.B0h) r0
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            if (r0 != 0) goto La0
            r0 = 0
            r307 = r0
        L14:
            r0 = r303
            if (r0 != 0) goto L97
            r0 = 0
            r308 = r0
        L1b:
            r0 = r302
            if (r0 != 0) goto L8e
            r0 = 0
            r309 = r0
        L22:
            r0 = r303
            if (r0 != 0) goto L85
            r0 = 0
            r310 = r0
        L29:
            r0 = r302
            if (r0 != 0) goto L7c
            r0 = 0
            r311 = r0
            r0 = 0
            r312 = r0
        L33:
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r303
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.A04
            r306 = r0
        L3d:
            r0 = r308
            boolean r0 = X.1JF.A0B(r0)
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L57
            r0 = r307
            r1 = r308
            boolean r0 = X.1JF.A0C(r0, r1)
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L76
        L57:
            r0 = r312
            r1 = r306
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L76
            r0 = r309
            r1 = r310
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r311 = r0
            r0 = 0
            r313 = r0
            r0 = r311
            if (r0 != 0) goto L79
        L76:
            r0 = 1
            r313 = r0
        L79:
            r0 = r313
            return r0
        L7c:
            r0 = r302
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.A04
            r312 = r0
            goto L33
        L85:
            r0 = r303
            java.lang.Integer r0 = r0.A05
            r310 = r0
            goto L29
        L8e:
            r0 = r302
            java.lang.Integer r0 = r0.A05
            r309 = r0
            goto L22
        L97:
            r0 = r303
            java.lang.String r0 = r0.A07
            r308 = r0
            goto L1b
        La0:
            r0 = r302
            java.lang.String r0 = r0.A07
            r307 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0h.A0r(X.1LI, X.1LI, X.2Yv, X.2Yv):boolean");
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        SearchView searchView = (SearchView) obj;
        MigColorScheme migColorScheme = this.A04;
        String str = this.A07;
        MHn mHn = this.A03;
        View.OnFocusChangeListener onFocusChangeListener = this.A01;
        TextView.OnEditorActionListener onEditorActionListener = this.A02;
        Integer num = this.A05;
        String str2 = this.A06;
        int i = this.A00;
        searchView.setQueryHint(str2);
        int intValue = num.intValue();
        searchView.setImeOptions(intValue);
        searchView.onSearchClicked();
        searchView.setQuery(str, false);
        searchView.setFocusable(true);
        searchView.setPadding(0, 0, 0, 0);
        TextView A06 = AbF.A06(searchView, 2131367189);
        if (A06 != null) {
            2KE r0 = A09;
            A06.setTextSize(7zN.A00(r0));
            AbH.A1M(A06, migColorScheme);
            2KQ A04 = 2KK.A04(r0);
            Context context = r302.A0D;
            A06.setTypeface(A04.A00(context));
            A06.setHintTextColor(i);
            A06.setHint(str2);
            A06.setCursorVisible(true);
            A06.setTextAlignment(5);
            A06.setImeOptions(intValue | A06.getImeOptions());
            InputMethodManager A062 = AbI.A06(context);
            if (A062 != null) {
                A062.restartInput(A06);
                A06.requestFocus();
            }
            if (onEditorActionListener != null) {
                A06.setOnEditorActionListener(onEditorActionListener);
            }
        }
        View findViewById = searchView.findViewById(2131367180);
        if (findViewById != null) {
            findViewById.setLayoutParams(A08);
        }
        View findViewById2 = searchView.findViewById(2131367153);
        if (findViewById2 != null) {
            findViewById2.setLayoutParams(A08);
            findViewById2.setContentDescription(r302.A0D(2131952114));
        }
        searchView.mOnQueryChangeListener = mHn;
        searchView.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        SearchView searchView = (SearchView) obj;
        searchView.mOnQueryChangeListener = null;
        searchView.setOnFocusChangeListener(null);
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B0h b0h = (B0h) r302;
            MigColorScheme migColorScheme = this.A04;
            MigColorScheme migColorScheme2 = b0h.A04;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            String str = this.A06;
            String str2 = b0h.A06;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (this.A00 != b0h.A00) {
                return false;
            }
            Integer num = this.A05;
            Integer num2 = b0h.A05;
            if (num != null) {
                if (!num.equals(num2)) {
                    return false;
                }
            } else if (num2 != null) {
                return false;
            }
            TextView.OnEditorActionListener onEditorActionListener = this.A02;
            TextView.OnEditorActionListener onEditorActionListener2 = b0h.A02;
            if (onEditorActionListener != null) {
                if (!onEditorActionListener.equals(onEditorActionListener2)) {
                    return false;
                }
            } else if (onEditorActionListener2 != null) {
                return false;
            }
            View.OnFocusChangeListener onFocusChangeListener = this.A01;
            View.OnFocusChangeListener onFocusChangeListener2 = b0h.A01;
            if (onFocusChangeListener != null) {
                if (!onFocusChangeListener.equals(onFocusChangeListener2)) {
                    return false;
                }
            } else if (onFocusChangeListener2 != null) {
                return false;
            }
            MHn mHn = this.A03;
            MHn mHn2 = b0h.A03;
            if (mHn != null) {
                if (!mHn.equals(mHn2)) {
                    return false;
                }
            } else if (mHn2 != null) {
                return false;
            }
            String str3 = this.A07;
            String str4 = b0h.A07;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
        }
        return true;
    }
}
