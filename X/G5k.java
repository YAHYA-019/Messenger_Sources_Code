package X;

import java.util.ArrayList;

/* loaded from: G5k.class */
public final class G5k implements Runnable {
    public static final String __redex_internal_original_name = "MerlinComponentSpec$onComponentUnfocused$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6KI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ CM7[] A04;

    public G5k(6KI r302, String str, String str2, CM7[] cm7Arr, long j) {
        this.A04 = cm7Arr;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CM7[] cm7Arr = this.A04;
        String str = this.A03;
        String str2 = this.A02;
        long j = this.A00;
        6KI r0 = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < cm7Arr.length; i++) {
        }
        r0.A06(new Eqe(EM0.A07, str, str2, C0ty.A00, (Bbe[]) A0s.toArray(new Bbe[0]), 100, j));
    }
}
