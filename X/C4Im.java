package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.4Im, reason: invalid class name */
/* loaded from: 4Im.class */
public final class C4Im {
    public C4Ip A00;
    public Set A02;
    public Executor A04;
    public Executor A05;
    public boolean A06;
    public boolean A07;
    public final Context A09;
    public final String A0B;
    public final List A0C = new ArrayList();
    public final List A0D = new ArrayList();
    public List A01 = new ArrayList();
    public boolean A08 = true;
    public final C4In A0A = new C4In();
    public Set A03 = new LinkedHashSet();

    public C4Im(Context context, String str) {
        this.A09 = context;
        this.A0B = str;
    }

    public void A00(C4Is... c4IsArr) {
        Set set = this.A02;
        if (set == null) {
            set = new HashSet();
            this.A02 = set;
        }
        C4Is c4Is = c4IsArr[0];
        11T.A0D(set);
        set.add(Integer.valueOf(c4Is.A01));
        Set set2 = this.A02;
        11T.A0D(set2);
        set2.add(Integer.valueOf(c4Is.A00));
        this.A0A.A00((C4Is[]) Arrays.copyOf(c4IsArr, 1));
    }
}
