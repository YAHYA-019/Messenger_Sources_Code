package X;

import com.facebook.messaging.presence.unifiedpresence.UnifiedPresenceViewLoggerItem;

/* renamed from: X.3Z5, reason: invalid class name */
/* loaded from: 3Z5.class */
public final class C3Z5 implements C1ps {
    public int A00;
    public int A01;
    public UnifiedPresenceViewLoggerItem A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public final long A08;
    public final 3E3 A09;

    public C3Z5(3E3 r302, UnifiedPresenceViewLoggerItem unifiedPresenceViewLoggerItem, Long l, Long l2, String str, int i, long j) {
        this.A09 = r302;
        this.A08 = j;
        this.A00 = i;
        this.A07 = str;
        this.A01 = 1;
        this.A06 = "";
        this.A02 = unifiedPresenceViewLoggerItem;
        this.A05 = "";
        this.A03 = l;
        this.A04 = l2;
    }

    public C3Z5(3E3 r302, String str, String str2, String str3, int i, long j) {
        this.A09 = r302;
        this.A08 = j;
        this.A00 = i;
        this.A07 = str;
        this.A01 = 0;
        this.A06 = str2;
        this.A02 = null;
        this.A05 = str3;
    }

    @Override // X.C1ps
    public long AsR() {
        return this.A08;
    }
}
