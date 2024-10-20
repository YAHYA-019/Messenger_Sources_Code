package X;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.business.attachments.generic.model.PlatformGenericAttachmentItem;
import com.facebook.messaging.business.common.calltoaction.CallToActionContainerView;
import com.facebook.messaging.business.vstacked.VStackedCompactItemView;
import com.facebook.messaging.xma.ui.XMALinearLayout;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.BetterTextView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

/* renamed from: X.6eO, reason: invalid class name */
/* loaded from: 6eO.class */
public abstract class C6eO implements C63i, C63j, C6eP {
    public AnonymousClass622 A00;
    public final Deque A01 = new ArrayDeque();
    public final java.util.Map A02 = new HashMap();

    /* JADX WARN: Type inference failed for: r0v93, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    public void A01(5zD r302, 6Az r303, EeO eeO, 7Wh r305) {
        PlatformGenericAttachmentItem A00;
        E2Y e2y;
        int i;
        int i2;
        if (this instanceof C6ec) {
            ArE BEO = r303.BEO();
            BEO.getClass();
            A00 = EWG.A00(BEO);
            if (A00 == null) {
                return;
            }
            e2y = eeO.A00;
            FGG.A02(A00, e2y.A04);
            FGG.A01(A00, e2y.A03);
            FGG.A00(A00, e2y.A02);
            Uri uri = A00.A03;
            CallerContext callerContext = E2Y.A05;
            ImageView imageView = e2y.A00;
            1BL.A1F(callerContext, imageView);
            C1iM.A01(imageView, null, C06974ih.A0Q, 5Bm.A01(uri, (java.util.Map) null), callerContext);
            i = 4;
        } else if (this instanceof C6eb) {
            ArE BEO2 = r303.BEO();
            BEO2.getClass();
            A00 = EWG.A00(BEO2);
            e2y = (VStackedCompactItemView) eeO.A00;
            FGG.A02(A00, e2y.A03);
            FGG.A01(A00, e2y.A02);
            ?? r0 = e2y.A00;
            CallerContext callerContext2 = VStackedCompactItemView.A05;
            Uri uri2 = A00.A03;
            if (uri2 != null) {
                r0.A0G(uri2, callerContext2);
                i2 = 0;
            } else {
                i2 = 8;
            }
            r0.setVisibility(i2);
            FGG.A00(A00, e2y.A01);
            i = 3;
        } else {
            if (!(this instanceof C6ed)) {
                if (this instanceof C6ee) {
                    ArE BEO3 = r303.BEO();
                    BEO3.getClass();
                    ImmutableList A01 = AbstractC08734ns.A01(BEO3.Aaw());
                    String A0r = BEO3.A0r(486946241);
                    if (!TextUtils.isEmpty(A0r)) {
                        try {
                            C0A2.A03(A0r);
                        } catch (SecurityException unused) {
                        }
                    }
                    String A0k = BEO3.A0k();
                    7gV r02 = eeO.A00;
                    if (A01.isEmpty()) {
                        r02.setVisibility(8);
                        return;
                    }
                    r02.setVisibility(0);
                    r02.A00.setVisibility(0);
                    r02.A00.A0G(BMF.A0N, A0k, A01);
                    return;
                }
                return;
            }
            ArE BEO4 = r303.BEO();
            BEO4.getClass();
            A00 = EWG.A00(BEO4);
            e2y = (E2d) eeO.A00;
            if (A00 == null) {
                e2y.setVisibility(8);
                return;
            }
            e2y.setVisibility(0);
            FGG.A02(A00, e2y.A04);
            FGG.A01(A00, e2y.A03);
            FGG.A00(A00, e2y.A02);
            Uri uri3 = A00.A03;
            CallerContext callerContext3 = E2d.A05;
            ImageView imageView2 = e2y.A00;
            1BL.A1F(callerContext3, imageView2);
            C1iM.A01(imageView2, null, C06974ih.A0Q, 5Bm.A01(uri3, (java.util.Map) null), callerContext3);
            i = 2;
        }
        e2y.setOnClickListener(new FXl(e2y, A00, i));
    }

    /* JADX WARN: Type inference failed for: r0v128, types: [android.widget.LinearLayout, X.7gp, android.view.View, com.facebook.widget.CustomLinearLayout] */
    /* JADX WARN: Type inference failed for: r0v58, types: [android.widget.LinearLayout, android.view.View, com.facebook.messaging.xma.ui.XMALinearLayout, com.facebook.widget.CustomLinearLayout, X.E2d] */
    public EeO A02(ViewGroup viewGroup) {
        if (this instanceof 6eN) {
            XMALinearLayout xMALinearLayout = new XMALinearLayout(((6eN) this).A00);
            xMALinearLayout.setOrientation(1);
            ((7gW) xMALinearLayout).A00 = new ArrayList();
            return new EeO(xMALinearLayout);
        }
        if (this instanceof C6ea) {
            11T.A0F(viewGroup, 0);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2132543010, viewGroup, false);
            11T.A0D(inflate);
            11T.A0F(inflate, 1);
            return new EeO(inflate);
        }
        if (this instanceof C6eg) {
            ?? customLinearLayout = new CustomLinearLayout(((C6eg) this).A00);
            customLinearLayout.A05 = new 1BV(customLinearLayout.getContext(), 49963);
            customLinearLayout.A0D(2132542103);
            customLinearLayout.A04 = (FbDraweeView) C09s.A01(customLinearLayout, 2131366686);
            customLinearLayout.A03 = (TextView) C09s.A01(customLinearLayout, 2131366689);
            customLinearLayout.A00 = (TextView) C09s.A01(customLinearLayout, 2131366685);
            customLinearLayout.A01 = (TextView) C09s.A01(customLinearLayout, 2131366687);
            customLinearLayout.A02 = (TextView) C09s.A01(customLinearLayout, 2131366688);
            customLinearLayout.setOrientation(1);
            customLinearLayout.setBackgroundResource(R.color.white);
            return new EeO((View) customLinearLayout);
        }
        if (this instanceof C6ec) {
            CallerContext callerContext = E2Y.A05;
            Context context = viewGroup.getContext();
            CustomFrameLayout customFrameLayout = new CustomFrameLayout(context, null, 0);
            EBG.A02(customFrameLayout);
            ((E2Y) customFrameLayout).A01 = (FGG) 1Bn.A0E(context, (1BY) null, 100032);
            customFrameLayout.A0U(2132543572);
            ((E2Y) customFrameLayout).A00 = (ImageView) C09s.A01(customFrameLayout, 2131363422);
            ((E2Y) customFrameLayout).A04 = (BetterTextView) C09s.A01(customFrameLayout, 2131363424);
            ((E2Y) customFrameLayout).A03 = (BetterTextView) C09s.A01(customFrameLayout, 2131363423);
            ((E2Y) customFrameLayout).A02 = 2Wo.A00((ViewStub) C09s.A01(customFrameLayout, 2131363483));
            return new EeO(customFrameLayout);
        }
        if (this instanceof C6eb) {
            return new EeO(LayoutInflater.from(viewGroup.getContext()).inflate(2132543569, viewGroup, false));
        }
        if (!(this instanceof C6ed)) {
            if (!(this instanceof C6ee)) {
                return this instanceof 6eY ? new 7gQ(new H5p(((6eY) this).A00)) : new 7gP(new H5o(((6eX) this).A00));
            }
            CustomFrameLayout customFrameLayout2 = new CustomFrameLayout(viewGroup.getContext(), null, 0);
            EBG.A02(customFrameLayout2);
            customFrameLayout2.A0U(2132543565);
            ((7gV) customFrameLayout2).A00 = (CallToActionContainerView) C09s.A01(customFrameLayout2, 2131363479);
            return new EeO(customFrameLayout2);
        }
        CallerContext callerContext2 = E2d.A05;
        Context context2 = viewGroup.getContext();
        ?? xMALinearLayout2 = new XMALinearLayout(context2, null, 0);
        xMALinearLayout2.A01 = (FGG) 1Bn.A0E(context2, (1BY) null, 100032);
        xMALinearLayout2.A0D(2132543566);
        xMALinearLayout2.setOrientation(1);
        xMALinearLayout2.A00 = (ImageView) C09s.A01(xMALinearLayout2, 2131363422);
        xMALinearLayout2.A04 = (BetterTextView) C09s.A01(xMALinearLayout2, 2131363219);
        xMALinearLayout2.A03 = (BetterTextView) C09s.A01(xMALinearLayout2, 2131363218);
        xMALinearLayout2.A02 = 2Wo.A00((ViewStub) C09s.A01(xMALinearLayout2, 2131363483));
        return new EeO((View) xMALinearLayout2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0a34, code lost:
    
        if (r0 != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0b7e, code lost:
    
        if (r314 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0ce8, code lost:
    
        if (r0 != null) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0c89  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0703  */
    /* JADX WARN: Type inference failed for: r0v518, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(com.facebook.auth.usersession.FbUserSession r302, X.5zD r303, X.5Pm r304, X.EeO r305, X.7Wh r306) {
        /*
            Method dump skipped, instructions count: 3357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6eO.A03(com.facebook.auth.usersession.FbUserSession, X.5zD, X.5Pm, X.EeO, X.7Wh):void");
    }

    public void A04(FbUserSession fbUserSession, 5zD r303, AnonymousClass622 anonymousClass622, EeO eeO, 7Wh r306) {
        11T.A0F(eeO, 1);
        this.A00 = anonymousClass622;
        5Pm r0 = anonymousClass622.A03.A08;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        A03(fbUserSession, r303, r0, eeO, r306);
    }

    @Override // X.C63i
    public void ACH(View view, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        4YV.A1N(view, r304);
        EeO eeO = (EeO) this.A02.get(view);
        if (eeO == null) {
            Object tag = view.getTag(2131367405);
            11T.A0I(tag, "null cannot be cast to non-null type VH of com.facebook.messaging.xma.SimpleStyleRenderer");
            eeO = (EeO) tag;
        }
        A01(r303, r304, eeO, r306);
    }

    @Override // X.C6eP
    public void ACM(View view, FbUserSession fbUserSession, 5zD r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        4YV.A1N(fbUserSession, anonymousClass622);
        Object tag = view.getTag(2131367405);
        11T.A0I(tag, "null cannot be cast to non-null type VH of com.facebook.messaging.xma.SimpleStyleRenderer");
        A04(fbUserSession, r304, anonymousClass622, (EeO) tag, r306);
    }

    @Override // X.C63j
    public void AFJ() {
        this.A01.clear();
        this.A02.clear();
    }

    @Override // X.C6eP
    public View ALJ(ViewGroup viewGroup) {
        EeO A02 = A02(viewGroup);
        View view = A02.A00;
        view.setTag(2131367405, A02);
        return view;
    }

    @Override // X.C63i
    public View BDK(ViewGroup viewGroup) {
        Deque deque = this.A01;
        EeO A02 = deque.isEmpty() ? A02(viewGroup) : (EeO) deque.pop();
        java.util.Map map = this.A02;
        View view = A02.A00;
        map.put(view, A02);
        return view;
    }

    @Override // X.C63j
    public void CiZ(View view) {
        11T.A0F(view, 0);
        Object remove = this.A02.remove(view);
        if (remove != null) {
            this.A01.push(remove);
        } else {
            String A0j = 0Pz.A0j("Tried to return a view ", view.toString(), " that was not lent out by this StyleRenderer");
            11T.A0A(A0j);
            throw AnonymousClass001.A0N(A0j);
        }
    }
}
