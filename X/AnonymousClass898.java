package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.base.Objects;

/* renamed from: X.898, reason: invalid class name */
/* loaded from: 898.class */
public final class AnonymousClass898 implements AnonymousClass623 {
    public final Message A00;
    public final 61C A01;
    public final ThreadSummary A02;

    public AnonymousClass898(Message message, 61C r303, ThreadSummary threadSummary) {
        this.A00 = message;
        this.A02 = threadSummary;
        this.A01 = r303;
    }

    @Override // X.AnonymousClass626
    public long AsR() {
        Message message = this.A00;
        String str = message.A1V;
        if (str == null) {
            str = message.A1g;
        }
        return 1JF.A01(str);
    }

    @Override // X.AnonymousClass623
    public Message Awk() {
        return this.A00;
    }

    @Override // X.AnonymousClass625
    public Message B01() {
        return this.A00;
    }

    @Override // X.AnonymousClass625
    public Integer B8N() {
        return 0S2.A01;
    }

    @Override // X.AnonymousClass624
    public C62b B8O() {
        return C62b.A03;
    }

    @Override // X.AnonymousClass624
    public boolean BVc(AnonymousClass624 anonymousClass624) {
        boolean z = false;
        if (anonymousClass624.getClass() == AnonymousClass898.class) {
            Message message = this.A00;
            String A0x = 4YU.A0x(message);
            Message message2 = ((AnonymousClass898) anonymousClass624).A00;
            if (Objects.equal(A0x, 4YU.A0x(message2)) && Objects.equal(message.A0K, message2.A0K) && Objects.equal(message.A0C, message2.A0C)) {
                z = 4YV.A1Z(message.A0A, message2.A0A);
            }
        }
        return z;
    }

    @Override // X.AnonymousClass624
    public boolean BVk(AnonymousClass624 anonymousClass624) {
        boolean z = false;
        if (C62b.A03 == anonymousClass624.B8O() && anonymousClass624.getClass() == AnonymousClass898.class) {
            z = Objects.equal(Long.valueOf(AsR()), Long.valueOf(anonymousClass624.AsR()));
        }
        return z;
    }
}
