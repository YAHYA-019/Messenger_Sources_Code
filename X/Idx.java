package X;

import java.util.List;

/* loaded from: Idx.class */
public final /* synthetic */ class Idx implements JGH {
    public final /* synthetic */ IEe A00;

    public final void CDk() {
        final IEe iEe = this.A00;
        GOp.A1I(18);
        HrO hrO = iEe.A0R;
        if (hrO != null) {
            hrO.A00();
        }
        if (!iEe.A0N.A00.isEmpty()) {
            I9z.A00(new Runnable() { // from class: X.Iso
                public static final String __redex_internal_original_name = "PreviewController$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    List list = iEe.A0N.A00;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= size) {
                            return;
                        }
                        ((JGD) list.get(i2)).CDk();
                        i = i2 + 1;
                    }
                }
            });
        }
        iEe.A0P.A07("handle_preview_started", new J5U(iEe, 28));
    }
}
