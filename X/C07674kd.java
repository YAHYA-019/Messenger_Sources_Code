package X;

/* renamed from: X.4kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kd.class */
public final class C07674kd {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C07914lB A04;
    public final 4lA A05;
    public final 4lD A06;
    public final C4l9 A07;
    public final InterfaceC07894l7 A08;
    public final InterfaceC07874l5 A09;
    public final 5Rx A0A;
    public final Number A0B;
    public final Number A0C;
    public final Number A0D;

    public C07674kd(C07914lB c07914lB, 4lA r303, 4lD r304, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, InterfaceC07874l5 interfaceC07874l5, 5Rx r308, Number number, Number number2, Number number3, int i, int i2, long j, long j2) {
        this.A04 = c07914lB;
        this.A02 = j;
        this.A06 = r304;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j2;
        this.A0B = number;
        C1pq.A08("nonParticipantSenderList", c4l9);
        this.A07 = c4l9;
        this.A0C = number2;
        C1pq.A08("participantList", interfaceC07894l7);
        this.A08 = interfaceC07894l7;
        this.A0D = number3;
        this.A05 = r303;
        C1pq.A08("threadModel", interfaceC07874l5);
        this.A09 = interfaceC07874l5;
        this.A0A = r308;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C07674kd)) {
                return false;
            }
            C07674kd c07674kd = (C07674kd) obj;
            if (!11T.A0O(this.A04, c07674kd.A04) || this.A02 != c07674kd.A02 || !11T.A0O(this.A06, c07674kd.A06) || this.A00 != c07674kd.A00 || this.A01 != c07674kd.A01 || this.A03 != c07674kd.A03 || !11T.A0O(this.A0B, c07674kd.A0B) || !11T.A0O(this.A07, c07674kd.A07) || !11T.A0O(this.A0C, c07674kd.A0C) || !11T.A0O(this.A08, c07674kd.A08) || !11T.A0O(this.A0D, c07674kd.A0D) || !11T.A0O(this.A05, c07674kd.A05) || !11T.A0O(this.A09, c07674kd.A09) || !11T.A0O(this.A0A, c07674kd.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A05, C1pq.A04(this.A0D, C1pq.A04(this.A08, C1pq.A04(this.A0C, C1pq.A04(this.A07, C1pq.A04(this.A0B, C1pq.A01((((C1pq.A04(this.A06, C1pq.A01(C1pq.A04(this.A04, 1), this.A02)) * 31) + this.A00) * 31) + this.A01, this.A03)))))))));
    }
}
