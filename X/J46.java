package X;

import android.content.Context;
import android.view.View;

/* loaded from: J46.class */
public final class J46 implements Runnable {
    public static final String __redex_internal_original_name = "StoryViewerTappableStickerComponentSpec$24";
    public final /* synthetic */ double A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ GEb A02;
    public final /* synthetic */ GEc A03;
    public final /* synthetic */ GEd A04;
    public final /* synthetic */ 1Iw A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ int[] A08;

    public J46(View view, GEb gEb, GEc gEc, GEd gEd, 1Iw r306, String str, int[] iArr, double d, boolean z) {
        this.A05 = r306;
        this.A06 = str;
        this.A07 = z;
        this.A04 = gEd;
        this.A08 = iArr;
        this.A01 = view;
        this.A00 = d;
        this.A03 = gEc;
        this.A02 = gEb;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context applicationContext = this.A05.A0D.getApplicationContext();
        String str = this.A06;
        int i = 2132542009;
        if (this.A07) {
            i = 2132542014;
        }
        C2137Deq A00 = R0x.A00(applicationContext, str, i);
        A00.A0T(this.A04);
        int[] iArr = this.A08;
        C2697Glk.A00(this.A01, this.A02, this.A03, A00, iArr, this.A00);
    }
}
