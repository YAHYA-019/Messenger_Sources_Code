package X;

import android.graphics.RectF;
import java.io.File;
import java.util.HashSet;

/* loaded from: I0d.class */
public final class I0d {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public RectF A05;
    public I8v A06;
    public JMX A07;
    public I9d A08;
    public HLh A09;
    public I9e A0A;
    public Hz0 A0B;
    public File A0C;
    public String A0D;
    public String A0E;
    public HashSet A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.HLh, java.lang.Object] */
    public I0d() {
        this.A05 = GOq.A0M();
        long j = -1;
        this.A04 = j;
        this.A00 = j;
        this.A0G = false;
        this.A0H = false;
        this.A02 = j;
        this.A0F = AnonymousClass001.A0v();
        try {
            this.A09 = new Object();
        } catch (HDB unused) {
            throw AnonymousClass001.A0U(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.HLh, java.lang.Object] */
    public I0d(Hkg hkg) {
        this.A05 = GOq.A0M();
        long j = -1;
        this.A04 = j;
        this.A00 = j;
        this.A0G = false;
        this.A0H = false;
        this.A02 = j;
        this.A0F = AnonymousClass001.A0v();
        try {
            this.A09 = new Object();
            this.A0C = hkg.A0C;
            String str = hkg.A0E;
            if (str != null) {
                this.A0E = str;
            }
            this.A08 = hkg.A08;
            this.A05 = hkg.A05;
            this.A04 = hkg.A04;
            this.A00 = hkg.A00;
            this.A0G = hkg.A0G;
            this.A0H = hkg.A0H;
            this.A07 = hkg.A07;
            this.A06 = hkg.A06;
            this.A0B = hkg.A0B;
            this.A0K = hkg.A0K;
            this.A0J = hkg.A0J;
            this.A0I = hkg.A0I;
            this.A0A = hkg.A0A;
            this.A0O = hkg.A0N;
            this.A0P = hkg.A0O;
            this.A0L = hkg.A0L;
            this.A02 = hkg.A03;
            this.A09 = hkg.A09;
            this.A0M = hkg.A0M;
            this.A0N = hkg.A0P;
            this.A0F = hkg.A0F;
            this.A0D = hkg.A0D;
        } catch (HDB unused) {
            throw AnonymousClass001.A0U(this);
        }
    }
}
