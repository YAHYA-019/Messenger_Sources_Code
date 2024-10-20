package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.643, reason: invalid class name */
/* loaded from: 643.class */
public final class AnonymousClass643 extends C1rj {
    public Parcelable A00;
    public 1LI A01;
    public C62r A02;
    public 66U A03;
    public AnonymousClass622 A04;
    public boolean A05;
    public boolean A06;

    public AnonymousClass643() {
        super("ReactionsGestureWrapper");
    }

    public static AnonymousClass856 A00(1Iw r301) {
        return new AnonymousClass856(r301, new AnonymousClass643());
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A01, this.A00, this.A04, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        AnonymousClass643 anonymousClass643 = (AnonymousClass643) super.A0l();
        1LI r0 = anonymousClass643.A01;
        anonymousClass643.A01 = r0 != null ? r0.A0l() : null;
        return anonymousClass643;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        AnonymousClass669 anonymousClass669 = (AnonymousClass669) r302.A06().A00();
        AnonymousClass622 anonymousClass622 = this.A04;
        C62r c62r = this.A02;
        1LI r0 = this.A01;
        66U r02 = this.A03;
        Parcelable parcelable = this.A00;
        boolean z = this.A05;
        66A r03 = anonymousClass669.A01;
        11T.A0F(r03, 7);
        r03.A03 = anonymousClass622;
        r03.A01 = c62r;
        r03.A02 = r02;
        r03.A00 = parcelable;
        2dD A00 = C2dB.A00(r302);
        A00.A2X(r0);
        A00.A2Q(true);
        if (!z) {
            Integer num = 0S2.A01;
            A00.A1o(1LI.A02(r302, AnonymousClass643.class, num, "ReactionsGestureWrapper", (Object[]) null, -1806852260));
            A00.A1s(1LI.A02(r302, AnonymousClass643.class, num, "ReactionsGestureWrapper", (Object[]) null, -1336101728));
        }
        return A00.A2W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        boolean z;
        int i = r302.A01;
        if (i == -1806852260) {
            3xF r0 = (3xF) obj;
            1Iv r02 = r302.A00;
            1Is r03 = r02.A01;
            1Iw r04 = r02.A00;
            View view = r0.A01;
            MotionEvent motionEvent = r0.A00;
            AnonymousClass643 anonymousClass643 = (AnonymousClass643) r03;
            AnonymousClass669 anonymousClass669 = (AnonymousClass669) r04.A06().A00();
            boolean z2 = anonymousClass643.A06;
            66E r05 = anonymousClass669.A00;
            11T.A0F(motionEvent, 2);
            11T.A0F(r05, 4);
            if (z2) {
                r05.A00 = view;
                r05.A03.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    r05.A01 = true;
                }
                z = r05.A02;
            } else {
                z = false;
            }
        } else {
            if (i != -1336101728) {
                if (i != -1048037474) {
                    return null;
                }
                1LI.A0J(r302, obj);
                return null;
            }
            3xE r06 = (3xE) obj;
            1Iv r07 = r302.A00;
            1Is r08 = r07.A01;
            1Iw r09 = r07.A00;
            View view2 = r06.A01;
            MotionEvent motionEvent2 = r06.A00;
            AnonymousClass643 anonymousClass6432 = (AnonymousClass643) r08;
            AnonymousClass669 anonymousClass6692 = (AnonymousClass669) r09.A06().A00();
            boolean z3 = anonymousClass6432.A06;
            66E r010 = anonymousClass6692.A00;
            66A r011 = anonymousClass6692.A01;
            11T.A0F(view2, 1);
            11T.A0F(motionEvent2, 2);
            11T.A0F(r010, 4);
            11T.A0F(r011, 5);
            if (z3 && motionEvent2.getAction() == 0) {
                r010.A01 = false;
            }
            z = r011.onTouch(view2, motionEvent2);
        }
        return Boolean.valueOf(z);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        AnonymousClass669 anonymousClass669 = (AnonymousClass669) r303;
        AnonymousClass622 anonymousClass622 = this.A04;
        C62r c62r = this.A02;
        66U r0 = this.A03;
        Parcelable parcelable = this.A00;
        11T.A0F(r302, 0);
        11T.A0F(anonymousClass622, 3);
        66A r02 = new 66A(parcelable, r302, c62r, r0, anonymousClass622);
        Context context = r302.A0D;
        11T.A0A(context);
        66E r03 = new 66E(context, r02);
        anonymousClass669.A01 = r02;
        anonymousClass669.A00 = r03;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
