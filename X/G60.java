package X;

/* loaded from: G60.class */
public final class G60 implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverServiceMessageHandler$13";
    public final /* synthetic */ DNc A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public G60(DNc dNc, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = dNc;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A0G.A0N(this.A02, this.A03, this.A04, this.A01, this.A05);
    }
}
