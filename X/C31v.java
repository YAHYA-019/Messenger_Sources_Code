package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: X.31v, reason: invalid class name */
/* loaded from: 31v.class */
public final class C31v extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C31v(View view, ViewPropertyAnimator viewPropertyAnimator, 2NG r304, C2lb c2lb) {
        this.A00 = 0;
        this.A01 = r304;
        this.A03 = c2lb;
        this.A04 = view;
        this.A02 = viewPropertyAnimator;
    }

    public C31v(View view, ViewPropertyAnimator viewPropertyAnimator, C2lb c2lb, 6LP r305, int i) {
        this.A00 = i;
        switch (i) {
            case 1:
                this.A04 = r305;
                this.A02 = c2lb;
                this.A03 = view;
                this.A01 = viewPropertyAnimator;
                break;
            case 2:
                this.A01 = r305;
                this.A03 = c2lb;
                this.A02 = viewPropertyAnimator;
                this.A04 = view;
                break;
            default:
                this.A01 = r305;
                this.A03 = c2lb;
                this.A04 = view;
                this.A02 = viewPropertyAnimator;
                break;
        }
    }

    public C31v(View view, ViewPropertyAnimator viewPropertyAnimator, 6LP r304, 3Ft r305, int i) {
        this.A00 = i;
        this.A01 = r304;
        this.A02 = r305;
        if (4 - i != 0) {
            this.A04 = viewPropertyAnimator;
            this.A03 = view;
        } else {
            this.A03 = viewPropertyAnimator;
            this.A04 = view;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 0:
            case 3:
                ((View) this.A04).setAlpha(1.0f);
                return;
            case 1:
                ((View) this.A03).setTranslationY(0.0f);
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        2NI r306;
        Object obj;
        C2lb c2lb;
        ArrayList arrayList;
        ArrayList arrayList2;
        C2lb c2lb2;
        switch (this.A00) {
            case 0:
                ((ViewPropertyAnimator) this.A02).setListener(null);
                2NG r0 = (2NG) this.A01;
                C2lb c2lb3 = (C2lb) this.A03;
                r0.A0M(c2lb3);
                r0.A00.remove(c2lb3);
                if (r0.A0A()) {
                    return;
                }
                r0.A05();
                return;
            case 1:
                ((ViewPropertyAnimator) this.A01).setListener(null);
                r306 = (6LP) this.A04;
                obj = this.A02;
                c2lb = (C2lb) obj;
                r306.A0M(c2lb);
                arrayList = ((6LP) r306).A01;
                arrayList.remove(c2lb);
                r306.A0T();
                return;
            case 2:
                ((ViewPropertyAnimator) this.A02).setListener(null);
                ((View) this.A04).setAlpha(1.0f);
                r306 = (6LP) this.A01;
                c2lb = (C2lb) this.A03;
                r306.A0O(c2lb);
                arrayList = ((6LP) r306).A0B;
                arrayList.remove(c2lb);
                r306.A0T();
                return;
            case 3:
                ((ViewPropertyAnimator) this.A02).setListener(null);
                r306 = (6LP) this.A01;
                obj = this.A03;
                c2lb = (C2lb) obj;
                r306.A0M(c2lb);
                arrayList = ((6LP) r306).A01;
                arrayList.remove(c2lb);
                r306.A0T();
                return;
            case 4:
                ((ViewPropertyAnimator) this.A03).setListener(null);
                View view = (View) this.A04;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                r306 = (6LP) this.A01;
                3Ft r02 = (3Ft) this.A02;
                r306.A06(r02.A05);
                arrayList2 = ((6LP) r306).A07;
                c2lb2 = r02.A05;
                arrayList2.remove(c2lb2);
                r306.A0T();
                return;
            default:
                ((ViewPropertyAnimator) this.A04).setListener(null);
                View view2 = (View) this.A03;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                r306 = (6LP) this.A01;
                3Ft r03 = (3Ft) this.A02;
                r306.A06(r03.A04);
                arrayList2 = ((6LP) r306).A07;
                c2lb2 = r03.A04;
                arrayList2.remove(c2lb2);
                r306.A0T();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        2NH r304;
        Object obj;
        switch (this.A00) {
            case 0:
            case 3:
                r304 = (2NH) this.A01;
                obj = this.A03;
                break;
            case 1:
                r304 = (2NH) this.A04;
                obj = this.A02;
                break;
            case 2:
                ((2NH) this.A01).A0L((C2lb) this.A03);
                return;
            default:
                return;
        }
        r304.A0H((C2lb) obj);
    }
}
