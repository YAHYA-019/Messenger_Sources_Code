package com.facebook.messaging.montage.viewer.reaction;

import X.0FI;
import X.2OB;
import X.C09s;
import X.C15h;
import X.C2rp;
import X.GOn;
import X.GOo;
import X.Hb2;
import X.IKE;
import X.IlK;
import X.IlL;
import X.J5u;
import X.JEW;
import X.JHH;
import X.JL7;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.messaging.montage.viewer.reaction.MontageViewerReactionsComposerScrollView;
import com.facebook.resources.ui.FbTextView;
import com.facebook.user.tiles.UserTileView;
import com.google.common.collect.HashBiMap;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: MontageViewerReactionsComposerScrollView.class */
public class MontageViewerReactionsComposerScrollView extends HorizontalScrollView {
    public ViewGroup A00;
    public ViewGroup A01;
    public GlyphView A02;
    public JL7 A03;
    public FbTextView A04;
    public UserTileView A05;
    public JHH A06;
    public C15h A07;
    public final JEW A08;
    public final Hb2 A09;
    public final IlL A0A;
    public final HashBiMap A0B;
    public final WeakHashMap A0C;

    public MontageViewerReactionsComposerScrollView(Context context) {
        super(context);
        this.A0A = new IlL();
        this.A09 = new Hb2();
        this.A0C = new WeakHashMap();
        this.A0B = HashBiMap.A00();
        final int i = 0;
        this.A08 = new JEW(this, i) { // from class: X.9rl
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = this;
            }

            public void onClick(View view) {
                int i2 = this.A00;
                Object obj = this.A01;
                switch (i2) {
                    case 0:
                        MontageViewerReactionsComposerScrollView montageViewerReactionsComposerScrollView = (MontageViewerReactionsComposerScrollView) obj;
                        if (montageViewerReactionsComposerScrollView.A03 != null) {
                            HashBiMap hashBiMap = montageViewerReactionsComposerScrollView.A0B;
                            hashBiMap.BPy();
                            String A0b = AnonymousClass001.A0b(view, hashBiMap.BPy());
                            if (A0b != null) {
                                montageViewerReactionsComposerScrollView.A03.Bvp(A0b);
                                montageViewerReactionsComposerScrollView.fullScroll(17);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        8E1 r0 = (8E1) obj;
                        List list = C2lb.A0J;
                        8Jv r02 = r0.A00;
                        if (r02 != null) {
                            Aaf aaf = r0.A06;
                            aaf.BhU(r02);
                            8KO r03 = r0.A05;
                            if (r03 == null || r03.A08 == null) {
                                return;
                            }
                            aaf.Bie(C9ls.A01(null, r03, r02, Integer.valueOf(r0.A01), 1BK.A0l(r0.A03()), null));
                            return;
                        }
                        return;
                    default:
                        8E0 r04 = (8E0) obj;
                        List list2 = C2lb.A0J;
                        8KG r05 = r04.A00;
                        if (r05 != null) {
                            r04.A03.invoke(r05);
                            return;
                        }
                        return;
                }
            }
        };
        A00();
    }

    public MontageViewerReactionsComposerScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = new IlL();
        this.A09 = new Hb2();
        this.A0C = new WeakHashMap();
        this.A0B = HashBiMap.A00();
        final int i = 0;
        this.A08 = new JEW(this, i) { // from class: X.9rl
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = this;
            }

            public void onClick(View view) {
                int i2 = this.A00;
                Object obj = this.A01;
                switch (i2) {
                    case 0:
                        MontageViewerReactionsComposerScrollView montageViewerReactionsComposerScrollView = (MontageViewerReactionsComposerScrollView) obj;
                        if (montageViewerReactionsComposerScrollView.A03 != null) {
                            HashBiMap hashBiMap = montageViewerReactionsComposerScrollView.A0B;
                            hashBiMap.BPy();
                            String A0b = AnonymousClass001.A0b(view, hashBiMap.BPy());
                            if (A0b != null) {
                                montageViewerReactionsComposerScrollView.A03.Bvp(A0b);
                                montageViewerReactionsComposerScrollView.fullScroll(17);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        8E1 r0 = (8E1) obj;
                        List list = C2lb.A0J;
                        8Jv r02 = r0.A00;
                        if (r02 != null) {
                            Aaf aaf = r0.A06;
                            aaf.BhU(r02);
                            8KO r03 = r0.A05;
                            if (r03 == null || r03.A08 == null) {
                                return;
                            }
                            aaf.Bie(C9ls.A01(null, r03, r02, Integer.valueOf(r0.A01), 1BK.A0l(r0.A03()), null));
                            return;
                        }
                        return;
                    default:
                        8E0 r04 = (8E0) obj;
                        List list2 = C2lb.A0J;
                        8KG r05 = r04.A00;
                        if (r05 != null) {
                            r04.A03.invoke(r05);
                            return;
                        }
                        return;
                }
            }
        };
        A00();
    }

    public MontageViewerReactionsComposerScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0A = new IlL();
        this.A09 = new Hb2();
        this.A0C = new WeakHashMap();
        this.A0B = HashBiMap.A00();
        final int i2 = 0;
        this.A08 = new JEW(this, i2) { // from class: X.9rl
            public final int A00;
            public final Object A01;

            {
                this.A00 = i2;
                this.A01 = this;
            }

            public void onClick(View view) {
                int i22 = this.A00;
                Object obj = this.A01;
                switch (i22) {
                    case 0:
                        MontageViewerReactionsComposerScrollView montageViewerReactionsComposerScrollView = (MontageViewerReactionsComposerScrollView) obj;
                        if (montageViewerReactionsComposerScrollView.A03 != null) {
                            HashBiMap hashBiMap = montageViewerReactionsComposerScrollView.A0B;
                            hashBiMap.BPy();
                            String A0b = AnonymousClass001.A0b(view, hashBiMap.BPy());
                            if (A0b != null) {
                                montageViewerReactionsComposerScrollView.A03.Bvp(A0b);
                                montageViewerReactionsComposerScrollView.fullScroll(17);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        8E1 r0 = (8E1) obj;
                        List list = C2lb.A0J;
                        8Jv r02 = r0.A00;
                        if (r02 != null) {
                            Aaf aaf = r0.A06;
                            aaf.BhU(r02);
                            8KO r03 = r0.A05;
                            if (r03 == null || r03.A08 == null) {
                                return;
                            }
                            aaf.Bie(C9ls.A01(null, r03, r02, Integer.valueOf(r0.A01), 1BK.A0l(r0.A03()), null));
                            return;
                        }
                        return;
                    default:
                        8E0 r04 = (8E0) obj;
                        List list2 = C2lb.A0J;
                        8KG r05 = r04.A00;
                        if (r05 != null) {
                            r04.A03.invoke(r05);
                            return;
                        }
                        return;
                }
            }
        };
        A00();
    }

    private void A00() {
        this.A07 = J5u.A03(this, 30);
        IlL ilL = this.A0A;
        this.A06 = ilL;
        ilL.A00.add(new IlK(this));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View, com.facebook.resources.ui.FbTextView] */
    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(51022888);
        super.onFinishInflate();
        this.A00 = (ViewGroup) C09s.A01(this, 2131365844);
        this.A01 = (ViewGroup) C09s.A01(this, 2131365845);
        ?? A0X = GOo.A0X(this, 2131367959);
        this.A04 = A0X;
        C2rp.A01(A0X);
        IKE.A01(this.A04, this, ActionId.RTMP_PACKET_RECEIVED);
        Resources resources = getResources();
        if (GOn.A06(resources) == 2) {
            int i = resources.getDisplayMetrics().widthPixels;
            TypedValue typedValue = new TypedValue();
            resources.getValue(2132279538, typedValue, true);
            int A03 = GOn.A03(typedValue.getFloat(), i);
            2OB r0 = this.A04;
            if (r0 != null) {
                r0.setLayoutParams(new LinearLayout.LayoutParams(A03, r0.getLayoutParams().height));
            }
        }
        GlyphView glyphView = (GlyphView) C09s.A01(this, 2131362838);
        this.A02 = glyphView;
        IKE.A01(glyphView, this, 108);
        this.A05 = (UserTileView) C09s.A01(this, 2131368305);
        0FI.A0C(-452417651, A06);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        JHH jhh = this.A06;
        if (jhh != null) {
            jhh.CJ9(i, i2, i3, i4);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int A05 = 0FI.A05(-1658922512);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        0FI.A0B(-1896644107, A05);
        return onTouchEvent;
    }
}
