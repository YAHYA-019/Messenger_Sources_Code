package com.facebook.messaging.rtc.incall.impl.chiclet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.4YU;
import X.AbH;
import X.C09s;
import X.C15h;
import X.C2hw;
import X.C2hy;
import X.C7W1;
import X.DKC;
import X.GOn;
import X.GOp;
import X.GVy;
import X.GWc;
import X.Gr4;
import X.HxI;
import X.I99;
import X.IKN;
import X.IYa;
import X.J5u;
import X.JDB;
import X.JFq;
import X.JIf;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;
import java.util.Iterator;

/* loaded from: ChicletParticipantsView.class */
public final class ChicletParticipantsView extends CustomLinearLayout implements JFq {
    public ViewStub A00;
    public RecyclerView A01;
    public GWc A02;
    public Gr4 A03;
    public FbLinearLayout A04;
    public C15h A05;
    public C15h A06;
    public boolean A07;
    public final View.OnLayoutChangeListener A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChicletParticipantsView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A08 = new IKN(this, 8);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChicletParticipantsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A08 = new IKN(this, 8);
        A00();
    }

    private final void A00() {
        this.A06 = J5u.A03(this, 47);
        this.A05 = J5u.A03(this, 48);
        Context A08 = 4YU.A08(this);
        this.A03 = (Gr4) 1Bn.A0E(A08, (1BY) null, 115708);
        LayoutInflater.from(A08).inflate(2132541701, this);
        setGravity(17);
        this.A04 = (FbLinearLayout) C09s.A01(this, 2131362999);
        RecyclerView recyclerView = (RecyclerView) C09s.A01(this, 2131366893);
        11T.A0F(recyclerView, 0);
        this.A01 = recyclerView;
        recyclerView.A1A(null);
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != null) {
            recyclerView2.A1D(new LinearLayoutManager(A08, 0, false));
            GWc gWc = new GWc(new HxI(this));
            this.A02 = gWc;
            RecyclerView recyclerView3 = this.A01;
            if (recyclerView3 != null) {
                recyclerView3.A16(gWc);
                AbH.A1K(this, -16777216);
                setElevation(DKC.A04(getResources()));
                this.A00 = (ViewStub) C09s.A01(this, 2131367055);
                return;
            }
        }
        11T.A0L("participantsList");
        throw 0Q8.createAndThrow();
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        String str;
        IYa iYa = (IYa) jdb;
        int i = 0;
        11T.A0F(iYa, 0);
        Rect BKp = iYa.BKp();
        11T.A0A(BKp);
        Resources resources = getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2132279320) + BKp.top;
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mapbox_eight_dp);
        FbLinearLayout fbLinearLayout = this.A04;
        String str2 = "combinedList";
        if (fbLinearLayout != null) {
            int paddingRight = fbLinearLayout.getPaddingRight();
            FbLinearLayout fbLinearLayout2 = this.A04;
            if (fbLinearLayout2 != null) {
                fbLinearLayout.setPadding(dimensionPixelOffset2, dimensionPixelOffset, paddingRight, fbLinearLayout2.getPaddingBottom());
                GWc gWc = this.A02;
                if (gWc == null) {
                    str = "adapter";
                } else {
                    boolean z = iYa.A05;
                    ImmutableList of = z ? iYa.A02 : ImmutableList.of();
                    11T.A0C(of);
                    C2hy A00 = C2hw.A00(new GVy(gWc.A00, of), true);
                    gWc.A00 = of;
                    A00.A02(gWc);
                    RecyclerView recyclerView = this.A01;
                    if (recyclerView != null) {
                        recyclerView.setFocusable(z);
                        setVisibility(GOp.A03(z ? 1 : 0));
                        this.A07 = iYa.A04;
                        float f = iYa.A00;
                        ViewGroup.LayoutParams layoutParams = getLayoutParams();
                        if (layoutParams == null) {
                            throw 1BK.A0h();
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int A002 = (int) (f * C7W1.A00(4YU.A08(this)));
                        marginLayoutParams.topMargin = A002;
                        marginLayoutParams.topMargin = A002;
                        setLayoutParams(marginLayoutParams);
                        if (this.A07) {
                            C15h c15h = this.A05;
                            if (c15h == null) {
                                11T.A0L("chicletPlayerSharedState");
                                throw 0Q8.createAndThrow();
                            }
                            I99 i99 = (I99) c15h.get();
                            int dimensionPixelOffset3 = A002 + resources.getDimensionPixelOffset(2132279320);
                            if (i99.A02 && i99.A01 != dimensionPixelOffset3) {
                                i99.A01 = dimensionPixelOffset3;
                                Iterator it = i99.A09.iterator();
                                while (it.hasNext()) {
                                    ((JIf) it.next()).CCa();
                                }
                            }
                        }
                        RecyclerView recyclerView2 = this.A01;
                        if (recyclerView2 != null) {
                            ViewGroup.LayoutParams layoutParams2 = recyclerView2.getLayoutParams();
                            layoutParams2.height = resources.getDimensionPixelSize(2132279368);
                            RecyclerView recyclerView3 = this.A01;
                            if (recyclerView3 != null) {
                                recyclerView3.setLayoutParams(layoutParams2);
                                str = "playerViewStub";
                                if (this.A07) {
                                    ViewStub viewStub = this.A00;
                                    if (viewStub != null) {
                                        if (viewStub.getParent() != null) {
                                            ViewStub viewStub2 = this.A00;
                                            if (viewStub2 != null) {
                                                viewStub2.inflate();
                                            }
                                        }
                                        AbH.A1K(this, 0);
                                        ViewStub viewStub3 = this.A00;
                                        if (viewStub3 != null) {
                                            viewStub3.setVisibility(4);
                                            return;
                                        }
                                    }
                                } else {
                                    if (!iYa.A06) {
                                        i = -16777216;
                                    }
                                    AbH.A1K(this, i);
                                    ViewStub viewStub4 = this.A00;
                                    if (viewStub4 != null) {
                                        viewStub4.setVisibility(8);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    str2 = "participantsList";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        int A06 = 0FI.A06(532119725);
        super.onAttachedToWindow();
        FbLinearLayout fbLinearLayout = this.A04;
        if (fbLinearLayout == null) {
            str = "combinedList";
        } else {
            fbLinearLayout.addOnLayoutChangeListener(this.A08);
            Gr4 gr4 = this.A03;
            if (gr4 != null) {
                gr4.A0Y(this);
                0FI.A0C(-520211218, A06);
                return;
            }
            str = "presenter";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        String str;
        int A06 = 0FI.A06(1923081096);
        Gr4 gr4 = this.A03;
        if (gr4 == null) {
            str = "presenter";
        } else {
            gr4.A0X();
            super.onDetachedFromWindow();
            FbLinearLayout fbLinearLayout = this.A04;
            if (fbLinearLayout != null) {
                fbLinearLayout.removeOnLayoutChangeListener(this.A08);
                0FI.A0C(246859528, A06);
                return;
            }
            str = "combinedList";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        if (getParent() != null) {
            if (motionEvent.getAction() == 0) {
                GOn.A1O(this, true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                GOn.A1O(this, false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
