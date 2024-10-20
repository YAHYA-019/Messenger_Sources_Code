package X;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.gestures.DragGestureNode;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.primitive.textinput.TextInputView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: AW8.class */
public final class AW8 extends C00q implements C0Bd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AW8(Object obj, Object obj2, int i) {
        super(3);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AQU aqw;
        switch (this.A00) {
            case 0:
                LNS lns = (MLv) obj2;
                7zL.A1P(obj3);
                lns.D2A(-353972293);
                ME3 Cd9 = ((ME2) this.A01).Cd9((MBF) this.A02, lns, 0);
                boolean AEi = lns.AEi(Cd9);
                Object CdA = lns.CdA();
                if (AEi || CdA == Ky6.A00) {
                    CdA = new LOH(Cd9);
                    lns.D7k(CdA);
                }
                LNS.A0P(lns, false);
                return CdA;
            case 1:
                Kts kts = (Kts) obj;
                DragGestureNode dragGestureNode = (DragGestureNode) this.A02;
                if (7zR.A1a(kts, dragGestureNode.A03)) {
                    if (!dragGestureNode.A06) {
                        if (dragGestureNode.A04 == null) {
                            dragGestureNode.A04 = new C4G6((-1) >>> 1);
                        }
                        dragGestureNode.A06 = true;
                        2aK.A03((Integer) null, (0DE) null, new AnonymousClass851(dragGestureNode, null, 3), dragGestureNode.A08(), 3);
                    }
                    KUd.A00(kts, (Kpe) this.A01);
                    C4G7 c4g7 = dragGestureNode.A04;
                    if (c4g7 != null) {
                        c4g7.D5N(new Object());
                    }
                }
                return 04S.A00;
            case 2:
                L5H l5h = (L5H) obj;
                int A03 = AnonymousClass001.A03(obj2);
                int A032 = AnonymousClass001.A03(obj3);
                Spannable spannable = (Spannable) this.A02;
                0Be r0 = (0Be) this.A01;
                Kbj kbj = l5h.A05;
                Liq liq = l5h.A08;
                if (liq == null) {
                    liq = Liq.A04;
                }
                KsO ksO = l5h.A06;
                KsO ksO2 = new KsO(ksO != null ? ksO.A00 : 0);
                KsP ksP = l5h.A07;
                spannable.setSpan(new JXC((Typeface) r0.invoke(kbj, liq, ksO2, new KsP(ksP != null ? ksP.A00 : 1))), A03, A032, 33);
                return 04S.A00;
            case 3:
                7zL.A1P(obj2);
                11T.A0F(obj, 0);
                boolean z = true;
                if (obj instanceof TextInputView) {
                    DKM dkm = new DKM();
                    DLQ dlq = (DLQ) this.A02;
                    dkm.A0J(dlq, 0);
                    FyG fyG = (FyG) this.A01;
                    dkm.A0J(fyG, 1);
                    FAv.A01(dlq, fyG, new DKc(dkm.A00), dlq.AlB(46));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                1BL.A1F(obj2, obj3);
                throw AnonymousClass001.A0Q("monitor-enter");
            case 5:
                8CX r02 = (8CX) obj2;
                Rect rect = (Rect) obj3;
                1BL.A1F(r02, rect);
                5C4 drawable = r02.getDrawable();
                11T.A0I(drawable, "null cannot be cast to non-null type com.facebook.fresco.vito.core.FrescoDrawableInterface");
                5C4 r03 = drawable;
                5BO r04 = (5BO) this.A02;
                C06974ih c06974ih = (C06974ih) this.A01;
                11T.A0F(r04, 0);
                r02.A04 = r04;
                r02.A03 = c06974ih;
                r02.A00 = rect;
                if (r02.isAttachedToWindow()) {
                    8CX.A00(r02);
                }
                aqw = new AQW(r03, 35);
                return new C2md(aqw);
            case 6:
                8CR r05 = (8CR) obj2;
                9Q5 r06 = (9Q5) obj3;
                7zT.A1S(obj, r05, r06);
                C8ip c8ip = (C8ip) this.A02;
                r05.setClipToPadding(false);
                r05.setClipChildren(false);
                ComponentTree componentTree = (ComponentTree) this.A01;
                11T.A0D(componentTree);
                int i = r06.A01;
                int i2 = r06.A00;
                List list = c8ip.A06;
                if (list == null) {
                    list = C0ty.A00;
                }
                Set A0f = 0QD.A0f(list);
                8CE r07 = c8ip.A02;
                8CE r08 = c8ip.A03;
                1Im r09 = c8ip.A01;
                C5eR c5eR = c8ip.A04;
                5eX r010 = c8ip.A05;
                5eS r011 = 5eS.A01;
                11T.A0F(componentTree, 1);
                7zS.A18(4, A0f, c5eR, r011);
                r05.A0B.A01(c5eR, r011, r05.A09, r05.A0A, r010);
                r05.A01 = i;
                r05.A00 = i2;
                r05.A03 = c5eR;
                r05.A04 = r011;
                r05.A05 = r010;
                r05.A02 = r09;
                r05.A06 = A0f;
                LithoView lithoView = r05.A08;
                lithoView.A10(componentTree, true);
                lithoView.setClipToPadding(false);
                lithoView.setClipChildren(false);
                lithoView.Bgo();
                if (r07 != null) {
                    r05.A0C.put(5eF.A02, r07);
                }
                if (r08 != null) {
                    r05.A0C.put(5eF.A03, r08);
                }
                aqw = new AQU(r05, 37);
                return new C2md(aqw);
            case 7:
                EvJ evJ = (EvJ) obj;
                11T.A0F(evJ, 0);
                Object obj4 = this.A01;
                if (obj4 != null) {
                    GAX gax = new GAX(obj4, 23);
                    Eqy eqy = evJ.A00;
                    if (eqy == null) {
                        throw AnonymousClass001.A0T("Can't add lifecycle callbacks outside the Screen's content callback");
                    }
                    eqy.A00 = gax;
                }
                return new 7J5((1LI) new G9H(this.A02, evJ, 24).invoke(), 7zQ.A1b(Ez7.class, 1Wg.A03(DKB.A00(72))), (03Y[]) null);
            default:
                11T.A0F(obj, 0);
                5Vs r012 = (5Vs) ((C0Bd) this.A02).invoke(obj, obj2, obj3);
                Function1 Ahy = r012.Ahy();
                r012.CoB(AUz.A00);
                Function1[] function1Arr = (Function1[]) this.A01;
                ArrayList A0t = AnonymousClass001.A0t(function1Arr.length);
                for (Function1 function1 : function1Arr) {
                    A0t.add(function1.invoke(r012));
                }
                r012.CoB((Function1) new GBo(A0t, 37).invoke(Ahy));
                return r012;
        }
    }
}
