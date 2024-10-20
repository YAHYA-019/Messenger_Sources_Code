package com.facebook.widget.tokenizedtypeahead;

import X.0Em;
import X.0FI;
import X.0S2;
import X.1BK;
import X.1Bn;
import X.1Hv;
import X.1JF;
import X.2MR;
import X.3vE;
import X.69U;
import X.7zL;
import X.7zM;
import X.AbF;
import X.AnonymousClass001;
import X.Bg6;
import X.BmE;
import X.BmF;
import X.C00i;
import X.C0Ad;
import X.C0ed;
import X.C1557Alb;
import X.C1oo;
import X.C1uu;
import X.CSF;
import X.DEQ;
import X.DHt;
import X.DIz;
import X.DKC;
import X.DO1;
import X.DOS;
import X.DPH;
import X.DRA;
import X.DRg;
import X.ECv;
import X.ECw;
import X.ETh;
import X.Eji;
import X.F73;
import X.FXE;
import X.G19;
import X.GDX;
import X.Qo5;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import android.text.method.QwertyKeyListener;
import android.text.method.TextKeyListener;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.facebook.resources.ui.FbAutoCompleteTextView;
import com.facebook.user.model.User;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: TokenizedAutoCompleteTextView.class */
public class TokenizedAutoCompleteTextView extends FbAutoCompleteTextView implements DHt {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ColorStateList A04;
    public Typeface A05;
    public Drawable A06;
    public Drawable A07;
    public ReplacementSpan A08;
    public BmE A09;
    public BmF A0A;
    public F73 A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public List A0G;
    public float A0H;
    public int A0I;
    public int A0J;
    public InputMethodManager A0K;
    public C00i A0L;
    public Integer A0M;
    public final Rect A0N;
    public final Rect A0O;

    public TokenizedAutoCompleteTextView(Context context) {
        super(context);
        this.A0O = DKC.A0C();
        this.A0N = DKC.A0C();
        Integer num = 0S2.A00;
        this.A0E = num;
        this.A0F = 0S2.A01;
        this.A0C = num;
        A03(context, null);
    }

    public TokenizedAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0O = DKC.A0C();
        this.A0N = DKC.A0C();
        Integer num = 0S2.A00;
        this.A0E = num;
        this.A0F = 0S2.A01;
        this.A0C = num;
        A03(context, attributeSet);
    }

    public TokenizedAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0O = DKC.A0C();
        this.A0N = DKC.A0C();
        Integer num = 0S2.A00;
        this.A0E = num;
        this.A0F = 0S2.A01;
        this.A0C = num;
        A03(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int A01() {
        Editable editableText = getEditableText();
        if (editableText.length() == 0) {
            return 0;
        }
        int length = editableText.length();
        for (DOS dos : (DOS[]) A0A(this, DOS.class)) {
            if (!dos.A02.A01() && editableText.getSpanStart(dos) < length) {
                length = editableText.getSpanStart(dos);
            }
        }
        return length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a3, code lost:
    
        if (r0 != r317) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0093  */
    /* JADX WARN: Type inference failed for: r322v1, types: [java.lang.Object, X.EqU] */
    /* JADX WARN: Type inference failed for: r322v3, types: [java.lang.Object, X.EqU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.text.SpannableString A02(X.ETh r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 1495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView.A02(X.ETh, boolean):android.text.SpannableString");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A03(Context context, AttributeSet attributeSet) {
        this.A0B = (F73) 1Bn.A0A(99910);
        this.A0K = (InputMethodManager) 1Hv.A02(context, 100189);
        this.A0L = 7zL.A0R(context, 99911);
        this.A0G = AbF.A1F();
        setSingleLine(true);
        setMaxLines(4);
        setHorizontallyScrolling(false);
        setCustomSelectionActionModeCallback(new FXE());
        setImeOptions(33554438);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1oo.A2o);
        this.A0F = 0S2.A00(3)[obtainStyledAttributes.getInt(7, 1)];
        int color = obtainStyledAttributes.getColor(9, getCurrentTextColor());
        this.A03 = color;
        this.A0I = obtainStyledAttributes.getColor(0, color);
        int color2 = obtainStyledAttributes.getColor(6, 7zM.A02(context2, 2MR.A2K));
        this.A02 = color2;
        this.A0J = obtainStyledAttributes.getColor(5, color2);
        this.A0H = obtainStyledAttributes.getDimension(10, getTextSize());
        this.A07 = obtainStyledAttributes.getDrawable(8);
        this.A00 = obtainStyledAttributes.getColor(3, context2.getColor(2132213790));
        this.A06 = obtainStyledAttributes.getDrawable(1);
        Integer num = 0S2.A00(3)[obtainStyledAttributes.getInt(2, 0)];
        num.getClass();
        if (this.A0D != num) {
            this.A0D = num;
            A04(this);
        }
        this.A04 = 0Em.A02(context, obtainStyledAttributes.getResourceId(4, 2132213789));
        this.A0M = Integer.valueOf(context2.getColor(2132214062));
        obtainStyledAttributes.recycle();
        this.A01 = 2132347243;
        setKeyListener(new DO1(TextKeyListener.Capitalize.NONE, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A04(TokenizedAutoCompleteTextView tokenizedAutoCompleteTextView) {
        Drawable drawable;
        Drawable[] compoundDrawables = tokenizedAutoCompleteTextView.getCompoundDrawables();
        tokenizedAutoCompleteTextView.A0C = 0S2.A00;
        int intValue = tokenizedAutoCompleteTextView.A0D.intValue();
        DRg dRg = null;
        if (intValue == 1 ? 1JF.A0B(tokenizedAutoCompleteTextView.getText()) : intValue != 2) {
            drawable = null;
        } else {
            if (tokenizedAutoCompleteTextView.A06 == null) {
                Drawable drawable2 = tokenizedAutoCompleteTextView.getContext().getDrawable(2132346785);
                tokenizedAutoCompleteTextView.A06 = drawable2;
                Drawable A00 = C1uu.A00(tokenizedAutoCompleteTextView.getResources(), drawable2, tokenizedAutoCompleteTextView.A00);
                tokenizedAutoCompleteTextView.A06 = A00;
                A00.setBounds(0, 0, A00.getIntrinsicWidth(), tokenizedAutoCompleteTextView.A06.getIntrinsicHeight());
            }
            drawable = tokenizedAutoCompleteTextView.A06;
            tokenizedAutoCompleteTextView.A0C = 0S2.A01;
        }
        if (drawable != compoundDrawables[2]) {
            if (drawable != null) {
                Drawable dra = new DRA(drawable, tokenizedAutoCompleteTextView);
                dra.setBounds(0, 0, ((69U) dra).A00.getIntrinsicWidth(), ((69U) dra).A00.getIntrinsicHeight());
                Rect rect = 3vE.A09;
                dRg = new DRg(new Rect(tokenizedAutoCompleteTextView.getWidth() - ((69U) dra).A00.getIntrinsicWidth(), 0, tokenizedAutoCompleteTextView.getWidth(), ((69U) dra).A00.getIntrinsicHeight()), tokenizedAutoCompleteTextView, tokenizedAutoCompleteTextView, tokenizedAutoCompleteTextView.getResources().getString(1 - tokenizedAutoCompleteTextView.A0C.intValue() != 0 ? 0 : 2131967479));
                drawable = dra;
            }
            tokenizedAutoCompleteTextView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
            C0Ad.A0B(tokenizedAutoCompleteTextView, dRg);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        if (r0 >= r0.length()) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView.A05(com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean A06(ReplacementSpan replacementSpan, MotionEvent motionEvent) {
        if (!(replacementSpan instanceof GDX)) {
            return false;
        }
        Rect rect = this.A0O;
        rect.set(((GDX) replacementSpan).A01);
        return rect.contains(((int) motionEvent.getX()) + getScrollX(), ((int) motionEvent.getY()) + getScrollY());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r0 > r305) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A07(com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView r301) {
        /*
            r0 = r301
            int r0 = r0.getSelectionStart()
            r302 = r0
            r0 = r301
            android.text.Editable r0 = r0.getEditableText()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L81
            r0 = r301
            int r0 = r0.getSelectionEnd()
            r305 = r0
            r0 = r302
            r1 = r305
            if (r0 != r1) goto L30
            r0 = r301
            int r0 = r0.A01()
            r305 = r0
            r0 = r302
            r1 = r305
            if (r0 <= r1) goto L81
        L28:
            r0 = r301
            r1 = r305
            r0.setSelection(r1)
            r0 = 0
            return r0
        L30:
            r0 = r301
            int r0 = r0.getSelectionEnd()
            r306 = r0
            java.lang.Class<X.DOS> r0 = X.DOS.class
            r307 = r0
            r0 = r303
            r1 = r302
            r2 = r306
            r3 = r307
            java.lang.Object[] r0 = r0.getSpans(r1, r2, r3)
            X.DOS[] r0 = (X.DOS[]) r0
            r308 = r0
            r0 = r308
            int r0 = r0.length
            r309 = r0
            r0 = 0
            r306 = r0
        L52:
            r0 = r306
            r1 = r309
            if (r0 >= r1) goto L81
            r0 = r308
            r1 = r306
            r0 = r0[r1]
            X.ETh r0 = r0.A02
            r307 = r0
            r0 = r307
            boolean r0 = r0.A01()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L78
            r0 = r301
            int r0 = r0.A01()
            r305 = r0
            goto L28
        L78:
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L52
        L81:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView.A07(com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A08(TokenizedAutoCompleteTextView tokenizedAutoCompleteTextView, boolean z) {
        DOS dos;
        DIz dIz;
        int selectionStart = tokenizedAutoCompleteTextView.getSelectionStart();
        Editable editableText = tokenizedAutoCompleteTextView.getEditableText();
        DOS[] A09 = A09(tokenizedAutoCompleteTextView);
        int length = A09.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dos = null;
                break;
            }
            dos = A09[i];
            if (selectionStart == editableText.getSpanEnd(dos)) {
                break;
            }
            i++;
        }
        boolean z2 = true;
        if (dos != null && tokenizedAutoCompleteTextView.A0A != null) {
            A09(tokenizedAutoCompleteTextView);
            BmF bmF = tokenizedAutoCompleteTextView.A0A;
            User user = dos.A02.A00;
            Bg6 bg6 = bmF.A01;
            C1557Alb c1557Alb = bg6.A00;
            boolean z3 = true;
            if (c1557Alb.A0Q.size() > 1 || (dIz = c1557Alb.A0K) == null || dIz.BRG()) {
                C1557Alb.A0J(c1557Alb, null, user, -1, -1);
                z3 = false;
            } else {
                C1557Alb.A09(new CSF(user, bg6, 25), c1557Alb);
            }
            z2 = true ^ z3;
        }
        if (!z || dos == null || !z2) {
            return z2;
        }
        tokenizedAutoCompleteTextView.A0E(dos.A02);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DOS[] A09(TokenizedAutoCompleteTextView tokenizedAutoCompleteTextView) {
        Editable editableText = tokenizedAutoCompleteTextView.getEditableText();
        return (DOS[]) editableText.getSpans(0, editableText.length(), tokenizedAutoCompleteTextView.A0F == 0S2.A00 ? ECv.class : ECw.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object[] A0A(TokenizedAutoCompleteTextView tokenizedAutoCompleteTextView, Class cls) {
        Editable editableText = tokenizedAutoCompleteTextView.getEditableText();
        return editableText.getSpans(0, editableText.length(), cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0D(ETh eTh) {
        if (getMeasuredWidth() == 0) {
            this.A0G.add(eTh);
        } else {
            A0F(A02(eTh, false));
        }
        A05(this, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0E(ETh eTh) {
        Editable editableText = getEditableText();
        DOS[] dosArr = (DOS[]) A0A(this, DOS.class);
        int length = dosArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            DOS dos = dosArr[i2];
            if (dos.A02.equals(eTh)) {
                int spanStart = editableText.getSpanStart(dos);
                int spanEnd = editableText.getSpanEnd(dos);
                editableText.removeSpan(dos);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    editableText.replace(spanStart, spanEnd, "");
                }
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0F(CharSequence charSequence) {
        Editable editableText = getEditableText();
        Eji A00 = F73.A00(editableText);
        if (this.A0E == 0S2.A01) {
            clearComposingText();
        }
        if (A00 != null) {
            int i = A00.A01;
            int i2 = A00.A00;
            QwertyKeyListener.markAsReplaced(editableText, i, i2, "");
            editableText.replace(i, i2, charSequence);
        }
        Selection.setSelection(editableText, editableText.length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DHt
    public void ByX(int i) {
        super/*android.widget.AutoCompleteTextView*/.onFilterComplete(i);
    }

    @Override // X.DHt
    public void CN6(Qo5 qo5) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean enoughToFilter() {
        boolean z = false;
        if (this.A0E != 0S2.A01) {
            if (this.A0B.A01(getText()).length() >= getThreshold()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getBottomFadingEdgeStrength() {
        return C0ed.A00(((computeVerticalScrollRange() - computeVerticalScrollExtent()) - computeVerticalScrollOffset()) / getVerticalFadingEdgeLength(), 0.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getTopFadingEdgeStrength() {
        return C0ed.A00(computeVerticalScrollOffset() / getVerticalFadingEdgeLength(), 0.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCommitCompletion(CompletionInfo completionInfo) {
        super/*android.widget.AutoCompleteTextView*/.onCommitCompletion(completionInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super/*android.widget.TextView*/.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new DPH(onCreateInputConnection, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 66) {
            if (i != 67) {
                return super/*android.widget.AutoCompleteTextView*/.onKeyDown(i, keyEvent);
            }
            if (!A07(this) || !A08(this, true) || !super/*android.widget.AutoCompleteTextView*/.onKeyDown(i, keyEvent)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        keyEvent.getAction();
        return super/*android.widget.AutoCompleteTextView*/.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66) {
            return super/*android.widget.AutoCompleteTextView*/.onKeyUp(i, keyEvent);
        }
        1JF.A0B(this.A0B.A01(getText()));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Integer num;
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("text_view_state_key");
        String string = bundle.getString("text_mode_key");
        if (string.equals("CHIPS")) {
            num = 0S2.A00;
        } else if (string.equals("STYLIZED")) {
            num = 0S2.A01;
        } else {
            if (!string.equals("PLAIN_TEXT")) {
                throw AnonymousClass001.A0L(string);
            }
            num = 0S2.A0C;
        }
        this.A0F = num;
        super/*android.widget.TextView*/.onRestoreInstanceState(parcelable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Parcelable onSaveInstanceState() {
        String str;
        Bundle A05 = 1BK.A05();
        A05.putParcelable("text_view_state_key", super/*android.widget.TextView*/.onSaveInstanceState());
        switch (this.A0F.intValue()) {
            case 1:
                str = "STYLIZED";
                break;
            case 2:
                str = "PLAIN_TEXT";
                break;
            default:
                str = "CHIPS";
                break;
        }
        A05.putString("text_mode_key", str);
        return A05;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.onScrollChanged(i, i2, i3, i4);
        if (this.A08 != null) {
            this.A08 = null;
            A05(this, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(882627361);
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        CharSequence A01 = this.A0B.A01(getText());
        A05(this, false);
        boolean z = false;
        if (!this.A0G.isEmpty()) {
            z = true;
            LinkedList linkedList = new LinkedList(this.A0G);
            this.A0G.clear();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                A0D((ETh) it.next());
                if (this.A0F == 0S2.A0C) {
                    boolean z2 = true;
                    if (((DOS[]) A0A(this, DOS.class)).length < 2) {
                        z2 = false;
                    }
                    A05(this, z2);
                }
            }
        }
        A0F(A01);
        if (z) {
            post(new G19(this));
        }
        0FI.A0C(-1254031173, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super/*android.widget.TextView*/.onTextChanged(charSequence, i, i2, i3);
        if (this.A0D == 0S2.A01) {
            boolean z = true;
            boolean A1P = AnonymousClass001.A1P(i2);
            if (i3 <= 0) {
                z = false;
            }
            if (z ^ A1P) {
                A04(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0214, code lost:
    
        if (r0.A01() == false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void performFiltering(CharSequence charSequence, int i) {
        ((DEQ) getAdapter()).A03().ASS(this, this.A0B.A01(getText()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceText(CharSequence charSequence) {
        clearComposingText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean z) {
        super/*android.widget.TextView*/.setEnabled(z);
        Drawable drawable = this.A06;
        if (drawable != null) {
            int i = 128;
            if (z) {
                i = 255;
            }
            drawable.setAlpha(i);
        }
        DOS[] A09 = A09(this);
        int length = A09.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                A05(this, false);
                return;
            } else {
                A09[i3].A02.A00 = !z;
                i2 = i3 + 1;
            }
        }
    }
}
