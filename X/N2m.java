package X;

import com.facebook.composer.publish.errordetails.ErrorDetails;

/* loaded from: N2m.class */
public final class N2m {
    public static volatile QzO A0F;
    public int A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public N2m() {
        this.A0B = true;
        this.A0D = true;
        this.A04 = "";
        this.A08 = "";
    }

    public N2m(ErrorDetails errorDetails) {
        this.A00 = errorDetails.A00;
        this.A02 = errorDetails.A02;
        this.A0A = errorDetails.A0A;
        this.A03 = errorDetails.A03;
        this.A0B = errorDetails.A0B;
        this.A0C = errorDetails.A0C;
        this.A0D = errorDetails.A0D;
        this.A0E = errorDetails.A0E;
        this.A01 = errorDetails.A01;
        this.A04 = errorDetails.A04;
        this.A05 = errorDetails.A05;
        this.A06 = errorDetails.A06;
        this.A07 = errorDetails.A07;
        this.A08 = errorDetails.A08;
        this.A09 = errorDetails.A09;
    }

    public void A00(String str) {
        this.A04 = str;
        C1pq.A08("logMessage", str);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.QzO] */
    public void A01(String str) {
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = new Object();
                }
            }
        }
        if (str == null) {
            str = "";
        }
        this.A08 = str;
        C1pq.A08("userMessage", str);
    }
}
