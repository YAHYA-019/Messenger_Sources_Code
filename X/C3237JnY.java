package X;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.fbui.widget.glyph.GlyphButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JnY, reason: case insensitive filesystem */
/* loaded from: JnY.class */
public final class C3237JnY extends L5Y implements MNo, MNp {
    public View A00;
    public View A01;
    public MLg A02;
    public Integer A03;
    public String A04;
    public String A05;
    public List A06;
    public Intent A08;
    public View A09;
    public MLq A0A;
    public LU3 A0B;
    public List A0C;
    public List A0D;
    public final View A0F;
    public final L2k A0G;
    public final MF5 A0H;
    public boolean A0E = true;
    public boolean A07 = false;

    public C3237JnY(Context context, View view, JgX jgX, JgX jgX2, KmY kmY, MLg mLg, Kqt kqt, Kqf kqf, L2h l2h, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        LTj lTj = new LTj(this);
        this.A0H = lTj;
        ((L5Y) this).A03 = jgX;
        Intent A0T = jgX.A0T();
        A0T.getClass();
        this.A08 = A0T;
        ((L5Y) this).A04 = jgX2;
        ((L5Y) this).A00 = context;
        this.A02 = mLg;
        List list = kmY.A0D;
        this.A06 = list;
        List list2 = kmY.A0F;
        this.A0D = list2;
        List list3 = kmY.A0E;
        this.A0C = list3;
        MLq mLq = kmY.A01;
        this.A0A = mLq;
        LU3 lu3 = kmY.A08;
        this.A0B = lu3;
        if (lu3 != null) {
            lu3.A08.add(lTj);
        }
        this.A03 = kmY.A0A;
        L2k l2k = new L2k(mLq, mLg, new KeL(this), kqt, lu3, kqf, l2h, list, list2, list3, z, z2);
        this.A0G = l2k;
        ViewStub A0X = JQx.A0X(view, z ? 2131362646 : 2131362602);
        boolean z3 = l2k.A0I;
        View A0C = DKF.A0C(A0X, z3 ? 2132541616 : 2132541574);
        l2k.A07 = A0C;
        List list4 = l2k.A0H;
        if (!list4.isEmpty()) {
            ImageView imageView = (ImageView) A0C.requireViewById(2131362489);
            View requireViewById = A0C.requireViewById(2131362490);
            LU3 lu32 = l2k.A0D;
            if (lu32 == null) {
                imageView.setVisibility(8);
                requireViewById.setVisibility(8);
            } else {
                Context context2 = A0C.getContext();
                imageView.setImageDrawable(lu32.Apb(context2));
                imageView.setOnClickListener(lu32.A03);
                imageView.setVisibility(0);
                requireViewById.setVisibility(0);
                GOo.A16(context2, imageView, 2131951673);
            }
            int i4 = 0;
            while (true) {
                int i5 = l2k.A0A;
                if (i4 >= i5) {
                    break;
                }
                if (i4 >= 0 && i4 < list4.size() && i4 < i5) {
                    Context context3 = A0C.getContext();
                    MLq mLq2 = (MLq) list4.get(i4);
                    int A0H = JQy.A0H(l2k.A0G, i4);
                    if (mLq2 instanceof LU1) {
                        l2k.A00 = i4;
                    } else if (mLq2 instanceof IMR) {
                        l2k.A02 = i4;
                    } else if (mLq2 instanceof LU4) {
                        l2k.A01 = i4;
                    }
                    ImageView imageView2 = (ImageView) A0C.requireViewById(A0H);
                    imageView2.setOnClickListener(mLq2.B06());
                    MLq.A00(context3, imageView2, mLq2);
                    GOo.A16(context3, imageView2, mLq2.BD5());
                    imageView2.setVisibility(0);
                    L2k.A00(A0C, l2k, i4);
                }
                i4++;
            }
            View.OnClickListener onClickListener = l2k.A03;
            if (onClickListener != null) {
                Context context4 = A0C.getContext();
                View requireViewById2 = A0C.requireViewById(2131362491);
                View requireViewById3 = A0C.requireViewById(2131362492);
                requireViewById2.setOnClickListener(onClickListener);
                requireViewById2.setVisibility(0);
                requireViewById3.setVisibility(0);
                GOo.A16(context4, requireViewById2, 2131951661);
            }
        }
        l2k.A05 = l2k.A07.requireViewById(2131362512);
        l2k.A04 = (!z3 || (i3 = l2k.A00) < 0) ? null : l2k.A07.requireViewById(JQy.A0H(l2k.A0G, i3));
        l2k.A09 = (!l2k.A0J || (i2 = l2k.A02) < 0) ? null : l2k.A07.requireViewById(JQy.A0H(l2k.A0G, i2));
        l2k.A08 = (l2k.A0E == null || (i = l2k.A01) < 0) ? null : l2k.A07.findViewById(JQy.A0H(l2k.A0G, i));
        View view2 = l2k.A07;
        Context context5 = view2.getContext();
        if (LDi.A08(context5)) {
            view2.requireViewById(2131362488).setBackgroundColor(LDi.A02(context5).A01(2MR.A19));
            View view3 = l2k.A05;
            if (view3 != null) {
                view3.setBackgroundColor(LDi.A02(context5).A01(2MR.A0p));
            }
            View view4 = l2k.A06;
            if (view4 != null) {
                view4.setBackgroundColor(LDi.A02(context5).A01(2MR.A0p));
            }
            ArrayList A17 = 1BK.A17(Arrays.asList((GlyphButton) view2.requireViewById(2131362489), (GlyphButton) view2.requireViewById(2131362491)));
            Iterator it = l2k.A0G.iterator();
            while (it.hasNext()) {
                A17.add(view2.requireViewById(DKE.A0F(it)));
            }
            Iterator it2 = A17.iterator();
            while (it2.hasNext()) {
                LDi.A05(context5, (GlyphButton) it2.next());
            }
        }
        View view5 = l2k.A07;
        this.A0F = view5;
        this.A00 = view5.requireViewById(2131362489);
        this.A01 = view5.requireViewById(2131362490);
        LU3 lu33 = this.A0B;
        if (lu33 != null && !lu33.A07.A02()) {
            this.A00.setVisibility(8);
            this.A01.setVisibility(8);
        }
        this.A05 = JQx.A0u(this.A08);
        String A00 = L9d.A00(this.A08.getStringExtra("BrowserLiteIntent.EXTRA_TRACKING_CODES"));
        if (A00 != null) {
            Long.parseLong(A00);
        }
        if (Kbt.A00.A02() && LEJ.A00().A0L()) {
            ViewStub A0X2 = JQx.A0X(view, 2131366953);
            String str = this.A05;
            MLg mLg2 = l2k.A0B;
            if (mLg2 != null) {
                mLg2.BZU(KOr.A0R, 0S2.A01);
            }
            View A0C2 = DKF.A0C(A0X2, 2132543257);
            l2k.A07 = A0C2;
            A0C2.requireViewById(2131366952).setOnClickListener(new LKH(A0C2.getContext(), l2k, str, 0));
            l2k.A06 = l2k.A07.requireViewById(2131366954);
            DKG.A1J(l2k.A05);
            View view6 = l2k.A07;
            if (view6 != null) {
                KxI.A00(new Ln8(view6, l2k));
            }
            this.A09 = l2k.A07;
        }
    }

    @Override // X.MNo
    public int Amw() {
        Context context = ((L5Y) this).A00;
        if (context == null) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(2132279410);
    }

    @Override // X.MNo
    public View Amx() {
        return this.A0F;
    }

    @Override // X.MNp
    public void BOG() {
    }

    @Override // X.MNo
    public boolean BSq() {
        return true;
    }

    @Override // X.MNo
    public boolean BSr() {
        return this.A0E;
    }

    @Override // X.MNo
    public boolean BWA() {
        return true;
    }

    @Override // X.MNo
    public void BzQ(int i) {
        View view;
        L2h l2h;
        View view2;
        Kqt kqt;
        View view3;
        this.A0F.setVisibility(i);
        L2k l2k = this.A0G;
        if (!this.A0E) {
            i = 8;
        }
        if (l2k.A0I && (kqt = l2k.A0C) != null && (view3 = l2k.A04) != null) {
            if (i != 0) {
                View view4 = kqt.A00;
                if (view4 != null && view3.equals(view4) && !kqt.A03) {
                    kqt.A05.A00();
                    kqt.A02 = true;
                }
            } else if (kqt.A00(view3)) {
                return;
            }
        }
        if (l2k.A0J && (l2h = l2k.A0F) != null && (view2 = l2k.A09) != null) {
            if (i != 0) {
                View view5 = l2h.A00;
                if (view5 != null && view2.equals(view5) && !l2h.A05) {
                    l2h.A01.A00();
                    l2h.A04 = true;
                }
            } else if (l2h.A01(view2)) {
                return;
            }
        }
        Kqf kqf = l2k.A0E;
        if (kqf == null || (view = l2k.A08) == null) {
            return;
        }
        if (i == 0) {
            kqf.A00(view);
        } else {
            kqf.A02.A00();
        }
    }

    @Override // X.MNp
    public /* synthetic */ boolean C24(long j) {
        return false;
    }

    @Override // X.MNp
    public void CAi(String str) {
    }

    @Override // X.MNp
    public void Cc2() {
        View view;
        L2k l2k = this.A0G;
        l2k.A01(this.A0F);
        if (Kbt.A00.A02() && LEJ.A00().A0L() && (view = this.A09) != null) {
            KxI.A00(new Ln8(view, l2k));
        }
    }

    @Override // X.MNp
    public void Clk(boolean z) {
    }

    @Override // X.MNo
    public void Cox(boolean z) {
    }

    @Override // X.MNo
    public void Coy(boolean z) {
        this.A0E = z;
    }

    @Override // X.MNo
    public /* synthetic */ void Cq7(boolean z) {
    }

    @Override // X.MNp
    public void D0U() {
    }

    @Override // X.MNo
    public boolean isAvailable() {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // X.MNp
    public void setProgress(int i) {
    }
}
