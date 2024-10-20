package com.facebook.messaging.msys.thread.aibot.nullstate.cardstack.layoutmanager;

import X.0K6;
import X.11T;
import X.1BJ;
import X.1Lo;
import X.2NB;
import X.2NQ;
import X.2XA;
import X.7zK;
import X.C1os;
import X.C2lg;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: AiBotGroupedCardStackLayoutManager.class */
public final class AiBotGroupedCardStackLayoutManager extends 2XA {
    public boolean A00 = true;
    public final int A01 = Color.rgb(23, 34, 58);
    public final FbUserSession A02;
    public final MigColorScheme A03;
    public final C1os A04;

    public AiBotGroupedCardStackLayoutManager(FbUserSession fbUserSession, MigColorScheme migColorScheme) {
        this.A02 = fbUserSession;
        this.A03 = migColorScheme;
        this.A04 = (C1os) 1Lo.A08(fbUserSession, 66301);
    }

    public C2lg A1F() {
        return new C2lg(-1, -2);
    }

    public void A1R(2NB r302, 2NQ r303) {
        int A0V;
        int i;
        Log.e(1BJ.A00(305), "You must override onLayoutChildren(Recycler recycler, State state) ");
        if (r302 != null) {
            A0s(r302);
            if (this.A00) {
                int A0V2 = A0V();
                A0V = 3;
                if (3 > A0V2) {
                    A0V = A0V2;
                }
            } else {
                A0V = A0V();
            }
            if (A0V != 0) {
                C1os c1os = this.A04;
                int BKg = c1os.A00() ? this.A01 : this.A03.BKg();
                int i2 = 0;
                int i3 = 40;
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < A0V; i6++) {
                    View A00 = 2NB.A00(r302, i6);
                    11T.A0I(A00, 7zK.A00(381));
                    CardView cardView = (CardView) A00;
                    if (this.A00) {
                        boolean A002 = c1os.A00();
                        int i7 = BKg;
                        if (i6 != 1) {
                            i = i6 == 2 ? 90 : 95;
                            cardView.A02(i7);
                        }
                        i7 = A002 ? Color.argb(i, 23, 34, 58) : Color.argb(i, 255, 255, 255);
                        cardView.A02(i7);
                    } else {
                        cardView.A02(BKg);
                    }
                    A0l(cardView, 0);
                    A0m(cardView, 0, 0);
                    int A0F = 2XA.A0F(cardView) + 40;
                    Rect rect = ((C2lg) cardView.getLayoutParams()).A02;
                    int measuredHeight = cardView.getMeasuredHeight() + rect.top + rect.bottom;
                    int i8 = A0F + i2;
                    if (this.A00) {
                        int i9 = i4 + measuredHeight;
                        if (i6 != 0) {
                            i9 = i5 + (i6 * 40);
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, "translationY", i4, 0.0f);
                        2XA.A0I(cardView, i3, i4, i8, i9);
                        ofFloat.setDuration(300L);
                        0K6.A00(ofFloat);
                        i4 += 40;
                        i3 += 20;
                        i2 -= 20;
                        if (i6 == 0) {
                            i5 = i9;
                        }
                    } else {
                        2XA.A0I(cardView, i3, i4, A0F, i4 + measuredHeight);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cardView, "translationY", -i4, 0.0f);
                        ofFloat2.setDuration(150L);
                        0K6.A00(ofFloat2);
                        i4 += measuredHeight + 40;
                    }
                }
            }
        }
    }

    public boolean A1c() {
        return true;
    }

    public boolean A1e() {
        return true;
    }
}
