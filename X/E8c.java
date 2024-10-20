package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: E8c.class */
public class E8c extends C1qv {
    public Ebd A00;
    public boolean A01;
    public boolean A02;
    public int[] A03;
    public 2JG[] A04;
    public 2JG[] A05;
    public final Euh A06;

    public E8c(Context context) {
        super(context, null);
        setClipChildren(true);
        this.A06 = new Euh(this);
        this.A04 = new 2JG[8];
        this.A03 = new int[0];
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
    }

    public static final String A00(2JG[] r301) {
        if (r301 == null) {
            return "<null>";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        int length = r301.length;
        for (int i = 0; i < length; i++) {
            2JG r0 = r301[i];
            A0k.append("Item at index: ");
            if (r0 != null) {
                A0k.append(i);
                A0k.append(" Type: ");
                A0k.append(r0.A01.A06.A07());
                A0k.append(" Position in parent: ");
                A0k.append(r0.A01.A02);
            } else {
                A0k.append(i);
                A0k.append(" item is null");
            }
            A0k.append("\n");
        }
        return 11T.A02(A0k);
    }

    @Override // X.C1qv
    public int A0Q() {
        int i = 0;
        for (2JG r0 : this.A04) {
            if (r0 != null) {
                i++;
            }
        }
        return i;
    }

    @Override // X.C1qv
    public 2JG A0R(int i) {
        2JG r0 = this.A04[i];
        if (r0 != null) {
            return r0;
        }
        throw 0Pz.A04("No MountItem exists at position ", i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r305 > (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
    
        if (r0[r305] == null) goto L28;
     */
    @Override // X.C1qv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0S(X.2JG r302) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8c.A0S(X.2JG):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d2, code lost:
    
        if (r0[r303] == null) goto L21;
     */
    @Override // X.C1qv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0T(X.2JG r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8c.A0T(X.2JG, int, int):void");
    }

    @Override // X.C1qv
    public void A0V() {
        this.A01 = true;
    }

    @Override // X.C1qv
    public void A0W() {
        this.A01 = false;
    }

    @Override // X.C1qv
    public void A0X(2JG r302, int i) {
        Integer num = r302.A01.A06.A04;
        Integer num2 = 0S2.A00;
        Object obj = r302.A04;
        if (num == num2) {
            11T.A0I(obj, 1BJ.A00(9));
            Drawable drawable = (Drawable) obj;
            11T.A0F(drawable, 1);
            drawable.setVisible(AnonymousClass001.A1O(getVisibility()), false);
            drawable.setCallback(this);
            DKE.A1I(drawable, this);
            invalidate(r302.A01.A03);
        } else {
            11T.A0I(obj, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj;
            this.A02 = true;
            if ((view instanceof E8c) && view.getParent() == this) {
                view.dispatchFinishTemporaryDetach();
                view.setVisibility(0);
            } else {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.A01) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            }
        }
        2JG[] r310 = this.A04;
        int length = r310.length;
        if (i >= length) {
            int i2 = length;
            do {
                i2 *= 2;
            } while (i >= i2);
            2JG[] r0 = new 2JG[i2];
            System.arraycopy(r310, 0, r0, 0, length);
            this.A04 = r0;
            r310 = r0;
        }
        r310[i] = r302;
        r302.A00 = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v1, types: [X.E8b] */
    /* JADX WARN: Type inference failed for: r307v2 */
    /* JADX WARN: Type inference failed for: r307v4, types: [X.E8a] */
    public void A0Y(int i, int i2, int i3, int i4) {
        E8c e8c;
        if (this instanceof E8a) {
            e8c = (E8a) this;
            FqZ fqZ = e8c.A01;
            FrB frB = fqZ.A00;
            int i5 = 0;
            if (fqZ.A02 && frB != null) {
                int i6 = i3 - i;
                int i7 = i4 - i2;
                frB.A05(C23X.A00.A00(i6, i6, i7, i7), (int[]) null);
                fqZ.A02 = false;
            }
            2AS r316 = fqZ.A01;
            if (r316 != null) {
                C1rF c1rF = fqZ instanceof E8k ? ((E8k) fqZ).A00 : fqZ.A04;
                c1rF.A0H(r316);
                while (true) {
                    if (11T.A0O(r316, fqZ.A01)) {
                        break;
                    }
                    if (i5 > 4) {
                        1Jj.A01(1Lc.A03, "RootHostDelegate", "More than 4 recursive mount attempts. Skipping mounting the latest version.", (Throwable) null, 0);
                        break;
                    } else {
                        r316 = fqZ.A01;
                        c1rF.A0H(r316);
                        i5++;
                    }
                }
            }
        } else {
            if (!(this instanceof E8b)) {
                return;
            }
            e8c = (E8b) this;
            2AS r308 = e8c.A00;
            if (r308 != null) {
                C1rF c1rF2 = e8c instanceof E8e ? ((E8e) e8c).A00 : e8c.A01;
                c1rF2.A0H(r308);
                int i8 = 0;
                while (true) {
                    2AS r0 = ((E8b) e8c).A00;
                    if (r308 == r0) {
                        break;
                    }
                    if (i8 > 4) {
                        1Jj.A01(1Lc.A03, "RenderTreeHostView", "More than 4 recursive mount attempts. Skipping mounting the latest version.", (Throwable) null, 0);
                        return;
                    } else {
                        c1rF2.A0H(r0);
                        i8++;
                        r308 = r0;
                    }
                }
            }
        }
        3H5.A00(e8c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        Euh euh = this.A06;
        euh.A02 = canvas;
        euh.A00 = 0;
        euh.A01 = euh.A03.A04.length;
        super.dispatchDraw(canvas);
        if (euh.A02 != null && euh.A00 < euh.A01) {
            euh.A00();
        }
        euh.A02 = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        2JG[] r0 = this.A04;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            2JG r02 = r0[i2];
            if (r02 != null && r02.A01.A06.A04 == 0S2.A00) {
                Object obj = r02.A04;
                11T.A0I(obj, 1BJ.A00(9));
                Drawable drawable = (Drawable) obj;
                11T.A0F(drawable, 1);
                DKE.A1I(drawable, this);
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.A02) {
            int childCount = getChildCount();
            if (this.A03.length < childCount) {
                this.A03 = new int[childCount + 5];
            }
            int length = this.A04.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                2JG r0 = this.A04[i4];
                if (r0 != null && r0.A01.A06.A04 == 0S2.A01) {
                    Object obj = r0.A04;
                    11T.A0I(obj, "null cannot be cast to non-null type android.view.View");
                    this.A03[i3] = indexOfChild((View) obj);
                    i3++;
                }
            }
            this.A02 = false;
        }
        Euh euh = this.A06;
        if (euh.A02 != null && euh.A00 < euh.A01) {
            euh.A00();
        }
        return this.A03[i2];
    }

    @Override // android.view.View
    public Object getTag() {
        return super.getTag();
    }

    @Override // android.view.View
    public Object getTag(int i) {
        return super.getTag(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        2JG[] r0 = this.A04;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            2JG r02 = r0[i2];
            if (r02 != null && r02.A01.A06.A04 == 0S2.A00) {
                Object obj = r02.A04;
                11T.A0I(obj, 1BJ.A00(9));
                ((Drawable) obj).jumpToCurrentState();
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        FY8 fy8;
        11T.A0F(motionEvent, 0);
        Ebd ebd = this.A00;
        if (ebd != null && (fy8 = ebd.A00.A00) != null && fy8.A07) {
            boolean z = true;
            if (motionEvent.getAction() == 0) {
                fy8.A00 = motionEvent.getX();
                fy8.A01 = motionEvent.getY();
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    fy8.A02 = true;
                }
            }
            if (motionEvent.getAction() != 2 || (DKC.A01(motionEvent.getX(), fy8.A00) <= 10.0f && DKC.A01(motionEvent.getY(), fy8.A01) <= 10.0f)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = true;
        A0Y(i, i2, i3, i4);
        this.A01 = false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1070875406);
        super.onSizeChanged(i, i2, i3, i4);
        0FI.A0C(-747375264, A06);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        2JG[] r0;
        int A05 = 0FI.A05(24382110);
        11T.A0F(motionEvent, 0);
        if (isEnabled() && (r0 = this.A04) != null) {
            int length = r0.length - 1;
            while (true) {
                int i = length;
                if (-1 >= i) {
                    break;
                }
                length = i - 1;
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        0FI.A0B(763570443, A05);
        return onTouchEvent;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        ViewParent viewParent = this;
        while (true) {
            ViewParent viewParent2 = viewParent;
            if (!(viewParent2 instanceof E8c)) {
                super.requestLayout();
                return;
            } else if (!(!((E8c) viewParent2).A01)) {
                return;
            } else {
                viewParent = viewParent2.getParent();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        2JG[] r0 = this.A04;
        int length = r0.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                return;
            }
            2JG r02 = r0[i3];
            if (r02 != null && r02.A01.A06.A04 == 0S2.A00) {
                Object obj = r02.A04;
                11T.A0I(obj, 1BJ.A00(9));
                ((Drawable) obj).setVisible(AnonymousClass001.A1O(i), false);
            }
            i2 = i3 + 1;
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }
}
