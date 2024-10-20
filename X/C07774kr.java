package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.orca.mca.MailboxOrca$ThreadViewDataObserverCallback;
import com.facebook.orca.mca.MailboxOrcaJNI;
import com.facebook.simplejni.NativeHolder;

/* renamed from: X.4kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kr.class */
public final class C07774kr implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ MailboxOrca$ThreadViewDataObserverCallback A05;
    public final /* synthetic */ C07764kq A06;
    public final /* synthetic */ 22B A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;
    public final /* synthetic */ boolean A0K;
    public final /* synthetic */ boolean A0L;
    public final /* synthetic */ boolean A0M;
    public final /* synthetic */ boolean A0N;
    public final /* synthetic */ boolean A0O;
    public final /* synthetic */ boolean A0P;
    public final /* synthetic */ boolean A0Q;
    public final /* synthetic */ boolean A0R;
    public final /* synthetic */ boolean A0S;
    public final /* synthetic */ boolean A0T;
    public final /* synthetic */ boolean A0U;
    public final /* synthetic */ boolean A0V;
    public final /* synthetic */ boolean A0W;
    public final /* synthetic */ boolean A0X;
    public final /* synthetic */ boolean A0Y;

    public C07774kr(MailboxFutureImpl mailboxFutureImpl, MailboxOrca$ThreadViewDataObserverCallback mailboxOrca$ThreadViewDataObserverCallback, C07764kq c07764kq, 22B r305, Number number, Number number2, String str, String str2, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23) {
        this.A07 = r305;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A0B = str;
        this.A09 = number;
        this.A08 = number2;
        this.A0A = str2;
        this.A06 = c07764kq;
        this.A05 = mailboxOrca$ThreadViewDataObserverCallback;
        this.A0G = z;
        this.A0F = z2;
        this.A0H = z3;
        this.A0D = z4;
        this.A0I = z5;
        this.A0T = z6;
        this.A0P = z7;
        this.A0O = z8;
        this.A0N = z9;
        this.A0M = z10;
        this.A0U = z11;
        this.A0R = z12;
        this.A0L = z13;
        this.A0S = z14;
        this.A0J = z15;
        this.A0K = z16;
        this.A0Q = z17;
        this.A0X = z18;
        this.A0Y = z19;
        this.A0E = z20;
        this.A0W = z21;
        this.A0V = z22;
        this.A0C = z23;
        this.A04 = mailboxFutureImpl;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        long j = this.A03;
        String str = this.A0B;
        Number number = this.A09;
        Number number2 = this.A08;
        String str2 = this.A0A;
        final C07764kq c07764kq = this.A06;
        final MailboxOrca$ThreadViewDataObserverCallback mailboxOrca$ThreadViewDataObserverCallback = this.A05;
        NativeHolder nativeHolder = (NativeHolder) MailboxOrcaJNI.dispatchOIIIJOOOOOOOZZZZZZZZZZZZZZZZZZZZZZZZZZ(5, i, i2, i3, j, obj, str, number, number2, str2, new MailboxOrca$ThreadViewDataObserverCallback(c07764kq, mailboxOrca$ThreadViewDataObserverCallback) { // from class: X.4ks
            public final 1XK A00;
            public final MailboxOrca$ThreadViewDataObserverCallback A01;

            {
                this.A00 = c07764kq;
                this.A01 = mailboxOrca$ThreadViewDataObserverCallback;
            }

            @Override // com.facebook.orca.mca.MailboxOrca$ThreadViewDataObserverCallback
            public void callback(C07864l4 c07864l4, C07884l6 c07884l6, C07904l8 c07904l8, 4lA r305, C07914lB c07914lB, C07924lC c07924lC, long j2, long j3, int i4, int i5, 5Rw r314, 5Ry r315, 4lE r316, 5pI r317, Number number3, Number number4, Number number5) {
                this.A00.setResult(new 4lF(c07914lB, r316, c07904l8, c07884l6, c07924lC, r305, c07864l4, r317, r315, r314, number3, number4, number5));
                MailboxOrca$ThreadViewDataObserverCallback mailboxOrca$ThreadViewDataObserverCallback2 = this.A01;
                if (mailboxOrca$ThreadViewDataObserverCallback2 != null) {
                    mailboxOrca$ThreadViewDataObserverCallback2.callback(c07864l4, c07884l6, c07904l8, r305, c07914lB, c07924lC, j2, j3, i4, i5, r314, r315, r316, r317, number3, number4, number5);
                }
            }
        }, null, this.A0G, true, this.A0F, this.A0H, this.A0D, this.A0I, this.A0T, true, this.A0P, this.A0O, this.A0N, this.A0M, this.A0U, this.A0R, this.A0L, this.A0S, this.A0J, this.A0K, this.A0Q, false, this.A0X, this.A0Y, this.A0E, this.A0W, this.A0V, this.A0C);
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        c07764kq.A01(nativeHolder);
        mailboxFutureImpl.setResult(c07764kq);
    }
}
