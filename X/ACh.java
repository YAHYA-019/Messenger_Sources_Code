package X;

/* loaded from: ACh.class */
public final class ACh implements Comparable {
    public final String A00;

    public ACh(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(((ACh) obj).A00);
    }
}
