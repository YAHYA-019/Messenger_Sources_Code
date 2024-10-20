package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;

/* loaded from: J47.class */
public final class J47 implements Runnable {
    public static final String __redex_internal_original_name = "StoryViewerTappableStickerComponentSpec$25";
    public final /* synthetic */ double A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ GEb A02;
    public final /* synthetic */ GEc A03;
    public final /* synthetic */ GEd A04;
    public final /* synthetic */ GEd A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ int[] A08;

    public J47(View view, GEb gEb, GEc gEc, GEd gEd, GEd gEd2, String str, int[] iArr, double d, boolean z) {
        this.A01 = view;
        this.A06 = str;
        this.A05 = gEd;
        this.A04 = gEd2;
        this.A07 = z;
        this.A08 = iArr;
        this.A00 = d;
        this.A03 = gEc;
        this.A02 = gEb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        View view = this.A01;
        Context context = view.getContext();
        String str = this.A06;
        GEd gEd = this.A05;
        GEd gEd2 = this.A04;
        boolean z = this.A07;
        int i = 2132542009;
        if (z) {
            i = 2132543402;
        }
        C2137Deq A00 = R0x.A00(context, str, i);
        if (z) {
            View A0K = A00.A0K(2131364056);
            if (A0K != null) {
                A0K.setOnClickListener(new FXs(gEd, A00, 25));
                ViewParent parent = A0K.getParent().getParent();
                ((View) parent).post(new SE7(A0K, parent, 12, 0));
            }
            View A0K2 = A00.A0K(2131367689);
            if (A0K2 != null) {
                A0K2.setOnClickListener(new FXs(gEd2, A00, 26));
                ViewParent parent2 = A0K2.getParent();
                ((View) parent2).post(new SE7(A0K2, parent2, 0, 12));
                GOo.A16(context, A0K2, 2131966461);
            }
        } else {
            A00.A0T(gEd);
        }
        C2697Glk.A00(view, this.A02, this.A03, A00, this.A08, this.A00);
    }
}
