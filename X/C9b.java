package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C9b.class */
public abstract class C9b {
    public final ThreadKey A00;
    public final String A01;

    public C9b(ThreadKey threadKey, String str) {
        this.A01 = str;
        this.A00 = threadKey;
    }

    public ThreadKey A00() {
        return this instanceof BHl ? ((BHl) this).A01 : ((BHk) this).A00;
    }

    public String A01() {
        return this instanceof BHl ? ((BHl) this).A03 : ((BHk) this).A02;
    }

    public String A02() {
        return this instanceof BHl ? ((BHl) this).A04 : ((BHk) this).A03;
    }

    public String A03() {
        return this instanceof BHl ? ((BHl) this).A05 : ((BHk) this).A04;
    }

    public String A04() {
        return this instanceof BHl ? ((BHl) this).A06 : this.A01;
    }

    public String A05() {
        return this instanceof BHl ? ((BHl) this).A07 : ((BHk) this).A06;
    }

    public boolean A06() {
        return this instanceof BHl ? ((BHl) this).A0A : ((BHk) this).A08;
    }

    public boolean A07() {
        return this instanceof BHl ? ((BHl) this).A09 : ((BHk) this).A07;
    }
}
