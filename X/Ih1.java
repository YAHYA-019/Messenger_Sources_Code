package X;

import android.content.Intent;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: Ih1.class */
public final class Ih1 implements C1ph {
    public final int A00;
    public final Object A01;

    public Ih1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1ph
    public void Bth(2Ov r302) {
        RecyclerView A00;
        switch (this.A00) {
            case 0:
                7yT r0 = ((C4Zl) this.A01).A01;
                if (r0 != null) {
                    r0.Btg();
                    return;
                }
                return;
            case 1:
                9cG r02 = (9cG) this.A01;
                if (r02 == null || (A00 = r02.A00()) == null) {
                    return;
                }
                A00.suppressLayout(false);
                return;
            case 2:
                ((HiH) this.A01).A03.A01(EPG.A05);
                return;
            default:
                ((Hnb) this.A01).A00(false);
                return;
        }
    }

    @Override // X.C1ph
    public void Btk(2Ov r302) {
        RecyclerView A00;
        switch (this.A00) {
            case 1:
                9cG r0 = (9cG) this.A01;
                if (r0 == null || (A00 = r0.A00()) == null) {
                    return;
                }
                A00.suppressLayout(true);
                return;
            case 2:
                HiH hiH = (HiH) this.A01;
                synchronized (hiH) {
                    ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
                    try {
                        C03m c03m = hiH.A02;
                        for (HTf hTf : c03m.A00()) {
                            ImmutableMap.Builder builder2 = new ImmutableMap.Builder(4);
                            I4p i4p = hTf.A00;
                            builder2.put("IdleTracker.isIdle", String.valueOf(((Haq) i4p.A01.get()).A01));
                            boolean A03 = i4p.A03();
                            builder2.put("InterruptManager.isInterrupted", String.valueOf(A03));
                            if (A03) {
                                ArrayList A0s = AnonymousClass001.A0s();
                                EnumSet enumSet = i4p.A03;
                                synchronized (enumSet) {
                                    Iterator it = enumSet.iterator();
                                    while (it.hasNext()) {
                                        A0s.add(((EPG) it.next()).name());
                                    }
                                }
                                Collections.sort(A0s);
                                StringBuilder A0o = AnonymousClass001.A0o("{");
                                int i = 0;
                                while (true) {
                                    if (i < A0s.size()) {
                                        A0o.append((String) A0s.get(i));
                                        if (i != A0s.size() - 1) {
                                            A0o.append(',');
                                        }
                                        i++;
                                    } else {
                                        builder2.put("InterruptManager.interrupters", AnonymousClass001.A0d("}", A0o));
                                    }
                                }
                            }
                            AbI.A1N(((Har) i4p.A02.get()).A00);
                            builder.putAll(AbG.A10(builder2, "MediaLoadTracker.isSelectedMediaLoaded", String.valueOf(false)));
                        }
                        c03m.A01();
                        hiH.A00 = builder.build();
                    } catch (Throwable th) {
                        hiH.A02.A01();
                        throw th;
                    }
                }
                hiH.A03.A02(EPG.A05);
                return;
            default:
                return;
        }
    }

    @Override // X.C1ph
    public void CR0(MotionEvent motionEvent) {
    }

    @Override // X.C1ph
    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
