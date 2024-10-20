package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.8o1, reason: invalid class name */
/* loaded from: 8o1.class */
public final class C8o1 extends C1rj {
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final 3Do A0E;
    public 9Z6 A00;
    public 3Dm A01;
    public 3Do A02;
    public ThreadCustomization A03;
    public MigColorScheme A04;
    public ThreadThemeInfo A05;
    public ImmutableList A06;
    public ImmutableMap A07;
    public boolean A08;
    public boolean A09;

    static {
        2RH r0 = 2RH.A03;
        A0D = r0.A00();
        2RH r02 = 2RH.A05;
        A0B = r02.A00();
        A0C = r02.A00();
        A0A = r0.A00();
        A0E = 3Do.A03;
    }

    public C8o1() {
        super("ThreadCustomizationPickerComponent");
        this.A02 = A0E;
    }

    public static int A00(1Iw r301, int i, int i2, boolean z) {
        int i3 = (int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.75d);
        int size = View.MeasureSpec.getSize(i);
        Context context = r301.A0D;
        int i4 = 1;
        if (4YU.A0B(context).orientation == 1 && !z) {
            size = Math.min(i3, size);
        }
        int A00 = C0A8.A00(context, A0D) * 2;
        int A002 = C0A8.A00(context, A0B);
        if (!z) {
            i4 = 2;
        }
        return ((size - A00) - (A002 * i4)) - i2;
    }

    public final Object[] A0k() {
        return new Object[]{this.A06, this.A04, this.A01, Boolean.valueOf(this.A08), Boolean.valueOf(this.A09), this.A00, this.A02, this.A07, this.A03, this.A05};
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x08ce, code lost:
    
        if (r0.isEmpty() != false) goto L131;
     */
    /* JADX WARN: Type inference failed for: r0v108, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0z(X.1Iw r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 2681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8o1.A0z(X.1Iw, int, int):X.1LI");
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -334106531) {
            return null;
        }
        9Z6 r0 = ((C8o1) r302.A00.A01).A00;
        r0.getClass();
        C9bf c9bf = r0.A00.A09;
        if (c9bf == null) {
            return null;
        }
        c9bf.A02.A0p();
        return null;
    }
}
