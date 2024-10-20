package X;

/* renamed from: X.2y8, reason: invalid class name */
/* loaded from: 2y8.class */
public final class C2y8 extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2y8(Object obj, Object obj2, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = i;
        this.A09 = str;
        this.A08 = str2;
        this.A01 = i2;
        this.A07 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C1h3 c1h3 = (C1h3) this.A03;
                String str = this.A06;
                11T.A0F(str, 0);
                c1h3.A0E = str;
                C1h2 c1h2 = (C1h2) this.A04;
                int i = this.A02;
                if (C1h2.A01(c1h2).isMarkerOn(729363290, i)) {
                    if (i == 2) {
                        String str2 = this.A09;
                        if (str2 != null) {
                            C1h2.A01(c1h2).markerAnnotate(729363290, i, "disconnect_change_source", str2);
                        }
                        String str3 = this.A08;
                        if (str3 != null) {
                            C1h2.A01(c1h2).markerAnnotate(729363290, i, "disconnect_change_reason", str3);
                        }
                        C1h2.A01(c1h2).markerAnnotate(729363290, i, "disconnected_dns_resolution_method", this.A01);
                        if (c1h2.A0E) {
                            C1h2.A01(c1h2).markerAnnotate(729363290, i, "disconnected_ip_addresses", this.A07);
                        }
                    }
                    C1h2.A01(c1h2).markerAnnotate(729363290, i, "disconnect_reason", str);
                    String str4 = this.A05;
                    if (str4 != null) {
                        C1h2.A01(c1h2).markerAnnotate(729363290, i, "connect_fail_reason", str4);
                    }
                    if (!c1h3.A0G) {
                        C1h2.A04(c1h3, c1h2, "not_connected", i);
                        break;
                    } else {
                        C1h2.A03(c1h3, c1h2, i);
                        C1h2.A01(c1h2).markerEnd(729363290, i, (short) 2);
                        C1h2.A02(c1h3);
                        break;
                    }
                }
                break;
            case 1:
                C1h3 c1h32 = (C1h3) this.A03;
                if (c1h32.A06 == 0) {
                    c1h32.A0C = ((C0dr) ((C1h2) this.A04).A09.A00.get()).now();
                }
                c1h32.A06++;
                c1h32.A0E = "connect_failed";
                C1h2 c1h22 = (C1h2) this.A04;
                int i2 = this.A02;
                if (C1h2.A01(c1h22).isMarkerOn(729363290, i2)) {
                    if (i2 == 2) {
                        String str5 = this.A09;
                        if (str5 != null) {
                            C1h2.A01(c1h22).markerAnnotate(729363290, i2, "disconnect_change_source", str5);
                        }
                        String str6 = this.A08;
                        if (str6 != null) {
                            C1h2.A01(c1h22).markerAnnotate(729363290, i2, "disconnect_change_reason", str6);
                        }
                        C1h2.A01(c1h22).markerAnnotate(729363290, i2, "disconnected_dns_resolution_method", this.A01);
                        if (c1h22.A0E) {
                            C1h2.A01(c1h22).markerAnnotate(729363290, i2, "disconnected_ip_addresses", this.A07);
                        }
                    }
                    C1h2.A01(c1h22).markerAnnotate(729363290, i2, "connect_fail_reason", this.A05);
                    String str7 = this.A06;
                    if (str7 != null) {
                        C1h2.A01(c1h22).markerAnnotate(729363290, i2, "disconnect_reason", str7);
                    }
                    C1h2.A04(c1h32, c1h22, "connect_failed", i2);
                    break;
                }
                break;
            default:
                C1gz c1gz = (C1gz) this.A03;
                c1gz.A07 = false;
                C1gy c1gy = (C1gy) this.A04;
                int i3 = this.A02;
                if (C1gy.A05(c1gy, i3)) {
                    if (c1gz.A00 <= 5) {
                        C1gy.A00(c1gy).markerPoint(729351308, i3, 0Pz.A0T("disconnected_", c1gz.A00));
                        String str8 = this.A09;
                        if (str8 != null) {
                            C1gy.A00(c1gy).markerAnnotate(729351308, i3, 0Pz.A0T("disconnect_change_source_", c1gz.A00), str8);
                        }
                        String str9 = this.A08;
                        if (str9 != null) {
                            C1gy.A00(c1gy).markerAnnotate(729351308, i3, 0Pz.A0T("disconnect_change_reason_", c1gz.A00), str9);
                        }
                        C1gy.A00(c1gy).markerAnnotate(729351308, i3, 0Pz.A0T("disconnect_reason_", c1gz.A00), this.A06);
                        String str10 = this.A05;
                        if (str10 != null) {
                            C1gy.A00(c1gy).markerAnnotate(729351308, i3, 0Pz.A0T("connect_fail_reason_", c1gz.A00), str10);
                        }
                        if (i3 == 1) {
                            C1gy.A00(c1gy).markerAnnotate(729351308, i3, 0Pz.A0T("disconnected_dns_resolution_method", c1gz.A00), this.A01);
                            if (c1gy.A0G) {
                                C1gy.A00(c1gy).markerAnnotate(729351308, i3, 0Pz.A0T("disconnected_ip_addresses", c1gz.A00), this.A07);
                            }
                        }
                    }
                    int i4 = c1gz.A00 + 1;
                    c1gz.A00 = i4;
                    if (i4 > c1gy.A02) {
                        C1gy.A00(c1gy).markerAnnotate(729351308, i3, "fail_reason", "exceed_connectivity_limit");
                        C1gy.A02(c1gz, c1gy, i3);
                        C1gy.A00(c1gy).markerEnd(729351308, i3, (short) 3);
                        c1gz.A00 = 1;
                        c1gz.A01 = 0;
                        c1gz.A05 = null;
                        c1gz.A06 = null;
                        break;
                    }
                }
                break;
        }
        return 04S.A00;
    }
}
