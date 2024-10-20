package com.facebook.messaging.composer.tabbedextensions;

import X.0fH;
import X.1BQ;
import X.1Fj;
import X.1Iw;
import X.3wK;
import X.5Su;
import X.6PH;
import X.7zL;
import X.8TK;
import X.9Hu;
import X.AnonymousClass001;
import X.AnonymousClass955;
import X.C00i;
import X.C1u3;
import X.C2iw;
import X.C9ak;
import X.C9ze;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.LithoView;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: TabbedExtensionsSegmentedControlLithoView.class */
public class TabbedExtensionsSegmentedControlLithoView extends LithoView {
    public int A00;
    public 6PH A01;
    public ThreadViewColorScheme A02;
    public String A03;
    public List A04;
    public List A05;
    public List A06;
    public final C00i A07;
    public final 9Hu A08;
    public final C00i A09;

    public TabbedExtensionsSegmentedControlLithoView(Context context) {
        this(context, null);
    }

    public TabbedExtensionsSegmentedControlLithoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = ImmutableList.of();
        this.A06 = ImmutableList.of();
        this.A04 = ImmutableList.of();
        1BQ A02 = 1BQ.A02(68543);
        this.A09 = A02;
        this.A07 = 1BQ.A02(68025);
        this.A03 = null;
        this.A00 = -1;
        this.A08 = new 9Hu(this);
        this.A02 = ((5Su) A02.get()).A01();
        A05(this);
    }

    public static void A05(TabbedExtensionsSegmentedControlLithoView tabbedExtensionsSegmentedControlLithoView) {
        int indexOf;
        String str = tabbedExtensionsSegmentedControlLithoView.A03;
        if (str != null && (indexOf = tabbedExtensionsSegmentedControlLithoView.A05.indexOf(str)) >= 0) {
            tabbedExtensionsSegmentedControlLithoView.A00 = indexOf;
        }
        if (tabbedExtensionsSegmentedControlLithoView.A05.size() <= tabbedExtensionsSegmentedControlLithoView.A00) {
            tabbedExtensionsSegmentedControlLithoView.A00 = 0;
        }
        MigColorScheme migColorScheme = tabbedExtensionsSegmentedControlLithoView.A02.A0F;
        tabbedExtensionsSegmentedControlLithoView.setBackground(7zL.A0D(migColorScheme.Amg()));
        C2iw A0Z = 7zL.A0Z();
        1Iw r0 = ((LithoView) tabbedExtensionsSegmentedControlLithoView).A09;
        C9ak c9ak = new C9ak();
        int min = Math.min(tabbedExtensionsSegmentedControlLithoView.A04.size(), tabbedExtensionsSegmentedControlLithoView.A06.size());
        if (tabbedExtensionsSegmentedControlLithoView.A06.size() != tabbedExtensionsSegmentedControlLithoView.A04.size()) {
            0fH.A0k("TabbedExtensionsSegmentedControlLithoView", "number of titles and icons should be the same!");
        }
        for (int i = 0; i < min; i++) {
            c9ak.A00((C1u3) tabbedExtensionsSegmentedControlLithoView.A04.get(i), (CharSequence) tabbedExtensionsSegmentedControlLithoView.A06.get(i));
        }
        ImmutableList A01 = 1Fj.A01(c9ak.A01);
        int i2 = tabbedExtensionsSegmentedControlLithoView.A00;
        if (i2 < 0 || i2 >= A01.size()) {
            tabbedExtensionsSegmentedControlLithoView.A00 = 0;
            if (A01.size() <= 0) {
                0fH.A14("TabbedExtensionsSegmentedControlLithoView", "mSelectedTab is %d while tab size is %d!", AnonymousClass001.A1b(Integer.valueOf(tabbedExtensionsSegmentedControlLithoView.A00), A01.size()));
            }
        }
        8TK A00 = 3wK.A00(r0);
        A00.A2Z(A01);
        int i3 = tabbedExtensionsSegmentedControlLithoView.A00;
        3wK r02 = A00.A01;
        r02.A00 = i3;
        A00.A2X(migColorScheme);
        A00.A0T();
        r02.A03 = AnonymousClass955.EVEN_WIDTH;
        A00.A1w(A0Z);
        A00.A2Y(new C9ze(tabbedExtensionsSegmentedControlLithoView, 0));
        tabbedExtensionsSegmentedControlLithoView.A0x(A00.A2W());
        if (((LithoView) tabbedExtensionsSegmentedControlLithoView).A00 != null) {
            3wK.A01(A0Z, tabbedExtensionsSegmentedControlLithoView.A00);
        }
    }
}
