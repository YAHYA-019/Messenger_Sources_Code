package X;

import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector;
import com.facebook.common.dextricks.LogcatReader;

/* renamed from: X.Jnc, reason: case insensitive filesystem */
/* loaded from: Jnc.class */
public final class C3241Jnc extends L5Y implements MNr, MNt, MNs {
    public float A00;
    public Context A02;
    public GestureDetector A03;
    public KmY A04;
    public KmK A05;
    public MNp A06;
    public L3M A07;
    public ML7 A08;
    public String A09;
    public JgX A0A;
    public final int A0B;
    public final MLg A0D;
    public int A01 = LogcatReader.DEFAULT_WAIT_TIME;
    public final C00i A0C = 1Bi.A02(1CO.class, (Class) null);

    public C3241Jnc(Context context, Intent intent, JgX jgX, KmY kmY, KmK kmK, MLg mLg, MNp mNp, ML7 ml7) {
        L3M l3m;
        this.A02 = context;
        this.A04 = kmY;
        this.A0A = jgX;
        this.A08 = ml7;
        this.A06 = mNp;
        if (kmY != null) {
            l3m = kmY.A09;
            if (l3m == null) {
                11T.A0L("moreInfoStore");
                throw 0Q8.createAndThrow();
            }
        } else {
            l3m = null;
        }
        this.A07 = l3m;
        this.A0D = mLg;
        this.A05 = kmK;
        this.A00 = context.getResources().getDimensionPixelSize(2132279328) - this.A02.getResources().getDimensionPixelSize(2132279310);
        this.A03 = new GestureDetector(this.A02, (GestureDetector.OnGestureListener) new JXP(this, mNp, ml7));
        this.A09 = null;
        this.A0B = intent.getIntExtra("BrowserLiteIntent.EXTRA_BONDI_HEADER_FOOTER_ANIMATION_ON_FLING_THRESHOLD", 1000);
    }
}
