package X;

import com.google.common.collect.ImmutableList;

/* loaded from: D89.class */
public final class D89 implements Runnable {
    public static final String __redex_internal_original_name = "OmniPickerSuggestionsLoader$startLoading$1";
    public final /* synthetic */ CNd A00;
    public final /* synthetic */ ImmutableList A01;

    public D89(CNd cNd, ImmutableList immutableList) {
        this.A00 = cNd;
        this.A01 = immutableList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CNd cNd = this.A00;
        C1320Ady c1320Ady = cNd.A00;
        if (c1320Ady != null) {
            c1320Ady.A0G(new C96(null, this.A01, null, 0, cNd.A03, ((5PC) 1Br.A0B(cNd.A09)).A01(), !((C1gb) 1Br.A0B(cNd.A08)).A0O()));
        }
    }
}
